package eifml.generator.core

import contextML.Context
import contextML.impl.ContextImpl
import contextML.impl.EntityImpl
import eifml.generator.app.RoutesGenerator
import eifml.generator.boilerplate.IndexGenerator
import eifml.generator.boilerplate.NpmPackageGenerator
import eifml.generator.context.ContextEntityGenerator
import eifml.generator.context.ContextProfileGenerator
import eifml.generator.context.ContextProvidersGenerator
import eifml.generator.context.ContextServiceGenerator
import eifml.generator.data.ExportClassGenerator
import eifml.generator.helper.PipeGenerator
import eifml.generator.nav.NavbarGenerator
import eifml.generator.nools.TGGNoolsServiceGenerator
import eifml.generator.views.ViewContainerGenerator
import essentialIFML.Core.EssentialIFMLModel
import essentialIFML.Core.ViewElement
import essentialIFML.Core.impl.ViewContainerImpl
import essentialIFML.Extensions.impl.ListImpl
import language.impl.TGGImpl
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.internal.impl.ClassImpl

class GeneratorCore {

	// Instance Methods
	def generateCode(EssentialIFMLModel ifmlModel, Model umlModel, TGGImpl adaptRules,  Context contextModel) {
		
			// Extract model elements 
			val appName = ifmlModel.name.toFirstUpper;
			val viewElements = ifmlModel.interactionFlowModel.interactionFlowModelElements.filter(typeof(ViewElement));
			val windows = viewElements.filter(typeof(ViewContainerImpl));

			val classes = umlModel.allOwnedElements.filter(typeof(ClassImpl));

			// Dynamic Generation
			// Export Classes from uml model
			classes.forEach [ c |
				new ExportClassGenerator().generateFile(c);
			]
			// View Controller
			windows.forEach [ w |
				// ViewController
				new ViewContainerGenerator().generateCode(w);
				//
				w.viewElements.filter(typeof(ListImpl)).forEach [ l |
					new PipeGenerator().generateFile(l);
				]
			]
			// Dynamic Components
			
			new NavbarGenerator().generateCode(windows);
			// App
			new RoutesGenerator().generateFile(windows);
			
			new TGGNoolsServiceGenerator().generateFile(adaptRules as TGGImpl);
			new TGGNoolsServiceGenerator().generateNoolsRules(adaptRules);

			// Context Service 
			// Context service generator
			new ContextServiceGenerator().generateFile(contextModel as ContextImpl);

			// Context profile generator
			new ContextProfileGenerator().generateFile(contextModel as ContextImpl);
			
			var entities = contextModel.entity
		entities.forEach [ entity |

			new ContextEntityGenerator().generateFile(entity as EntityImpl)
		]
		
		new ContextProvidersGenerator().generateFiles(contextModel as ContextImpl)

			// Boilerplate Generation
			// generate index.html
			new IndexGenerator().generateFile(appName);
			// generate package.json
			new NpmPackageGenerator().generateFile(appName);
		}
	}

