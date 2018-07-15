package eifml.generator.nools

import language.impl.TGGImpl

import eifml.generator.general.AbstractFileGenerator

class TGGNoolsServiceGenerator extends AbstractFileGenerator<TGGImpl> {
	override protected fileContents(TGGImpl it) {
		

		'''
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
							«new TGGNoolsServiceGenerator().generateNoolsRules(it)»				
							});
									}
										
									public getSession(){
										return this.flow.getSession();
									}
									
									public setProfile(m: Profile){
										this.m = m;
									}
								}
								
		'''
	}

	override protected fileName(TGGImpl it) {
		'''nools.service.ts'''
	}

	override protected folderName(TGGImpl it) {
		'''app/services/'''
	}

	def generateNoolsRules(TGGImpl tggFile) {
		var output = ""
		for (adaptRule : tggFile.rules) {
			if (!adaptRule.abstract && adaptRule.name.contains("Adaptation")) {
				output += new TGGNoolsConditionGenerator().generateCode(adaptRule)
			}
		}
		return output
	}

}
