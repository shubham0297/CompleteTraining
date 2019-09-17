import React from 'react';



const ShowContent = (props) => {
    

    return (
        <div >
                <ol>
                <li>Location : {props.request.location}</li>                
                {/* // AS for routing content beacme child. Earlier it was parent to prop in container was fine */}
                <li>Blood Group : {props.request.bloodGroup}</li>   
                <li>Units Required : {props.request.requiredUnit}</li>
                <li><img src={props.request.logo} alt="Image"></img></li>
            </ol>
            {/* <h3>{props.location}</h3> */}

        </div>
    );

}

export default ShowContent;