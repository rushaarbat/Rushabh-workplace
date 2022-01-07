import React, { Component } from "react";
import { connect } from "react-redux";
class courseList extends Component {
  render() {
    console.log(this.props.courseList);
    return (
      <>
        <h1> Course List is </h1>
        <table className={"table"}>
          <thead>
            <tr>
              <th>Sr.No</th>
              <th>Name</th>
              <th>Fees</th>
              <th>Option</th>
            </tr>
          </thead>
          <tbody>
            {this.props.courseList.map((course, index) => {
              return (
                <tr key={index}>
                  <td> {index + 1}</td>
                  <td> {course.name}</td>
                  <td> {course.fees} </td>
                  <td>
                    <button
                      className="btn btn-danger"
                      onClick={() => this.props.deleteCourseByIndex(index)}
                    >
                      -
                    </button>
                    <button
                      className="btn btn-secondary"
                      onClick={() => this.props.editCourseByIndex(index)}
                    >
                      edit
                    </button>
                  </td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </>
    );
  }
}
const mapStateToProps = (state) => {
  return {
    courseList: state.courseList,
  };
};
const mapDispatchToProps = (dispatch) => {
  return {
    deleteCourseByIndex: (index) =>
      dispatch({ type: "COURSE_DELET", payload: index }),
  };
};
export default connect(mapStateToProps, mapDispatchToProps)(courseList);
