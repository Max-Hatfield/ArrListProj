import java.util.ArrayList;
import java.util.Scanner;
public class carRun
	{
		static ArrayList<car>carStat= new ArrayList<car>();
		static Scanner userInput = new Scanner (System.in);
static int money = 20;
	static boolean m1 = true;
public static void main(String [] args)
{
	
	chooseCar();
	makeCars();
	menuChoice();
}

public static void makeCars()
{
car supra = new car("red ", "supra ", 1000);
carStat.add(supra);
//System.out.println(carStat.get(0).getName());
}
public static void chooseCar()
{
	System.out.println("Welcome to car game, you may pick a car and you will be stuck with it for the remanider of the game");
	System.out.println("you will start with 20$ and can earn money from winning races and can modify your car with it");
	System.out.println("what kind of car do you want?");
	System.out.println("1. Honda Civic");
	System.out.println("2. Toyota Celica");
	System.out.println("3. BMW 3 series");
	System.out.println("4. FJ cruiser");
	int choice = userInput.nextInt();
	if(choice == 1)
		{
		car userCar = new car ("ugly green ", " civic " , 200);
		carStat.add(userCar);

		}
	if(choice == 2)
		{
			car userCar = new car ("silver ", " celica " , 180);
			carStat.add(userCar);


		}
	if(choice == 3)
		{
			car userCar = new car ("fancy grey ", " 3 series" , 220);
			carStat.add(userCar);


		}
	if(choice == 4)
		{
			car userCar = new car ("flawless silver ", " FJ Cruiser" , 250);
			carStat.add(userCar);


		}
	//System.out.println("your car is " + carStat.get(0).getColor());
	
	
}
public static void menuChoice()
{

		System.out.println("what do you want to do?");
		System.out.println("1. go to store");
		System.out.println("2.check money ");
		System.out.println("3. check stats");
		System.out.println("4. race");
		int choice= userInput.nextInt();

	
	if( choice ==1)
		{
			
		}
	if( choice ==2)
		{
			System.out.println(money);
			menuChoice();
			
		}
	if( choice ==3)
		{
			System.out.println(carStat.get(0).getColor()+carStat.get(0).getName() + " with " +carStat.get(0).getHp() + "horsepower");
			menuChoice();
		}
	if( choice ==4)
		{
			
		}
	
}
public static void shop()
{
System.out.println("Welcome to shop, you have $" + money + "to spend, what would you like to look at");
System.out.println("1. car performance mods");
System.out.println("2. car tunes");
System.out.println("3. customizations");
int choice =userInput.nextInt();
if( choice ==1)
	{
		System.out.println("welcome to modding marks, what mods do you want to try out?");
		System.out.println("1. 100$ Turbo Charger + 35% hp");
		System.out.println("2. 75$ Super Charger + 25% hp");
		System.out.println("3. 20$ pirelli racing tires + 10% hp");
		int mchoice = userInput.nextInt();
		if(mchoice ==1 && m1 && money>=100 )
			{
			money-=100;
			m1=false;
			
				
			}
		if( mchoice ==2)
			{
				
			}
		if( mchoice ==3)
			{
				
			}
	}
if( choice ==2)
	{
		System.out.println("welcome to tuner tims what would you like today?");
		System.out.println("1. Stage 1 tune: 10% hp gain");
		System.out.println("2. Stage 2 tune: 20% hp gain");
		System.out.println("3. Stage 3 tune: 30% hp gain");
		
	}
if( choice ==3)
	{
		
	}


}
	}


