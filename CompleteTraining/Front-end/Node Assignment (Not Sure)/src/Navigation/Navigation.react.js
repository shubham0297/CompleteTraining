import React from 'react';



const Navigation = () => {

    return (

        <div >
            <main>
                <Switch>
                    <Route exact path='/' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Ruby' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Java' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Javascript' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Python' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Cpp' component={()=><FetchData name={All}></FetchData>}></Route>
                    <Route exact path='/Cpp' component={()=><FetchData name={All}></FetchData>}></Route>
                    {/* <Route component={NOTFOUND}></Route> */}

                    
                </Switch>
            </main>
        </div>
    );

}

export default Navigation;