package obr;
import java.util.Scanner;
public class Vvod {

	public static int[] vod() {
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� ����� � �������");
		n=Validity.valid3();
		int[] b = new int[n];
		
		for (int i = 0; i<n; i++)
		{
			System.out.println ("�������� "+(i+1) +" ������� �������: " );
			
			b[i] = Validity.valid1();
			
		}
		
		return b;
	}
	public static int csn() {
		Scanner sc = new Scanner(System.in);
		
		return  Validity.valid2();
		

	}
	public static int csn2() {
		Scanner sc = new Scanner(System.in);
		
		return  Validity.valid1();
		

	}
	public static void  prnt( int[] c )
	{
		int n;
		n=c.length;
		for (int i=0; i<n;++i)
		{  System.out.print (c[i]+" ");}
		System.out.println (" ");
		}
	
	
public static void  prntMenu()
{
	System.out.println ("1 - ���������� ������ �������� � ������.");
	System.out.println ("2 - ���������� ������� �� �����������.");
	System.out.println ("3 - ���������� ������� �� ��������.");
	System.out.println ("4 - ������������ �������.");
	System.out.println ("5 - ����������� �������.");
	System.out.println ("6 - �������� ������.");
	System.out.println ("0 - �����.");
	}

}
