package model;

public class Transport {

	private String type;

	public Transport(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transport [type=" + type + "]";
	}
	
	

}
