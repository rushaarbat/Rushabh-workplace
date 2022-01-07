import React,{Component} from "react";
import { connect } from "react-redux";


class CourseList extends Component{
    render(){
        return(
            <>
            <h1>Course List</h1>
            <table className={"table"}>
                <thead>
                    <tr>
                        <th>Sr.No.</th>
                        <th>Course Name</th>
                        <th>Course Fees</th>
                        <th>Options</th>
                        <th>Options</th>
                    </tr>
                    </thead>
                    <tbody>
                        {this.props.courseList.map((course, index)=>{
                            return(
                        <tr key={index}>
                            
                            <td>{index+1}</td>
                            <td>{course.name}</td>
                            <td>{course.fees}</td>
                            <td><button className="btn btn-danger" onClick={()=>{
                                this.props.deletecourseByIndex(index)
                            }}>Delete</button></td>
                            <td><button className="btn btn-warning" onClick={()=>{
                                
                            }}>Edit</button></td>
                        </tr>

                            )

                        })}
                        
                    </tbody>
                
            </table>
            </>
        )
    }
} 
const mapStateToProps=(state)=>{
    return{
        courseList:state.courseList,
    }
}
const mapDispatchToProps=(dispatch)=>{
    return{
        deletecourseByIndex: (index)=> dispatch({type:"COURSE_DELETE", payload:index})
        
    }
}


export default connect(mapStateToProps, mapDispatchToProps)(CourseList);
