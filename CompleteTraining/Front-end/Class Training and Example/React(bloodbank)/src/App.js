import React from 'react';
import './App.css';
import Header from './Header/Header.react';
import Footer from './Footer/Footer.react';
import Content from './Content/Content.react';
import bbLogo from './bloodbank.jpg';
import Navigation from './Navigation/Navigation.react';
import ShowProfile from './ShowProfile/ShowProfile.react';

function App() {
  
  return (
    <div className="App">
        <Header></Header>
        <Navigation></Navigation>
        <Footer/>
        <ShowProfile></ShowProfile>
        {/* only one property can be passes...if more than one create object */}
    </div>
  );
}

export default App;
