import cs101.io.Console;
import cs101.lang.Animate;


public class Sender implements Animate {
	
	public static TextContainer container;

	public Sender(){	
		container = new TextContainerPrototype();
	}
	
	public Sender( TextContainer cntnr){
		System.out.println("Hallo, bitte gib deine Nachrichten ein:");
		container = cntnr;
	}

	@Override
	public void act() {
		einlesen();
	}
	
	public static void einlesen(){
		System.out.println(">");
		
		String text = Console.readln();
		
		container.enter(text);
	}
	
	public static void main(String[] args) {
		
		container = new TextContainerPrototype();
		
		einlesen();
		
		try {
			System.out.println(container.remove());
		} catch (EmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
