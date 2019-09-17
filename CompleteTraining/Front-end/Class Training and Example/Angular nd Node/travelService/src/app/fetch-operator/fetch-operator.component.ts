import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-fetch-operator',
  templateUrl: './fetch-operator.component.html',
  styleUrls: ['./fetch-operator.component.css']
})
export class FetchOperatorComponent implements OnInit {
  @Input() searchCity:string;
  @Output() operator: EventEmitter<string> = new EventEmitter<string>();
  constructor() { }

  ngOnInit() {
  }

  send(){
    console.log("Send button fired")
    if(this.searchCity==='chennai'){
     // console.log('Suresh 97808');
      this.operator.emit('Suresh 97808');
    }else{
      //console.log('Ramesh 9780')
      this.operator.emit('Ramesh 97808');
    }
  }
}
