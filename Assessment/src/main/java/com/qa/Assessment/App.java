package com.qa.Assessment;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		boolean map, exit = false;
		Descriptors.Dialogue(0);//All three generate starting dialogue options
		Descriptors.Dialogue(1);
		Descriptors.Dialogue(6);
		Scanner mapInputScaner = new Scanner(System.in); //Takes map option
		String mapInputString = mapInputScaner.next().toLowerCase();
		if (mapInputString.equals("no")) { //checks if the user wants to use the map
			map = false;
		} else {
			map = true;
		}
		Descriptors.Dialogue(7); 
		while (!exit) {				//Used to keep game running constantly
			Descriptors.Dialogue(2);
			Terrain.TerrainGen();	//Adds 0's to all spaces on terrain
			Terrain.RandomFeature();//Adds in the RandomFeature
			Terrain.FeatureFinder();//Finds where the feature was placed
			restart: while (Terrain.field[Terrain.featurePosition[0]][Terrain.featurePosition[1]] != Terrain.field[Movement.currentPosition[0]][Movement.currentPosition[1]]) { //Win condition
				Descriptors.Dialogue(4);
				Scanner userInputScaner = new Scanner(System.in);	// Takes movement option
				String userInputString = userInputScaner.next().toLowerCase(); 
				switch (userInputString) {// Each Case is a different direction
				case "n":
				case "north": {
					Movement.North();
					if (map) {
						Terrain.PrintField();
					}
					break;
				}
				case "e":
				case "east": {
					Movement.East();
					if (map) {
						Terrain.PrintField();
					}
					break;
				}
				case "s":
				case "south": {
					Movement.South();
					if (map) {
						Terrain.PrintField();
					}
					break;
				}
				case "w":
				case "west": {
					Movement.West();
					if (map) {
						Terrain.PrintField();
					}
					break;
				}
				case "exit": {
					return;
				}
				default: {
					Descriptors.Dialogue(5);
					break restart;
				}
				}
			}
			Descriptors.TreasureOptions(Terrain.randomNum.nextInt(11)); //Randomises winning messages
		}
	}
}
