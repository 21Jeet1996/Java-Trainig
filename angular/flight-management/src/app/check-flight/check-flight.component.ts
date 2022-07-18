import { Component, OnInit } from '@angular/core';
import { Booking } from '../book';
import { FlightServiceService } from '../flight-service.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-check-flight',
  templateUrl: './check-flight.component.html',
  styleUrls: ['./check-flight.component.scss']
})
export class CheckFlightComponent implements OnInit {
  book:Booking=new Booking(0,0,"","","","",0,0,"",0);
  books:any[]=[];
  email!:string;
  errorMessage:any="";
  constructor(private service:FlightServiceService) { }
  
  ngOnInit(): void {
  }

  public checkTicket(){
    this.service.checkTicket(this.email).subscribe({
      next:(res:any)=>{
        this.books=res;
      },
      error:(e)=>{
        this.errorMessage=e.message;
        console.log(e);
      }
    })
  }

  // public cancelTicket(pnr:number){
  //   //let res=
  //   this.book.bookingStatus="cancel";
  //   this.service.cancelTicket(this.book,pnr).subscribe({
  //     next:(res:any)=>{
  //       //this.checkTicket();
  //       this.books=res;  
  //       console.log(res);     
  //     }
  //   })
  //   //res.subscribe((data)=>this.books=data);
  // }

  public cancelTicket(pnr:number){
    Swal.fire({
      title: 'Are you sure?',
      text: '',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes',
      cancelButtonText: 'No',
    }).then((result) => {
      if (result.value) {
        Swal.fire('Ticket Cancel successfully.', '', 'success');
        this.book.bookingStatus="cancel";
        this.service.cancelTicket(this.book,pnr).subscribe({
          next:(res:any)=>{
            this.books=res;  
            console.log(res);  
            this.checkTicket();   
          }
        });

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire('Reject', '', 'error');
      }
    });
  }
  
}
