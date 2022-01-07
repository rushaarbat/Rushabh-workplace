import react,{Component} from "react";
export default class LifeCycleUnmount extends Component{


    render(){
        console.log("In LifeCycleUnmount");
        return<h1> In Life LifeCycleUnmount</h1>
    
    }

    componentWillUnmount(){
        console.log("In componentWillUnmount");
    }
}