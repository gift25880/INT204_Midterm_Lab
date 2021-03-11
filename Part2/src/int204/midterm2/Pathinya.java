package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pathinya")
@Scope("singleton")
public class Pathinya implements Two {
	
	@Value("pathinya") protected String varName;
	@Value("48") protected int varValue;

	@Override
	public String getName() {
		return this.varName;
	}

	@Override
	public int getValue() {
		return this.varValue;
	}

}
