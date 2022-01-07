import React,{Component} from "react";
import ContextUserFourthChildConsumer from "./ContextUserFourthChildConsumer";
export default class ContextUserThirdChildConsumer{
    render(){
        return(
            <>

            <h1> I am in ContextUserThirdChildConsumer</h1>
            <ContextUserFourthChildConsumer/>

            
            </>
        )
    }
}