package int204.midterm2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pathinyaThonguam")

public class PathinyaThonguam implements Two {
	
	private Two first;
	private Two last;

	@Override
	public String getName() {
		return this.first.getName();
	}

	@Override
	public int getValue() {
		return this.last.getValue();
	}
	
	@Autowired @Qualifier("pathinya")
	public void setName(Two name) {
		this.first = name;
	}
	
	@Autowired @Qualifier("thonguam")
	public void setValue(Two value) {
		this.last = value;
	}
}
