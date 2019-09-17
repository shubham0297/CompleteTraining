import React from 'react';
import Feedback from '../Feedback/Feedback.react';



class Blog extends React.Component {
    constructor(props) {
        super(props);
        this.state ={
            likeCount:1,
            unlikeCount:1
        }
        
    }
    incrementLikes =()=>{
        console.log('Increment Called');
        this.setState({likeCount :this.state.likeCount+1});
    }

    incrementDislikes =()=>{
        console.log('Increment Called');
        this.setState({unlikeCount :this.state.unlikeCount+1});
    }

    render() {
        console.log("Render Called")
        return (
            <div>
                <article>
                    <h1> Who can donate blood</h1>
                    <p>You are eligible to donate blood if you are in good health, weigh at least 110 pounds and are 17 years or older. You are not eligible to donate blood if you: Have ever used self-injected drugs (non-prescription) Had hepatitis.</p>
                </article>
                <span>Likes :</span>{this.state.likeCount} &nbsp;&nbsp;&nbsp;
                <span>Dislikes :</span>{this.state.unlikeCount}
                <Feedback action={this.incrementLikes} action1={this.incrementDislikes}/>
                {/* <Feedback action1={this.incrementDislikes} label={"Increment Unlikes"}/> */}

            </div>
            
        );
    }
}

export default Blog;