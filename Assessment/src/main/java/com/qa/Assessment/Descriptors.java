package com.qa.Assessment;

public class Descriptors {

	//This entire file is made up of all the text options that can be used in the game.
	public static void Dialogue(int variant) {
		switch (variant) {
		case 0: {
			System.out.println(
					"You find yourself in a foggy field, visibility is poor,\nyou have nothing but your wits and an urge to find...\n...something?");
			break;
		}
		case 1: {
			System.out.println("You notice a small watch-like device in your left hand.\n"
					+ "It has hands like a watch, but the hands don't seem to tell time.\n");
			break;
		}
		case 2: {
			System.out.println("\nWhich Way Would You Like To Go?\nHint,Try: \"North\",\"East\",\"South\",\"West\"");
			break;
		}
		case 3: {
			System.out.println("An Invisible Barrier Prevents You Going That Way.\n");
			break;
		}
		case 4: {
			System.out.println("\nYour Watch now reads: " + Distance.Watch() + "m");
			break;
		}
		case 5: {
			System.out.println("Entered Argument Was Invalid\nThe feature has moved...\n");
			break;
		}
		case 6: {
			System.out.println(
					"You notice a piece of paper on the floor,\nit looks old, possibly untrustworthy, pick it up?");
			break;
		}
		case 7: {
			System.out.println("After hearing what you can only describe as a shallow groan, you decide to move.\n");
			break;
		}
		default: {
			System.out.println("Fail");
			break;
		}
		}
	}

	public static void TreasureOptions(int variant) {
		switch (variant) {
		case 0: {
			System.out.println("You find a stash of food, satiating!");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("\"It's A Presidential BigMac!\"");
			}
			break;
		}
		case 1: {
			System.out.println("There is an abandoned car, you think to yourself \"I Can Leave?!\"");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("\"Think I'll Call Him Herbie.\"");
			}
			break;
		}

		case 2: {
			System.out.println("You find a small house.");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("I wonder if there are any balloons nearby?");
			}
			break;
		}

		case 3: {
			System.out.println("Stumbling over it, you notice there is a rare gemstone on the ground");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("Ooh! shiny!");
			}
			break;
		}
		case 4: {
			System.out.println("Stumbling over it, you notice there is a shiny ring on the ground");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("My Precious!");
			}
			break;
		}

		case 5: {
			System.out.println("It's just a barrel of jet fuel...");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("\"I Wonder If There Are Steel Beams Around Here Somewhere?\"");
			}
			break;
		}
		case 6: {
			System.out.println("It's a mobile phone, it's broken and is stuck playing a video...");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("Who's Rick Astley?");
			}
			break;
		}
		case 7: {
			System.out.println("It's a rock?...");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("\"Think I'll enter him in a race.\"");
			}
			break;
		}
		case 8: {
			System.out.println("It's a disembodied brain.. \t..huh?");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("Ah the little grey cells, they are fragile");
			}
			break;
		}
		case 9: {
			System.out.println("You find a small sprouting herb. looks like basil");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.println("HA! HA! BOOM! BOOM!");
			}
			break;
		}
		case 10: {
			System.out.println("You find nothing...");
			if (Terrain.randomNum.nextInt(50) == 42) {
				System.out.print("except a small screwdriver that hums when touched... odd... ");
			}
			break;
		}

		}
	}

}
