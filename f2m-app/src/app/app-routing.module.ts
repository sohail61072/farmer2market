import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { from } from 'rxjs';
import { AppComponent } from './app.component';
import { BasketComponent } from './basket/basket.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { CustomerComponent } from './customer/customer.component';
import { ItemComponent } from './item/item.component';
import { LoginComponent } from './login/login.component';



const routes: Routes = [
  {path: "" , component:LoginComponent},
  {path: "customer", component:CustomerComponent},
  {path: "checkout", component:CheckoutComponent},
  {path: "item", component:ItemComponent},
  {path: "basket", component:BasketComponent},
  
  // 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
