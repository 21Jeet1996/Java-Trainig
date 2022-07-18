import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SearchServiceService {

  constructor(private http:HttpClient) { }
  public searchFlight(search:any){
    return this.http.get("http://localhost:9090/user/search/mumbai/delhi",search);//,{responseType:'text' as 'json'});
  }
}
