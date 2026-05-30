package coding.block.dailycode;

public class Fibonacci {

	public static void main(String[] args) {
int n=15;
int i=0,num1=0,num2=1;


while(i<=n)
{
	System.out.print(num1+" ");
	int c=num1+num2;
	num1=num2;
	num2=c;
	i++;
}
	}

}
