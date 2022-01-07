import React,{Component} from "react";
import {connect} from "react-redux";

class CourseForm extends Component{
    state={
        name:"",
        fees:0,
    }
    onValueChangeHandler=(event)=>{
          const{name,value}=event.target;
          this.setState({[name]:value})  
    }
    onSubmitClickHandler=(event)=>{
          event.preventDefault();
          console.log(this.state);
          this.props.addCourse(this.state);
    }
    render(){
        return(
            <>
            <h1>Course Form</h1>
            <form onSubmit={this.onSubmitClickHandler}>
                <div className="mb-3">
                <label>Course Name:</label>
                <input name="name" className="form-control" value={this.state.name} onChange={this.onValueChangeHandler}></input>
                </div>
                <div className="mb-3">
                <label>Course Fees:</label>
                <input name="fees" className="form-control" value={this.state.fees} onChange={this.onValueChangeHandler}></input>
                </div>
                <button className="btn btn-success" type="submit">Submit</button>
            </form>
            </>
        )
    }
}
const mapStateToProps =(state)=>{
    return{}
}
const mapDispatchToProps=(dispatch)=>{
    return{
        addCourse:(payload)=> dispatch({type:"COURSE_ADD", payload})
    }
}
export default connect(mapStateToProps, mapDispatchToProps) (CourseForm);