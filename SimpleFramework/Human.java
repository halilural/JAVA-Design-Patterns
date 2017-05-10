package Package1;

public class Human {
	
// Human.java is the template , which reflects the idea of how the frameworks works.
	
	private Move move ;
	
	public Human(Move m){
		
		this.move = m;
		
	}
	
	public void doMove(){
		
		this.move.Action();
		
	}
	
}
