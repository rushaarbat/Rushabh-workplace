import axios from "axios";

const BASE_URL = "http://localhost:8081";

export const getApprovalList = () => {
  return axios.get(BASE_URL + "/approval/getAll");
};
