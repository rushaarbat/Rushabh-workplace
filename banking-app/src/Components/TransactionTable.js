import { useEffect, useState } from "react"
import { getTransactionList } from "../Services/TransTable.service";


export default()=>{
    const [transactionList, setTransactionList] = useState([]);

    useEffect(()=>{
        getTransactionList().then((response)=>{
            console.log(response);
            if(response && response.data){
                setTransactionList(response.data);
            }
        })
    },[])

    return(
        <>
        <h1 className="text-centre">Transaction List</h1>
        <table className="table table-dark table-striped">
            <thead>
                <tr>
                    <th>Transaction ID</th>
                    <th>Amount Transferred</th>
                    <th>Mode of Transaction</th>
                    <th>transaction Date</th>
                    <th>Remark</th>
                </tr>
            </thead>
            <tbody>
               {transactionList.map((transaction)=>{
                   return(
                <tr key={transaction.transactionId}>
                    <td>{transaction.transactionId}</td>
                    <td>{transaction.amountTransferred}</td>
                    <td>{transaction.modeOfTransaction}</td>
                    <td>{transaction.transactionDate}</td>
                    <td>{transaction.remark}</td>
                </tr>
                   )
               })}
            </tbody>
        </table>
        
        </>
    )
}