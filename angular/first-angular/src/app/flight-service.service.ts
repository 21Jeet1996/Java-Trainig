import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FlightServiceService {

  constructor(private http:HttpClient) { }

  public addFlight(flight: any){
    return this.http.post("http://localhost:8081/addflight",flight,{responseType: 'text' as 'json'});
  }
  public getFlight(){
    return this.http.get("http://localhost:8081/getflight");
  }
  public getFlightById(id:number){
    return this.http.get("http://localhost:8081/getflight/"+id);
  }

  public deleteFlightById(id:number){
    return this.http.delete("http://localhost:8081/deleteFlight/"+id);
  }

}
