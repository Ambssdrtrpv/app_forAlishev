package ru.myApp.forAlishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml"
            );

//            Music music1 = context.getBean("rockMusic", Music.class);
//            MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//            musicPlayer1.playMusic();
//
//            Music music2 = context.getBean("classicalMusic", Music.class);
//            MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//            music2.getSong();
//            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            musicPlayer.playMusic();
            MusicPlayer musicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic(MusicType.CLASSICAL);
            musicPlayer.playMusic(MusicType.ROCK);

            context.close();
    }
}

