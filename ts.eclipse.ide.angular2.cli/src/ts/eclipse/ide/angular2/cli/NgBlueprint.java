package ts.eclipse.ide.angular2.cli;

public enum NgBlueprint {

	MODULE, COMPONENT, DIRECTIVE, PIPE, SERVICE, GUARD, CLASS, INTERFACE, ENUM;

	private final String blueprint;

	private NgBlueprint() {
		this.blueprint = name().toLowerCase();
	}

	public String getBlueprint() {
		return blueprint;
	}
}
