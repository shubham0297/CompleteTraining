import React from 'react';



const DisplayResult = (props) => {
    return (
        <div className='container'>
                    <div className="row text-center grid space-around">
                     {
                        props.dataList.map((eachProject,index)=>{
                            return (
                            <div className="col-md-4 d-flex flex-row  flex-center card bg-light" key={index}>
                                <div className="thumbnail">
                                    <h3>#{index+1}</h3>
                                    <img src={eachProject.owner.avatar_url} alt={eachProject.owner.login} width="200" height="200"></img>
                                    <a href={eachProject.owner.html_url}><p><strong>{eachProject.name} </strong> </p></a>
                                    <p>Repository: <a href={eachProject.html_url}>{eachProject.name}</a></p>
                                    <p>Stars: {eachProject.watchers} </p>
                                    <p>Forks: {eachProject.forks} </p>
                                    <p>Issues: {eachProject.open_issues} </p>
                                </div>
                            </div>
                            )
                        })
                    }

                    </div>
            </div>

    );

}

export default DisplayResult;