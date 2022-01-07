import { useEffect, useState } from "react"
import { getPayeeList } from "../Services/Payee.service";


export default()=>{
    const [payeeList, setPayeeList] = useState([]);

    useEffect(()=>{
        getPayeeList().then((response)=>{
            console.log(response);
            if(response && response.data){
                setPayeeList(response.data);
            }
        })
    },[])

    return(
        <>
        <h1 className="text-centre">Payee List</h1>
        <table className="table table-dark table-striped">
            <thead>
                <tr>
                    <th>Beneficiary Acc No</th>
                    <th>Beneficiary Name</th>
                    <th>Beneficiary Nick Name</th>
                </tr>
            </thead>
            <tbody>
               {payeeList.map((payee)=>{
                   return(
                <tr key={payee.beneficiaryAccNo}>
                    <td>{payee.beneficiaryAccNo}</td>
                    <td>{payee.beneficiaryName}</td>
                    <td>{payee.nickname}</td>
                </tr>
                   )
               })}
            </tbody>
        </table>
        
        </>
    )
}