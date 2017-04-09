package io.kwu.kythera;

public abstract class Variable {
	private String identifier;
	private Object value; // ooh dangerous
	public abstract String toString();
	
	public class IntVariable extends Variable {
		@Override
		public String toString() {
			return null;
		}
	}
}