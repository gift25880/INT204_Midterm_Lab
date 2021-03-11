package int204.midterm2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pThonguam")
@PropertySource("classpath:pathinya.properties")
public class PThonguam extends Pathinya {
	
	@Value("${initialize}")
	public void initialize(String init) {
		this.varName = init;
		this.varValue = init.length();
	}
}
