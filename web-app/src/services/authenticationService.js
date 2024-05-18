import { removeToken } from "./localStorageService";

export const logOut = () => {
  removeToken();
};
