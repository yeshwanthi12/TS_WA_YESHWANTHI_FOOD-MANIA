import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataService } from '../data.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
	
  orderTotalPrice = 0;
  menuItems:any;
  restaurantName: string;
  constructor(private router:Router, private dataService: DataService) { }

  ngOnInit() {
    let resId = sessionStorage.getItem('restaurantId');
    this.restaurantName = sessionStorage.getItem('restaurantName');
    this.dataService.getMenuItems(resId).subscribe(data => {
      let menuItems = data;
      console.log(this.menuItems);
      if(!!menuItems){
        for(let i=0;i<menuItems.length;i++){
          menuItems[i].showAdd = true;
          menuItems[i].qty = 0;
        }
      }
      this.menuItems = menuItems;
     
    })
  }

  add(item){
    let menuItems=this.menuItems;
    for(let i=0;i<menuItems.length;i++){
      if(item.itemId == menuItems[i].itemId){
        menuItems[i].showAdd = true;
        menuItems[i].qty = item.qty + 1;
        menuItems[i].showAdd= false;
        menuItems[i].itemTotalPrice=item.qty * item.itemPrice;
      }
      
    }
    this.menuItems = menuItems;
     this.orderTotal(this.menuItems);
   }
   update(item){
     item.qty = item.qty + 1;
     item.itemTotalPrice=item.qty * item.itemPrice;
       this.orderTotal(this.menuItems);
   }
   delete(item){
     item.qty = item.qty - 1;
     item.itemTotalPrice=item.qty * item.itemPrice;
     if(item.qty == 0){
        item.showAdd= true;
     }
       this.orderTotal(this.menuItems);
   }
 
   orderTotal(games){
     let orderTotalPrice =0;
     for(let i=0;i<games.length;i++){
       if(!!games[i].itemTotalPrice){
         orderTotalPrice= orderTotalPrice + games[i].itemTotalPrice;
       }
     }
     this.orderTotalPrice = orderTotalPrice;
     sessionStorage.setItem('orderTotal',JSON.stringify(this.orderTotalPrice));
   }ࠀ
  payOnDelivery(){
    this.router.navigateByUrl('/order-confirmation');
  }
	proceedToCheckout(){
    let orderItems = [];
    for(let i=0;i<this.menuItems.length;i++){
      if(this.menuItems && this.menuItems[i].qty >0){
        this.menuItems[i].userId= parseInt(sessionStorage.getItem('userId'));
        orderItems.push(this.menuItems[i]);
      }

    }
    this.dataService.setOrderItems(orderItems);
		this.router.navigateByUrl('/checkout');
	}
}
