import cs101.lang.Animate;


public class Empfaenger implements Animate{
	
	public static TextContainer container;
	public static TextGUI window;
	
	public Empfaenger(){
		this(container = new TextContainerPrototype());
	}
	
	public Empfaenger( TextContainer cntnr){
		window = new TextGUI();
		container = cntnr;
	}

	@Override
	public void act() {
		auslesen();
	}
	
	public static void auslesen(){

		while(!container.empty()){
			try {
				window.write(container.remove());
			} catch (EmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
			container = new TextContainerPrototype();
 
			container.enter("1"); 
			container.enter("2"); 
			container.enter("3");
			
			auslesen();
			
	}

}
