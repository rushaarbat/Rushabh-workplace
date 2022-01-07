import {Component} from "react";
import './index.css';
export default class Imps extends Component{
    render(){
        return(
<>
<div className="imps">
<b><div className="title-imps">Initiate IMPS Payment</div></b><br/>
<form>
<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">From Account</label>
</div>
<div class="col-auto">
<input type="number" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">To Account</label>
</div>
<div class="col-auto">
<input type="number" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Amount</label>
</div>
<div class="col-auto">
<input type="number" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Remark</label>
</div>
<div class="col-auto">
<input type="text" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div class="row g-3 align-items-center">
<div class="col-auto">
<label for="inputPassword6" class="col-form-label">Transaction Date</label>
</div>
<div class="col-auto">
<input type="datetime-local" id="inputPassword6" class="form-control" aria-describedby="passwordHelpInline"/>
</div></div><br/>

<div>     <button type="reset" class="btn btn-secondary">Reset</button>
<span>    <button type="submit" class="btn btn-success">Continue</button></span>
</div>

</form>
</div>           
</>
)
}
}