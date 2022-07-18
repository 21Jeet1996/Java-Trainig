import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight';
import { FlightServiceService } from '../flight-service.service';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  flight: Flight=new Flight(0,"","");
  message:any;
  constructor(private service:FlightServiceService) { }

  ngOnInit(): void {
  }
  public addFlight(){
    let res=this.service.addFlight(this.flight);
    res.subscribe((data)=>this.message=data);
  }

}
