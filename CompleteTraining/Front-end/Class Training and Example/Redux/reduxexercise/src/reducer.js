const reducer = (state={loggedIn:"false"}, action)=>{
    switch (action.type) {
        case 'LOGIN':
            // console.log(Object.assign({},action));
            return Object.assign({},action);
        case 'LOGOUT':
            return {...action};                         // Line 4 & 6 are same ...just syntax different. 6 is spreading       
        default:
            return state
    }
}

export default reducer
