import { NullTemplateVisitor } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { AuthServiceService } from '../auth-service.service';
import { Login } from '../book-flight/login';
import { FlightServiceService } from '../flight-service.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.scss']
})
export class AdminLoginComponent implements OnInit {

  login:Login=new Login("","","");
  response:any;
  erromessage:any;
 
  constructor(private router: Router, private service:AuthServiceService){}

  ngOnInit(): void {
  }

  public checkLogin(){
    if((this.login.username!=null && this.login.password!=null)&&(this.login.username!='' && this.login.password!='')){
      this.service.authenticate(this.login).subscribe(
        (res:any)=>{
          this.login.token=res.token;
          console.log("token "+this.login.token);
          this.service.validate(res.token);
          window.location.href="/add-flight"
        },error=>{
          this.erromessage=error.error.message
          console.log(this.erromessage)
        }
      )
     }else{
      
     }
   
  }

  public welcome(token: string){
    let res= this.service.welcome(token);
    res.subscribe(data=>this.response=data);
  }

 

  // this.service.authenticate(this.login).subscribe(
  //   (res:any)=>{
  //     this.login.token=res.token;
  //     console.log("token "+this.login.token);
  //     this.service.validate(res.token);
  //     this.welcome(res.token);
  //   }
  // )


}
