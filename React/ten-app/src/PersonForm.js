import React,{Component} from "react";
import { connect } from "react-redux";
import Person from "./Person";

 class  PersonForm extends Component{
    state={
        name:"",
        age:0,
        selectedId:-1,
    }
    onValueChangeHandler=(event)=>{
        const {name, value} = event.target
        this.setState({[name]:value})
    }
    onFormSubmitHandler=(event)=>{
        event.preventDefault();
        console.log(this.state);
        this.props.addPerson(this.state);
    }
    onEditButtonHandler=()=>{
        this.setState({selectedId:Person.id})
    }
    render(){
        return(
            <>
            <h1>Add Person</h1>
            <form onSubmit={this.onFormSubmitHandler}>
                <div className="mb-3">
                <label htmlFor="name">Name :</label>
                <input id="name" className="form-control" name="name" value={this.state.name} onChange={this.onValueChangeHandler}></input><br/>
                </div>
                <div className="mb-3">
                <label htmlFor="age">Age :</label>
                <input id="age" className="form-control" name="age" value={this.state.age} onChange={this.onValueChangeHandler}></input><br/>
                </div>
                <button className="btn btn-success" type="submit">Submit</button>
            </form>
            </>
            
        )
    }
}
const mapStateToProps=(state)=>{
    return{}
}
const mapDispatchToProps=(dispatch)=>{
    return{
        addPerson:(payload)=> dispatch({type:"PERSON_ADD", payload})
    }
}
export default connect(mapStateToProps, mapDispatchToProps)(PersonForm)