import React, { Component } from "react";
import PersonForm from "./PersonForm";
import PersonList from "./PersonList";
class Person extends Component {
  state = {};
  render() {
    return (
      <>
        <h1>I am Person</h1>
        <br />
        <div className="row">
          <div className="col-md-5">
            <PersonForm />
          </div>

          <div className="col-md-7">
            <PersonList />
          </div>
        </div>
      </>
    );
  }
}
export default Person;
