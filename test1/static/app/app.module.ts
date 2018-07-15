import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { provideRouter, RouterConfig }  from '@angular/router';
import { FormsModule } from '@angular/forms'


import { AppComponent }  from './app.component';
import { routes } from './app.routes';
import { SearchBooksComponent } from './views/searchBooks.component';
import { LoginComponent } from './views/login.component';
import { HomeComponent } from './views/home.component';
import { LendingFormComponent } from './views/lendingForm.component';
import { LentBooksComponent } from './views/lentBooks.component';
import { StudentsComponent } from './views/students.component';
import { StudentDetailsComponent } from './views/studentDetails.component';
import { BookReservationsComponent } from './views/bookReservations.component';
import { HelpWindowComponent } from './views/helpWindow.component';
import { AdministrationComponent } from './views/administration.component';

@NgModule({
  imports:      [ BrowserModule, FormsModule, routes ],
  declarations: [ AppComponent, SearchBooksComponent, LoginComponent, HomeComponent, LendingFormComponent, LentBooksComponent, StudentsComponent, StudentDetailsComponent, BookReservationsComponent, HelpWindowComponent, AdministrationComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }