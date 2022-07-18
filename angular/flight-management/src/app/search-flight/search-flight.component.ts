import { Component, OnInit } from '@angular/core';
import { FlightServiceService } from '../flight-service.service';
import { Search } from '../search';

@Component({
  selector: 'app-search-flight',
  templateUrl: './search-flight.component.html',
  styleUrls: ['./search-flight.component.scss']
})
export class SearchFlightComponent implements OnInit {

  //search:Search=new Search(0,"","","",new Date,"",new Date,"","",0,0,0);
  searches:any;
  message:any;
  start!: string;
  end!: string;
  pnr!: number;
  constructor(private service:FlightServiceService) { }

  ngOnInit(): void {
  }

  public searchFlight(){
    this.service.searchFlight(this.start,this.end)
    .subscribe({
      next:(res:any)=>{
        this.searches=res;
        console.log(res);
      }
    })    
  }


}
