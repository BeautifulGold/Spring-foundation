package com.goldfish.knight;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BraveKnightTest {
	
	@Test
	public void BraveKnightTestOnQuest() {
		/*
		Quest mockQuest = new LayDragonQuest(System.out);
		mockQuest.embark();
		*/
		
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
		BraveKnight bean = (BraveKnight) context.getBean("knight");
		bean.embarkonquest();
		*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.goldfish.config.KnightConfig.class);
		BraveKnight bean = (BraveKnight) context.getBean("knight");
		bean.embarkonquest();
	}
}
