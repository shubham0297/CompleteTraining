import React from 'react';
import {Link}  from 'react-router-dom';
import tom from '../assests/tom.jpg';
import puro from '../assests/puro.jpg';
import whiskey from '../assests/whiskey.jpg';




const HomePage = () => {

    return (
        <div>
                <nav>
                <ul>
                    <li>
                    
                    <Link to='/dogs/whiskey'>Whiskey &nbsp;<img src={whiskey}></img> </Link>
                    </li>
                    <li>
                        <Link to='/dogs/tom'>Tom &nbsp; <img src={tom}></img></Link>
                    </li>
                    <li>
                        <Link to='/dogs/puro'>Puro &nbsp; <img src={puro}></img></Link>
                    </li>
                </ul>
            </nav>

        </div>
    );

}

export default HomePage;