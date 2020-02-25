import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {AboutComponent} from './about/about.component';
import {MenuComponent} from './menu/menu.component';
import{OrderOnlineComponent}from './order-online/order-online.component';
import{SignInComponent}from './sign-in/sign-in.component';
import{SignUpComponent}from './sign-up/sign-up.component';
import{CheckoutComponent}from './checkout/checkout.component';
import{OrderConfirmationComponent}from './order-confirmation/order-confirmation.component';



const routes: Routes = [
	{path:'home',component:HomeComponent},
	{path:'about',component:AboutComponent},
	{path:'menu',component:MenuComponent},
	{path:'order-online',component:OrderOnlineComponent},
	{path:'',component:SignInComponent},
	{path:'sign-up',component:SignUpComponent},
	{path:'checkout',component:CheckoutComponent},
	{path:'order-confirmation',component:OrderConfirmationComponent}

	
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
