package obr;
import obr.Validity;
public class Work {
	public static int[] adb (int[] ms, int k)
	{  
		 int n;
		 n = ms.length;
		// int [] c = new int[n];
		 int [] ms2 = new int[n+1];
		 
		 //c = ms;
		 for (int i = 0; i < n; i++ )
			 ms2[i]=ms[i];
		  ms2[n]=k;
		return ms2;
	}
	public static int [] sort (int[] ms) // по убыванию
	{
		int mx = 0;
		int n=ms.length; 
		for(int i = 0; i<(n); i++)
		{
			for(int j = 0; j<(n-1); ++j)
			{
				if(ms[j]<ms[j+1]) { mx=ms[j]; ms[j]=ms[j+1]; ms[j+1]=mx;   }
			}
		}
		return ms;
	}
	public static int [] sort2 (int[] ms)  // по возрастанию
	{
		int mx = 0;
		int n=ms.length; 
		for(int i = 0; i<(n); i++)
		{
			for(int j = 0; j<(n-1); ++j)
			{
				if(ms[j]>ms[j+1]) { mx=ms[j]; ms[j]=ms[j+1]; ms[j+1]=mx;   }
			}
		}
		return ms;
	}
	public static int  maxEl (int[] ms) 
	{
		int mx = ms[0];
		int n=ms.length; 
		for(int i = 1; i<n; i++)
			if(ms[i]>mx) mx=ms[i];
		
		return mx;
	}
	public static int  minEl (int[] ms) 
	{
		int mn = ms[0];
		int n=ms.length; 
		for(int i = 1; i<n; i++)
			if(ms[i]<mn) mn=ms[i];
		
		return mn;
	}
	
	
}
