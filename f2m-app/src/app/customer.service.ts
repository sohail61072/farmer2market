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
getCustomer():Observable<Customer[]> {
  return this.httpsvc.get<Customer[]>(this.rootURL+"/customer/list")

}
registerNewCustomer(newCustomer:Customer): Observable<Customer> {
  const httpOpts = {
    headers: new HttpHeaders(
      {'Content-Type':
    'application/x-www-form-urlencoded;charset=UTF-8'})
  }
  var reqBody="customerForename=" +newCustomer.customerForename
  +"&customerSurname=" + newCustomer.customerSurname
  +"&customerAddress=" + newCustomer.customerAddress
  +"&customerBalance=" + newCustomer.customerBalance
  +"&customerDOB=" + newCustomer.customerDOB
  +"&customerUsername=" + newCustomer.customerUsername
  +"&customerPassword=" + newCustomer.customerPassword
  
  return this.httpsvc.post<Customer>(
    this.rootURL+"/customer/register", reqBody, httpOpts)
}
}