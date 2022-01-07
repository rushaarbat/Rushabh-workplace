import React, {Component} from "react";

class MyFirstClassComponent extends Component{
    state={
        balance:0
    }
  
    render() {
        const {name, age} = this.props;
        return(
        <h2> I am  {name},{age} years of old and my balance is {" "} {this.state.balance}</h2>
        );
    }
    
}
export default MyFirstClassComponent;