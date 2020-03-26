package fr.uvsq.pglp_4_2;

import fr.uvsq.pglp_4_2.exceptions.ArgumentPileException;
import fr.uvsq.pglp_4_2.exceptions.MinMaxException;

public class ExceptionHandler {
	
	private static final double MIN_VALUE = 100000;
	private static final double MAX_VALUE = 100000;
	
	public static void handleMinMax(double nb) {
		if(nb > MAX_VALUE || nb < -MIN_VALUE) {
			throw new MinMaxException();
		}
	}
	
	public static void handleStackSize(int actualSize, int wantedSize) {
		if(actualSize < wantedSize) {
			throw new ArgumentPileException();
		}
	}

}
