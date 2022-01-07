import React,{Component}  from "react";

export default class SampleError extends Component{

    myArr = [1,2];
    render(){
        return<h1> IN SampleError {this.myArr[10].toString()}</h1>
    }
}