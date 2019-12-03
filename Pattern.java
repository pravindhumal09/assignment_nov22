package com.assignment.nov22;

/**
 * @author 799197
 *Print below pattern
       *
       **
       ***
       ****
  */
public class Pattern {
		
		public static void main(String[] args) {
			for(int i=0; i<4; i++) {
				for(int j=0; j<=i; j++)
					{
					System.out.print("* ");
					}
				System.out.println();
			}
		}

	}

