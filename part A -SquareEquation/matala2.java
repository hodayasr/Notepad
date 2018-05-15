package Assignment2;

import java.lang.reflect.Executable;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.lang.*;

public class matala2 {

	public static void quadratic_equation_solution() throws SquareEquationException{

		int g;
		
		do{
			
			try{

				System.out.println("aX^2+bX+c=0: Enter a,b,c: ");
				Scanner s=new Scanner(System.in);
				double a=s.nextDouble();
				double b=s.nextDouble();
				double c=s.nextDouble();

				double x1 ,x2;
				if((b*b-4*a*c)<0)
					throw new SquareEquationException("Error: NO real roots!");

				if(a==0&&b==0&&c==0)
					throw new SquareEquationException("x can be any number - trivial!");

				if(a==0&&b==0&&c!=0)
					throw new SquareEquationException("Error, no answer!!");
				if(a==0&&b!=0&&c!=0)
				{
					x1=c/-b;
					System.out.println(a+"X^2 + "+b+"X+"+c+" = 0");
					System.out.println("x1= "+x1);
				}
				else {
				x1=(-b+(Math.sqrt(b*b-(4*a*c))))/(2*a);
				x2=(-b-(Math.sqrt(b*b-(4*a*c))))/(2*a);
				
				System.out.println(a+"X^2 + "+b+"X+"+c+" = 0");
				if(a!=0||b!=0||c!=0)
				{
				if(x1!=x2)
					System.out.println("x1= "+x1+", x2= "+x2);
				else
					System.out.println("x1=x2= "+x1);
				}
				}
		}
			

			catch(SquareEquationException e){
				e.printStackTrace();
			}

			
			System.out.println("Enter 0 or any number to Exit or 1 to solve aX^2+bX+c=0: ");
			Scanner sc=new Scanner(System.in);
			g=sc.nextInt();

		}
		while(g==1);

		System.out.println("bye bye!");

	}


	public static void main(String[] args) throws SquareEquationException{

		quadratic_equation_solution();
	}
}
