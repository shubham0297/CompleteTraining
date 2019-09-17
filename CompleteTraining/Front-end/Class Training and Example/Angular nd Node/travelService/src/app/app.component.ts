import { Component } from '@angular/core';
import { NavigationLinks } from './navigation-links';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'travelService';
  subHead = 'Chennai';

  links:NavigationLinks[] =[{text:'Home', link:'/search'},
  {text:'Catalog', link:'/show'}
  // {text:'Payment', link:'payment.html'},
  // {text:'Contact', link:'contact.html'}]  
  ];
}

/* since property can be different...when different application use navigation component we create an interface...so there is a common way/blueprint. Say one applicaiton uses text,link other uses txt lnk } */