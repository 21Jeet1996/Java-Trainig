import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './book-flight/login';

@Injectable({
  providedIn: 'root'
})
export class FlightServiceService {

  constructor(private http:HttpClient) { }

  public searchFlight(start:string,end:string){
    return this.http.get("http://localhost:9090/user/search/"+start+"/"+end);//,{responseType:'text' as 'json'});
  }

  public bookTicket(book:any){
    return this.http.post("http://localhost:9090/user/book",book,{responseType:'text' as 'json'});
  }

  public  checkTicket(email:string){
    return this.http.get("http://localhost:9090/user/checkticket/"+email);
  }

  public cancelTicket(book:any,pnr:number){
    return this.http.put("http://localhost:9090/user/updatestatus/"+pnr,book);
  }

  public login(username:string,password:string): Observable<Login>{
    const loginPath = "http://localhost:9090/authenticate/login";
    const headers = new HttpHeaders({
        'Content-Type': 'application/x-www-form-urlencoded',
    });
    const options = { headers };
    return this.http.post<Login>(loginPath+`?username=${username}&password=${password}`, options);
  }
  
}
