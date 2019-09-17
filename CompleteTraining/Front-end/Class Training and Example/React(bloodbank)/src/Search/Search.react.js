import React from 'react';


const clear = () =>{
    console.log('clear invoked');
    return()=>{
        console.log('Inner Function called')
    }
}


const Search = () => {

    return (
        <div >
            <button className="fa fa-search" onClick={(event)=>{console.log(event)}}> Search</button>
            <button className="fa fa-crosshairs" onClick={clear()}> Delete</button>           
            {/* It is clear and not clear(). If we write clear() then it calls it automatically without even click and on clicking also it will not do if we clicked it */}
            {/* { if wrtiting clear() then add return in clear} */}
        </div>
    );

}

export default Search;