
import cs101.lang.Animate;
import cs101.lang.AnimatorThread;



public class Main {
	
	public static void main(String[] args) {
		
		TextContainer container = new TextContainerPrototype();

		Animate sender = new Sender(container);
		AnimatorThread senderThread = new AnimatorThread(sender);
		senderThread.startExecution();

		Animate empfaenger = new Empfaenger(container);
		AnimatorThread empfaengerThread = new AnimatorThread(empfaenger);
		empfaengerThread.startExecution();
		empfaengerThread.setSleepRange(10000);
		
		
	}
}
