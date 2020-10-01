import { Component, OnInit } from '@angular/core';
import { Customer } from '../Customer';
import { CustomerService } from '../customer.service';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customers: Customer[]
  customerID: number

  constructor(private customerService:CustomerService) { 
    this.customers=[]
    
  }

  ngOnInit(): void {
    this.customerService.getCustomer().subscribe
         res => {this.customers=res}
    
      }

}
