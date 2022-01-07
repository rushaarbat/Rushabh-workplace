import React,{Component} from "react";
import { Link } from "react-router-dom";
export default class Navbar extends Component{
    render(){
        return(
            <>
           <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">User Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <Link class="nav-link active" aria-current="page" to={"/read"}>Read</Link>
        <Link class="nav-link" to={"/delete"}>Delete</Link>
        <Link class="nav-link" to={"/create"}>Create</Link>
        <Link class="nav-link" to={"/update"}>Update</Link>
        <Link class="nav-link" to={"/update2"}>Update2</Link>
        
      </div>
    </div>
  </div>
</nav>
            </>
        )
    }
}