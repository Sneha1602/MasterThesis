package eifml.generator.nools

import language.TGGRule

class TGGNoolsConditionGenerator {
	def protected generateCode(TGGRule rule) {
		return generateTemplate(rule);
	}

	def protected generateTemplate(TGGRule rule) {
		var output = ""
		
		var profileToUse = ""
		var comparisonExpression = ""
		var complementRuleForColorBlind = false;
		var complementRuleForNavigation = false;
		var complementRuleForAge = false;

		for (edge : rule.edges) {
			if (edge.domainType.toString.equals("SRC")) {
				var sourceNode = edge.srcNode
				var targetNode = edge.trgNode

				// Context of Use Profile selection
				if (sourceNode.type.toString.contains("Context")) {
					if (targetNode.type.toString.contains("User")) {
						profileToUse = ".getUser()"
					}

					if (targetNode.type.toString.contains("Platform")) {
						profileToUse = ".getPlatform()"
					}
				}

				// Comparison expression
				if (sourceNode.type.toString.contains("User")) {
					if (targetNode.type.toString.contains("Admin")) {
						comparisonExpression = ".getUserRole()=='staff'"

					}
				}
				if (sourceNode.type.toString.contains("User")) {
					if (targetNode.type.toString.contains("Student")) {
						comparisonExpression = ".getUserRole()=='student'"
						complementRuleForNavigation = true

					}
				}

				if (sourceNode.type.toString.contains("User")) {
					if (targetNode.type.toString.contains("ColorBlind")) {
						comparisonExpression = ".getColorBlind()=='true'"
						complementRuleForColorBlind = true
					}
				}
				if (sourceNode.type.toString.contains("User")) {
					System.out.println(targetNode.type.toString)
					if (targetNode.type.toString.contains("UserIsOld")) {
						comparisonExpression = ".getAge()>60"
						complementRuleForAge = true
					}
				}

				if (sourceNode.type.toString.contains("Platform")) {
					System.out.println(targetNode.type.toString)
					if (targetNode.type.toString.contains("English")) {
						comparisonExpression = ".getLanguage()=='en'"
					}
				}
				
				if (sourceNode.type.toString.contains("Platform")) {
					System.out.println(targetNode.type.toString)
					if (targetNode.type.toString.contains("German")) {
						comparisonExpression = ".getLanguage()=='dede'"
					}
				}

			}
			output = '''flow.rule("«rule.name»",[Profile,"m","m«profileToUse» «comparisonExpression»"],function(facts){
			'''
		// other rules added incrementally
		}

		output += new eifml.generator.nools.TGGNoolsActionGenerator().generateCode(rule)
		output += '''});
		'''
		// complement rule for color blind
		if (complementRuleForColorBlind) {
			comparisonExpression = ".getColorBlind()=='false'"
			output += '''flow.rule("Complement«rule.name»",[Profile,"m","m«profileToUse» «comparisonExpression»"],function(facts){
			'''
			output += new eifml.generator.nools.TGGNoolsActionGenerator().generateComplementCode(rule)
			output += '''});
			'''
		}

		if (complementRuleForNavigation) {
			comparisonExpression = ".getUserRole() != 'staff' && m.getUser().getUserRole() != 'student'"
			output += '''flow.rule("Complement«rule.name»",[Profile,"m","m«profileToUse» «comparisonExpression»"],function(facts){
			'''
			output += new eifml.generator.nools.TGGNoolsActionGenerator().generateComplementCode(rule)
			output += '''});
			'''
		}

		if (complementRuleForAge) {
			comparisonExpression = ".getAge()<=60"
			output += '''flow.rule("Complement«rule.name»",[Profile,"m","m«profileToUse» «comparisonExpression»"],function(facts){
			'''
			output += new eifml.generator.nools.TGGNoolsActionGenerator().generateComplementCode(rule)
			output += '''});
			'''
		}

		return output;
	}

}
