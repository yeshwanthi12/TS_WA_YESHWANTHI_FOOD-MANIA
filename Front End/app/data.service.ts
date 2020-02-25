import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {HttpParams} from  "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DataService {
  orderItems: any;

  constructor(private http: HttpClient) { }

// Simple POST request with response type <any>
  public createCustomer(customer){
    return this.http.post<any>('/api/createAccount', customer);
  }

  // Simple GET request with response type <any>
  public getRestaurents(){
    return this.http.get<any>('/api/restaurants');
  }

  //GET call request to check login user
  public loggedInUser(username,password){
    
       return this.http.get<any>("/api/login/"+username+'/'+password);
       
  }

  //POST call for checkout user
  public checkoutUser(user){
    return this.http.post<any>('/api/Checkout',user);
  }

  public getMenuItems(restaurantId){
    return this.http.get<any>("/api/"+restaurantId+"/menu");
  }
  public setOrderItems(orderItems){
    this.orderItems =orderItems;
  }
  public getOrderItems(){
    return this.orderItems;
  }
  public setFinalOrder(finalOrders){
    console.log(finalOrders);
    //return finalOrders;
    return this.http.post<any>("/api/finalOrder", finalOrders);
  }
}
