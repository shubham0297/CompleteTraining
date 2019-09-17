import React from 'react';



const Footer = () => {

    return (
        <div >
            <table>
                <thead>
                    <tr>
                        <th>Private</th>
                        <th>Connect with us</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <ul>
                                <li><a href="#">ABC Hospital</a></li>
                                <li><a href="#">DEF Hospital</a></li>
                                <li><a href="#">GHI Hospital</a></li>
                            </ul>
                        </td>
                    
                        <td>
                            <ul>
                                <li><span  className="fa fa-facebook-official "></span></li>
                                <li><span  className="fa fa-twitter "></span></li>
                                <li><span  className="fa fa-instagram "></span></li>
                            </ul>
                        </td>
                    </tr>

                </tbody>
            </table>
            
        </div>
    );

}

export default Footer;