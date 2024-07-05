package ru.myApp.forAlishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicType musicType) {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if(musicType == MusicType.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNum));
        } else {
            System.out.println(rockMusic.getSong().get(randomNum));
        }
    }
}
