package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
    	Items i1 = (Items) context.getBean("item1");
    	Items i2 = (Items) context.getBean("item1");

    	System.out.println(i1);
    	System.out.println(i2);
    	System.out.println(i1 == i2); 

    	System.out.println("-------------");

    	Items p1 = (Items) context.getBean("item2");
    	Items p2 = (Items) context.getBean("item2");

    	System.out.println(p1);
    	System.out.println(p2);
    	System.out.println(p1 == p2); 
    }
}