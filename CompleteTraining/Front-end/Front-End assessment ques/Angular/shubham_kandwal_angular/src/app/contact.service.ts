import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ContactFormat } from './contact-format';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(private http: HttpClient) { }

  listContacts():Observable<ContactFormat[]>{
    return this.http.get<ContactFormat[]>("http://localhost:3000/contacts");
   }
}
