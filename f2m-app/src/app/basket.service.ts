import { Injectable } from '@angular/core';
import { Basket } from './Basket';
import { Item } from './item';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BasketService {

  rootURL:string
  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:7777/farmertomarket"
}
getBasket():Observable<Basket[]>{
  return this.httpsvc.get<Basket[]>
  (this.rootURL+"/basket/list")
}
getBasketItem():Observable<Basket[]>{
  return this.httpsvc.get<Basket[]>
  (this.rootURL+"/basket/basketItems/")
 
}}