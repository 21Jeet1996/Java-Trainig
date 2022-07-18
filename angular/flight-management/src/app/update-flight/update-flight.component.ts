import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';
import { addFlight } from '../flight';

@Component({
  selector: 'app-update-flight',
  templateUrl: './update-flight.component.html',
  styleUrls: ['./update-flight.component.scss']
})
export class UpdateFlightComponent implements OnInit {
  flight:addFlight=new addFlight(0,"","","",new Date,"",new Date,"","",0,0,0,"");
  flightNo: any;
  message:any;
  constructor(private service:AuthServiceService,private rout:ActivatedRoute) { }

  ngOnInit(): void {
    this.flightNo=this.rout.snapshot.paramMap.get('flightNo');

    this.flight.flightNo=this.flightNo;
    console.log(this.flight.flightNo);
  }

  public updateFlight(){
    this.service.updateFlight(this.flight,this.flight.flightNo).subscribe(
        (data:any)=>{
          this.message="Flight "+data.flightNo+ " update successfully!";
          
        }
    )

    
  }
}
