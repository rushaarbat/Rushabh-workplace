import { Component } from "react";

export default class NewPersonComponent extends Component {
state = {
name: "",
age: 0,
mobile: 0,
personList: []
};

onValueChangeHandler = (event) => {
console.log(event.target.name);
this.setState({ [event.target.name]: event.target.value });
};

onSubmitHandler = (event) => {
event.preventDefault();
console.log("On Submit");
this.setState({
personList:[...this.state.personList,{name:this.state.name,age:this.state.age,mobile:this.state.mobile}]
})

// this.onAdd();
// console.log(this.state.personList);

this.setState({name: (this.state.name = "")});
this.setState({age: (this.state.age =0)});
this.setState({mobile: (this.state.mobile =0)});
};
// onAdd = () => {
// console.log("On Add");
// const personListCopy = this.state.personList;
// console.log(personListCopy);
// personListCopy.push(this.state);
// this.setState({ personList: personListCopy });
// console.log("list updated");
// };

onDelete=(index)=>{
const personListCopy=this.state.personList;
personListCopy.splice(index,1);
this.setState({personList:personListCopy});
}

render() {
return (
<>
{/* <h1>Form Component</h1> */}
<form onSubmit={this.onSubmitHandler}>
<label>Name :</label>
<input
name={"name"}
value={this.state.name}
onChange={this.onValueChangeHandler}
/>
<br />
<label>Age</label>
<input
name={"age"}
value={this.state.age}
onChange={this.onValueChangeHandler}
/>
<br />
<label>Mobile No :</label>
<input
name={"mobile"}
value={this.state.mobile}
onChange={this.onValueChangeHandler}
/>
<br />

<button type="submit">Submit </button>

</form>
{this.state.personList.map((person,index) => (
<p key={index}>Hi I am {person.name}, i am {person.age}. Contact me on {person.mobile} <button onClick={()=>{
this.onDelete(index);
}}>Delete</button></p>
))}
</>
);
}
}


