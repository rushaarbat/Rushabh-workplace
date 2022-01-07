import React,{Component} from "react";
import ContextUserThirdChildConsumer from "./ContextUserThirdChildConsumer";
export default class ContextUserSecondtChildConsumer{
    render(){
        return(
            <>

            <h1> I am in ContextUserSecondChildConsumer</h1>
<ContextUserThirdChildConsumer/>
            
            </>
        )
    }
}
