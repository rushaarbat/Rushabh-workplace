import SmchildComponent from "./SmChildComponent";

import react,{ Component } from "react";

class SmParentsComponent extends Component{
state={
    balance:0
};
onProfit=()=>{
this.setState({balance:this.state.balance+1});
}

onLoss=()=>{
    this.setState({balance:this.state.balance-1});
    }
   
    render(){
       return( <>
       <h1> parents : {this.state.balance}</h1>
       <button onClick={this.onProfit}> family Profit</button>
       <button onClick={this.onLoss}>family Loss</button> 
       <SmchildComponent name={"Rushabh"} onProfit = {this.onProfit}  onLoss={this.onLoss}/>
       <SmchildComponent name={"Chetan"} onProfit= {this.onProfit} onLoss={this.onLoss} />
       
     </>  );
    }
};
export default SmParentsComponent;