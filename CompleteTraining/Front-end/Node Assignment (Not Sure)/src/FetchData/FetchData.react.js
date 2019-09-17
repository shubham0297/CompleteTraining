import React from 'react';
import DisplayResult from '../DisplayResult/DisplayResult.react'


class FetchData extends React.Component {
    constructor(props) {
        super(props);
        this.state={
            dataFetched:[],                             // to store the json response
            isLoaded:false
        }
    }

    componentDidUpdate(props,state){
        console.log("Component updated");
    }
    componentDidMount(){
        fetch(this.props.url_to_fetch).then(response=>response.json()).then(resp=>{this.setState({dataFetched:resp.items,isLoaded:true});
            }
        );
        console.log("Component Mounted");
    }

    shouldComponentUpdate(props,state){
        console.log(props.url_to_fetch)
        fetch(props.url_to_fetch).then(response=>response.json()).then(resp=>{state.dataFetched = resp.items;
        console.log(state.response);
        console.log("Fetch");
        this.forceUpdate();
        this.render();
            }
        );
        
        return true;
    }
    render() {
        if(!this.state.isLoaded){
            return (
                <div>
                    <h3>  Fetching result ... </h3>
                </div>
            );
        }
        else{
            return (
                <div>
                    <DisplayResult dataList={this.state.dataFetched}></DisplayResult>             {/*Passing data retreived to Display component to display*/}  
                     <p>
                        {this.props.url_to_fetch}
                    </p> 
                </div>
            );
        }
    }
}


export default FetchData;