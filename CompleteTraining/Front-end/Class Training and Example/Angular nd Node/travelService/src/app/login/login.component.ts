import { Component, OnInit } from '@angular/core';
import { Credential } from '../credential';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:Credential = {userName: '', passWord: ''};      // we will have to initialize also , if we don't it would throw error
  status:string;
  constructor() { }

  ngOnInit() {
  }
  validate(){
    console.log("Inside validate");
    if(this.user.userName=="India" && this.user.passWord=="India"){
      this.status="Valid User";
      console.log(this.status);
    }
    else{
      this.status = "Invalid user";
      console.log(this.status);
    }
  }

}
