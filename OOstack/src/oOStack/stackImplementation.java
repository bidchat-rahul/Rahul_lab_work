package oOStack;

public class stackImplementation extends stackUsingLinkList {
	private int n;
	private int top = -1 ;
	private int Storage[];
		
	public stackImplementation(int n) {
		super();
		this.n = n;
		Storage = new int[n] ;
	}
	
	

	public boolean pushS(int num){

		if(top == (n - 1)){
			return false;
		}
		else{
			Storage[++top]=num;
		}
			
		
		return true;
	}
	
	public boolean popS(){
		
		if(top == -1){
			return false;
			
		}
		else{
			top--;
		}
		
		return true;
	}
	
	public void displyS(){
		System.out.print("the stack is ");
		
		if(top == -1){
			System.out.print("empty");
		}
		
		for(int i=0;i<=top ;i++){
			System.out.print(Storage[i] + "\t");
		}
		System.out.println("");
	}
}
