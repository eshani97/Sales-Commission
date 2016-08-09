import java.util.Scanner;

public class SalesCommission {
	public static void main(String args[])
	{
		int[] c=new int[12];
		int n,i,salaryOfPerson,gross;
		System.out.println("Enter the number of elements of array");
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter gross value of %d - Salesperson ",i);
			gross=inp.nextInt();
			salaryOfPerson=(int)(200+(gross*0.09));
			System.out.printf("%nThe total commission received by Salesperson %d",salaryOfPerson);
			if((salaryOfPerson>=200) && (salaryOfPerson<=299))
				c[0]++;
			if((salaryOfPerson>=300) && (salaryOfPerson<=399))
				c[1]++;
			if((salaryOfPerson>=400) && (salaryOfPerson<=499))
				c[2]++;
			if((salaryOfPerson>=500) && (salaryOfPerson<=599))
				c[3]++;
			if((salaryOfPerson>=600) && (salaryOfPerson<=699))
				c[4]++;
			if((salaryOfPerson>=700) && (salaryOfPerson<=799))
				c[5]++;
			if((salaryOfPerson>=800) && (salaryOfPerson<=899))
				c[6]++;
			if((salaryOfPerson>=900) && (salaryOfPerson<=999))
				c[7]++;
			if(salaryOfPerson>1000)
				c[8]++;
		}
		System.out.printf("\nRange\t    NumberSalesperson\n");
		i=0;
		System.out.printf("\n200-299      %d",c[0]);
		System.out.printf("\n300-399      %d",c[1]);
		System.out.printf("\n400-499      %d",c[2]);
		System.out.printf("\n500-599      %d",c[3]);
		System.out.printf("\n600-699      %d",c[4]);
		System.out.printf("\n700-799      %d",c[5]);
		System.out.printf("\n800-899      %d",c[6]);
		System.out.printf("\n900-999      %d",c[7]);
		System.out.printf("\n1000 &above  %d",c[8]);
		
				
		}

}
