import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Basket } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Basket';



@Injectable({
  providedIn: 'root'
})
export class BasketService {
  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Basket"
  }
 
}
