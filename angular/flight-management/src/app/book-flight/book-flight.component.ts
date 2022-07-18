import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Booking } from '../book';
import { FlightServiceService } from '../flight-service.service';
import { Search } from '../search';

@Component({
  selector: 'app-book-flight',
  templateUrl: './book-flight.component.html',
  styleUrls: ['./book-flight.component.scss']
})
export class BookFlightComponent implements OnInit {

  book:Booking=new Booking(0,0,"","","","",0,0,"",0);
  message:any;
  flightNo:any;
  errorMessage:any="";
  

  constructor(private service:FlightServiceService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.flightNo=this.route.snapshot.paramMap.get('flightNo');
    this.book.flightNo=this.flightNo;
  
  }

  public boolkTicket(){
    
    this.service.bookTicket(this.book).subscribe({
      next:(res:any)=>{
        this.book=res;
        this.book.bookingStatus="confirm";
        console.log(res);
      },
      error:(e)=>{
        this.errorMessage=e.message;
        console.log(e);

      }
    }
    );
  }

}
