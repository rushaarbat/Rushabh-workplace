import { useEffect, useState } from "react"
import { getCustomerDetailsList } from "../Services/CustomerDetails.service";


export default()=>{
    const [custDetailsList, setCustDetailsList] = useState([]);

    useEffect(()=>{
        getCustomerDetailsList().then((response)=>{
            console.log(response.data);
            if(response && response.data){
                setCustDetailsList(response.data);
            }
        })
    },[])

    return(
        <>
        <h1 className="text-centre">Customer Details List</h1>
        <table className="table table-dark table-striped">
            <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Title</th>
                    <th>First Name</th>
                    <th>Aadhar Number</th>
                    <th>Residencial Pin Code</th>
                    <th>Opt for Debit card</th>
                </tr>
            </thead>
            <tbody>
               {custDetailsList.map((customer)=>{
                   return(
                <tr key={customer.custId}>
                    <td>{customer.custId}</td>
                    <td>{customer.title}</td>
                    <td>{customer.firstName}</td>
                    <td>{customer.aadharNumber}</td>
                    <td>{customer.residPincode}</td>
                    <td>{customer.debitCard}</td>
                    
                </tr>
                   )
               })}
            </tbody>
        </table>
        
        </>
    )
}