import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataService } from '../data.service';

@Component({
  selector: 'app-order-online',
  templateUrl: './order-online.component.html',
  styleUrls: ['./order-online.component.css']
})
export class OrderOnlineComponent implements OnInit {
  totalRestaurents: any;
  backupTotalRestaurents: any;
  constructor(private router:Router,private dataService: DataService) { }

  ngOnInit() {
    //Get restaurent details from Dataservice

    this.dataService.getRestaurents().subscribe(data => {
            this.totalRestaurents = data;
            this.backupTotalRestaurents = data;
    })

  }
orderNow(item){
  sessionStorage.setItem("restaurantId",item.id);
  sessionStorage.setItem("restaurantName",item.restaurantName);

	this.router.navigateByUrl('/menu'); }
 

  FilterRestaurants(event: any){
  let resturant = event.target.value;
 

  this.totalRestaurents= this.backupTotalRestaurents.filter( it => {
      return it.restaurantName.toLowerCase().includes(resturant.toLowerCase());
    });
  }
}
