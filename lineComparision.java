package Day8Assignment;

import com.bridgelabz.day8assignment.lineComparisionProblem;

public class lineComparision {

	void lineDistance()
	{
		
		//for point1
		double x1=5;
		double y1=5;
		
		//for point2
		double x2=10;
		double y2=10;
		
		//calculating distance between two points
		double distance = Math.sqrt(x2-x1) * (x2-x1) + (y2-y1) * (y2-y1);
		System.out.println("Distance Between The Two Points:" + distance);

	}
	
	void lineEquality()
	{
		//for line1
		double Ax1=1;
		double Ay1=1;
		double Ax2=7;
		double Ay2=7;
		
		//for line2
		double Bx1=1;
		double By1=1;
		double Bx2=7;
		double By2=7;
		
		//calculating equality of two lines
		double distance1 = Math.sqrt(Ax2-Ax1)*(Ax2-Ax1) + (Ay2-Ay1)*(Ay2-Ay1);
		double distance2 = Math.sqrt(Bx2-Bx1)*(Bx2-Bx1) + (By2-By1)*(By2-By1);
		if (distance1 == distance2)
		System.out.println("Lines are equal");
		
	}
	
	void compareLine()
	{
		//for line1
		double Fx1=1;
		double Fy1=1;
		double Fx2=7;
		double Fy2=7;
		
		//for line2
		double Sx1=1;
		double Sy1=1;
		double Sx2=6;
		double Sy2=6;
		
		//calculatons
		double distance1 = Math.sqrt(Fx2-Fx1)*(Fx2-Fx1) + (Fy2-Fy1)*(Fy2-Fy1);
		double distance2 = Math.sqrt(Sx2-Sx1)*(Sx2-Sx1) + (Sy2-Sy1)*(Sy2-Sy1);
		if (distance1 - distance2 == 0)
		{
			System.out.println("Line's are equal");
		}
		else if (distance1 - distance2 > 0)
		{
			System.out.println("Line one is bigger");
		}
		else
		{
			System.out.println("Line two is bigger");
		}
		}
	
		public static void main(String[] args)
		{
			lineComparision l=new lineComparision();
			l.lineDistance();
			
			lineComparision c=new lineComparision();
			c.lineEquality();
			
			lineComparision a=new lineComparision();
			a.compareLine();
		}

}
