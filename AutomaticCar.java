public class AutomaticCar{
	
	private String model;
	private String year;
	private int speed;
	private int gear;
	
	private int distance;
	
	public void setspeed(int speed){
		if(speed<0)
			System.out.println(" Speed Error!");
		else
		this.speed=speed;
	setgear();
	}
	
	public void setmodel(String model){
		this.model=model;
	}
	
	public void setyear(String year){
		this.year=year;
	}
	
	public String getmodel(){
		return model;
	}
	
	public String getyear(){
		return year;
	}
	
	public int getspeed(){
		return speed;
	}
	
	public void setgear(){
		if(speed==0)
			gear=0;
		else if(speed>0 && speed<=100)
			gear=1;
		else if(speed>100 && speed<=200)
			gear=2;
		else if(speed>200 && speed<=300)
			gear=3;
		else if(speed>300 && speed<=400)
			gear=4;
		else if(speed>400 && speed<=500)
			gear=5;
	}
	
	public int getgear(){
		return gear;
	}
	
	public void setdistance(int speed, int time){
		int avg= speed/10;
		distance=(avg*time);
		
	}
	
	public int getdistance(){
		return distance;
	}
	
	public void bar(){
		for(int b=0; b<=distance; b+=100){
			System.out.print("-");
	
		}
		
	}
	
}