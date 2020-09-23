import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasketComponent } from './basket/basket.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { CustomerComponent } from './customer/customer.component';
import { FarmerComponent } from './farmer/farmer.component';
import { ItemComponent } from './item/item.component';
import { ProductComponent } from './product/product.component';
import { TransactionComponent } from './transaction/transaction.component';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    BasketComponent,
    CheckoutComponent,
    CustomerComponent,
    FarmerComponent,
    ItemComponent,
    ProductComponent,
    TransactionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
