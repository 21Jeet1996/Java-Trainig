import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { ViewFlightComponent } from './view-flight/view-flight.component';
import { FlightServiceService } from './flight-service.service';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SearchFlightComponent } from './search-flight/search-flight.component';
import { SearchServiceService } from './search-service.service';

@NgModule({
  declarations: [
    AppComponent,
    AddFlightComponent,
    ViewFlightComponent,
    SearchFlightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [FlightServiceService,SearchServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
