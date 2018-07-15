package eifml.generator.views;


import essentialIFML.Extensions.impl.FormImpl
import essentialIFML.Extensions.OnSubmitEvent
import eifml.generator.general.AbstractViewElementGenerator
import eifml.generator.utils.ServiceCollection

public class FormGenerator extends AbstractViewElementGenerator<FormImpl>{
	
	override protected generateTemplate(FormImpl el) {
		var output = ""
		
		var fields = el.viewComponentParts
		var onSubmitEvent = el.viewElementEvents.filter(typeof(OnSubmitEvent)).get(0)
		
		output += '''
			<form id="«el.id»" name="«el.name»" class="form-horizontal">
			
			<!-- PROTECTED REGION ID «el.name» ENABLED START -->
					  	
			<!-- PROTECTED REGION END -->
		'''
		
		for(field : fields){
			if(field.name.equalsIgnoreCase("password")){
				output += '''
					<div class="form-group">
						<label for="«field.id»" class="col-sm-2 control-label">{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«field.name»')}}</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="«field.id»" [(ngModel)]="«field.name»">
						</div>
					</div>
				'''
			}
			else{
			output += '''
					<div class="form-group">
						<label for="«field.id»" class="col-sm-2 control-label">{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«field.name»')}}</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="«field.id»" [(ngModel)]="«field.name»">
						</div>
					</div>
				'''
			}
		}
		
		output += '''
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button id="«onSubmitEvent.id»" name="«onSubmitEvent.name»" (click)="«onSubmitEvent.name»()" type="submit"'''
					if(!onSubmitEvent.annotations.isEmpty()){
					for(annotation : onSubmitEvent.annotations){
						if(annotation.text.contains("<<enablingExpression>")){
							var expr = annotation.text.replace("<<enablingExpression>>","").trim();
							output += '''[ngClass]="{disabled: !(«expr»), 'class': btn}"'''
							}
						}
					}
	output+='''>{{_«ServiceCollection.sharedInstance.resource.name.toFirstLower».getLangString('«onSubmitEvent.name»')}}</button>
					</div>
				</div>
		'''
		
		output += '''
			</form>
		'''
		
		return output
	}
	
	override protected prepareGeneration(FormImpl it) {
	}
	
}
