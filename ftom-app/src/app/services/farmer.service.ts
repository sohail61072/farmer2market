import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Farmer } from 'D:/Training/repo/farmer2market/ftom-app/src/app/Farmer';

@Injectable({
  providedIn: 'root'
})
export class FarmerService {

  serviceURL:string
  constructor(private httpsvc:HttpClient) { 
    this.serviceURL="http://localhost:4200/ftom-app/Farmer"
  }
}
