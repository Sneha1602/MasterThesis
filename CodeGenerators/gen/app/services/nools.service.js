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
var router_1 = require('@angular/router');
var profile_1 = require('../context/profile/profile');
var resource_service_1 = require('./resource.service');
var displayProperties_service_1 = require('../services/displayProperties.service');
var NoolsService = (function () {
    function NoolsService(dcl, injector, _Router, _ResourceService, _DisplayPropertiesService) {
        this.dcl = dcl;
        this.injector = injector;
        this._Router = _Router;
        this._ResourceService = _ResourceService;
        this._DisplayPropertiesService = _DisplayPropertiesService;
        this.flow = nools.flow("Profile Evaluation", function (flow) {
            flow.rule("AdaptationColorBlindness", [profile_1.Profile, "m", "m.getUser() .getColorBlind()=='true'"], function (facts) {
                _DisplayPropertiesService.setProperty('bodyClass', 'backgroundPrimary');
            });
            flow.rule("ComplementAdaptationColorBlindness", [profile_1.Profile, "m", "m.getUser() .getColorBlind()=='false'"], function (facts) {
                _DisplayPropertiesService.setProperty('bodyClass', 'backgroundOrange');
            });
            flow.rule("AdaptationCreateAdminNavBar", [profile_1.Profile, "m", "m.getUser() .getUserRole()=='staff'"], function (facts) {
                _DisplayPropertiesService.pushNavigation({ path: '/searchBooks', key: 'searchBooks' });
                _DisplayPropertiesService.pushNavigation({ path: '/students', key: 'students' });
                _DisplayPropertiesService.pushNavigation({ path: '/bookReservations', key: 'bookReservations' });
                _DisplayPropertiesService.pushNavigation({ path: '/lendingForm', key: 'lendingForm' });
                _DisplayPropertiesService.pushNavigation({ path: '/administration', key: 'administration' });
            });
            flow.rule("AdaptationCreateStudentNavBar", [profile_1.Profile, "m", "m.getUser() .getUserRole()=='student'"], function (facts) {
                _DisplayPropertiesService.pushNavigation({ path: '/lentBooks', key: 'lentBooks' });
                _DisplayPropertiesService.pushNavigation({ path: '/searchBooks', key: 'searchBooks' });
            });
            flow.rule("ComplementAdaptationCreateStudentNavBar", [profile_1.Profile, "m", "m.getUser() .getUserRole() != 'staff' && m.getUser().getUserRole() != 'student'"], function (facts) {
                _DisplayPropertiesService.clearNavigation();
                _DisplayPropertiesService.clearNavigation();
            });
            flow.rule("AdaptationEnglishLanguage", [profile_1.Profile, "m", "m.getPlatform() .getLanguage()=='en'"], function (facts) {
                _ResourceService.setLangFile("enus");
            });
            flow.rule("AdaptationGermanLanguage", [profile_1.Profile, "m", "m.getPlatform() .getLanguage()=='dede'"], function (facts) {
                _ResourceService.setLangFile("dede");
            });
            flow.rule("AdaptationUserAge", [profile_1.Profile, "m", "m.getUser() .getAge()>60"], function (facts) {
                _DisplayPropertiesService.setProperty('routerOutletClass', 'col-md-10 textPrimary zoom');
            });
            flow.rule("ComplementAdaptationUserAge", [profile_1.Profile, "m", "m.getUser() .getAge()<=60"], function (facts) {
                _DisplayPropertiesService.setProperty('routerOutletClass', 'col-md-10 textPrimary');
            });
        });
    }
    NoolsService.prototype.getSession = function () {
        return this.flow.getSession();
    };
    NoolsService.prototype.setProfile = function (m) {
        this.m = m;
    };
    NoolsService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [core_1.DynamicComponentLoader, core_1.Injector, router_1.Router, resource_service_1.ResourceService, displayProperties_service_1.DisplayPropertiesService])
    ], NoolsService);
    return NoolsService;
}());
exports.NoolsService = NoolsService;
//# sourceMappingURL=nools.service.js.map