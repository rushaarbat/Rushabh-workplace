import react,  {Component} from "react";
export default class Accessibility extends Component{

    onButtonClickHandler    =()=>{
        console.log("button clicked");
    };
    render(){
        return(
            <>
            <h1>
                I Am Inside Accessibility
            </h1>
            <label htmlFor="name">Name</label>
            <br/>
            <input
            id="name"
            name={"name"}
            placeholder="Please enetr your name"
            aria-lable="name"
            aria-required="true"/>

            <br/>
<button onClick={this.onButtonClickHandler}> Click Me</button>
            <br/>
            <table>
                <tbody>
                    <tr>
                        <td> Rushabh</td>
                        <td> Ram</td>

                    </tr>
                </tbody>
            </table>
            </>
        );
    }
}