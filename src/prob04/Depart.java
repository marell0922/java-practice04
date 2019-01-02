package prob04;

public class Depart extends Employee {
	
	//fields
	private String departName;
	
	//constructor
	public Depart(String name, int salary, String departName){
		super(name, salary);
		this.departName=departName;
	}
	
	//method
	public void setDepartName(String departName) {
		this.departName=departName;
	}
	
	public String getDepartName() {
		return departName;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "\t연봉:" + getSalary() +" \t부서:" + departName);
	}
}
