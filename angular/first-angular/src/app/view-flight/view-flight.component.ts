import { Component, OnInit } from '@angular/core';
import { FlightServiceService } from '../flight-service.service';

@Component({
  selector: 'app-view-flight',
  templateUrl: './view-flight.component.html',
  styleUrls: ['./view-flight.component.css']
})
export class ViewFlightComponent implements OnInit {
  flights:any;
  id!: number;
  constructor(private flightService:FlightServiceService) { }

  ngOnInit() {
    let res=this.flightService.getFlight();
    // console.log(res.subscribe((data)=>this.flights=data));
    res.subscribe((data)=>this.flights=data);
  }
  public deleteById(id:number){
    let res=this.flightService.deleteFlightById(id);
    res.subscribe((data)=>this.flights=data);
  }
  public getById(){
    let res=this.flightService.getFlightById(this.id);
    console.log("hii "+this.id);
    // console.log( res.subscribe((data)=>this.flights=data));
    res.subscribe((data)=>this.flights=data);
  }

}
