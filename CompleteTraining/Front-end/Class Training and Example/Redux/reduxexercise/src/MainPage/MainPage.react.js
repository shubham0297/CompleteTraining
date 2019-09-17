import React from 'react';
import Menu from '../Menu/Menu.react'
import Login from '../Login/Login.react';


class MainPage extends React.Component {
    constructor(props) {
        super(props);
    }
    
    render() {
        return (
            <div >
                {/* <p>Hi</p> */}
                <p>{this.props.loggedIn}</p>
                <Menu></Menu>
                <Login></Login>
            </div>
        );
    }
}
// const mapStateToProps = (state) => {
//     return {
//         message : state.loggedIn
//     }
// }

// const mapDispatchToProps = (dispatch) => {
//     return {
//         bday:()=>{
//             dispatch(birth)
//         },
//         vday:()=>{
//             dispatch(valentine)
//         }
//     }
// }

// export default connect(mapDispatchToProps)(Menu)
 export default MainPage;