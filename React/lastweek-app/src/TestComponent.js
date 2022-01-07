// import React, { Component } from "react";
var createReactclass = require("create-react-class");
// class TestComponent extends  Component{
//state={
//  count:0
//  }
//     render(){
//         return<h1> In TestComponent</h1>
//     }
// }
//this iuse in se 6
var TestComponent = createReactclass({
  render: function () {
    return (
      <>
        <h1> In TestComponent with old way : {this.props.name}</h1>
        count: {this.state.count}
        <br />
        <button onClick={this.onIncrementClickhandler}>Increment</button>
        <button onClick={this.onDecrementClickhandler}>Decrement</button>
      </>
    );
  },
  getInitialState: function () {
    return {
      count: 0,
    };
  },
  onIncrementClickhandler: function () {
    this.setState({ count: this.state.count + 1 });
  },
  onDecrementClickhandler: function () {
    this.setState({ count: this.state.count - 1 });
  },
});
export default TestComponent;
