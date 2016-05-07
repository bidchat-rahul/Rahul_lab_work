package q4composit;

public class DrowShape implements Shape {

	Shape sp;
	@Override
	public void drow() {
		// TODO Auto-generated method stub
		System.out.println("Blank Space for next shape is been created");
	}
	public void crateShape(String SpName){
		
		switch(SpName){
		case "tri" :
			sp = new trangle();
			break;
			
		case "sqa" :
			sp = new square();
			break;
			
		case "cir" :
			sp = new circle();
			break;
		}
		
	}
	public void drowShap(){
		sp.drow();
	}

}
