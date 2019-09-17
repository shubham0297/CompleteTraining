import React from 'react';
import {Link}  from 'react-router-dom';



const Header = () => {

    return (
        <div >
            <h1> SK Blood Bank</h1>

            <nav>
                <ul>
                    <li>
                        <Link to='/'>Home</Link>
                    
                        <Link to='/fetch'>Show Donors</Link>
                   
                        <Link to='/add'>Add Donor</Link>
                   
                        <Link to='/blog'>Blogs</Link>
                    </li>

                </ul>
            </nav>
        </div>
    );

}

export default Header;