import java.util.Scanner;
public class Google {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//ask the user what shape you want
		System.out.println(" pick one of the following options");
		System.out.println("1. rectangle area");
		System.out.println("2. rectangle perimeter");
		System.out.println("3. triangle area");
		System.out.println("4. triangle perimeter");
		System.out.println("5. circle area");
		System.out.println("6. circle ciircumference");
		System.out.println("7. Quit");
		System.out.println("Ok Google: ");
		int choice=in.nextInt();
		//read in the values
		if(choice==1){
			//rectangle area
			int l,w;
			System.out.println(" give me the length");
			l=in.nextInt();
			System.out.println("give me a width");
			w=in.nextInt();
			int area=GeoCalc.rectArea(l,w);
			System.out.println(" the area of "+l+" and "+w+" is "+area);
			
		}
		//call the right method
		//print out the answer
		//repeat until quit

	}

}
