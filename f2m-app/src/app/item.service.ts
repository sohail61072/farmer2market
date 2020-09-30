import { Injectable } from '@angular/core';
import { Item } from './Item'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  rootURL:string
  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:7777/farmertomarket"
}

getItem():Observable<Item[]>{
  return this.httpsvc.get<Item[]>
  (this.rootURL+"/item/list")
}
  addItemToBasket(basketID:number,itemID: number):Observable<Item[]>{
    const httpOpts ={
      headers: new HttpHeaders(
        {'Content-Type':
        'application/x-www-form-urlencoded;charset=UTF-8'})
      }

      var reqBody = "basketID="+basketID+"&itemID="+itemID

      return this.httpsvc.post<Item[]>(
        this.rootURL+"baskets/add-item-to-basket", reqBody, httpOpts
      )
  }
  

addItem(newItems: Item): Observable<Item> {
  const httpOpts = {
    headers: new HttpHeaders(
      {'Content-Type':
    'application/x-www-form-urlencoded;charset=UTF-8'})
  }
  var reqBody =
  "quantity=" + newItems.selectedQuantity + "&price=" + newItems.itemPrice

  return this.httpsvc.post<Item>(
    this.rootURL + "/register", reqBody, httpOpts)
  
}}
