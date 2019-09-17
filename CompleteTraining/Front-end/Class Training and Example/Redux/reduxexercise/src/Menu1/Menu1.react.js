import React from 'react';
import createdStore,{login,logout} from '../store'
import {connect} from 'react-redux'
import Login from '../Login/Login.react'

class Menu1 extends React.Component {
    constructor(props) {
        super(props);
    }

    checkLoginStatus=()=>{

    }
    render() {
        return (
            <div >
                <a href='#'> Login </a>
                <a href='#'> Logout </a>
                <Login action={this.check} ></Login> 
            </div>
        );
    }
}
// const mapStateToProps = (state) => {
//     return {
//         message : state.message
//     }
// }

const mapDispatchToProps = (dispatch) => {
    return {
        bday:()=>{
            dispatch(login)
        },
        vday:()=>{
            dispatch(logout)
        }
    }
}
export default connect(mapDispatchToProps)(Menu1)
