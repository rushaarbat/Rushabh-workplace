import React, { Component } from "react";
import { connect } from "react-redux";
class CourseForm extends Component {
  state = {
    name: "",
    fees: 0,
  };
  onValueChangeHandler = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  onformSubmitHandler = (event) => {
    event.preventDefault();
    console.log(this.state);
    this.props.addCourse(this.state);
  };

  render() {
    return (
      <>
        <h1>In Course Form</h1>
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
          <label>fees : </label>
          <input
            name={"fees"}
            value={this.state.fees}
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
const mapStateToProps = () => {
  return {};
};
const mapDispatchToProps = (dispatch) => {
  return {
    addCourse: (payload) => dispatch({ type: "COURSE_ADD", payload: payload }),
  };
};
export default connect(mapStateToProps, mapDispatchToProps)(CourseForm);
