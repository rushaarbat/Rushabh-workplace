import React,{Component} from "react";
export default class PersonForm extends Component{
state={
name:"",
age:0,
mobile:0,

myList:[],
}
onInputChange=(event)=>{
this.setState({[event.target.name]:event.target.value})
console.log(event.target.name);
}
onFormSubmitHandler=(event)=>{
event.preventDefault();
console.log("in submit");
console.log(this.state);
}
onAdd=(index)=>{
const myListCopy=this.state.myList;
myListCopy.push(<h3>Hi My name is {this.state.name},My age is {this.state.age}
and my Mobile No is {this.state.mobile}<button onClick={()=>{
  console.log("delet clicked");
  this.onDeleteByIndex(index)}}>Delete</button></h3>);
this.setState({myList:myListCopy, name:"", age:0, mobile:0});
};
onDeleteByIndex=(index)=>{
const myListCopy=this.state.myList;
myListCopy.splice(index, 1);
this.setState({myList: myListCopy});
}
render(){
return (
<>
<h1>Person Form</h1>
<form onSubmit={this.onFormSubmitHandler}>
<label>Name:</label>
<input
name={"name"}
value={this.state.name}
onChange={this.onInputChange}
></input>
<br />
<label>Age:</label>
<input
name={"age"}
value={this.state.age}
onChange={this.onInputChange}
></input>
<br />
<label>Mobile No:</label>
<input
name={"mobile"}
value={this.state.mobile}
onChange={this.onInputChange}
></input>
<br />
<button type="submit" onClick={this.onAdd}>
Submit
</button>
</form>
<h1>My List</h1>
{this.state.myList.map((element, index) => (
<div key={index}>
<div>{element}</div>
</div>
))}
</>
);
}

}
