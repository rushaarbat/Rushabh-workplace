import react,{Component} from "react";
export default class LifeCycle extends Component{
    constructor(){  //internaly we are oinvoking base class constructor
        //first the constructor of base class wil invock and then constructor of child class get invoke
        super();
        console.log("In Construction");
    }
    render(){
        console.log(" In sRender ");

        return<h1> In LifeCycle</h1>
    }
    componentDidMount(){
        console.log("In ComponentDidMoutn");
    }

    
}