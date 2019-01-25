package com.qa.Assessment;

import java.util.Random;

public class Terrain {
	public static int[][] field = new int[5][5]; // represents the play area
	public static int[] featurePosition = new int[2]; // represents the goal
	public static Random randomNum = new Random();

	public static void PrintField() {
		// Iterates through "Field" and prints out value, reusable without assignment
		// (unlike TerrainGen().)
		// Mainly visual based testing purposes.
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				if (column == 4) {
					System.out.println(field[row][column] + " ");
				} else {
					System.out.print(field[row][column] + " ");
				}
			}
		}
	}

	public static void TerrainGen() {
		// Iterates through "Field" and sets all nulls to 0.
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				field[row][column] = 0;
			}
		}
	}

	public static void RandomFeature() {
		// Randomly selects a location and changes it to a 1.
		field[randomNum.nextInt(5)][randomNum.nextInt(5)] = 1;
		// Checks the location of the feature
		FeatureFinder();
		// Prevents feature spawning on player...
		if (field[featurePosition[0]][featurePosition[1]] == field[Movement.currentPosition[0]][Movement.currentPosition[1]]) {
			field[randomNum.nextInt(5)][randomNum.nextInt(5)] = 1;
		}
	}

	public static void FeatureFinder() // finds the feature
	{
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				if (field[row][column] == 1) {
					featurePosition[0] = row;
					featurePosition[1] = column;
				}
			}
		}
	}
}