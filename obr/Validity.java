package obr;
import java.util.Scanner;
public class Validity {
   
	 public static int valid1 ()
	 {    
		  int nn,n;
		  int f;
		  char ch;
		 Scanner sc = new Scanner(System.in);
		 String s;
		 do{
			 nn=0;
			 f=0;
		  s=sc.nextLine(); 
		  n=s.length();
		  for (int i=0; i<(n); ++i)
		  {
			 ch=s.charAt(i);
			 if (i==0) f=val3(ch); else
			 f=val(ch);
			 if (f==1) break;
		  }
		  if ((f==0)&&(Long.parseLong(s)>=-2147483648)&&(Long.parseLong(s)<=2147483647)){ nn=1; break;} else { System.out.println ("¬ведите правильное число: " ); nn=0; } 
		 } while(nn==0);
		 int chislo=Integer.parseInt(s);
		 return chislo;
	 }
	 
	 public static int valid2 ()
	 {    
		  int nn,n;
		  int f;
		  char ch;
		 Scanner sc = new Scanner(System.in);
		 String s;
		 do{
			 nn=0;
			 f=0;
		  s=sc.nextLine(); 
		  n=s.length();
		  for (int i=0; i<(n); ++i)
		  {
			 ch=s.charAt(i);
			 f=val2(ch);
			 if (f==1) break;
		  }
		  if ((f==0)&&(n==1)) { nn=1; break;} else { System.out.println ("¬ведите правильное число: " ); nn=0; } 
		 } while(nn==0);
		 int chislo=Integer.parseInt(s);
		 return chislo;
	 }
	 
	 public static int valid3 ()
	 {    
		  int nn,n;
		  int f;
		  char ch;
		 Scanner sc = new Scanner(System.in);
		 String s;
		 do{
			 nn=0;
			 f=0;
		  s=sc.nextLine(); 
		  n=s.length();
		  for (int i=0; i<(n); ++i)
		  {
			 ch=s.charAt(i);
			 if (i==0) f=val3(ch); else
				 f=val(ch);
			 if (f==1) break;
		  }
		  if ((f==0)&&(Long.parseLong(s)>0)&&(Long.parseLong(s)<=2147483647)){ nn=1; break;} else { System.out.println ("¬ведите правильное число: " ); nn=0; } 
		 } while(nn==0);
		 int chislo=Integer.parseInt(s);
		 return chislo;
	 }
	 
	 public static int val(char c)
	 {
		 int ff=1;
		 switch (c) {
		case '1': ff=0;
		case '2': ff=0;
		case '3': ff=0;
		case '4': ff=0;
		case '5': ff=0;
		case '6': ff=0;
		case '7': ff=0;
		case '8': ff=0;
		case '9': ff=0;
		case '0': ff=0;
		}
		 return ff;
	 }
	 public static int val3(char c)
	 {
		 int ff=1;
		 switch (c) {
		case '1': ff=0;
		case '2': ff=0;
		case '3': ff=0;
		case '4': ff=0;
		case '5': ff=0;
		case '6': ff=0;
		case '7': ff=0;
		case '8': ff=0;
		case '9': ff=0;
		case '0': ff=0;
		case '-': ff=0;
		case '+': ff=0;
		}
		 return ff;
	 }
public static int val2(char c)
{
	 int ff=1;
	 switch (c) {
	case '1': ff=0;
	case '2': ff=0;
	case '3': ff=0;
	case '4': ff=0;
	case '5': ff=0;
	case '6': ff=0;
	case '0': ff=0;
	}
	 return ff;
}
}
