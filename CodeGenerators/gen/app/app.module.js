"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var platform_browser_1 = require('@angular/platform-browser');
var forms_1 = require('@angular/forms');
var app_component_1 = require('./app.component');
var app_routes_1 = require('./app.routes');
var searchBooks_component_1 = require('./views/searchBooks.component');
var login_component_1 = require('./views/login.component');
var home_component_1 = require('./views/home.component');
var lendingForm_component_1 = require('./views/lendingForm.component');
var lentBooks_component_1 = require('./views/lentBooks.component');
var students_component_1 = require('./views/students.component');
var studentDetails_component_1 = require('./views/studentDetails.component');
var bookReservations_component_1 = require('./views/bookReservations.component');
var helpWindow_component_1 = require('./views/helpWindow.component');
var administration_component_1 = require('./views/administration.component');
var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            imports: [platform_browser_1.BrowserModule, forms_1.FormsModule, app_routes_1.routes],
            declarations: [app_component_1.AppComponent, searchBooks_component_1.SearchBooksComponent, login_component_1.LoginComponent, home_component_1.HomeComponent, lendingForm_component_1.LendingFormComponent, lentBooks_component_1.LentBooksComponent, students_component_1.StudentsComponent, studentDetails_component_1.StudentDetailsComponent, bookReservations_component_1.BookReservationsComponent, helpWindow_component_1.HelpWindowComponent, administration_component_1.AdministrationComponent],
            bootstrap: [app_component_1.AppComponent]
        }), 
        __metadata('design:paramtypes', [])
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map