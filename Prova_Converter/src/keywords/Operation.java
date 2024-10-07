package keywords;

import java.util.List;

public class Operation {
	Visibility visibility;
	List<Parameter> parameters;
	
	Operation(Visibility visibility, List<Parameter> parameters){
		this.visibility = visibility;
		this.parameters = parameters;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}
	
	
}
