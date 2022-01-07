import React,{Component} from "react";

export default class ResultComponent extends Component{
    state={
    
        percentage: 0,
        result: "Invalid",
        color:  "white",
         };

        onCalculatorHandler=(event)=>{
        console.log("In Handler");
            this.setState({percentage: event.target.value});
            };

       onClickHandler=()=>{
           const    { result,color} = this.calculateResult(this.state.percentage);
             //this.setState({result : result, color: color});
           this.setState({result, color}); //same as above statement
               
       } ;
       
       calculateResult=(percentage)=>{
           //let result="Invalid";
           let resultObject = {
               result: "Invalid",
               color: "white",
           };
           if(percentage>=0 && percentage<35){
               //result = "Fail";
           
               resultObject = {
                result: "Fail",
                color: "red",
            };
         }
           else if(percentage >=35 && percentage <= 50){
               //result = "Jus pass";
               resultObject = {
                result: "just pass",
                color: "pink",
            };
           }
           else if(percentage >50 && percentage <=60){
              // result = "Second Class"
               resultObject = {
                result: "Second Class",
                color: "orange",
            };
           }
           else if(percentage >60 && percentage <=70){
           // result = "first Class"
            resultObject = {
                result: "first Class",
                color: "blue",
            };
        }
           else if(percentage >70 && percentage<=100){
               //result = "Distiction"
               resultObject = {
                result: "Distiction",
                color: "green",
            };
           }
           return resultObject;

       } ; 

render(){
    return(<>
    <h1>Result Calculator</h1>
   
    <input
value={this.state.percentage}
onChange={this.onCalculatorHandler}
/>
<br/>
<button onClick={this.onClickHandler}> calculate Result</button>
<div style={{ backgroundColor:this.state.color}}> Your Result Is : {this.state.result}</div>


    </>

    );
}


}