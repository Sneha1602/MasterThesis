package eifml.generator.context

import contextML.Context
import contextML.impl.PropertyImpl

class ContextProvidersGenerator {
	
	def generateFiles(Context context) {
		var entities = context.entity
		var providers = context.provider

		for (var i = 0; i < providers.size; i++) {
			var providerName = providers.get(i).id
			var propertyList = newArrayList();

			for (var j = 0; j < entities.size; j++) {
				for (var k = 0; k < entities.get(j).eContents.size; k++) {
					(entities.get(j).eContents.get(k) as PropertyImpl).provider.id
					if ((entities.get(j).eContents.get(k) as PropertyImpl).provider.id.equalsIgnoreCase(providerName))
						propertyList.add(entities.get(j).eContents.get(k))
				}
			}
						
			new ContextProviderGenerator().generateFiles(providerName,propertyList)
		}

	}
}
