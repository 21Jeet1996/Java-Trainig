import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { addFlight } from '../flight';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.scss']
})
export class AddFlightComponent implements OnInit {
  flight:addFlight=new addFlight(0,"","","",new Date,"",new Date,"","",0,0,0,"");
  token:any;
  message:any;
  constructor(private service:AuthServiceService) { }

  ngOnInit(): void {
  }

  public addFlight(){
    let res=this.service.addFlight(this.flight);
    res.subscribe((data:any)=>this.message="Flight "+data.flightNo+" is added successfully!");
  }
}
