import java.util.ArrayList;

import cs101.lang.Animate;


public class EmpfaengerGenerics implements Animate{
	
	public static ArrayList<String> container;
	public static TextGUI window;
	
	public EmpfaengerGenerics(){
		this(container = new ArrayList<String>());
	}
	
	public EmpfaengerGenerics( ArrayList<String> cntnr){
		window = new TextGUI();
		container = cntnr;
	}

	@Override
	public void act() {
		auslesen();
	}
	
	public static void auslesen(){

		while(!container.isEmpty()){
				window.write(container.remove(0));
		}
	}
	
	public static void main(String[] args) {
		
			container = new ArrayList<String>();
 
			container.add("1"); 
			container.add("2"); 
			container.add("3");
			
			auslesen();
			
	}

}
