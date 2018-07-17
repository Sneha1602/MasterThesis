"use strict";
var platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
var http_1 = require('@angular/http');
var app_component_1 = require('./app.component');
var app_routes_1 = require('./app.routes');
// Import generated Nools Service
var nools_service_1 = require('./services/nools.service');
var displayProperties_service_1 = require('./services/displayProperties.service');
var contextController_service_1 = require('./context/contextController.service');
var resource_service_1 = require('./services/resource.service');
var data_service_1 = require('./services/data.service');
// Service Imports
var authentication_service_1 = require('./services/authentication.service');
var appState_service_1 = require('./context/providers/appState.service');
var userData_service_1 = require('./context/providers/userData.service');
var deviceAPI_service_1 = require('./context/providers/deviceAPI.service');
var faceDetection_service_1 = require('./context/providers/faceDetection.service');
var logger_service_1 = require('./services/logger.service');
// PROTECTED REGION ID imports ENABLED START
// PROTECTED REGION END
platform_browser_dynamic_1.bootstrap(app_component_1.AppComponent, [
    app_routes_1.APP_ROUTER_PROVIDERS,
    http_1.HTTP_PROVIDERS,
    nools_service_1.NoolsService,
    contextController_service_1.ContextControllerService,
    authentication_service_1.AuthenticationService,
    appState_service_1.AppStateService,
    userData_service_1.UserDataService,
    displayProperties_service_1.DisplayPropertiesService,
    deviceAPI_service_1.DeviceAPIService,
    resource_service_1.ResourceService,
    faceDetection_service_1.FaceDetectionService,
    data_service_1.DataService,
    logger_service_1.LoggerService
]);
//# sourceMappingURL=main.js.map