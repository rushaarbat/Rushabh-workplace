import {Component} from "react";
import './index.css';
export default class AddPayee extends Component{
    render(){
        return(
<>
<div class="addpayee">
<b><div className="title-payee">Add Payee</div></b><br/>
<form>
<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Beneficiary Name</label>
</div>
<div class="col-auto">
<input type="name" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Beneficiary Account Number</label>
</div>
<div class="col-auto">
<input type="number" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Re-Account Number</label>
</div>
<div class="col-auto">
<input type="number" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Nick Name</label>
</div>
<div class="col-auto">
<input type="name" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div><button type="submit" class="btn btn-success">Save As Beneficiary</button></div>
</form>
</div>           
</>
)
}
}