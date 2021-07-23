package fixtures;

public class Room extends Fixtures{

	Room[] Exits;

	public Room(String name, String sDescription, String lngDescription) {
		super(name, sDescription, lngDescription);
		this.Exits = new Room[4];
	}

	public void setExits(Room N, Room S, Room E, Room W) {
		Exits[0] = N;
		Exits[1] = S; 
		Exits[2] = E;
		Exits[3] = W;
	}

	public Room[] getExits() {
		return Exits;
	}
	
	public Room getExit(String direction) {
		if (direction.equals("North") || direction.equals("north")) {
			return Exits[0];
		}
		if (direction.equals("South") || direction.equals("south")) {
			return Exits[1];
		}
		if (direction.equals("East") || direction.equals("east")) {
			return Exits[2];
		}
		if (direction.equals("West") || direction.equals("west")) {
			return Exits[3];
		}
		return null;
	}

}
