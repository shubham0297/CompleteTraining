import { Component, OnInit } from '@angular/core';
import { Credential } from '../credential';
import { LoggedInComponent } from '../logged-in/logged-in.component';
import { FormGroup, FormControl, Validators, } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: Credential = {userName: '' , passWord : ''};
  status: string;
  constructor(private router: Router) { }

  ngOnInit() {
    
  }

  validate(){
    if(this.user.userName === 'india' && this.user.passWord === 'india'){
        this.status = 'valid user';
        console.log(this.status);
        this.router.navigate(['/movie']);
        // <LoggedInComponent><LoggedInComponent>;
         } else {
          this.router.navigate(['/error']);
         }

  }
}
