import { Component } from '@angular/core';
import { AuthenticationService } from '../services/authentication.service';
import { Profile } from '../context/profile/profile'
import { Subscription } from 'rxjs/Subscription';
import { ContextControllerService } from '../context/contextController.service';



@Component({
    selector: 'noolstestbar',
    template: `
    <div class="row">
        <div class="col-md-3">
            <table class="table table-striped">
                <th><h3>User</h3></th>             
                <tr>
                    <td>Age:</td>
                    <td>{{age}}</td> 
                </tr>
                <tr>
                    <td>User Role:</td>
                    <td>{{userRole}}</td> 
            </tr>
            </table>
        </div>
        <div class="col-md-3">
            <table class="table table-striped">
                <th><h3>Platform</h3></th>
                <tr>
                    <td>Device Language:</td>
                    <td>{{language}}</td>
                </tr>
                <tr>
                    <td>Device Type:</td>
                    <td>{{deviceType}}</td>
                </tr>
            </table>
        </div>
        <div class="col-md-3">
            <table class="table table-striped">
                <th><h3>Environment</h3></th>
                <tr>
                    <td>Movement:</td>
                    <td>{{movement}}</td>
                </tr>
             </table>
        </div>
    </div>                                             
            <div id="affdex_elements" style="width:640px;height:480px;"></div>
   	`
})

// class for testing nools by setting context attributes in a ui bar
export class NoolsTestBarComponent {
  
    private active: boolean;
    private dashboard: boolean;

    private profile: Profile;
    private change: Subscription;

   
   
    private colorBlind;
    private age;
    
    private language;
    private deviceType;
   
    private userRole;
    private movement;

//    private userWeakVision: boolean;
//    private userSelfEfficiacy: string;

    constructor(
        private _service : AuthenticationService,
        private _context : ContextControllerService
    ) {
        this.active = true;
        this.profile = this._context.getProfile();
        this.change = this._context.changedSubject.subscribe(change => {		   
            this.age = this.profile.getUser().getAge();
            this.colorBlind = this.profile.getUser().getColorBlind();
            this.language=this.profile.getPlatform().getLanguage();
            this.userRole=this.profile.getUser().getUserRole();
            this.deviceType=this.profile.getPlatform().getDeviceType();
            this.movement=this.profile.getEnvironment().getMovement();
         //   this.userRole = this.profile.getUser().getUserRole();
            this._context.setNotChanged();
		});

        }

    logout() {
        this._service.logout();
    }
  
    setActivation(){
        this._context.setActivation(this.active);
    }
}