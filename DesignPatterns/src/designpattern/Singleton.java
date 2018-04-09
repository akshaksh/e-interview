package designpattern;

public class Singleton {
	
	//First way
	private static final Singleton firstwaysingleton=new Singleton();
	//Second way
	private Singleton(){
		System.out.println("Second way of SingleTon");
	}
	//Third way
	private static Singleton thirdwaysingleton=null;
	public static Singleton getSingleton(){
		synchronized(Singleton.class){ 
		if(thirdwaysingleton == null){
			thirdwaysingleton=new Singleton();
		}
		}
		return thirdwaysingleton;
	}
	public static void main(String args[]){
		System.out.println(new Singleton());
	}
	public String toString(){
		return "Singleton firstway";
	}
}
