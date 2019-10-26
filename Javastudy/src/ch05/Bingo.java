package ch05;

import java.util.Arrays;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		for(int i = 0; i < 25; i++) {
			bingo[i] = i + 1;
		}
		System.out.println( Arrays.toString(bingo) );
		
		for(int i = 0; i <100; i++) {
			Random r = new Random();
			int num = r.nextInt(25);
			int temp = bingo[0];
			bingo[0] = bingo[num];
			bingo[num] = temp;
		}
		System.out.println( Arrays.toString(bingo));	
		
		for(int i = 0; i < 25; i++) {
		
		if(i % 5 == 0 ) {
			System.out.println();
		}
		
		System.out.print(bingo[i] + " ");
		}
	}
}
