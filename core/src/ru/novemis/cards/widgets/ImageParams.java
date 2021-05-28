package ru.novemis.cards.widgets;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.function.Function;

public class ImageParams {
    String img;
    float x;
    float y;
    float width;
    float height;
    Runnable onClick;

    public ImageParams textureName(String textureName) {
        this.img = textureName;
        return this;
    }

    public ImageParams x(float x) {
        this.x = x;
        return this;
    }

    public ImageParams y(float y) {
        this.y = y;
        return this;
    }

    public ImageParams width(float width) {
        this.width = width;
        return this;
    }

    public ImageParams height(float height) {
        this.height = height;
        return this;
    }

    public ImageParams onClick(Runnable onClick) {
        this.onClick = onClick;
        return this;
    }

    public Image create() {
        return Widgets.createImage(this);
    }
}
