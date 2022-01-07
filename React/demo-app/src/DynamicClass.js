import React,{Component} from "react";

export default class DynamicClass extends Component{
state={
isTrue:true,
colorList:["red", "yellow","blue","green","orange"],
incrementer:0,
}
onCLickHandler=()=>{
this.setState({isTrue: !this.state.isTrue})
}
onChangeColor=()=>{
this.setState({incrementer:(this.state.incrementer+1)%5})
}
render(){
return(
<>
<h1>In Dynamic CLass</h1>
<div className={this.state.isTrue? "my-true-div":"my-false-div"}>In div with {this.state.isTrue ? "true":"false"} Condition</div>
<button onClick={this.onCLickHandler}>Toggle</button>
<br/>
<div style={{backgroundColor:this.state.colorList[this.state.incrementer]}}>In dynamic style div</div>
<button onClick={this.onChangeColor}>Update Color</button>
</>
)
}
}
