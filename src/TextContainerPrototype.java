
public class TextContainerPrototype implements TextContainer {
	private String[] list;
	private int size, top = 0;
	
	public TextContainerPrototype(){
		this(25);
	}
	
	public TextContainerPrototype(int size){
		this.size = size;
		list = new String[size];
	}
	
	@Override
	public void enter(String s) {
		if(top == size) throw new FullException();
		list[top] = s;
		top++;
	}

	@Override
	public String remove() throws EmptyException {
		if(top == 0) throw new EmptyException();
		top--;
		return list[top];
	}

	@Override
	public boolean empty() {
		return top == 0;
	}
	
	public static void main(String[] args) {
		
		TextContainerPrototype chn = new TextContainerPrototype(4);
		try { 
			chn.enter("1"); chn.enter("2"); chn.enter("3");
			System.out.println(chn.remove());
			System.out.println(chn.remove());
			System.out.println(chn.remove());
			System.out.println(chn.remove());
			
		} catch (EmptyException e) { System.out.println("leer"); }
	}

}
