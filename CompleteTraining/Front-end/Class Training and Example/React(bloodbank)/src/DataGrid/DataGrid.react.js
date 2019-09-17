import React from 'react';
import PropTypes from 'prop-types';



const DataGrid = (props) => {

    return (
        <div>
            <br/>
            <table className="table table-stripped">
                            {/* Though it will get rendered, but will show error in console, So use thead and tbody etc */}
                {props.children}
                <tbody>
                {
                    props.donorList.map((name,index)=>{
                        return <tr key={index}>
                        <td>{props.donorList[index].donorName}</td>
                        <td>{props.donorList[index].phoneNumber}</td>
                        <td>{props.donorList[index].donationCount}</td>
                        </tr>
                    })
                }
                </tbody>
                
            </table>
            
        </div>
    );

}

DataGrid.propTypes = {
    donorList : PropTypes.arrayOf(PropTypes.shape({
        donorName:PropTypes.string.isRequired,
        phoneNumber:PropTypes.number.isRequired,
        donationCount:PropTypes.number.isRequired
    }).isRequired).isRequired
}
/* or let donor =PropTypes.shape({
        donorName:PropTypes.string.isRequired,
        phoneNumber:PropTypes.number.isRequired,
        donationCount:PropTypes.number.isRequired
    })
    and then 
    DataGrid.propTypes  = PropTypes.arrayOf(donor).isRequired
*/

export default DataGrid;