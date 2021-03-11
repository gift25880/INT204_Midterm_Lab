package int204.midterm1;

public class Thonguam implements One {
	
	private double guam;
	
	public Thonguam() {}
	
	public Thonguam(double num) {
		this.guam = num;
	}
	
	public void setGuam(double num) {
		this.guam = num;
	}

	@Override
	public double getValue() {
		return this.guam;
	}

}
