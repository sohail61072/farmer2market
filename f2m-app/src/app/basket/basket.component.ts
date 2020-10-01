import { Component, OnInit } from '@angular/core';
import { Basket } from '../Basket';
import { BasketService } from '../basket.service';
import { Item } from '../item';
import { ItemService } from '../item.service';
import { BasketItems } from '../basketItems';

@Component({
  selector: 'app-basket',
  templateUrl: './basket.component.html',
  styleUrls: ['./basket.component.css']
})
export class BasketComponent implements OnInit {

  baskets: Basket[];
  items: Item[];
  basketItems: BasketItems[];
  baskeID: number;
  itemID: number;
  itemName: string;
  itemPrice: number
  itemQuantity: number;
  totalPrice: number;


  constructor(private basketService: BasketService, private itemService: ItemService) { 
    this.baskets=[]
    this.items=[]
    this.basketItems=[]
  }
  addItemToBasket(basketID:number, itemID: number) {
    this.itemService.addItemToBasket(basketID, itemID,  ).subscribe(
      res=> {
        this.items = res
        res => {this.baskets = res}
      }
    )
  }

  // removeItemFromBasket(index:number){
  //   this.itemService.deleteItem(index).subscribe(
  //     res => {
  //       this.basketService.getItemsFromBasket(this.basketId).subscribe(
  //         res => {this.items = res}
  //       )
  //     }
  //   )
  // }

  ngOnInit(): void {
    this.basketService.getItems(10).subscribe(
    res =>{this.basketItems=res 
    console.log(JSON.stringify(this.basketItems))} 
    
    )} 
}