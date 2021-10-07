import java.util.ArrayList;
import java.util.Scanner;
public class carRun
	{
		static ArrayList<car>carStat= new ArrayList<car>();
		static Scanner userInput = new Scanner (System.in);
static int money = 2000;
static String HI = "GFH LOL";
static String HI2 = "GFH2 lol";
	static boolean turbo = true;
	static boolean Sc = true;
	static boolean wheel= true;
	static boolean one = true;
	static boolean two = true;
	static boolean three = true;
	static boolean wing = true;
	static boolean color = true;
	static int carchoice = 0;
	static int rreward;
	static int rireward;
	static int mreward;
	public static void main(String [] args)
{
	
	chooseCar();
	makeCars();
	menuChoice();
	race();
}

public static void makeCars()
{
	car camero = new car(" red ", "camero ", 210, 3 , 1);
	car bmw = new car(" silver ", " bmw ", 250, 2, 2);
	car yaris = new car(" dope sponser wrap ", " yaris ", 300, 4 , 4);
car supra = new car("red ", "supra ", 1000, 10 , 8);
carStat.add(camero);
carStat.add(bmw);
carStat.add(yaris);
carStat.add(supra);
//System.out.println(carStat.get(1).getName());
//System.out.println(carStat.get(2).getName());
//System.out.println(carStat.get(3).getName());
//System.out.println(carStat.get(4).getName());


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
		car userCar = new car ("ugly green ", " civic " , 200, 2 ,0);
		carStat.add(userCar);

		}
	if(choice == 2)
		{
			car userCar = new car ("silver ", " celica " , 180, 4,0) ;
			carStat.add(userCar);


		}
	if(choice == 3)
		{
			car userCar = new car ("fancy grey ", " 3 series" , 220, 3,0);
			carStat.add(userCar);


		}
	if(choice == 4)
		{
			car userCar = new car ("flawless silver ", " FJ Cruiser" , 250, 1,0);
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
			shop();
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
			race();
		}
	
}
public static void shop()
{
System.out.println("Welcome to shop, you have $" + money + " to spend, what would you like to look at");
System.out.println("1. car performance mods");
System.out.println("2. car tunes");
System.out.println("3. customizations");
System.out.println("4. go back to menu");
int choice =userInput.nextInt();
if( choice ==1)
	{
		System.out.println("welcome to modding marks, what mods do you want to try out?");
		System.out.println("1. 100$ Turbo Charger + 25% hp");
		System.out.println("2. 75$ Super Charger + 20% hp");
		System.out.println("3. 20$ pirelli racing tires + 10% hp");
		System.out.println("4. main menu");
		int mchoice = userInput.nextInt();
		
		if(mchoice ==1) {
		if(mchoice ==1 && turbo && money>=100 )
			{
			money-=100;
			turbo=false;
			int TH = carStat.get(0).getHp()/4;
			carStat.get(0).setHp(TH+carStat.get(0).getHp());
		System.out.println( "congrats you now have a turbo and have " + carStat.get(0).getHp() + " horsepower and $" + money);
			shop();
			}	
			
		else if( money<=100)
			{
				System.out.println("you dont have enough money yuo only have " + money);
				shop();

			}
		else if( turbo == false)
			{
				System.out.println("you already have one you can only have one!");
				shop();

			}
	}
			if(mchoice ==2) {
		if( mchoice ==2 && Sc && money>=75)
			{
				money-=75;
				Sc=false;
				int TH = carStat.get(0).getHp()/5;
				carStat.get(0).setHp(TH +carStat.get(0).getHp() );
				System.out.println( "congrats you now have a supercharger and have " + carStat.get(0).getHp() + " horsepower and $" + money);
				shop();
			}
		else if( money<=75)
		{
			System.out.println("you dont have enough money yuo only have " + money);
			shop();

		}
	else if( Sc == false)
		{
			System.out.println("you already have one you can only have one!");
			shop();
		}
			}
			if(mchoice ==3) {
		if( mchoice ==3 && wheel && money>=20)
			{
				money-=20;
				wheel=false;
				int TH = carStat.get(0).getHp()/10;
				carStat.get(0).setHp(TH+carStat.get(0).getHp());
				System.out.println( "congrats you now have wheels and have " + carStat.get(0).getHp() + " horsepower and $" + money);
				shop();
			}
		else if( money<20)
		{
			System.out.println("you dont have enough money yuo only have " + money);
			shop();

		}
	else if( wheel == false)
		{
			System.out.println("you already have one you can only have one!");
			shop();
		}
	
	}
			if(mchoice == 4) {
				shop();
			}
	}
if( choice ==2)
	{
		System.out.println("welcome to tuner tims what would you like today?");
		System.out.println("1.7$ Stage 1 tune: 10% hp gain");
		System.out.println("2. 15$ Stage 2 tune: 20% hp gain and 1 rice (anti lag pop)");
		System.out.println("3. 20$ Stage 3 tune: 30% hp gain and 2 rice (shoots 3 foot flames)");
		System.out.println("4. main shop");
		int choiceT = userInput.nextInt();
		if(choiceT ==1 ) {
		if(choiceT == 1 && one && money>=7)
		{
			one = false;
			money-=7;
			int oneH = carStat.get(0).getHp()/7;
			carStat.get(0).setHp(oneH+carStat.get(0).getHp());
			System.out.println(" you now have "+ carStat.get(0).getHp() + " and $"+ money +"and " + carStat.get(0).getRice() + " rice");
			shop();
		}
		else if(money<7)
		{
			System.out.println("you dont have enough monmey you only have " +money);
			shop();
		}
		else if(one == false)
		{
			System.out.println("you already have this tune!");
			shop();
		}
		}
	
		if(choiceT ==2 ) {

			if(choiceT ==2 && two && money >= 15)
			{
				two = false;
				money-=15;
				
				int oneH = carStat.get(0).getHp()/20;
				carStat.get(0).setRice(carStat.get(0).getRice()+1);

				carStat.get(0).setHp(oneH+carStat.get(0).getHp());
				System.out.println(" you now have "+ carStat.get(0).getHp() + " and $"+ money +" and " + carStat.get(0).getRice() + " rice");
				shop();
			}
			else if(money<15)
			{
				System.out.println("you dont have enough monmey you only have " +money);
				shop();
			}
			else if(two == false)
			{
				System.out.println("you already have this tune!");
				shop();
			}
		}
		if(choiceT ==3 ) {

				if(choiceT==3 && three && money>=20)
				{
					money-=20;
					int oneH = carStat.get(0).getHp()/30;
					carStat.get(0).setRice(carStat.get(0).getRice()+2);
					carStat.get(0).setHp(oneH+carStat.get(0).getHp());
					System.out.println(" you now have "+ carStat.get(0).getHp() + " and $"+ money +"and " + carStat.get(0).getRice() + " rice");
					shop();
				}
				else if(money<20)
				{
					System.out.println("you dont have enough monmey you only have " +money);
					shop();
				}
				else if(three == false)
				{
					System.out.println("you already have this tune!");
					shop();
				}
		}
		if(choiceT==4)
			{
				shop();
			}
	}
if( choice ==3)
	{
		System.out.println("Welcome to carls customs, what can i do for you");
		System.out.println("1. 3$ Giant wing:  2 rice");
		System.out.println("2. 10$ Paint job: +1 rice, can change multiple times but can only get one rice ");
		System.out.println("3. main menu");
		int choiceC= userInput.nextInt();
		if(choiceC ==1 ) {
		if(choiceC == 1 && wing && money>=10)
		{
			money-=10;
		wing = false;	
		carStat.get(0).setRice(carStat.get(0).getRice() +3);
		System.out.println("you now have a sick wing, bro! you have " + carStat.get(0).getRice() + " rice and have " + money);
		shop();
		}
		else if (wing == false)
		{
			System.out.println("you already have this wing!");
			shop();
		}
		else if (money < 10)
		{
			System.out.println("you dont have enough money you only have $" + money);
			shop();
		}
		}
		if(choiceC ==2) {
		if(choiceC == 2 && money>=10)
		{
			money-=10;
			System.out.println("what color paint do you want! ");
			String cchoice = "";
			while(cchoice.equals(""))
				{
			 cchoice = userInput.nextLine();
				}
			
		if(color) {
		carStat.get(0).setRice(carStat.get(0).getRice() +1);
		color=false;
		}
		carStat.get(0).setColor(cchoice);
		System.out.println("good chouce your car is now " + carStat.get(0).getColor() + "and has rice :  "+carStat.get(0).getRice() + " and $" + money);
		shop();
		//NEED TO FIGURE OUT HOW TO STOP THE MENU FROM COMING UNTIL IM DONE WITH MY USER INPUT, SHOUDLNT BE HARD JUST HAD TO PUSH, MAKE SURE TO LOOK BACK OVER TO SEE THAT NUMBERS MATHC UP
		}
		
		else if (money < 10)
		{
			System.out.println("you dont have enough money you only have $" + money);
			shop();
		}
		
		
		
		// add thing and booleans and values and  for color make an if statement to give rice
		}
		if (choiceC == 3) {
			shop();
		}
	}
if(choice ==4)
	{
		menuChoice();
	}


}
public static void race()
{
	System.out.println("welcome to the competition!");
	System.out.println("you can compete against multiple cars on different competitions");
	System.out.println(" ");
	System.out.println("you can earn money by winning, start small and work your way up by using the shop");
	System.out.println(" ");
	System.out.println(" 1. Slow camero");
	System.out.println(" 2. Leaky old BMW");
	System.out.println(" 3. Rally built Yaris");
	System.out.println(" 4. MK4 SUPRA!!!!!!");
	carchoice=0;
	while (carchoice==0) {
		carchoice = userInput.nextInt();

	}
	raceChoice();
	
	
	
	
	
	
	

}
public static void raceChoice() {
	System.out.println("1. Rice off");
	System.out.println("2. Race");
	System.out.println("3. Both");
	System.out.println("4. Back to menu");
	int rchoice = userInput.nextInt();
	if(rchoice == 1)
		{
			if(carchoice == 1)
				{
					 rireward = 50;
				}
			if(carchoice == 2)
				{
					 rireward = 100;
				}
			if(carchoice == 3)
				{
					 rireward = 150;
				}
			if(carchoice == 4)
				{
					 rireward = 500;
				}
			if(carStat.get(0).getRice()>carStat.get(carchoice).getRice())
				{
					money+=rireward;
					carStat.get(0).setCred(carStat.get(0).getCred() + 1);
					System.out.println(" you beat the " + carStat.get(carchoice).getName() + " in the rice off! you won " + rireward + "$! you now have $" + money+ " and you gained 1 street cred and have " + carStat.get(0).getCred());
					raceChoice();
				}
			if(carStat.get(0).getRice()<carStat.get(carchoice).getRice())
				{
					money-=rireward;
					carStat.get(0).setCred(carStat.get(0).getCred() - 1);

					System.out.println(" you lost to the " + carStat.get(carchoice).getName() + " in the rice off! you lost $!" + rireward +" you now have $" + money+ " and you gained 1 street cred and have " + carStat.get(0).getCred());
					raceChoice();
				}
			if(carStat.get(0).getRice()==carStat.get(carchoice).getRice())
				{
					System.out.println("you tied!");
					raceChoice();
				}
		}
	if(rchoice == 2)
		{
			if(carchoice == 1)
				{
					 rreward = 70;
				}
			if(carchoice == 2)
				{
					 rreward = 120;
				}
			if(carchoice == 3)
				{
					 rreward = 200;
				}
			if(carchoice == 4)
				{
					 rreward = 1000;
				}
			if(carStat.get(0).getHp()>carStat.get(carchoice).getHp())
				{
					money+=rreward;
					carStat.get(0).setCred(carStat.get(0).getCred() + 1);

					System.out.println(" you beat the " + carStat.get(carchoice).getName() + " in the race ! you won " + rreward + "$! you now have $" + money + " and you gained 1 street cred and have " + carStat.get(0).getCred());
					raceChoice();
				}
			if(carStat.get(0).getHp()<carStat.get(carchoice).getHp())
				{
					money-=rreward;
					carStat.get(0).setCred(carStat.get(0).getCred() - 1);

					System.out.println(" you lost to the " + carStat.get(carchoice).getName() + " in the race ! you lost "+ rreward + "$! you now have $" + money + " and you gained 1 street cred and have " + carStat.get(0).getCred());
					raceChoice();
				}
			if(carStat.get(0).getHp()==carStat.get(carchoice).getHp())
				{
					System.out.println("you tied!");
					raceChoice();
				}
		}
	if(rchoice == 3)
		{
			
		}
	if(rchoice == 4)
		{
			menuChoice();
		}
}
	}


