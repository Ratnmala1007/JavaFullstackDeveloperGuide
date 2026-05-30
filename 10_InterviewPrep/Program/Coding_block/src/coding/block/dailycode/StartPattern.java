package coding.block.dailycode;

public class StartPattern {
	    public static void main(String[] args) {

	        int rows = 4;
	        int i = 1;

	        while (i <= rows) {

	            // 1️⃣ Print leading spaces
	            int space = 1;
	            while (space <= (rows - i) * 3) {
	                System.out.print(" ");
	                space++;
	            }

	            // 2️⃣ Print stars with two spaces in between
	            int star = 1;
	            while (star <= i) {
	                System.out.print("*");
	                if (star < i) {
	                    System.out.print("  ");
	                }
	                star++;
	            }

	            // 3️⃣ Next line
	            System.out.println();
	            i++;
	        }
	    }
	}



