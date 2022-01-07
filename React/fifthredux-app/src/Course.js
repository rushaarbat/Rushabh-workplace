import React, { Component } from "react";
import { connect } from "react-redux";
import CourseForm from "./CourseForm";
import CourseList from "./CourseList";
class Course extends Component {
  render() {
    return (
      <>
        <h1> In Course</h1>
        <br />
        <div className="row">
          <div className="col-md-5">
            <CourseForm />
          </div>
          <div className="col-md-7">
            <CourseList />
          </div>
        </div>
      </>
    );
  }
}
export default connect()(Course);
