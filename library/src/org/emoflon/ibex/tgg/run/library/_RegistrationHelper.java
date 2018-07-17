package org.emoflon.ibex.tgg.run.library;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		_SchemaBasedAutoRegistration.register(strategy);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("libraryRefine");
		options.projectPath("libraryRefine");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.minimumNumberOfEdgesToCreateEdgePatterns(3);
		options.stronglyTypedEdgedPatterns(true);
		options.setCorrContextNodesAsLocalNodes(false);
		return options;
	}

}
