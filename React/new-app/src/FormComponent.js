import React,{Component} from "react";
export default class FormComponent extends Component{
state = {
    name : "",
    age : 0,
 
};

// onInputNameChange= (event)=>
//     {
//         console.log(event.target.value);
//         this.setState({name : event.target.value});
//     };
//     onInputAgeChange= (event)=>
//     {
//         console.log(event.target.value);
//         this.setState({age : event.target.value});
//     };
    onFormSubmitHandler =   (event)=>{
        event.preventDefault();
        console.log("In Onsubmit");
        console.log(this.state);
    };

    onValueChangeHandler    =   (event)=>{                 //by using this function no need of write above name and age functrion
        console.log(event.target.name);
        this.setState({ [event.target.name] : event.target.value});
    };


render(){
    return(<>
            <h1> Persone Form</h1>
            <form onSubmit = {this.onFormSubmitHandler}>

                <label> Name  : </label>
                <input 
                name={"name"}
                    value= {this.state.name}
                onChange= {this.onValueChangeHandler}/>
                
            
    <br/>
    
    <label> Age : </label>
    <input 
    name = {"age"}
    value= {this.state.age}
    onChange= {this.onValueChangeHandler}/>
        
    <br/>
    <button type="submit"> submit</button>
</form>
</>

    );
}

}