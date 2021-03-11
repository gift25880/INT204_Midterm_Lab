package int204.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import int204.midterm2.Two;

public class PuangThong {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PuangThongConfig.class);
		
		//bean1
		Two bean11 = (Two) context.getBean("pathinya");
		System.out.println("bean11: "+bean11.getName()+" "+bean11.getValue());
		Two bean12 = (Two) context.getBean("pathinya");
		System.out.println("bean12: "+bean12.getName()+" "+bean12.getValue());
		System.out.println("bean11 and bean12 are the same?: "+(bean11 == bean12));
		
		System.out.println();
		
		//bean2
		Two bean21 = (Two) context.getBean("thonguam");
		System.out.println("bean21: "+bean21.getName()+" "+bean21.getValue());
		Two bean22 = (Two) context.getBean("thonguam");
		System.out.println("bean22: "+bean22.getName()+" "+bean22.getValue());
		System.out.println("bean21 and bean22 are the same?: "+(bean21 == bean22));
		
		System.out.println();
		
		//bean3
		Two bean31 = (Two) context.getBean("pThonguam");
		System.out.println("bean31: "+bean31.getName()+" "+bean31.getValue());
		Two bean32 = (Two) context.getBean("pThonguam");
		System.out.println("bean32: "+bean32.getName()+" "+bean32.getValue());
		System.out.println("bean31 and bean32 are the same?: "+(bean31 == bean32));
		
		System.out.println();
		
		//bean4
		Two bean41 = (Two) context.getBean("pathinyaThonguam");
		System.out.println("bean41: "+bean41.getName()+" "+bean41.getValue());
		Two bean42 = (Two) context.getBean("pathinyaThonguam");
		System.out.println("bean42: "+bean42.getName()+" "+bean42.getValue());
		System.out.println("bean41 and bean42 are the same?: "+(bean41 == bean42));
		
		context.close();
	}

}
