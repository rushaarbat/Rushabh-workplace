import React, {Component, component} from "react";
class Child extends Component{

    render() {
        const {name,age} =this.props;
        return (<>
        <h1> {name}</h1>


</>  
);
    }

};