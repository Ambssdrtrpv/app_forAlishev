package ru.myApp.forAlishev;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public void setMusic(Music music){
//        this.music = music;
//    }
    public MusicPlayer() {}
//    public void playMusic(){
//        System.out.println("Playing:" + music.getSong());
//    }
    public void playMusicList(List<Music> musicList){
        for (int i=0; i<musicList.size(); i++) {
            System.out.println(musicList.get(i).getSong());
        }
    }
}
