import axios from "axios";

const BASE_URL = "http://localhost:8081";

export const getAccountList = () => {
  return axios.get(BASE_URL + "/accountdetails/getAll");
};

export const getAccById = (accId) => {
  return axios.get(BASE_URL + "/accountdetails/get/" + accId);
};
