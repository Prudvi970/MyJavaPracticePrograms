package com.pst.tr.patterns;

public class SquarePattern3 {

	public static void main(String[] args) {
		        // * # * #
				// * # * #
				// * # * #
				// * # * #
		for(int r = 1; r <= 4; r++ ) {
			for(int c = 1; c <= 4; c++) {
				if (c % 2 == 1) {
						System.out.print("*");
				}else {
					System.out.print("#");
				}
				
			}
			System.out.println();
		}

	}

}
