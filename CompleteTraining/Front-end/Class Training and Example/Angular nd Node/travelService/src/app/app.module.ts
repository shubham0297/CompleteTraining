import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClient,HttpClientModule} from '@angular/common/http'      // HTTPClient is a client and HTTPCLIENTMODULE is a module
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';
import { FetchOperatorComponent } from './fetch-operator/fetch-operator.component';
import { FormStyle } from '@angular/common';
import { ShowToursComponent } from './show-tours/show-tours.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavigationComponent,
    LoginComponent,
    SearchComponent,
    FetchOperatorComponent,
    ShowToursComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule      // Module put in imports
  ],
  providers: [HttpClient],          // Client should go here
  bootstrap: [AppComponent]
})
export class AppModule { }
