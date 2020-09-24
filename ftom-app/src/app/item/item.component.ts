import { Component, OnInit } from '@angular/core';
import {ItemService } from '../item.service'
import { Item } from '../item';



@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {
  
  Item:Item[]

  constructor(private itemService:ItemService) { }

  ngOnInit() {

    this.itemService.getItem()
    .subscribe(
      res =>{ this.Item= res}
    
      
  
)  
  }


}
