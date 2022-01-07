import React,{Component} from "react";

export default class Percentage extends Component{
    state={
    
        percentage: 0,
        
         }
        onCLickHandler=()=>{
        console.log("In Handler");
            this.setState({percentage: event.target.value});
            };
          

render(){
    return(<>
    <h1>In To Percentage Class</h1>
   
    <input
value={this.state.percentages}
onChange={this.onCLickHandler}
/>
<br/>
<button onClick={this.onCLickHandler}>Result</button>
<div> Your Result Is : {this.state.percentage}</div>
    </>

    );
}


}