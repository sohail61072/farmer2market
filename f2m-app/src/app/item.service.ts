import { Injectable } from '@angular/core';
import { Item } from './Item'
import { HttpClient } from '@angular/common/http';
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
}