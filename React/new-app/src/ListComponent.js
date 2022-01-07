import React,{Component} from "react";
 export  default class ListComponent extends Component{
    state={
        myList : [],
        inputValue: "",
        
    }




    onAdd = ()=>{
console.log("on add");
const myListCopy = this.state.myList;
myListCopy.push(this.state.inputValue);
console.log(myListCopy);
this.setState({myList:myListCopy, inputValue : ""});

    }

    onInputTextChange= (event)=>
    {
        console.log(event.target.value);
        this.setState({inputValue : event.target.value});
    };



    render(){
        return(
            <>
            <h1> From ListComponent</h1>

            <input   value= {this.state.inputValue}
                    onChange= {this.onInputTextChange}     >
            
            </input>

            <button onClick ={this.onAdd}> Add</button>
            <h2> In Side List Component</h2>
            {this.state.myList.map((element,index)=>(
           <div key={index}> 
    
            <div > {element}</div>
                </div>
            ))}




            </>
        );
    }

}  