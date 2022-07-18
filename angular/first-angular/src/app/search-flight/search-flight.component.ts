import { Component, OnInit } from '@angular/core';
import { Search } from '../search';
import { SearchServiceService } from '../search-service.service';

@Component({
  selector: 'app-search-flight',
  templateUrl: './search-flight.component.html',
  styleUrls: ['./search-flight.component.css']
})
export class SearchFlightComponent implements OnInit {
  search:Search=new Search(0,"","","",new Date,"",new Date,"","",0,0,0);
  message:any;
  constructor(private service:SearchServiceService) { }

  ngOnInit(): void {
  }
  public searchFlight(){
    let res=this.service.searchFlight(this.search);
    console.log("hiiii");
    res.subscribe((data)=>this.message=data);

    console.log(this.message);
  }

}
