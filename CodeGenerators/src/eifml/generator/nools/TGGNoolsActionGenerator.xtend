package eifml.generator.nools

import language.TGGRule

class TGGNoolsActionGenerator {
	def generateCode(TGGRule rule) {
		return generateTemplate(rule);
	}

	def generateComplementCode(TGGRule rule) {
		return generateComplementTemplate(rule);
	}

	def protected generateTemplate(TGGRule rule) {
		var output = ""

		for (edge : rule.edges) {
			if (edge.domainType.toString.equals("TRG") && edge.bindingType.toString.equals("CREATE")) {
				var edgeContents = edge.name.split("__")
				var navItem = edgeContents.get(2).split("_")
				System.out.println(edgeContents.get(1))
				switch (edgeContents.get(1)) {
					case "navBarContainer":
						output +=
							''' _DisplayPropertiesService.pushNavigation({path:'/«navItem.get(0).toFirstLower»',key:'«navItem.get(0)»'});
							'''
					case "changeBackgroundColor":
						output += '''_DisplayPropertiesService.setProperty('bodyClass','backgroundPrimary');
						'''
					case "screenZoom":
						output += '''_DisplayPropertiesService.setProperty('routerOutletClass','col-md-10 textPrimary zoom');
						'''
					case "increaseButtonSize":
						output += '''$('#«edge.trgNode.name»').css('font-size','20px');
						'''
					case "setLanguage":
					if(edge.trgNode.name.contains("english"))
						output+='''_ResourceService.setLangFile("enus");
							'''
					else if(edge.trgNode.name.contains("german"))
						output+='''_ResourceService.setLangFile("dede");
							'''
				// other operations added incrementally
				}
			}
		}

		return output
	}

	def protected generateComplementTemplate(TGGRule rule) {
		var output = ""
		for (edge : rule.edges) {
			if (edge.domainType.toString.equals("TRG")) {
				var edgeContents = edge.name.split("__")
				switch (edgeContents.get(1)) {
					case "changeBackgroundColor":
						output += '''_DisplayPropertiesService.setProperty('bodyClass','backgroundOrange');
						'''
					case "navBarContainer":
						output += '''_DisplayPropertiesService.clearNavigation();
						'''
					case "screenZoom":
						output += '''_DisplayPropertiesService.setProperty('routerOutletClass','col-md-10 textPrimary');
						'''
					case "increaseButtonSize":
						output += '''$('#«edge.trgNode.name»').css('font-size','18px');
						'''
				// other operations added incrementally
				}
			}
		}

		return output

	}

}
