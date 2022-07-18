import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FlightServiceService } from './flight-service.service';
import { SearchFlightComponent } from './search-flight/search-flight.component';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BookFlightComponent } from './book-flight/book-flight.component';
import { CheckFlightComponent } from './check-flight/check-flight.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AuthServiceService } from './auth-service.service';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { GetFlightComponent } from './get-flight/get-flight.component';
import { UpdateFlightComponent } from './update-flight/update-flight.component';
import { AuthguardService } from './authguard.service';

@NgModule({
  declarations: [
    AppComponent,
    SearchFlightComponent,
    BookFlightComponent,
    CheckFlightComponent,
    AdminLoginComponent,
    AddFlightComponent,
    GetFlightComponent,
    UpdateFlightComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [FlightServiceService,AuthServiceService,AuthguardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
