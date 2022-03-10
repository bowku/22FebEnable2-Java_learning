package com.qa.calculator;

public class blackjack {

		private int a;
		private int b;
			
	
		public int play(int a,int b) {
			if (a >= 0 && b >= 0 && a <= 21 && b <= 21 ) {
				return Math.max(a , b);
			} else if (a>=0 && b>=0 && a>21 && b<=21) {
					return b;
			} else if (a>=0 && b>=0 && a<=21 && b>21) {
					return a;
			} else {
					return 0;
			}
			
		}
		
		
	
		
	
}
