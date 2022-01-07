import { useEffect, useState } from "react"
import { getApprovalList } from "../Services/approval.service";

export default()=>{
    const [approvalList, setApprovalList] = useState([]);

    useEffect(()=>{
        getApprovalList().then((response)=>{
            console.log(response);
            if(response && response.data){
                setApprovalList(response.data);
            }
        })
    },[])

    return(
        <>
        <h1 className="text-centre">Approval List</h1>
        <table className="table table-dark table-striped">
            <thead>
                <tr>
                    <th>Service Ref Number</th>
                    <th>Approval Status</th>
                </tr>
            </thead>
            <tbody>
               {approvalList.map((approval)=>{
                   return(
                <tr key={approval.srn}>
                    <td>{approval.srn}</td>
                    <td>{approval.approvalStatus}</td>
                </tr>
                   )
               })}
            </tbody>
        </table>
        
        </>
    )
}