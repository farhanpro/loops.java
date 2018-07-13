import java.util.Scanner;
public class Program_For_Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num;
		System.out.println("Enter the Number you want to find Multiplicants of : ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		for(i=0;i<=10;i++)
		{
			System.out.printf("%d * %d = %d \n",num,i,num*i);
			
		}

	}

}
