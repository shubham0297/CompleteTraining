import axios from 'axios';                                                      // THIS REDUCER IS FOR THUNK(MIDDLEWARE) EXAMPLE
import { createStore,applyMiddleware } from 'redux';
import thunk from 'redux-thunk'
const intialState ={
    isLoaded:false,
    list:[{}]
}
export const myActionCreator = (list,status) =>{
    return{
        type:'GET_ALL_DONORS',
        payload:list,
        isLoaded:status
    }
}

export function getListByThunk(){
    return function(dispatch){
            axios.get("http://localhost:3000/donors").then(resp=>{dispatch(myActionCreator(resp.data,true))});
    }
}
const donorReducer = (state=intialState, action)=>{
    switch (action.type) {
        case 'GET_ALL_DONORS':
            return Object.assign({},action);
        default:
            return state
    }
}

let restStore = createStore(donorReducer,applyMiddleware(thunk));
export default restStore;