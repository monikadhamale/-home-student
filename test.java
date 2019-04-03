import java.util.Scanner;
public class test
{
public static void main(String ar[])
{
 Scanner in = new Scanner(System.in);

	System.out.println("Enter number");
	int n=in.nextInt(); 

	int i,j,a,b,c,u,v,x,y,z;

	a=0;
	b=0;
	c=0;
	
	u=1;
	v=5;
	x=7;
	y=9;
	z=11;

	b=n;
	
	
		if(b==(u+v))
	{	System.out.println("1c=="+c);
		c++;
	}	/////////////////////////
	
	 if(b==(u+x))
{	System.out.println("2c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		if(b==(u+y))
{	System.out.println("3c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+z))
{	System.out.println("4c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+v))
{	System.out.println("5c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(v+x))
{	System.out.println("6c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(v+y))
{	System.out.println("7c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(v+z))
{	System.out.println("8c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(x+y))
{	System.out.println("9c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(x+z))
{	System.out.println("10c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(y+z))
{	System.out.println("11c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+v+x))
{	System.out.println("12c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+v+y))
{	System.out.println("13c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+v+z))
{	System.out.println("14c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+x+z))
{	System.out.println("15c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+x+y))
{	System.out.println("16c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+v+x+y+z))
{	System.out.println("17c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+x+y+z))
{	System.out.println("18c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(v+x+y))
{	System.out.println("19c=="+c);
		c++;
	}	/////////////////////////
	 if(b==(v+z+y))
{	System.out.println("19c=="+c);
		c++;
	}	//
		/////////////////////////
		 if(b==(u+x+z))
{	System.out.println("20c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(u+x+y+z))
{	System.out.println("21c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		 if(b==(x+y+z))
{	System.out.println("22c=="+c);
		c++;
	}	/////////////////////////
	
		/////////////////////////
		

	
	System.out.println("no of occurences="+c);
}

}
