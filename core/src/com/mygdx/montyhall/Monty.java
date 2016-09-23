package com.mygdx.montyhall;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.managers.GameManager;

/**
 * Created by User on 23.09.2016.
 */
public class Monty implements ApplicationListener {

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private float w,h;

    @Override
    public void create() {
        w = Gdx.graphics.getWidth();
        h = Gdx.graphics.getHeight();
        camera = new OrthographicCamera(w,h);
        camera.setToOrtho(false);
        batch = new SpriteBatch();
        GameManager.initialize(w,h);
    }

    @Override
    public void dispose() {
        batch.dispose();
        GameManager.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        GameManager.renderGame(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }
}
