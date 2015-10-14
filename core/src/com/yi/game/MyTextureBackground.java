package com.yi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.TimeUtils;

/**
 */
public class MyTextureBackground {
    Texture textureBackground;
    /**
     * store current timestamp use TimeUtils.nanoTime()
     */
    long lastTimeBg;
    /**
     * use to tell which background image
     */
    int bgNumber;

    /**
     * default constructor, initialize variable when this class object create
     */
    public MyTextureBackground(){
        textureBackground = new Texture(Gdx.files.internal("Starry_sky.png"));
        lastTimeBg = TimeUtils.nanoTime();
        bgNumber = 1;
    }

    /**
     * constructor, initialize variable when this class object create base on given parameter
     */
    public MyTextureBackground(String backgroundFileName){
        textureBackground = new Texture(Gdx.files.internal(backgroundFileName));
        lastTimeBg = TimeUtils.nanoTime();
        bgNumber = 1;
    }

    /*
    public void updateBackground(){
        if(TimeUtils.nanoTime() - lastTimeBg > 5000000000l){
            textureBackground = new Texture(Gdx.files.internal("rainbg" + bgNumber + ".png"));
            lastTimeBg = TimeUtils.nanoTime();
            if(bgNumber >= 6){
                bgNumber = 1;
            }
            else{
                bgNumber++;
            }
        }
    }
    */
}
