import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-get-flight',
  templateUrl: './get-flight.component.html',
  styleUrls: ['./get-flight.component.scss']
})
export class GetFlightComponent implements OnInit {
  flights:any;
  constructor(private service:AuthServiceService) { }

  ngOnInit(): void {
    this.getFlight();
  }

  public getFlight(){
   let res= this.service.getFlight();
   res.subscribe(data=>this.flights=data);
  }
  
}
