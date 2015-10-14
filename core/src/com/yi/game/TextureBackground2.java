package com.yi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextureBackground2 extends ApplicationAdapter {
	SpriteBatch batch;
	MyTextureBackground myTextureBackground;
	MyTextureMoon myTextureMoon;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		myTextureBackground = new MyTextureBackground();
		myTextureMoon = new MyTextureMoon();
//		myTextureBackground = new MyTextureBackground("rainbg1.png");
//		myTextureMoon = new MyTextureMoon("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(myTextureBackground.textureBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.draw(myTextureMoon.textureMoon, myTextureMoon.moonXposition, Gdx.graphics.getHeight() / 2 - myTextureMoon.textureMoon.getHeight() / 2);
		batch.end();

//		myTextureBackground.updateBackground();
//		myTextureMoon.updateMoon();
	}
}
