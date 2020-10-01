import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './Customer';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  rootURL:string
  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:7777/farmertomarket"

}
getCustomer(customerID:number):Observable<Customer[]>{
  return this.httpsvc.get<Customer[]>(this.rootURL+"/customer/list")
}
}