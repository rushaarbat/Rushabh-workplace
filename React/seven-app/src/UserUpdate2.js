import React, { Component } from "react";
import axios, { Axios } from "axios";

export default class UserUpdate extends Component {
  state = {
    users: [],
    isEditMode: false,
    userObject: {
      username: "",
      name: "",
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

          this.resetState(); //it will reset the state of object
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
              name: "",
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
    this.resetState(); //it will reset the state of object
  };

  render() {
    return (
      <>
        <h2>Create UserName</h2>
        <form onSubmit={this.onFormSubmitClick}>
          <label htmlFor="username">UserName :</label>
          <input
            id="username"
            name="username"
            value={this.state.userObject.username}
            onChange={this.onChangeHandler}
          ></input>
          <label htmlFor="name">Name :</label>
          <input
            id="name"
            name="name"
            value={this.state.userObject.name}
            onChange={this.onChangeHandler}
          ></input>
          <label htmlFor="phone">Phone :</label>
          <input
            id="phone"
            name="phone"
            value={this.state.userObject.phone}
            onChange={this.onChangeHandler}
          ></input>
          <br />

          <button type="submit">
            {this.state.isEditMode ? "Update" : "Submit"}
          </button>

          <button onClick={this.onCancelClickHandler}>Cancel</button>

          <hr />
        </form>
        {this.state.users.map((users, index) => (
          <div key={index}>
            <div>
              {index + 1}.{users.username}--{users.phone}
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
  resetState() {
    this.setState({
      userObject: {
        username: "",
        name: "",
        phone: "",
        id: 1,
      },
      isEditMode: false,
    });
  }

  fetchData() {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      console.log(response.data);
      this.setState({ users: response.data });
    });
  }
}
