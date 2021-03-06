// Generated by ContextProviderGenerator

// Contains Objects that push new data to the Context Controller

// Code for API/Library access has to be inserted in the file:"appState.service.ts" 
// in the folder: static/app/context/providers/

	import { Injectable } from '@angular/core';
	import { Observable } from 'rxjs';
	import { BehaviorSubject } from 'rxjs/Rx';
	
	// PROTECTED REGION ID general ENABLED START
	// PROTECTED REGION END
				
				@Injectable()
				export class AppStateService {
					private userRole:string;
					private _userRoleSubject: BehaviorSubject<string> = new BehaviorSubject("init");
								public userRoleSubject: Observable<string> = this._userRoleSubject.asObservable();
					private colorBlind:string;
					private _colorBlindSubject: BehaviorSubject<string> = new BehaviorSubject("init");
								public colorBlindSubject: Observable<string> = this._colorBlindSubject.asObservable();
				
// PROTECTED REGION ID appState ENABLED START
// PROTECTED REGION END

constructor(){
//Here is the place where code for EventListeners is inserted (manual inserting is done in /static/app/context/providers/[providerfile])
// PROTECTED REGION ID constructor ENABLED START
// PROTECTED REGION END
}
//Add callback functions for the properties
				getUserRole(){
					
				//Here can be some code for the timer be inserted (manual inserting is done in /static/app/context/providers/[providerfile])
				// PROTECTED REGION ID userRole ENABLED START

                if(localStorage.getItem('userRole') != null){
                        this.userRole = localStorage.getItem('userRole');
                }

				// PROTECTED REGION END
				this._userRoleSubject.next(this.userRole);
				}
				getColorBlind(){
					
				//Here can be some code for the timer be inserted (manual inserting is done in /static/app/context/providers/[providerfile])
				// PROTECTED REGION ID colorBlind ENABLED START
		if(localStorage.getItem('colorBlind') != null){
			this.colorBlind = localStorage.getItem('colorBlind');
	}
				// PROTECTED REGION END
				this._colorBlindSubject.next(this.colorBlind);
				}

// PROTECTED REGION ID addMethods ENABLED START
// PROTECTED REGION END
}
