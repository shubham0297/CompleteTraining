import React from 'react';


const url = "https://api.github.com/users/vatsank";

class ShowProfile extends React.Component {
        constructor(props) {
        super(props);
        this.state={
            profile:{},
            loaded:false
        }
    }
 
    componentDidMount(){
        fetch(url).then(data=>data.json()).then(profile=>{this.setState({profile:profile,loaded:true})})
        console.log("called")
    }
    render() {
        if(!this.state.loaded){
            return (
                <div className="showprofile_wrapper">
                    <div>
                        <h1>Loading....</h1>
                    </div>
                    </div>
                    )
        }
        else{
            console.log("Yes")
            console.log(this.state.profile.avatar_url)
            return(
            <div>
                <p>{this.state.profile.login}</p>
                <img src={this.state.profile.avatar_url} alt="Image"></img>
            </div>
            )
        } 
    }
}

export default ShowProfile;