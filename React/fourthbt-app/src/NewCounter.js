import React,{ Component } from "react";        
import { connect } from "react-redux";      
class NewCounter extends Component{
    state={
        inputValue:0
    }
    onValueChangeHandler=(event)=>{
        this.setState({inputValue:event.target.value})

    }
    render(){

        return <><h1> New Counter {this.props.counter}</h1>
        <input 
        value={this.state.inputValue}
        onChange={this.onValueChangeHandler}/>
        <button onClick={this.props.increment}> Increment</button>
        <button onClick={this.props.decrement}> Decrement</button>
      </>
        } ;
    
    }
    const mapStateToProps=(state)=>{
return {
counter : state.counter,
}
    }
    const mapDispatchToprops = (dispatch)=>{
        return{
            increment: ()=> dispatch({ type : "increment"}),
            decrement: ()=> dispatch({ type: "decrement"}),
        }
    }


    export default connect(mapStateToProps,mapDispatchToprops)(NewCounter);
