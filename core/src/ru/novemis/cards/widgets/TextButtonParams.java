package ru.novemis.cards.widgets;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class TextButtonParams {
    String text;

    Skin skin;
    float x;
    float y;
    float width;
    float height;
    Runnable onClick;

    public TextButtonParams text(String text) {
        this.text = text;
        return this;
    }

    public TextButtonParams skin(Skin skin) {
        this.skin = skin;
        return this;
    }

    public TextButtonParams x(float x) {
        this.x = x;
        return this;
    }

    public TextButtonParams y(float y) {
        this.y = y;
        return this;
    }

    public TextButtonParams width(float width) {
        this.width = width;
        return this;
    }

    public TextButtonParams height(float height) {
        this.height = height;
        return this;
    }

    public TextButtonParams onClick(Runnable onClick) {
        this.onClick = onClick;
        return this;
    }

    public TextButton create() {
        return Widgets.createTextButton(this);
    }
}
