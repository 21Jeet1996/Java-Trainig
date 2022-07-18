import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { SearchFlightComponent } from './search-flight/search-flight.component';
import { ViewFlightComponent } from './view-flight/view-flight.component';

const routes: Routes = [
 {path:"add",component:AddFlightComponent},
 {path:"view",component:ViewFlightComponent},
 {path:"search",component:SearchFlightComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
