import { Component, OnInit } from '@angular/core';
import { ContactFormat } from '../contact-format';
import { ContactService } from '../contact.service';

@Component({
  selector: 'app-show-content',
  templateUrl: './show-content.component.html',
  styleUrls: ['./show-content.component.css']
})
export class ShowContentComponent implements OnInit {
  contactList : ContactFormat[]
  constructor(private service:ContactService) { }

  ngOnInit() {
    this.service.listContacts().subscribe(resp => this.contactList = resp); 
  }

}
