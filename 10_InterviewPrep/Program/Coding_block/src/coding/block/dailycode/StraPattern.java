package coding.block.dailycode;

	public class StraPattern {
	    public static void main(String[] args) {

	        int rows = 4;
	        int cols = 5;

	        int i = 1;
	        while (i <= rows) {

	            int j = 1;
	            while (j <= cols) {

	                if (i == 1 || i == rows) {
	                    // first and last row
	                    System.out.print("*");
	                } else {
	                    // middle rows
	                    if (j == 3) {
	                        System.out.print(" ");
	                    } else {
	                        System.out.print("*");
	                    }
	                }

	                j++;
	            }

	            System.out.println();
	            i++;
	        }
	    }
	}
