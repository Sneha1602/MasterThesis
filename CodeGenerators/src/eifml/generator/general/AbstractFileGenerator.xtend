package eifml.generator.general


import eifml.generator.core.FileManager

abstract class AbstractFileGenerator<T> extends eifml.generator.general.AbstractGenerator <T>{
	
	public def generateFile(T it) {
		FileManager::sharedInstance.generateFile(qualifiedName, fileContents);
	}
	
	protected abstract def String fileContents(T it);
	
	

}
