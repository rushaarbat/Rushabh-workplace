import { useEffect, useState } from "react"
import { getAccountList } from "./account.service";

export default () =>{
    const [ accountList , setAccountList] = useState([]);
    useState([]);
    useEffect(() =>{
        getAccountList().then(Response)=> {
if (Response && Response.data){
    setAccountList(response.data)
}
        }
    },[])

    const onSetDetaisClickHandler = (accId)=>{
        getaccountById(accId).then((response) =>{
            if (Response && Response.data){
               alert('name: ' + response.data)
            }
            UserId
        })
    }
    return(
        <>
        <h1 className="test-center">
            Account List
        </h1>
        <table className="table">
<thead>
    <tr>UserId</tr>
    <th>AccountStatus</th>
</thead>
<tbody>
    {accountList.map((account)=>{
        return (
            <tr key={account.accId}>
                <td>{account.UserId}</td>
                <td>{account.accountStatus}</td>
                <td>
                    <button onClick={()=>{
                        onSetDetaisClickHandler(account.accId);
                    }}>
Get Details
                    </button>
                </td>

            </tr>
        )

    })}
</tbody>
        </table>
        </>
    )
}