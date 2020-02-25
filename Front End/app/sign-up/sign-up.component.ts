import { Component, OnInit } from '@angular/core';
import{ Router } from '@angular/router';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { DataService } from '../data.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
   signupForm:FormGroup;
   customer: any;     //variable declaration
   submitted = false;

  constructor(private router:Router,private formBuilder:FormBuilder,private dataService: DataService) { }

  ngOnInit() {
     this.signupForm = this.formBuilder.group({
       name:['',Validators.required],
       password:['',Validators.required],
       phoneNumber:['',Validators.required],
       emailId:['',Validators.required]
     });
  }
  // convenience getter for easy access to form fields
  get f() { return this.signupForm.controls; }


  onSubmit(){
    this.submitted = true;

    // stop here if form is invalid
    if (this.signupForm.invalid) {
        return;
    }
    
    this.customer = this.signupForm.value;
    
    this.dataService.createCustomer(this.customer).subscribe((res)=>{
      sessionStorage.setItem('userId',res.id);
      this.router.navigateByUrl('/');
    });
    
    
  }
}
