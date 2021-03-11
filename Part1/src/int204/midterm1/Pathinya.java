package int204.midterm1;

public class Pathinya implements One {
	
	private double rand;
	
	public Pathinya() {
		this.rand = Math.random();
	}

	@Override
	public double getValue() {
		return this.rand;
	}

}
