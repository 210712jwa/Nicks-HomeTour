package game;

import java.util.Scanner;

public class Main {

	static String[] cIM = new String[4]; //cIM is collect input Method
	static Scanner sc = new Scanner(System.in);
	static String playerName;
	static Player p1 = new Player();
	static RoomManager rm = new RoomManager();

	public static void main(String[] args) {

		rm.init();
		p1.setCurrentRoom(rm.startingRoom);

		System.out.println("Good evening, so happy for you to make it. Im sorry what was your name again? Input \n"
				+ "first and last name here");
		playerName = sc.nextLine();
		System.out.println(
				"well hello there " + playerName + " Welcome to my home, we will start in the living room but if you\n ever decide"
						+ " you want to end the tour please input Q ");
		System.out.println();

		boolean system = true;
		
		while(system != false) {
			printRoom(p1);
			collectInput();
			parse(cIM, p1);
			
		}
		
	}

	private static void printRoom(Player player) {
		System.out.println(p1.currentRoom.getName());
		System.out.println(p1.currentRoom.getLngDescription());
		System.out.println("");
		
		System.out.println("Exits: Please input North, South, East or West as you see it displayed here.");
		System.out.println();
		if (p1.currentRoom.getExits()[0] != null) {
		System.out.println("North: " + p1.currentRoom.getExits()[0].getsDescription());
		}
		if (p1.currentRoom.getExits()[1] != null) {
			System.out.println("South: " + p1.currentRoom.getExits()[1].getsDescription());
		}
		if (p1.currentRoom.getExits()[2] != null) {
			System.out.println("East: " + p1.currentRoom.getExits()[2].getsDescription());
		}
		if (p1.currentRoom.getExits()[3] != null) {
			System.out.println("West: " + p1.currentRoom.getExits()[3].getsDescription());
		}
	}

	private static String[] collectInput() {
		return cIM = sc.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) {

		p1.currentRoom = p1.currentRoom.getExit(command[0]);
	}

}
