import java.util.ArrayList;

import cs101.io.Console;
import cs101.lang.Animate;


public class SenderGenerics implements Animate {
	
	public static ArrayList<String> container;

	public SenderGenerics(){	
		container = new ArrayList<String>();
	}
	
	public SenderGenerics( ArrayList<String> container){
		System.out.println("Hallo, bitte gib deine Nachrichten ein:");
		this.container = container;
	}

	@Override
	public void act() {
		einlesen();
	}
	
	public static void einlesen(){
		System.out.println(">");
		
		String text = Console.readln();
		
		container.add(text);
	}
	
	public static void main(String[] args) {
		
		container = new ArrayList<String>();
		
		einlesen();
		
		System.out.println(container.remove(0));
		
		
	}
	
}
