import java.util.*;

public class Main{
	
	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
		
		//Making Cars objects
		
		AutomaticCar car1= new AutomaticCar();
		AutomaticCar car2= new AutomaticCar();
		AutomaticCar car3= new AutomaticCar();
		AutomaticCar car4= new AutomaticCar();
		AutomaticCar car5= new AutomaticCar();
		
		System.out.printf("\n\tDetails ABout Car1");	//Car1 Body
		System.out.println();
		
		System.out.print("Model: ");
		String model1= input.nextLine();
		
		System.out.print("Year: ");
		String year1= input.nextLine();
		
		car1.setmodel(model1);
		car1.setyear(year1);
		
		
		
		System.out.printf("\n\tDetails ABout Car2");	//Car2 Body
		System.out.println();
		
		System.out.print("Model: ");
		String model2= input.nextLine();
		
		System.out.print("Year: ");
		String year2= input.nextLine();
		
		car2.setmodel(model2);
		car2.setyear(year2);
		
		
		
		System.out.printf("\n\tDetails ABout Car3");	//Car3 Body
		System.out.println();
		
		System.out.print("Model: ");
		String model3= input.nextLine();
		
		System.out.print("Year: ");
		String year3= input.nextLine();
		
		car3.setmodel(model3);
		car3.setyear(year3);
		
		
		
		System.out.printf("\n\tDetails ABout Car4");	//Car4 Body
		System.out.println();
		
		System.out.print("Model: ");
		String model4= input.nextLine();
		
		System.out.print("Year: ");
		String year4= input.nextLine();
		
		car4.setmodel(model4);
		car4.setyear(year4);
		
		
		
		System.out.printf("\n\tDetails ABout Car5");	//Car5 Body
		System.out.println();
		
		System.out.print("Model: ");
		String model5= input.nextLine();
		
		System.out.print("Year: ");
		String year5= input.nextLine();
		
		car5.setmodel(model5);
		car5.setyear(year5);
		
		
		
		int Dcar1=0;
		int Dcar2=0;
		int Dcar3=0;
		int Dcar4=0;
		int Dcar5=0;
		int round;
		
		for(round=1; round<=10; round++){
			
			System.out.printf("\n\nAfter Hour/Round: %d \n\n",round);
			int speedcar1= rand.nextInt(500);
			int speedcar2= rand.nextInt(500);
			int speedcar3= rand.nextInt(500);
			int speedcar4= rand.nextInt(500);
			int speedcar5= rand.nextInt(500);
			
			car1.setspeed(speedcar1);
			car2.setspeed(speedcar2);
			car3.setspeed(speedcar3);
			car4.setspeed(speedcar4);
			car5.setspeed(speedcar5);
		
			
			Dcar1+=speedcar1;
			Dcar2+=speedcar2;
			Dcar3+=speedcar3;
			Dcar4+=speedcar4;
			Dcar5+=speedcar5;
			
			car1.setdistance(Dcar1, round);
			car2.setdistance(Dcar2, round);
			car3.setdistance(Dcar3, round);
			car4.setdistance(Dcar4, round);
			car5.setdistance(Dcar5, round);
		
			System.out.printf("Car1: %s (%s)\n", model1, year1);
			car1.bar();
			System.out.printf(" Distance: %dkm\n\n", car1.getdistance());
		
			System.out.printf("Car2: %s (%s)\n", model2, year2);
			car2.bar();
			System.out.printf(" Distance: %dkm\n\n", car2.getdistance());
		
			System.out.printf("Car3: %s (%s)\n", model3, year3);
			car3.bar();
			System.out.printf(" Distance: %dkm\n\n", car3.getdistance());
		
			System.out.printf("Car4: %s (%s)\n", model4, year4);
			car4.bar();
			System.out.printf(" Distance: %dkm\n\n", car4.getdistance());
		
			System.out.printf("Car5: %s (%s)\n", model5, year5);
			car5.bar();
			System.out.printf(" Distance: %dkm\n\n\n", car5.getdistance());
			System.out.printf("\n\n\n\n\n");
			
		}
			
		
		
		
		System.out.printf("Car1: %s (%s)\n", model1, year1);
		car1.bar();
		System.out.printf(" Distance: %dkm\n\n", car1.getdistance());
		
		System.out.printf("Car2: %s (%s)\n", model2, year2);
		car2.bar();
		System.out.printf(" Distance: %dkm\n\n", car2.getdistance());
		
		System.out.printf("Car3: %s (%s)\n", model3, year3);
		car3.bar();
		System.out.printf(" Distance: %dkm\n\n", car3.getdistance());
		
		System.out.printf("Car4: %s (%s)\n", model4, year4);
		car4.bar();
		System.out.printf(" Distance: %dkm\n\n", car4.getdistance());
		
		System.out.printf("Car5: %s (%s)\n", model5, year5);
		car5.bar();
		System.out.printf(" Distance: %dkm\n\n\n", car5.getdistance());
		System.out.printf("\n\n");
		
		System.out.printf("\n\t****RESULTS****\n\n");
		
			if(car1.getdistance()>car2.getdistance() && car1.getdistance()>car3.getdistance() && car1.getdistance()>car4.getdistance() && car1.getdistance()>car5.getdistance() )
				System.out.printf("Car1 %s (%s) Wins The Game\n\n", model1, year1);
			else if(car2.getdistance()>car1.getdistance() && car2.getdistance()>car3.getdistance() && car2.getdistance()>car4.getdistance() && car2.getdistance()>car5.getdistance() )
				System.out.printf("Car2 %s (%s) Wins The Game\n\n", model2, year2);
			else if(car3.getdistance()>car1.getdistance() && car3.getdistance()>car2.getdistance() && car3.getdistance()>car4.getdistance() && car3.getdistance()>car5.getdistance() )
				System.out.printf("Car3 %s (%s) Wins The Game\n\n", model3, year3);
			else if(car4.getdistance()>car2.getdistance() && car4.getdistance()>car3.getdistance() && car4.getdistance()>car1.getdistance() && car4.getdistance()>car5.getdistance() )
				System.out.printf("Car4 %s (%s) Wins The Game\n\n", model4, year4);
			else if(car5.getdistance()>car2.getdistance() && car5.getdistance()>car3.getdistance() && car5.getdistance()>car4.getdistance() && car5.getdistance()>car1.getdistance() )
				System.out.printf("Car5 %s (%s) Wins The Game\n\n", model5, year5);
			
		
	}
	
}