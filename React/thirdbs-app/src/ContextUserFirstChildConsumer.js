import React,{Component} from "react";
import ContextUserSecondtChildConsumer from "./ContextUserSecondChildConsumer";
export default class ContextUserFirstChildConsumer{
    render(){
        return(
            <>

            <h1> I am in ContextUserFirstChildConsumer</h1>
<ContextUserSecondtChildConsumer/>
            
            </>
        )
    }
}