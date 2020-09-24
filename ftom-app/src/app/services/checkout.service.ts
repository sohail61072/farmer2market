import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Checkout } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Checkout';


@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Checkout"
  }
 
}
