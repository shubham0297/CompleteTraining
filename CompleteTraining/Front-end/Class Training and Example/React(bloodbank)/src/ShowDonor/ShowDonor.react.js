import React from 'react';
import DataGrid from '../DataGrid/DataGrid.react';
import PropTypes from 'prop-types';


let donorList = [{donorName:"Shubham",phoneNumber:7867589,donationCount:45},
                {donorName:"Pranjal",phoneNumber:356349,donationCount:65},
                {donorName:"Karan",phoneNumber:7345689,donationCount:54}];
const ShowDonor = (props) => {
    return (
        <div >
            <h1 className='text-center'>{props.title}</h1>
            <DataGrid donorList={donorList}>
                <thead>
                    <tr>
                        <th>Donor Names</th>
                        <th>Phone Number</th>
                        <th>Donation Count</th>
                    </tr>
                </thead>

            </DataGrid>
        </div>
    );

}

ShowDonor.propTypes = {
    title : PropTypes.string.isRequired
};

export default ShowDonor;