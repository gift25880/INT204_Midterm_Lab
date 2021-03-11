package int204.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("int204.midterm2")
@PropertySource("classpath:pathinya.properties")
public class PuangThongConfig { }
