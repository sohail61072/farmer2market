import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Customer } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Customer"
  }
}
