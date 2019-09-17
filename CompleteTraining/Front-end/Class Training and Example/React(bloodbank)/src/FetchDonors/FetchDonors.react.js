import React from 'react';
import DataGrid from '../DataGrid/DataGrid.react';



class FetchDonors extends React.Component {
    constructor(props) {
        super(props);
        this.state = {donorList:[]}             
        // if we had  givven another name for property say ...this.state = {dN:[]}
    }
    componentDidMount(){
        let url="http://localhost:3000/donors";
        fetch(url).then(respone=>respone.json()).then(donorList=>this.setState({donorList}));
        // then we would have written ..   fetch(url).then().then(donorList=>this.state({dn:donorList}))
    }

    render() {
        return (
            <div >
                <DataGrid donorList={this.state.donorList}></DataGrid> 
            </div>
        );
    }
}

export default FetchDonors;