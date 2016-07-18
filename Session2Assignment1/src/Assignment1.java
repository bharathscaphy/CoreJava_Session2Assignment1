import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a = s.nextInt();
		if(a>=18)
		{
			System.out.println("You are Eligibile to Vote");	
		}
		else
		{
			System.out.println("You are not Eligibile to Vote");
		}
	}

}
