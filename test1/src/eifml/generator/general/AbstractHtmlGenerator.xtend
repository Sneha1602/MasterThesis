package eifml.generator.general

import eifml.generator.core.FileManager

abstract class AbstractHtmlGenerator<T>{

	public def String generateCode(T it) {
		
		// Give subclasses the change to prepare for the generation effort
		prepareGeneration
				
	    generateTemplate
	}
	
	protected def void prepareGeneration(T it){
	}

	protected abstract def String generateTemplate(T it);

}
