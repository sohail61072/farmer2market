import { Injectable } from '@angular/core';
import { Basket } from './Basket';
import { Item } from './item';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BasketItems } from './basketItems';



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
getItems(basketID:number):Observable<BasketItems[]>{
  return this.httpsvc.get<BasketItems[]>(this.rootURL + "/basket/basketItems/"+basketID )
}

// getBasketItem():Observable<BasketItems[]>{
//   // return this.httpsvc.get<Basket[]>
//   return this.httpsvc.get<BasketItems[]>(this.rootURL + "basketItems"+basketId)
//   (this.rootURL+"/basket/basketItems/")
 
}