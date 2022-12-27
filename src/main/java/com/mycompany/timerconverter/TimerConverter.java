package com.mycompany.timerconverter;
import java.util.Scanner; //User input library

public class TimerConverter {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt(); // User input day variable.
		
		int sum = days * 24; // Day to Hour

		sum = sum * 60; // Hour to Minute

		sum = sum * 60; // Minute to Second


		System.out.println(sum); // Result second

		
        
    }
}
