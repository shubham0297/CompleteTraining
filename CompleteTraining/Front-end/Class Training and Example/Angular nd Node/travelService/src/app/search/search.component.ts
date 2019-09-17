import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  city:string;
  responseFromChild:string;
  constructor() { }

  ngOnInit() {
  }
  onChange(val){
    this.responseFromChild = val;
  }
}
