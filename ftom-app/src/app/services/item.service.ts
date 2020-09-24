import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Item } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Item';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Item"
  }
 
}
