package int204.midterm1;

public class PathinyaThonguam implements One {
	
	private One first;
	private One last;
	
	public PathinyaThonguam(One first, One last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public double getValue() {
		return this.first.getValue()+this.last.getValue();
	}

}
