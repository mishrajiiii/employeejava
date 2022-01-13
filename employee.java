import java.util.Scanner;
public class employee {
	    String name;
	    int year;
	    String add; 
	    float salary;
	
	            public static void main(String args[]) 
	   {
	            Scanner sc = new Scanner(System.in);
	            employee emp[] = new employee[3];
	            for (int i = 0; i < 3; i++) {
	            emp[i] = new employee();
	            System.out.println("Enter " + (i + 1) + " Employee data :");
	            System.out.print("Enter employee name :");
	            emp[i].name = sc.next();
	            System.out.print("Enter employee year :");
	            emp[i].year = sc.nextInt();
	            System.out.print("Enter employee address :");
	            emp[i].add = sc.next();
	            System.out.print("Enter employee salary :");
	            emp[i].salary = sc.nextFloat();
	} sc.close();
	 System.out.println("\n\n********* All Employee Details are :*********\n");
	 System.out.println("name   "+" "+"year   "+" "+" salary  "+" "+"address ");
	 for (int i = 0; i < 3; i++) {
	        System.out.println("" + emp[i].name + " " + emp[i].year + " " + emp[i].salary + " " +emp[i].add);
	  }
	 }
	}
