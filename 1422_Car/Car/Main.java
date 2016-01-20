package Car;

public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		
		SubSystem engine=new SubSystem();
		
		engine.addPart(new Parts(100));
		engine.addPart(new Parts(100));
		engine.addPart(new Parts(100));
		engine.addPart(new Parts(100));
		
		SubSystem wheels=new SubSystem();
		wheels.addPart(new Parts(200));
		
		c.addSubSystem(engine);
		c.addSubSystem(wheels);
		
		System.out.println("Total cost:"+c.getTotalCost());
	}

}
