import axios from "axios"
import { useEffect, useState } from "react"

export default ()=>{
    const [accountList, setAccountList] =useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/accountdetails/getAll").then((response)=>{
            console.log(response);
            if(response && response.data){
                setAccountList(response.data)
            }

        })
    },[])

    //class="table table-striped"
    return(
        <>
        <h1>Account List</h1>
        <table class="table table-striped"> 
            <thead>
                <tr>
                    <th>Account Number</th>
                    <th>Account Status</th>
                    <th>login Password</th>
                   
                </tr>
            </thead>
            <tbody>
                {accountList.map((accountdetails, index)=>{
                    return(
                  <tr key={index}>
                    <td>{accountdetails.accountNumber}</td>  
                    <td>{accountdetails.accountStatus}</td>
                    <td>{accountdetails.loginPassword}</td>
                   
                  </tr>//BENEFICIARY_ACC_NO  BENEFICIARY_NAME
                    )
                })}
            </tbody>
        </table>
        </>

    )
}