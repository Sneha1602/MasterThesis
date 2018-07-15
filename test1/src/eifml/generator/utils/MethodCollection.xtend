package eifml.generator.utils

import java.util.HashMap

class MethodCollection extends HashMap<String, String> {

	def String signatures() {

		keySet.join(";\n") + ";"
	}

	def String implementations() {

		var output = ""

		for (signature : keySet) {

			output += '''
				«signature» {
					
					«get(signature) ?: ""»
				}
					
			'''
		}

		return output
	}
}
