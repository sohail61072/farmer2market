import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Transaction } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Product"
  }
}
