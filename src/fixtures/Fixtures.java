package fixtures;

public abstract class Fixtures {

	String name;//name of the room
	String sDescription;//short Description
	String lngDescription;//long Description
	
	public Fixtures(String name, String sDescription, String lngDescription) {
		this.name = name;
		this.sDescription = sDescription;
		this.lngDescription = lngDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsDescription() {
		return sDescription;
	}

	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}

	public String getLngDescription() {
		return lngDescription;
	}

	public void setLngDescription(String lngDescription) {
		this.lngDescription = lngDescription;
	}
	
	
	
}
