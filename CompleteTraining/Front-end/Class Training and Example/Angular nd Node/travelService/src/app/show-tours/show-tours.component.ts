import { Component, OnInit } from '@angular/core';
import { TourService } from '../tour.service';
import { TourInterface } from '../tour-interface';

@Component({
  selector: 'app-show-tours',
  templateUrl: './show-tours.component.html',
  styleUrls: ['./show-tours.component.css']
})
export class ShowToursComponent implements OnInit {

  tourList:TourInterface[];
  constructor(private service:TourService) { }

  ngOnInit() {
    this.service.findAll().subscribe(resp => this.tourList = resp); 
   }

}
