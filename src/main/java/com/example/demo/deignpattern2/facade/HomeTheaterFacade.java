package com.example.demo.deignpattern2.facade;

public class HomeTheaterFacade {


    private DVDPlayer dvdPlayer;

    private Popcorn popcorn;

    private Screen screen;

    private Projectot projectot;

    private Stereo stereo;

    private TheaterLight theaterLight;

    public HomeTheaterFacade() {

        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.projectot = Projectot.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }


    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projectot.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {

        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        screen.up();
        projectot.off();
        stereo.off();
        dvdPlayer.off();

    }
}
