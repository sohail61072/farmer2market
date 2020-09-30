import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { ItemService} from '../item.service';
import { from } from 'rxjs';


@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {
  
  items:Item[]

  constructor(private itemService:ItemService) { }

  ngOnInit() {

    this.itemService.getItem()
    .subscribe(
      res =>{ this.items= res}
    
      
  
)  
  }


}
