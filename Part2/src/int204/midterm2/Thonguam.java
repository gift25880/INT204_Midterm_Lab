package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thonguam")
@Scope("prototype")
public class Thonguam extends Pathinya {

	public Thonguam(@Value("Pathinya") String varName, @Value("48") int varValue) {
		this.varName = varName;
		this.varValue = varValue;
	}
}
