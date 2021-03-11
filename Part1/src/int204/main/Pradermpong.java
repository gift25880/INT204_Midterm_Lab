package int204.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import int204.midterm1.One;

public class Pradermpong {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//bean1
		System.out.println("------------bean1-----------------");
		One bean11 = (One) context.getBean("pathinya");
		System.out.println("Bean11: "+bean11.getValue());
		One bean12 = (One) context.getBean("pathinya");
		System.out.println("Bean12: "+bean12.getValue());
		One bean13 = (One) context.getBean("pathinya");
		System.out.println("Bean13: "+bean13.getValue());
		System.out.println("Is bean11 and bean12 is the same?: "+(bean11==bean12));
		System.out.println("Is bean12 and bean13 is the same?: "+(bean12==bean13));
		System.out.println("Is bean11 and bean13 is the same?: "+(bean11==bean13));
		
		System.out.println();
		
		//bean2
		System.out.println("------------bean2-----------------");
		One bean21 = (One) context.getBean("pat");
		System.out.println("Bean21: "+bean21.getValue());
		One bean22 = (One) context.getBean("pat");
		System.out.println("Bean22: "+bean22.getValue());
		One bean23 = (One) context.getBean("pat");
		System.out.println("Bean23: "+bean23.getValue());
		System.out.println("Is bean21 and bean22 is the same?: "+(bean21==bean22));
		System.out.println("Is bean22 and bean23 is the same?: "+(bean22==bean23));
		System.out.println("Is bean21 and bean23 is the same?: "+(bean21==bean23));
		
		System.out.println();
		
		//bean3
		System.out.println("------------bean3-----------------");
		One bean31 = (One) context.getBean("thonguam");
		System.out.println("Bean31: "+bean31.getValue());
		One bean32 = (One) context.getBean("thonguam");
		System.out.println("Bean32: "+bean32.getValue());
		One bean33 = (One) context.getBean("thonguam");
		System.out.println("Bean33: "+bean33.getValue());
		System.out.println("Is bean31 and bean32 is the same?: "+(bean31==bean32));
		System.out.println("Is bean32 and bean33 is the same?: "+(bean32==bean33));
		System.out.println("Is bean31 and bean33 is the same?: "+(bean31==bean33));
		
		System.out.println();
		
		//bean4
		System.out.println("------------bean4-----------------");
		One bean41 = (One) context.getBean("path");
		System.out.println("Bean41: "+bean41.getValue());
		One bean42 = (One) context.getBean("path");
		System.out.println("Bean42: "+bean42.getValue());
		One bean43 = (One) context.getBean("path");
		System.out.println("Bean43: "+bean43.getValue());
		System.out.println("Is bean41 and bean42 is the same?: "+(bean41==bean42));
		System.out.println("Is bean42 and bean43 is the same?: "+(bean42==bean43));
		System.out.println("Is bean41 and bean43 is the same?: "+(bean41==bean43));
		
		System.out.println();
		
		//bean5
		System.out.println("------------bean5-----------------");
		One bean51 = (One) context.getBean("guam");
		System.out.println("Bean51: "+bean51.getValue());
		One bean52 = (One) context.getBean("guam");
		System.out.println("Bean52: "+bean52.getValue());
		One bean53 = (One) context.getBean("guam");
		System.out.println("Bean53: "+bean53.getValue());
		System.out.println("Is bean51 and bean52 is the same?: "+(bean51==bean52));
		System.out.println("Is bean52 and bean53 is the same?: "+(bean52==bean53));
		System.out.println("Is bean51 and bean53 is the same?: "+(bean51==bean53));
		
		context.close();

	}

}
