import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { LoggedInComponent } from './logged-in/logged-in.component';
import { ErrorComponent } from './error/error.component';
import { MovieDetailComponent } from './movie-detail/movie-detail.component';



const routes: Routes = [
  {path: '', component: MainPageComponent, pathMatch: 'full'},
  {path: 'home', component: MainPageComponent},
  {path: 'login', component: LoginComponent},
  {path: 'error', component: ErrorComponent},
  {path: 'movie', component: MovieDetailComponent}
  


];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
