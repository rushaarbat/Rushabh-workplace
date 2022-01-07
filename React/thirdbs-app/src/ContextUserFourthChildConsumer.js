import React,{Component} from "react";
import { UserConsumer } from "./UserContext";
export default class ContextUserFourthChildConsumer{
    render(){
        return(
            <>

            <h1> I am in ContextUserFourthChildConsumer</h1>
            <UserConsumer>
{(value)=>{
    return(
        <h2> HELLO I AM USER MY NAME IS  {value.name} AND MY is {value.id} AND MY PASSWORD IS {value.password} {" "}</h2>
    );
}}


            </UserConsumer>

            
            </>
        )
    }
}