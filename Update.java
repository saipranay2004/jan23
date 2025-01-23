import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a ");
		int a = sc.nextInt();
		System.out.println("enter number b ");
		int b = sc.nextInt();
		System.out.println("enter number c ");
		int c = sc.nextInt();
		System.out.println("enter number d ");
		int d = sc.nextInt();
		if( (a<b) && (b<c) && (c<d)) {
		System.out.println("increasing order");
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d);}
		else if ((a>b) && (b>c) && (c>d)){
		System.out.println("decreasing order");
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d);}
		
		}
	}
