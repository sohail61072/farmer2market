import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { ItemService} from '../item.service';
import { from } from 'rxjs';
import { Basket } from '../Basket';
import { BasketService } from '../basket.service';



@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {
  
  items:Item[]
  baskets:Basket[]
  newItems:Item[]

  constructor(private itemService:ItemService, private basketService: BasketService) { 

    this.items=[]
    this.baskets=[]
  }


addItemToBasket(productId:number, basketID:number, newItem:Item){
 
this.itemService.addItem(newItem).subscribe(
 res => 
 { newItem =res
   this.itemService.addItemToBasket(basketID, newItem.itemID).subscribe(
    
         res => 
         {this.items = res}
         )
        })}
      


        ngOnInit() {
          this.itemService.getItem().subscribe(
          res =>{this.items=res} 
        )}
          }

      
  