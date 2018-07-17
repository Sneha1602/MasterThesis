
// PROTECTED REGION ID general ENABLED START

declare var affdex: any;
declare var $: any;
// PROTECTED REGION END

// PROTECTED REGION ID faceDetection ENABLED START
private faceDetected: boolean;
private _faceDetectedSubject: BehaviorSubject<boolean> = new BehaviorSubject(false);
public faceDetectedSubject: Observable<boolean> = this._faceDetectedSubject.asObservable();
// PROTECTED REGION END
	
// PROTECTED REGION ID constructor ENABLED START

        
        setTimeout(()=> {
                var divRoot = $("#affdex_elements")[0];

                // The captured frame's width in pixels
                var width = 1280;

                // The captured frame's height in pixels
                var height = 1024;

                /*
                Face detector configuration - If not specified, defaults to
                affdex.FaceDetectorMode.LARGE_FACES
                */
                var faceMode = affdex.FaceDetectorMode.LARGE_FACES;

                //Construct a CameraDetector and specify the image width / height and face detector mode.
                var detector = new affdex.CameraDetector(divRoot, width, height, faceMode);
                $( "#affdex_elements" ).hide();

                detector.detectEmotions.joy = true;
                detector.detectEmotions.anger = true;
                detector.detectAppearance.gender = true;
                detector.detectAppearance.age = true;

                //Add a callback to notify when the detector is initialized and ready for runing.
                detector.addEventListener("onInitializeSuccess", () => {
                console.log("The detector reports initialized");
                //Display canvas instead of video feed because we want to draw the feature points on it
                $("#face_video_canvas").css("display", "none");
                $("#face_video").css("display", "none");  
                });

                //Add a callback to notify when camera access is allowed
                detector.addEventListener("onWebcamConnectSuccess", () => {
                console.log("Webcam access allowed");
                });

                //Add a callback to notify when camera access is denied
                detector.addEventListener("onWebcamConnectFailure", () => {
                console.log("webcam denied");
                });

                //Add a callback to notify when detector is stopped
                detector.addEventListener("onStopSuccess", () => {
                console.log("The detector reports stopped");
                });
                
                
                this.age = 0;
                detector.addEventListener("onImageResultsSuccess", (faces: any, image: any, timestamp:any) => {
                        // console.log("Timestamp: " + timestamp.toFixed(2));
                        // console.log("Number of faces found: " + faces.length);
                        if (faces.length > 0) {
                                this.faceDetected = true;
                        }
                                //If joy of the first face is over 50% then show in log
                                // console.log("Emotions: " + JSON.stringify(faces[0].emotions, function(key, val) {
                                // return val.toFixed ? Number(val.toFixed(0)) : val;
                                // }));
                        else{
                                this.faceDetected = false;
                        }

                                if(this.faceDetected){       
                                        
                                switch(faces[0].appearance.age){
                                        case 'Under 18': {
                                                this.age = 10;
                                                break;
                                        };
                                        case '18 - 24': {
                                                this.age = 20;
                                                break;
                                        };
                                        case '25 - 34': {
                                                this.age = 30;
                                                break;
                                        };
                                        case '35 - 44': {
                                                this.age = 40;
                                                break;
                                        };
                                        case '45 - 54': {
                                                this.age = 50;
                                                break;
                                        };
                                        case '55 - 64': {
                                                this.age = 60;
                                                break;
                                        };
                                        case '65+': {
                                                this.age = 70;
                                                break;
                                        };
                                        //Default is left out because an unkown age will just keep the last known age
                                        // default:{
                                        //         this.age = 40;
                                        // };
                                }
                                
                        }else{
                                this.faceDetected = false;
                        }
                });

                detector.start();
        }, 500);

// PROTECTED REGION END
	
	
	getAge(){
		
		// PROTECTED REGION ID age ENABLED START
		// PROTECTED REGION END
		
		this._ageSubject.next(this.age);
	}
	getGender(){
		
		// PROTECTED REGION ID gender ENABLED START
		// PROTECTED REGION END
		
		this._genderSubject.next(this.gender);
	}
	
	getFaceDetected(){
		
		// PROTECTED REGION ID faceDetected ENABLED START
		// PROTECTED REGION END
		
		this._faceDetectedSubject.next(this.faceDetected);
	}
	
	// PROTECTED REGION ID addMethods ENABLED START
	// PROTECTED REGION END
}
