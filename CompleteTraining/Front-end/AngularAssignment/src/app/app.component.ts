import { Component } from '@angular/core';
import { NavigationLinks } from './navigation-links';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SK MovieRatingApp';
  links: NavigationLinks[] = [
    {text: 'Home', link: '/home'},
    {text: '', link: '/login'},
    {text: '', link: '/error'},
    {text: '', link: '/movie'},
    ];
}
