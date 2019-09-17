import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  logo = 'assets/travel-logo.jpg';
  @Input() majorHeading :string;
  @Input() subHeading :string;
  constructor() { }

  ngOnInit() {
  }

}
