package ru.myApp.forAlishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//ClassPathXmlApplicationContext  этот класс загружен благодря dependency
// из pom файла а сам класс считывает и
// помещает все бины, которые там написаны в application context
// в качестве аргумента принимает название конфигурационного файла спринга
//в файле applicationContext происходит работа с бинами в моем случае создание
//а вызывая метод getBean идет id бина и тот класс бин которого нужно получить(так как объект
// этого класса я хочу полуичть) то есть в этой строке мы получили объект данного класса
//когда мы закончили работу с applicationContext мы его закрывае
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
//1)описали получениет бина в конфигурационном файл applicationContext
//2)спринг прочитал этото файл с помощью класса ClassPathXmlApplicationContext
// и тем самым создал бины которые описаны в applicationContext
//3)из самого applicationContext получаем бины выбранного класса
