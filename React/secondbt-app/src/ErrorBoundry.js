import React,{component} from "react"; 
import { Component } from "react";
export default class ErrorBoundry extends Component{
    state ={
        hasError: false,
    };
    static getDerivedStateFromError(error){
        return{
            hasError: true,

        };
    }
    componentDidCatch(error, info){
        //send error to server via service
        console.log(error);
        console.log(info);
    }
    render()
{
    if (this.state.hasError){
        return <h1> Something Went Wrong Please Check</h1>

    }else{
        return this.props.children;
    }

}} 