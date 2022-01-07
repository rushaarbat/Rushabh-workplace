import React, { Component } from "react";
import { connect } from "react-redux";
class PersonForm extends Component {
  state = {
    name: "",
    age: 0,
  };
  onValueChangeHandler = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  onformSubmitHandler = (event) => {
    event.preventDefault();
    console.log(this.state);
    this.props.addPerson(this.state);
  };

  render() {
    return (
      <>
        <h1>I am PersonForm</h1>
        <form onSubmit={this.onformSubmitHandler}>
          <div className="mb-3">
            <label className="from-label">Name : </label>
            <input
              className="from-control"
              name={"name"}
              value={this.state.name}
              onChange={this.onValueChangeHandler}
            />
          </div>
          <label>age : </label>
          <input
            name={"age"}
            value={this.state.age}
            onChange={this.onValueChangeHandler}
          />
          <br />

          <button
            className="btn btn-success"
            type="submit"
            onClick={this.onformSubmitHandler}
          >
            Submit
          </button>
        </form>
      </>
    );
  }
}
const mapStateToProps = (state) => {
  return {};
};
const mapDispatchToProps = (dispatch) => {
  return {
    addPerson: (payload) => dispatch({ type: "PERSON_ADD", payload: payload }),
  };
};
export default connect(mapStateToProps, mapDispatchToProps)(PersonForm);
