import React from 'react';
import ReactDOM from 'react-dom';
import ShowCity from '../ShowCity/ShowCity.react';


class LIfeCycle extends React.Component {
    constructor(props) {
        super(props);
        this.state={
            name:"Ramesh",
            city:"Chennai"
        }
        console.log("Constructor called");

        /* Create a stateless component showCity which takes a prop city and display the same 
        when the state property city changes observe showCity render is also called */
    }
    componentDidMount(){
        console.log("Component Did Mount called");
        //const elementToAdd = '<h1>Added to DOM</h1>'
        const element = ReactDOM.findDOMNode(this);
        const child = element.firstChild;
        console.log(child);
        ReactDOM.render("Ramesh",child);
        console.log(element)
    }
    change = ()=>{
        console.log("Change called");
        this.setState({name:this.state.name+"Ji"});
    }

    shouldComponentUpdate(){
        return true;
    }

    componentDidUpdate(){
        console.log("Did Mount Called Component Updated")
    }
    render() {
        
        console.log("Render Method Called")
        return (
            <div>
                <h3>{this.state.name}</h3>
                <button onClick={this.change}>Update</button>
                <ShowCity city={this.state.city}/>
            </div>
        );
    }
}

export default LIfeCycle;