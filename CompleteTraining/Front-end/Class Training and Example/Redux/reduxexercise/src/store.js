
import reducer from './reducer';
import {createStore} from 'redux';
export const login ={
    type:'LOGIN',
    message: 'Logged In '
}

export const logout ={
    type:'LOGOUT',
    message: 'LogOut'
}

const createdStore = createStore(reducer);
export default createdStore;