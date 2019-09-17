import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import {RatingService} from '../rating.service';

@Component({
  selector: 'app-movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css']
})
export class MovieDetailComponent implements OnInit {

  public movies = [];
  rating :number=0;
  postReviewHidden:boolean=false;
  reveiw:string;
  constructor() { }   
  // private ratingService : RatingService 

  ngOnInit() {
    // this.ratingService.getMovies()
    //   .subscribe(data => this.movies = data);
  }
  increaseRating(event){
    this.rating = Math.min(5, this.rating + 1);;
  }
  decreaseRating(event){
    this.rating = Math.max(0, this.rating - 1);;
  }
  hidePostReview(event){
    this.postReviewHidden=true;
  }
}
