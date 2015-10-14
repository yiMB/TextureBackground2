package com.yi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.TimeUtils;

/**
 */
public class MyTextureMoon {
    Texture textureMoon;
    /**
     * store current timestamp use TimeUtils.nanoTime()
     */
    long lastTimeMoon;
    /**
     * moon image x position
     */
    float moonXposition;

    /**
     * default constructor, initialize variable when this class object create
     */
    public MyTextureMoon(){
        textureMoon = new Texture(Gdx.files.internal("moon.png"));
        lastTimeMoon = TimeUtils.nanoTime();
        moonXposition = Gdx.graphics.getWidth() / 2 - textureMoon.getWidth() / 2;
    }

    /**
     * constructor, initialize variable when this class object create base on given parameter
     */
    public MyTextureMoon(String moonImageFileName){
        textureMoon = new Texture(Gdx.files.internal(moonImageFileName));
        lastTimeMoon = TimeUtils.nanoTime();
        moonXposition = Gdx.graphics.getWidth() / 2 - textureMoon.getWidth() / 2;
    }

    /*
    public void updateMoon(){
        if(TimeUtils.nanoTime() - lastTimeMoon > 5000000000l){
            lastTimeMoon = TimeUtils.nanoTime();
            if(moonXposition + textureMoon.getWidth() >= Gdx.graphics.getWidth()){
                moonXposition = 0;
            }
            else{
                moonXposition += 200f;
            }
        }
    }
    */
}
