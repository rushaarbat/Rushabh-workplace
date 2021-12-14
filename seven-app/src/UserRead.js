import React, { Component } from "react";
import axios, { Axios } from "axios";

export default class UserRead extends Component {
  state = {
    users: [],
  };
  render() {
    return (
      <>
        <h2>Read UserName</h2>
        {this.state.users.map((users, index) => (
          <div key={index}>
            <div>
              {index + 1}.{users.username} {index + 1}.{users.name} {index + 1}.
              {users.email}
              {index + 1}.{users.address.zipcode} {index + 1}.
              {users.company.name}
            </div>
          </div>
        ))}
      </>
    );
  }
  componentDidMount() {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      console.log(response.data);
      this.setState({ users: response.data });
    });
  }
}
