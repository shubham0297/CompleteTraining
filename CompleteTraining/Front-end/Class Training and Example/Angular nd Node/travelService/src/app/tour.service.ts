import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TourInterface } from './tour-interface';

@Injectable({
  providedIn: 'root'
})
export class TourService {

  constructor(private http:HttpClient) { }        // since get,post,delete etc method are in HttpClient , that is why it is injected in constructor tour service

  findAll():Observable<TourInterface[]>{
   return this.http.get<TourInterface[]>("http://localhost:3000/tours");
  }
}
