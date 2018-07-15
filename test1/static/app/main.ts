import { bootstrap } from '@angular/platform-browser-dynamic';
import { HTTP_PROVIDERS } from '@angular/http';

import { AppComponent } from './app.component';
import { APP_ROUTER_PROVIDERS } from './app.routes';

import { provide, PLATFORM_DIRECTIVES } from '@angular/core';

// Import generated Nools Service
import { NoolsService } from './services/nools.service';
import { DisplayPropertiesService } from './services/displayProperties.service';
import { ContextControllerService } from './context/contextController.service';
import { ResourceService} from './services/resource.service';
import {DataService} from './services/data.service';



// Service Imports

import { AuthenticationService } from './services/authentication.service';
import { AppStateService } from './context/providers/appState.service';
import { UserDataService } from './context/providers/userData.service';
import { DeviceAPIService } from './context/providers/deviceAPI.service';
import { FaceDetectionService } from './context/providers/faceDetection.service';
import { LoggerService } from './services/logger.service';





// PROTECTED REGION ID imports ENABLED START


// PROTECTED REGION END

bootstrap(AppComponent, [
	APP_ROUTER_PROVIDERS,
    HTTP_PROVIDERS,
    NoolsService,
    ContextControllerService,
	AuthenticationService,
	AppStateService,
	UserDataService,
	DisplayPropertiesService,
	DeviceAPIService,
	ResourceService,
	FaceDetectionService,
	DataService,
	LoggerService
]);