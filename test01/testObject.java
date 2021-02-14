package testing;

public class testObject {
    int number = 0 ;
	
    
    public testObject(int number) {
    	this.number=number;
    }
	public void add() {
		number = number + 1;
	}
	
	public  int getNumber() {
		return number;
	}
	
	public  void setNumber(int number) {
		 this.number = number;
	}
	
	public int testMethodInside() {
		
		number = getNumber() + 10;
		
		return number;
	}
}
