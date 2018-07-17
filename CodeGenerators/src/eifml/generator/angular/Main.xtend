package eifml.generator.angular

import eifml.generator.core.ParametersValidator
import eifml.generator.core.FileManager
import eifml.generator.core.ModelLoader
import eifml.generator.utils.UMLReferenceResolver
import eifml.generator.utils.ServiceCollection
import eifml.generator.core.GeneratorCore

class Main {
	// generated the code
	def static void main(String[] args){

		// whether the received parameters point to valid resources
		if(new ParametersValidator().validate(args)){
			
			// Prepare the File Manager & register input PATHS
			val fileManager = FileManager::sharedInstance
			fileManager.registerPathToOutputDirectory(args.get(3))
			val pathToUMLFile = fileManager.registerPathToInputFile(args.get(1))
			val pathToIFMLFile = fileManager.registerPathToInputFile(args.get(0))
			
			
			// Load the Models
			val modelLoader = new ModelLoader;
			val umlResolver = UMLReferenceResolver::sharedInstance
			val ifmlModel = modelLoader.loadIFMLModel(pathToIFMLFile)
			val umlModel = modelLoader.loadUMLModel(pathToUMLFile)
			
			umlResolver.UMLModel = umlModel
			//TGG rules
			val pathToTggRulesFile = fileManager.registerPathToInputFile(args.get(4));
			val adaptRules=modelLoader.loadTGGModel(pathToTggRulesFile);
				
			// Load Context model
			val pathToContextModelFile=fileManager.registerPathToInputFile(args.get(5))
			val contextModel=modelLoader.loadContextModel(pathToContextModelFile)
		
			
			// prepare Services
			val serviceCollection = ServiceCollection::sharedInstance
			serviceCollection.setAuthentication("AuthenticationService","/services/authentication.service")
			serviceCollection.setData("DataService","/services/data.service")
			serviceCollection.setResource("ResourceService", "/services/resource.service")						
			serviceCollection.setDisplayProperties("DisplayPropertiesService","/services/displayProperties.service")
			serviceCollection.addService("LoggerService", "/services/logger.service")
			
			
			// copy files
			fileManager.copyFiles(args.get(2), args.get(3))
			
			
			// Start Code Generation
			new GeneratorCore().generateCode(ifmlModel, umlModel, adaptRules, contextModel)
			println("M2T IFML2NG2 finished!")				

		}	
		
	}

}
