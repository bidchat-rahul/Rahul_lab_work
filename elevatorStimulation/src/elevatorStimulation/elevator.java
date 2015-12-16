package elevatorStimulation;

public class elevator {

	private int status=0;
	DisplyPanel displyPanel = new  DisplyPanel();
	
	private int callElevator(int reqFloor) {
		
		for(int i=0;i<=reqFloor;i++){
			status=i;
			
			if(i != reqFloor)
				displyPanel.printElevatorMovingUp(status);
		}
		return status;
	}
	private int callElevatorUp(int reqFloor) {
		for(int i=status;i<=reqFloor;i++){
			this.status=i;
			if(i != reqFloor)
				displyPanel.printElevatorMovingUp(status);
		}
		return this.status;
		
	}
	
	private int callElevatorDown(int reqFloor){
		for(int i=status;i>=reqFloor;i--){
			this.status=i;
			if(i != reqFloor)
				displyPanel.printElevatorMovingDown(status);
		}
		return this.status;
	}
	
	public int callElevator(int reqFloor, int status ) {
		if(status==0){
			return callElevator(reqFloor);
			
		}else
		{
			if(status<reqFloor){
				return callElevatorUp(reqFloor);
			}
			else{
				return callElevatorDown(reqFloor);
			}
		}
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
