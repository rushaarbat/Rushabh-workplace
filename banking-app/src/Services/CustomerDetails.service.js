import axios from "axios";

const BASE_URL = "http://localhost:8081";

export const getCustomerDetailsList = () => {
  return axios.get(BASE_URL + "/cust/getAll");
};
