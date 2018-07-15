package eifml.generator.core

import contextML.Context
import contextML.ContextMLPackage
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import language.LanguagePackage
import language.impl.TGGImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.UMLPackage
import org.w3c.dom.Document

import essentialIFML.Core.CorePackage
import essentialIFML.Extensions.ExtensionsPackage
import essentialIFML.DataTypes.DataTypesPackage
import essentialIFML.Core.EssentialIFMLModel
import essentialIFML.Core.IFMLModel

class ModelLoader {

	// File Extensions
	public static final String IFML_MODEL_FILE_EXTENSION = "core"
	public static final String UML_MODEL_FILE_EXTENSION = "uml" 
	
	// Meta-models' URI
	public static final String ESSENTIALIFML_CORE_EPACKAGE_URI = "'platform:/resource/IFMLEditor/model/IFML-Metamodel.ecore#//Core'" 
	public static final String ESSENTIALIFML_EXTENSIONS_EPACKAGE_URI = "'platform:/resource/IFMLEditor/model/IFML-Metamodel.ecore#//Extensions'" 
	public static final String ESSENTIALIFML_DATATYPE_EPACKAGE_URI = "'platform:/resource/IFMLEditor/model/IFML-Metamodel.ecore#//DataTypes'"
	public static final String UML_EPACKAGE_URI = "'http://www.eclipse.org/uml2/5.0.0/UML'"
	public static final String TGGRULE_EXTENSION = "xmi"
	public static final String TGGRULE_EPACKAGE_URI = "'platform:/plugin/org.emoflon.ibex.tgg.core.language/model/Language.ecore#/'"
	public static final String CONTEXT_MODEL_FILE_EXTENSION = "contextml"
	public static final String CONTEXT_EPACKAGE_URI = "'platform:/resource/ContextML/model/contextML.ecore'"
	
	def EssentialIFMLModel loadIFMLModel(String pathToIFMLFile) {

		// Register the IFML Packages 
		EPackage.Registry::INSTANCE.put(ESSENTIALIFML_CORE_EPACKAGE_URI, CorePackage::eINSTANCE)
		EPackage.Registry::INSTANCE.put(ESSENTIALIFML_EXTENSIONS_EPACKAGE_URI, ExtensionsPackage::eINSTANCE)
		EPackage.Registry::INSTANCE.put(ESSENTIALIFML_DATATYPE_EPACKAGE_URI, DataTypesPackage::eINSTANCE)
 
		// Register the model factories 
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(IFML_MODEL_FILE_EXTENSION,
			new XMIResourceFactoryImpl)

		// Instantiate the resource set				
		val resourceSet = new ResourceSetImpl

		// Extract & parse the IFML model
		val ifmlResource = resourceSet.getResource(URI::createURI(pathToIFMLFile), true)
		val ifmlModel = ifmlResource.contents.filter[e|e instanceof EssentialIFMLModel]?.get(0) as EssentialIFMLModel

		return ifmlModel;

	}
	
	def Model loadUMLModel(String pathToUMLFile) {

		// Register the UML Package 
		EPackage.Registry::INSTANCE.put(UML_EPACKAGE_URI, UMLPackage::eINSTANCE)

		// Register the model factories 
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(UML_MODEL_FILE_EXTENSION,
			new XMIResourceFactoryImpl)

		// Instantiate the resource set				
		val resourceSet = new ResourceSetImpl

		// Extract & parse the UML model
		val umlResource = resourceSet.getResource(URI::createURI(pathToUMLFile), true)
		val umlModel = umlResource.contents.filter[e|e instanceof Model]?.get(0) as Model;

		return umlModel

	}
	
	def Document loadAdaptModel(String pathToAdaptFile) {
	    // parse an XML document into a DOM tree
	    var factory = DocumentBuilderFactory.newInstance();
	    factory.ignoringComments = true;
	    factory.ignoringElementContentWhitespace = true;
	    var parser = factory.newDocumentBuilder();
	    var document = parser.parse(new File(pathToAdaptFile));
	    
	    document.documentElement.normalize
	    
	    println("root " + document.documentElement.nodeName)
	    println("root child " + document.documentElement.firstChild.nodeName)
	    
	    return document;
	}
	
	def TGGImpl loadTGGModel(String pathToTggRulesFile) {

		// Register the TGGRules Package 
		EPackage.Registry::INSTANCE.put(TGGRULE_EPACKAGE_URI, LanguagePackage::eINSTANCE)

		// Register the model factories 
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(TGGRULE_EXTENSION, new XMIResourceFactoryImpl)

		// Instantiate the resource set	
		val resourceSet = new ResourceSetImpl

		// Extract & parse the AdaptationRules model
		val resource = resourceSet.getResource(URI::createURI(pathToTggRulesFile), true)
		System.out.println(resource.contents)
		val tggFile = resource.contents.get(0) as TGGImpl;
		return tggFile;
	}
	
	def Context loadContextModel(String pathToContextModelFile) {
		// Register the Context Packages 
		EPackage.Registry::INSTANCE.put(CONTEXT_EPACKAGE_URI, ContextMLPackage::eINSTANCE)

		// Register the model factories 
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(CONTEXT_MODEL_FILE_EXTENSION,
			new XMIResourceFactoryImpl)

		// Instantiate the resource set				
		val resourceSet = new ResourceSetImpl

		// Extract and parse Context model
		val contextResource = resourceSet.getResource(URI::createURI(pathToContextModelFile), true)
		val contextModel = contextResource.contents.filter[e|e instanceof Context]?.get(0) as Context

		return contextModel;
	}
}
	
	
