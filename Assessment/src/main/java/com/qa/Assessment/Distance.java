package com.qa.Assessment;

import java.text.DecimalFormat;

public class Distance {

	//This calculates the distance the player is from the win condition
	public static String Watch() {
		float distance = 0;
		float playerDistance = Movement.currentPosition[0] + 1 + Movement.currentPosition[1];
		float featureDistance = Terrain.featurePosition[0] + 1 + Terrain.featurePosition[1];
		if(featureDistance >playerDistance)
		{
			distance = featureDistance / playerDistance;
		}
		else
		{
			distance = playerDistance / featureDistance ;
		}
		return new DecimalFormat("#.00").format(distance);
	}
}
