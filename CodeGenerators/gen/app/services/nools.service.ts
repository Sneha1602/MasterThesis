import {Injectable, DynamicComponentLoader, Injector} from '@angular/core';
import { Router } from '@angular/router';

import { Profile } from '../context/profile/profile';
import { DisplayProperties } from '../helper/displayProperties';
import { ResourceService } from './resource.service';

import { DisplayPropertiesService } from '../services/displayProperties.service';
declare var nools: any;
declare var $: any;

@Injectable()
export class NoolsService {
	
	private flow;
	private m: Profile;
	
	constructor(
		private dcl: DynamicComponentLoader,
		private injector: Injector,
		private _Router: Router,
		private _ResourceService: ResourceService,
		private _DisplayPropertiesService: DisplayPropertiesService){
			this.flow = nools.flow("Profile Evaluation", function(flow){
				flow.rule("AdaptationColorBlindness",[Profile,"m","m.getUser() .getColorBlind()=='true'"],function(facts){
				_DisplayPropertiesService.setProperty('bodyClass','backgroundPrimary');
				});
				flow.rule("ComplementAdaptationColorBlindness",[Profile,"m","m.getUser() .getColorBlind()=='false'"],function(facts){
				_DisplayPropertiesService.setProperty('bodyClass','backgroundOrange');
				});
				flow.rule("AdaptationCreateAdminNavBar",[Profile,"m","m.getUser() .getUserRole()=='staff'"],function(facts){
				 _DisplayPropertiesService.pushNavigation({path:'/searchBooks',key:'searchBooks'});
				 _DisplayPropertiesService.pushNavigation({path:'/students',key:'students'});
				 _DisplayPropertiesService.pushNavigation({path:'/bookReservations',key:'bookReservations'});
				 _DisplayPropertiesService.pushNavigation({path:'/lendingForm',key:'lendingForm'});
				 _DisplayPropertiesService.pushNavigation({path:'/administration',key:'administration'});
				});
				flow.rule("AdaptationCreateStudentNavBar",[Profile,"m","m.getUser() .getUserRole()=='student'"],function(facts){
				 _DisplayPropertiesService.pushNavigation({path:'/lentBooks',key:'lentBooks'});
				 _DisplayPropertiesService.pushNavigation({path:'/searchBooks',key:'searchBooks'});
				});
				flow.rule("ComplementAdaptationCreateStudentNavBar",[Profile,"m","m.getUser() .getUserRole() != 'staff' && m.getUser().getUserRole() != 'student'"],function(facts){
				_DisplayPropertiesService.clearNavigation();
				_DisplayPropertiesService.clearNavigation();
				});
				flow.rule("AdaptationEnglishLanguage",[Profile,"m","m.getPlatform() .getLanguage()=='en'"],function(facts){
				_ResourceService.setLangFile("enus");
				});
				flow.rule("AdaptationGermanLanguage",[Profile,"m","m.getPlatform() .getLanguage()=='dede'"],function(facts){
				_ResourceService.setLangFile("dede");
				});
				flow.rule("AdaptationUserAge",[Profile,"m","m.getUser() .getAge()>60"],function(facts){
				_DisplayPropertiesService.setProperty('routerOutletClass','col-md-10 textPrimary zoom');
				});
				flow.rule("ComplementAdaptationUserAge",[Profile,"m","m.getUser() .getAge()<=60"],function(facts){
				_DisplayPropertiesService.setProperty('routerOutletClass','col-md-10 textPrimary');
				});
				});
						}
							
						public getSession(){
							return this.flow.getSession();
						}
						
						public setProfile(m: Profile){
							this.m = m;
						}
					}
					
