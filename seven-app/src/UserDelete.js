import React, { Component } from "react";
import axios, { Axios } from "axios";

export default class UserDelete extends Component {
  state = {
    users: [],
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
  render() {
    return (
      <>
        <h2>Delete UserName</h2>
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
