package obr;
import java.util.Scanner;
public class Vvod {

	public static int[] vod() {
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите колчиество чисел в массиве");
		n=Validity.valid3();
		int[] b = new int[n];
		
		for (int i = 0; i<n; i++)
		{
			System.out.println ("¬введите "+(i+1) +" элемент массива: " );
			
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
	System.out.println ("1 - добавление нового элемента в массив.");
	System.out.println ("2 - сортировки массива по возрастанию.");
	System.out.println ("3 - сортировки массива по убыванию.");
	System.out.println ("4 - максимальный элемент.");
	System.out.println ("5 - минимальный элемент.");
	System.out.println ("6 - показать массив.");
	System.out.println ("0 - выход.");
	}

}
