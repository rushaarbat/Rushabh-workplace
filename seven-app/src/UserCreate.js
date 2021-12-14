import React,{Component} from "react";
import axios, { Axios } from "axios";

export default class UserCreate extends Component{
    state={
        users:[],
        userObject:{
            username:"",
            phone:"",
            id:1,

        }

    }
        onDeleteClickHandler(id){
        axios.delete("https://jsonplaceholder.typicode.com/users/"+id).then((response)=>{
            console.log(response);
            this.fetchData();
                alert("User Deleted");
        })

    }
    onChangeHandler=(event)=>{
            const{name ,value}=event.target;
            const userObjectCopy=this.state.userObject;
            userObjectCopy[name]=value;
            this.setState({userObject:userObjectCopy})
    }
    onFormSubmitClick=(event)=>{
        event.preventDefault();
        console.log(this.state);
        
        axios.post("https://jsonplaceholder.typicode.com/users" , this.state.userObject).then((response)=>{
            console.log(response);
            this.fetchData();
            alert("User Created");
            this.setState({userObject:{
                username:"",
                phone:"",
            }})
        })
    }
    render(){
        return(
            <>
            <h2>Create UserName</h2>
            <form onSubmit={this.onFormSubmitClick}>
                <label>UserName :</label>
                <input name="username" value={this.state.userObject.username} onChange={this.onChangeHandler}></input>
                <label>Phone :</label>
                <input name="phone" value={this.state.userObject.phone} onChange={this.onChangeHandler}></input>
                <button type="submit">Submit</button>
            </form>
            {this.state.users.map((users, index)=>(
                <div key={index}><div>{index+1}.{users.username}</div>
                <button onClick={()=>{this.onDeleteClickHandler(users.id)}}>Delete</button>
                </div>
                
            ))}
            
            </>
        )
    }
    componentDidMount(){
        this.fetchData();

    }

    fetchData() {
        axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
            console.log(response.data);
            this.setState({ users: response.data });
        });
    }
}