import React,{Component}  from "react";
class ConditionalComponent extends Component{

state={
    showText : true,
}

onTogleShowText=()=>{
    this.setState({showText:!this.state.showText});
}

render(){
    return<>

    {this.state.showText && <h1> From Conditional Component</h1>}

    <button onClick={this.onTogleShowText}>{this.state.showText ? "Hide" : "Show"}</button>
</>
}
};
export default ConditionalComponent;