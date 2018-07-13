import java.util.Scanner;
public class WhileScanner {

	public static void main(String[] args) {
		int i=1,j;
		
		System.out.println("Enter the number of which you want to see the multiplicants of : ");
		Scanner input=new Scanner(System.in);
	//	i=input.nextInt();
		j=input.nextInt();
		// TODO Auto-generated method stub
		while (i<=10)
	{
		System.out.printf(" %d * %d = %d \n", j , i , i * j);
		i++;
	}

}
}