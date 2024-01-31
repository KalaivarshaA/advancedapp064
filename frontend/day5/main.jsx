import React from 'react';
import ReactDOM from 'react-dom/client';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Landingpage from './Components/Landingpage';
import Login from './Components/Login';
import Signup1 from './Components/Signup1';
import { configureStore } from '@reduxjs/toolkit';
import { Provider } from 'react-redux';
import userReducer from './Components/user';
import ForgotPassword from './ForgotPassword';
import ContactUs from './Contactus';
// import Signup from './signup';
import AboutUs from './Components/aboutus';
import MyProfile from './Components/myprofile';
import Form from './Components/form';
import Services from './Components/services';
import Admin from './Components/admin';
import Album from './Components/mui';
import SearchPage from './Components/mui';
const store = configureStore({
  reducer: {
    user: userReducer,
  },
});
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
  <Provider store={store}>
  <Router>
    <Routes>
      <Route path="/login" element={<Login/>}/>
      <Route path="/" element={<Landingpage/>}/>
      <Route path="/signup" element={<Signup1/>}/>
      <Route path="/forgotpassword" element={<ForgotPassword/>}/>
      <Route path="/contactus" element={<ContactUs/>}/>
      <Route path="/aboutus" element={<AboutUs/>}/>
      <Route path="/myprofile" element={<MyProfile/>}/>
      <Route path="/form" element={<Form/>}/>
      <Route path="/services" element={<Services/>}/>
      <Route path="/admin" element={<Admin/>}/>
      <Route path="/searchpage" element={<SearchPage/>}/>



      {/* <Route path="/log" element={<Log/>}/> 
      <Route path="/signup" element={<Signup/>}/>  */}









    </Routes>
  </Router>
  </Provider>
  </React.StrictMode>,
);

