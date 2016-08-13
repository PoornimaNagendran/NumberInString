import java.util.Scanner;
public class NumbersInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		String a=s.next();
		String b=s.next();
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		int x=c*d;
		String str=String.valueOf(x);
		System.out.println("The result is "+str);

	}

}
