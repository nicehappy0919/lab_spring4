package local.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonataApx {
	public static void main(String[] args) {
		Sonata herCar = new Sonata();
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("sonataBean.xml");
		Sonata myCar = null;
		myCar = (Sonata)context.getBean("myCar");
		System.out.println(myCar.toString());
		Sonata himCar = null;
		myCar = (Sonata)context.getBean("himCar");
		System.out.println(myCar.toString());
		System.out.println("himCar의 현재 속도는 "+himCar.getSpeed() + " 입니다.");
	}
}
