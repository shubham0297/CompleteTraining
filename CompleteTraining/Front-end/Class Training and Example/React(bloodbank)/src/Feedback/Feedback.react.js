import React from 'react';



const Feedback = (props) => {

    return (
        <div >
            <button className="fa fa-thumbs-o-up" onClick={props.action} > Like </button> &nbsp;&nbsp;&nbsp;
            <button className="fa fa-thumbs-o-down" onClick={props.action1}> Dislike</button> 
        </div>
    );

}

export default Feedback;

// onClick={this.incrementLikes}            {this.state.likeCount}
// onClick={this.incrementDislikes}         {this.state.likeCount}