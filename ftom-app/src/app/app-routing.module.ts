import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BasketComponent } from './basket/basket.component';
import { pathToFileURL } from 'url';
import { CheckoutComponent } from './checkout/checkout.component';
import { CustomerComponent } from './customer/customer.component';
import { FarmerComponent } from './farmer/farmer.component';
import { ItemComponent } from './item/item.component';
import { ProductComponent } from './product/product.component';
import { TransactionComponent } from './transaction/transaction.component';


const routes: Routes = [
// {path:"",component:AppComponent},
{path:"basket" ,component:BasketComponent},
{path: "checkout" , component:CheckoutComponent},
{path: "customer" , component:CustomerComponent},
{path: "farmer" , component:FarmerComponent},
{path: "item" , component:ItemComponent},
{path: "product" , component:ProductComponent},
{path: "transaction" , component:TransactionComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[ItemComponent]
