import { useEffect, useState } from "react";
import {
  getAccountDetailsList,
  onAccountDeleteClickHandler,
} from "../Services/AccountDetails.service";

export default () => {
  const [accountDetailsList, setAccountDetailsList] = useState([]);

  useEffect(() => {
    getAccountDetailsList().then((response) => {
      console.log(response);
      if (response && response.data) {
        setAccountDetailsList(response.data);
      }
    });
  }, []);

  return (
    <>
      <h1 className="text-centre">Account Details List</h1>
      <table className="table table-dark table-striped">
        <thead>
          <tr>
            <th>Account Number</th>
            <th>User ID</th>
            <th>Account Status</th>
            <th>Account CreatedOn</th>
            <th>Account Type</th>
            <th>Login Password</th>
            <th>Transaction Password</th>
            <th>Account Balance</th>
            <th>Account Lock</th>
            <th>Options</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {accountDetailsList.map((accountdetails) => {
            return (
              <tr key={accountdetails.accountNumber}>
                <td>{accountdetails.accountNumber}</td>
                <td>{accountdetails.userID}</td>
                <td>{accountdetails.accountStatus}</td>
                <td>{accountdetails.createdOn}</td>
                <td>{accountdetails.accountType}</td>
                <td>{accountdetails.loginPassword}</td>
                <td>{accountdetails.transactionPassword}</td>
                <td>{accountdetails.accountBalance}</td>
                <td>{accountdetails.accountLock}</td>
                <td>
                  <button
                    onClick={() => {
                      onAccountDeleteClickHandler(accountdetails.accountNumber);
                    }}
                    className="btn btn-danger"
                  >
                    Delete
                  </button>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};
