import axios from "axios"
import { useEffect, useState } from "react"

export default ()=>{
    const [payeeList, setPayeeList] =useState([]);

    useEffect(()=>{
        axios.get("http://localhost:8080/payee/getAll").then((response)=>{
            console.log(response);
            if(response && response.data){
                setPayeeList(response.data)
            }

        })
    },[])

    //class="table table-striped"
    return(
        <>
        <h1>Payee List</h1>
        <table class="table table-striped"> 
            <thead>
                <tr>
                    <th>Beneficiary Acc No</th>
                    <th>Beneficiary Name</th>
                    <th>Beneficiary Nick Name</th>
                   
                </tr>
            </thead>
            <tbody>
                {payeeList.map((payee, index)=>{
                    return(
                  <tr key={index}>
                    <td>{payee.beneficiaryAccNo}</td>  
                    <td>{payee.beneficiaryName}</td>
                    <td>{payee.nickname}</td>
                   
                  </tr>//BENEFICIARY_ACC_NO  BENEFICIARY_NAME
                    )
                })}
            </tbody>
        </table>
        </>

    )
}