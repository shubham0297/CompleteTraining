import React from 'react';
import {Route,Switch} from 'react-router-dom';
import HomePage from '../HomePage/HomePage.react';
import Whiskey from '../Whiskey/Whiskey.react';
import Tom from '../Tom/Tom.react';
import Puro from '../Puro/Puro.react';  



const Navigate = () => {

    return (
        <div >
            <main>
                <Switch>
                    <Route exact path='/dogs' component={HomePage}></Route>
                    <Route  path='/dogs/whiskey' component={Whiskey}></Route>
                    <Route  path='/dogs/tom' component={Tom}></Route>
                    <Route  path='/dogs/puro' component={Puro}></Route>
                    <Route component={HomePage}></Route> }
                </Switch>
            </main>
        </div>
    );

}


export default Navigate;