import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../Customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  customers: Customer[]
  isValid:boolean
  isValidF:boolean
  errorMessage:String
  errorMessageF:String
  customerForename: string
  customerSurname: string
  customerAddress: string
  customerBalance: number
  customerDOB: string
  customerUsername: string
  customerPassword: string
  

  constructor(private customerService:CustomerService, private router:Router) {
    this.customers=[]
    this.isValid=true
    this.isValidF=true
   }

   registerNewCustomer(newCustomer:Customer){
     if(newCustomer.customerForename == ""){
       this.isValid=false;
       this.errorMessage = "Please enter a Firstname"
     } else if (newCustomer.customerSurname == ""){
       this.isValid = false;
       this.errorMessage = "Please enter a Surname"
     } else if (newCustomer.customerAddress == ""){
       this.isValid = false;
       this.errorMessage = "Please enter a valid address"
     }else if ((newCustomer.customerBalance == 0 )|| (isNaN(newCustomer.customerBalance))){
      this.isValid = false;
      this.errorMessage = "Please enter a balance"
     } else if(newCustomer.customerDOB == ""){
       this.isValid = false;
       this.errorMessage ="Please enter a valid DOB"
     }else if (newCustomer.customerUsername == ""){
       this.isValid = false;
       this.errorMessage = "Please enter a valid username"
     }else if (newCustomer.customerPassword = ""){
       this.isValid = false;
       this.errorMessage = "Please enter a valid password"
     } else {
       this.customerService.registerNewCustomer(newCustomer)
       .subscribe(
         res =>{
           newCustomer = res
           console.log(JSON.stringify(res))
           this.customerService.getCustomer().subscribe(        
            res=> {this.customers = res}

                 )})
            
     this.router.navigate(["./customer"]);
     }
    }
    ngOnInit() {
      this.customerService.getCustomer().subscribe(
        res =>{this.customers=res
        console.log(JSON.stringify(res))}
      )
  
    }
  }
  

