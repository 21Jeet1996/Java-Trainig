import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  constructor(private http:HttpClient) { }

 
  public authenticate(login:any){
    return this.http.post("http://localhost:9090/authenticate/login",login,{responseType:'json' as 'text'});
  }

  public validate(token:string){
    console.log(token);
    localStorage.setItem("token",token);
  }
  public welcome(token:string){
      let tokenStr='Bearer '+token;
      const headers=new HttpHeaders().set("Authorization",tokenStr);
      return this.http.get("http://localhost:9090/flight/test",{headers,responseType:'text'});
  }

  public addFlight(flight:any){
    let token=localStorage.getItem("token");
    let tokenStr='Bearer '+token;
    const headers=new HttpHeaders().set("Authorization",tokenStr);
    return this.http.post("http://localhost:9090/flight/add",flight,{headers,responseType:'json' as 'text'})
  }

  public getFlight(){
    let token=localStorage.getItem("token");
    let tokenStr='Bearer '+token;
    console.log(tokenStr);
    const headers=new HttpHeaders().set("Authorization",tokenStr);
    return this.http.get("http://localhost:9090/flight/get",{headers,responseType:'json'as 'text'});
  }

  public updateFlight(flight:any,flightNo:number){
    let token=localStorage.getItem("token");
    let tokenStr='Bearer '+token;
    console.log(tokenStr);
    const headers=new HttpHeaders().set("Authorization",tokenStr);
    return this.http.put("http://localhost:9090/flight/updateStatus/"+flightNo,flight,{headers,responseType:'json'as 'text'});
  }

  isUserLoggedIn() {
    let token =localStorage.getItem("token");
    if(token===undefined || token=='' || token==null){
      return false;
    }
    return true;
  }

  logOut() {
    sessionStorage.removeItem('username')
  }

}
