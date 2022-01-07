import React, { Component } from "react";
import axios, { Axios } from "axios";

export default class UserUpdate extends Component {
  state = {
    users: [],
    isEditMode: false,
    userObject: {
      username: "",
      phone: "",
      id: 1,
    },
  };
  onDeleteClickHandler(id) {
    axios
      .delete("https://jsonplaceholder.typicode.com/users/" + id)
      .then((response) => {
        console.log(response);
        this.fetchData();
        alert("User Deleted");
      });
  }
  onChangeHandler = (event) => {
    const { name, value } = event.target;
    const userObjectCopy = this.state.userObject;
    userObjectCopy[name] = value;
    this.setState({ userObject: userObjectCopy });
  };
  onFormSubmitClick = (event) => {
    event.preventDefault();
    console.log(this.state);

    if (this.state.isEditMode) {
      axios
        .put(
          "https://jsonplaceholder.typicode.com/users/" +
            this.state.userObject.id,
          this.state.userObject
        )
        .then((response) => {
          console.log(response);
          this.fetchData();
          alert("User Updated");

          this.setState({
            userObject: {
              username: "",
              phone: "",
              id: 1,
            },
            isEditMode: false,
          });
        });
    } else {
      axios
        .post(
          "https://jsonplaceholder.typicode.com/users",
          this.state.userObject
        )
        .then((response) => {
          console.log(response);
          this.fetchData();
          alert("User Created");
          this.setState({
            userObject: {
              username: "",
              phone: "",
            },
          });
        });
    }
  };
  onEditClickHandler = (id) => {
    //here we set specific object by id from list
    const editObject = this.state.users.find((user) => user.id === id);

    //here we set the object to state.userObject
    this.setState({ userObject: editObject, isEditMode: true });
  };
  onCancelClickHandler = (event) => {
    event.preventDefault();
    this.setState({
      userObject: {
        username: "",
        phone: "",
        id: 1,
      },
      isEditMode: false,
    });
  };
  render() {
    return (
      <>
        <h2>Create UserName</h2>
        <form onSubmit={this.onFormSubmitClick}>
          <label>UserName :</label>
          <input
            name="username"
            value={this.state.userObject.username}
            onChange={this.onChangeHandler}
          ></input>
          <label>Phone :</label>
          <input
            name="phone"
            value={this.state.userObject.phone}
            onChange={this.onChangeHandler}
          ></input>
          <button type="submit">
            {this.state.isEditMode ? "Update" : "Submit"}
          </button>
          <button onClick={this.onCancelClickHandler}>Cancel</button>
        </form>
        {this.state.users.map((users, index) => (
          <div key={index}>
            <div>
              {index + 1}.{users.username}
            </div>
            <button
              onClick={() => {
                this.onDeleteClickHandler(users.id);
              }}
            >
              Delete
            </button>
            <button
              onClick={() => {
                this.onEditClickHandler(users.id);
              }}
            >
              Edit
            </button>
          </div>
        ))}
      </>
    );
  }
  componentDidMount() {
    this.fetchData();
  }

  fetchData() {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      console.log(response.data);
      this.setState({ users: response.data });
    });
  }
}
