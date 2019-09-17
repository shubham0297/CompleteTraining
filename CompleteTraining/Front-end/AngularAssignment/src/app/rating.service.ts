import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
// import { IMovie } from './movie';
import { MovieType } from './movie-type';
import { Observable } from 'rxjs';
const _url: string = "http://localhost:3000/movies";
@Injectable({
  providedIn: 'root'
})
export class RatingService {
   
  constructor(private http: HttpClient) {}
  
  getMovies(id_:number): Observable<MovieType[]> {
    const endpoint = `${_url}?id=${id_}`;
    return this.http.get<MovieType[]>(endpoint);
  }
}
