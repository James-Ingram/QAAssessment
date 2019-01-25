package com.qa.Assessment;

public class Movement {

	// this file contains all the actions relative to the directions they can move
	public static int[] currentPosition = new int[2]; // players position on the board

	public static void North() {
		Terrain.field[currentPosition[0]][currentPosition[1]] = 0;
		if ((currentPosition[0] - 1) < 0) {
			Descriptors.Dialogue(3);
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		} else {
			currentPosition[0] -= 1;
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		}
	}

	public static void East() {
		Terrain.field[currentPosition[0]][currentPosition[1]] = 0;
		if ((currentPosition[1] + 1) > 4) {
			Descriptors.Dialogue(3);
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		} else {
			currentPosition[1] += 1;
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		}
	}

	public static void South() {
		Terrain.field[currentPosition[0]][currentPosition[1]] = 0;
		if ((currentPosition[0] + 1) > 4) {
			Descriptors.Dialogue(3);
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		} else {
			currentPosition[0] += 1;
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		}
	}

	public static void West() {
		Terrain.field[currentPosition[0]][currentPosition[1]] = 0;
		if ((currentPosition[1] - 1) < 0) {
			Descriptors.Dialogue(3);
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		} else {
			currentPosition[1] -= 1;
			Terrain.field[currentPosition[0]][currentPosition[1]] = 8;
		}
	}
}