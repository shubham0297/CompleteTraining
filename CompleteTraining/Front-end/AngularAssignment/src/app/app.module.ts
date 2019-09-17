import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { NavigationComponent } from './navigation/navigation.component';
import { FormsModule }   from '@angular/forms';
import { LoggedInComponent } from './logged-in/logged-in.component';
import { ErrorComponent } from './error/error.component';
import { MovieDetailComponent } from './movie-detail/movie-detail.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MainPageComponent,
    NavigationComponent,
    LoggedInComponent,
    ErrorComponent,
    MovieDetailComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
