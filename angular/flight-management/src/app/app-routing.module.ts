import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AuthGuard } from './auth.guard';
import { AuthguardService } from './authguard.service';
import { BookFlightComponent } from './book-flight/book-flight.component';
import { CheckFlightComponent } from './check-flight/check-flight.component';
import { GetFlightComponent } from './get-flight/get-flight.component';
import { SearchFlightComponent } from './search-flight/search-flight.component';
import { UpdateFlightComponent } from './update-flight/update-flight.component';

const routes: Routes = [
  {path:"",component:SearchFlightComponent},
  {path:"book-flight/:flightNo",component:BookFlightComponent},
  {path:"check-ticket",component:CheckFlightComponent},
  {path:"admin",component:AdminLoginComponent},
  {path:"add-flight",component:AddFlightComponent,canActivate:[AuthGuard]},
  {path:"flight-list",component:GetFlightComponent,canActivate:[AuthGuard]},
  {path:"update-flight/:flightNo",component:UpdateFlightComponent,canActivate:[AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
