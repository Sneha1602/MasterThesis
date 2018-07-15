package eifml.generator.utils

import java.util.ArrayList

class ServiceCollection {

	private static ServiceCollection INSTANCE
	private eifml.generator.utils.Service authentication
	private eifml.generator.utils.Service data
	private eifml.generator.utils.Service resource
	private eifml.generator.utils.Service displayProperties
	private eifml.generator.utils.Service profile
	private eifml.generator.utils.Service speech
	private ArrayList<eifml.generator.utils.Service> services = new ArrayList<eifml.generator.utils.Service>()
	
	private ArrayList<eifml.generator.utils.Service> tempArray = new ArrayList<eifml.generator.utils.Service>()
	
	static def ServiceCollection sharedInstance(){
		if(INSTANCE == null) {
			INSTANCE = new ServiceCollection();
		}
		return INSTANCE;
	}
	
	def setAuthentication(String name, String location){
		authentication = new eifml.generator.utils.Service(name, location)
	}
	
	def setData(String name, String location){
		data = new eifml.generator.utils.Service(name, location)
	}
		
	def setDisplayProperties(String name, String location){
		displayProperties = new eifml.generator.utils.Service(name, location)
	}
	
	def setProfile(String name, String location){
		profile = new eifml.generator.utils.Service(name, location)
	}
	
	def setResource(String name, String location){
		resource = new eifml.generator.utils.Service(name, location)
	}
		
	def addService(String name, String location){
		services.add(new eifml.generator.utils.Service(name, location))
	}
	
	def getAuthentication(){
		return authentication
	}
	
	def getData(){
		return data
	}
		
	def getDisplayProperties(){
		return displayProperties
	}
	
	def getProfile(){
		return profile
	}
	
	def getResource(){
		return resource
	}
	
	def getSpeech(){
		return speech
	}
	
	def getServices(){
		tempArray.clear;
		for(service: services){
			tempArray.add(service)
		}
		if(authentication != null){
			tempArray.add(authentication)
		}
		if(data != null){
			tempArray.add(data)
		}
		if(displayProperties != null){
			tempArray.add(displayProperties)
		}
		if(profile != null){
			tempArray.add(profile)
		}
		if(resource != null){
			tempArray.add(resource)
		}
		if(speech != null){
			tempArray.add(speech)
		}
		return tempArray
	}
	
	def getProviders(){
		tempArray.clear;
		for(service: services){
			tempArray.add(service)
		}
		if(displayProperties != null){
			tempArray.add(displayProperties)
		}
		if(authentication != null){
			tempArray.add(authentication)
		}
		if(data != null){
			tempArray.add(data)
		}
		return tempArray		
	}
}
