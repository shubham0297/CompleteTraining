import React from 'react';
import ShowDonor from '../ShowDonor/ShowDonor.react';
import Search from '../Search/Search.react';
import FetchDonors from '../FetchDonors/FetchDonors.react';
import AddDonor from '../AddDonor/AddDonor.react';
import LIfeCycle from '../LIfeCycle/LIfeCycle.react';
import Blog from '../Blog/Blog.react';
import bbLogo from '../bloodbank.jpg';
import ShowContent from '../ShowContent/ShowContent.react';


const req = {
    location:'Chennai',
    bloodGroup:'B+',
    requiredUnit: '5',
    logo :bbLogo
  }
const Content = (props) => {

    
    return (
        <div >
            <h2>Current Request</h2>
                <ShowContent request={req}></ShowContent>       

                        {/* <ShowDonor title={'Star Donors'}></ShowDonor> */}
            {/* <FetchDonors/> */}
            {/* <Search></Search> */}
            {/* <Blog/> */}
            {/* <AddDonor/> */}
            {/* <LIfeCycle/> */}
        </div>
    );

}

export default Content;