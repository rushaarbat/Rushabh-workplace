import React, {Component} from "react";
import ContextCunsumerChild from "./ContextConsumerChild";
export default class ContextCunsumer extends Component{
render(){
    return(
        <>
        <h1> IN ContextCunsumer</h1>
        <ContextCunsumerChild/>
        </>
    );
}
} 