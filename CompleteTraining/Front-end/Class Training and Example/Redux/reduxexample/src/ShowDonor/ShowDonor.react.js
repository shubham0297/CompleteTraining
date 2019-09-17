import React from 'react';
import {connect} from 'react-redux'
import {myActionCreator,getListByThunk} from '../donorReducer'

const ShowDonor = (props) => {
    console.log(props.isLoaded)
    if(!props.isLoaded){
        return(
            <div>
                <h2>Loading</h2>
                <button onClick={props.get}> GET</button>
            </div>
        );
    }
    else{
        return(
            props.list.map(values=>{
            
                return(
                    <div>
                        <p>{values.donorName}</p>
                        <p>{values.phoneNumber}</p>
                        <p>{values.donationCount}</p>
                        <p>{values.bloodGroup}</p>
                        <p>{values.lastDonated}</p>                
                    </div>
                )
            })
        )
    }
   
}

const mapStateToProps = (state) =>{
    console.log(state)
    return{
        list:state.payload,
        isLoaded:state.isLoaded
    }
}
const mapDispatchToProps = (dispatch) =>{
    return{
        get:()=>{
            dispatch(getListByThunk());
        }
    }
}


export default connect(mapStateToProps,mapDispatchToProps)(ShowDonor);