package com.mygdx.gameobjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by User on 23.09.2016.
 */
public class Door {

    public Sprite openSprite;
    public Sprite closeSprite;
    public boolean isOpen;
    public Vector2 position = new Vector2();
    public float height;
    public float width;

    public void render(SpriteBatch batch) {
        if(isOpen) {
            openSprite.draw(batch);
        }
        else {
            closeSprite.draw(batch);
        }
    }
}
