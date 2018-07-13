import java.util.Scanner;
public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j;
		System.out.println("Enter the number you want to search the multiplicants of: ");
		Scanner input=new Scanner(System.in);
		j=input.nextInt();
		do
		{
			System.out.printf("%d * %d = %d \n", j, i, i * j);
		//System.out.println(i);
			i++;
		}
		while(i<=10);
		
	}

}
