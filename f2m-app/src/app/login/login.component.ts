import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  
    username: string;
    password: string;
    errorMessage:String
    isValid:boolean
    constructor(private router : Router) {
      this.isValid=true;
     }
    ngOnInit() {
    }
    login() {
      if (this.username == null) {
        this.isValid = false;                                 // validation for inputs, isvalid must be true for error to disappear
        this.errorMessage = "Please Enter a UserName"
      } else if (this.password == null){
        this.isValid = false;
        this.errorMessage = "Please Enter a Password"
      }
    
    else if  (this.username == 'customer' && this.password == 'customer') {
    this.router.navigate(['customer']);
    }
    else if(this.username == 'farmer' && this.password == 'farmer') {
      this.router.navigate(['farmer']);
      }
    else if(this.username == 'admin' && this.password == 'admin'){
      this.router.navigate(['registered-users'])
    }
    else {
      alert("Invalid credentials.")
      }
    }
    }
    