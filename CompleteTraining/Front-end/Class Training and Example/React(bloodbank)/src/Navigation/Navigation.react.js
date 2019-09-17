import React from 'react';
import {Route,Switch} from 'react-router-dom';
import Content from '../Content/Content.react';
import FetchDonors from '../FetchDonors/FetchDonors.react';
import AddDonor from '../AddDonor/AddDonor.react';
import Blog from '../Blog/Blog.react';



const Navigation = () => {

    return (
        <div >
            <main>
                <Switch>
                    <Route exact path='/' component={Content}></Route>
                    <Route exact path='/fetch' component={FetchDonors}></Route>
                    <Route exact path='/add' component={AddDonor}></Route>
                    <Route exact path='/blog' component={Blog}></Route>
                    {/* <Route component={NOTFOUND}></Route> */}

                    
                </Switch>
            </main>
        </div>
    );

}

export default Navigation;