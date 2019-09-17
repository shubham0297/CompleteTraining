import { Component, OnInit, Input } from '@angular/core';
import { NavigationLinks } from '../navigation-links';
import { Router } from '@angular/router';
import { RatingService } from '../rating.service';
import { MovieType } from '../movie-type';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  review_:MovieType[];
  currentReview:boolean=true;
  otherReviews:boolean=false;
  
  constructor(private router: Router,private service: RatingService) { }
  
  ngOnInit() {
  }
  movieReview(){
    this.router.navigate(['/login']);
   }
   getReview(id){
     console.log(id);
    this.service.getMovies(id).subscribe(resp=>this.review_=resp);
   }
}

