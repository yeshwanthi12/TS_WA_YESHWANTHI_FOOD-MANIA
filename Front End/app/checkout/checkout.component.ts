import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { DataService } from '../data.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  checkoutForm:FormGroup;
  checkoutUser : any;
  userId: any;
  restaurantId: any;
  orderTotal: string;
  finalOrder: any;
  submitted = false;

  constructor(private router:Router,
  private formBuilder: FormBuilder, 
  private dataService: DataService) { }

  ngOnInit() {
    this.checkoutForm = this.formBuilder.group({
      name:['',Validators.required],
      address:['',Validators.required],
      number:['',Validators.required],
      nameOnCard:['',Validators.required],
      cardNumber:['',Validators.required],
      expMonth:['',Validators.required],
      expYear:['',Validators.required],
      cvv:['',Validators.required],
      zip:['',Validators.required],
    });
    this.orderTotal = sessionStorage.getItem('orderTotal');
  }
   // convenience getter for easy access to form fields
   get f() { return this.checkoutForm.controls; }
onSubmit(){
  this.submitted = true;

  // stop here if form is invalid
  if (this.checkoutForm.invalid) {
      return;
  }
  this.checkoutUser = this.checkoutForm.value;

  this.userId = sessionStorage.getItem('userId');
  this.restaurantId = sessionStorage.getItem('restaurantId');
  
  this.checkoutUser.userId = this.userId;
  this.checkoutUser.restaurantId = this.restaurantId;
  this.checkoutUser.orderTotal = this.orderTotal;
  this.finalOrder = this.dataService.getOrderItems();
  this.dataService.setFinalOrder(this.finalOrder).subscribe(
    (res) =>{

    }
  )
  this.dataService.checkoutUser(this.checkoutUser).subscribe((res) =>{
      console.log("successfully posted checkout values");
  });
	this.router.navigateByUrl('/order-confirmation');
  }
}
