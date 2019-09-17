import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';
import { ShowToursComponent } from './show-tours/show-tours.component';


const routes: Routes = [

  {path:'',component:LoginComponent, pathMatch:'full'},  // every component's path starts with / so all component will pe matched....pathMatch tells that look for exact matching of path
  {path:'search',component:SearchComponent, pathMatch:'full'},
  {path:'show',component:ShowToursComponent, pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
