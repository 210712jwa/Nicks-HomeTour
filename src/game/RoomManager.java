package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	public Room[] rooms = new Room[4];
	
	public void init() {
		Room livingRoom = new Room( "The Living Room", "The family room", "The family room is where we gather to spend quality time together. Here we have the big screen, two large couches, and the fireplace to enjoy. Please \n"
				+ "take your shoes off at the door");
		this.rooms[0] = livingRoom;
		this.startingRoom = livingRoom;
		
		Room kitchen = new Room(" The Kitchen", "Cooking Station ", "The foundation of health and nutrition that equips us with the necessary tools to create a healthy environment for the family. It has huge open windows that allows natural light with a patio garden for herbs to utilize for cooking with a gray white and green color scheme. No argueing in the kitchen....there are knifes here.");
		this.rooms[1] = kitchen;
		
		Room diningRoom = new Room("The Dining Room ", "Untouchable dining area", "DON'T COME IN HERE! This is the room that is basically a china room. LOOK BUT DONT TOUCH! YOU GO GET A TRAY FROM THE KITCHEN AND GO BACK TO THE LIVING ROOM!\n"
				+ "Secretly my wifes pride and joy, so we dont eat in here");
		this.rooms[2] = diningRoom;
		
		
		Room basement =  new Room("The basement ", " Activity Room", "This is a play room for children in the day time and adults at night. Here is a bar, big screen TV, pool table and two very large couches. Very comfortable area to lounge and unwind..or WINE >:)");
		this.rooms[3] = basement;
		
		livingRoom.setExits(kitchen, null, diningRoom, basement);
		basement.setExits(null, null, livingRoom, null);
		diningRoom.setExits(null, null, null, livingRoom);
		kitchen.setExits(null, livingRoom, null, null);
	}

}
