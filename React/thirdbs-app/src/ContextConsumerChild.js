import React, {Component} from "react";
import { PersonConsumer } from "./PersonContext";

export default class ContextCunsumerChild extends Component{
render(){
    return(
        <>
        <h1> IN ContextCunsumerChild</h1>
        <PersonConsumer>
            {(value) =>{
                return(
                    <h2> The LAtest value in context is  {value.name} and age is {" "}  {value.age} {" "} </h2>
                );
            }}
        </PersonConsumer>
        </>
    )
}
} 