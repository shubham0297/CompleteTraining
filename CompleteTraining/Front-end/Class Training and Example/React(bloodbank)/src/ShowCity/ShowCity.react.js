import React from 'react';



const ShowCity = (prop) => {
    console.log("Render called in statless component")
    return (
        <div >
                <h2>{prop.city}</h2>
                
        </div>
    );

}

export default ShowCity;