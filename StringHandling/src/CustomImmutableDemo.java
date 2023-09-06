
public final class CustomImmutableDemo {
	
	private final String name;

	public CustomImmutableDemo(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String customContact(String s) {
		return name+s;
	}

	@Override
	public String toString() {
		return name;
	}

	
	
}
