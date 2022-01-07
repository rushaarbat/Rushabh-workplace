import React,{Component} from "react";
import ContextUserFirstChildConsumer from "./ContextUserFirstChildConsumer";

export default class ContextUserConsumer{
    render(){
        return(
            <>

            <h1> I am in ContextUseConsumer</h1>
            <ContextUserFirstChildConsumer/>
            
            
            </>
        )
    }
}