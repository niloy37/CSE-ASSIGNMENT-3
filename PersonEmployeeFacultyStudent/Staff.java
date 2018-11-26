package PersonEmployeeFacultyStudent;

public class Staff extends Employee {
	
	private String workerType;
	
	
	
	Staff(){
		
	}
	Staff(int id,String name,double salary,String workerType){
		super(id,name,salary);
		this.workerType=workerType;
	}
	public String toString() {
		return super.toString()+" "+this.workerType;
	}

}
