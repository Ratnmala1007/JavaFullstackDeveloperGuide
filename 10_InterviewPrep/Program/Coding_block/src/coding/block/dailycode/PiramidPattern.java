package coding.block.dailycode;

public class PiramidPattern {

	
	    public static void main(String[] args) {

	        int rows = 5;
	        int i = 1;

	        while (i <= rows) {

	            // 1️⃣ Print spaces
	            int space = 1;
	            while (space <= rows - i) {
	                System.out.print(" ");
	                space++;
	            }

	            // 2️⃣ Print stars
	            int star = 1;
	            while (star <= i) {
	                System.out.print("* ");
	                star++;
	            }

	            // 3️⃣ Move to next line
	            System.out.println();
	            i++;
	        }
	    }
	}


