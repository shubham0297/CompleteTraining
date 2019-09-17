import { Component, OnInit, Input } from '@angular/core';
import { NavigationLinks } from '../navigation-links';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  @Input() linkList: NavigationLinks[];
  constructor() { }

  ngOnInit() {
  }

}
