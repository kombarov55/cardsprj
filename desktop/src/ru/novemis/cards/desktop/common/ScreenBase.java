package ru.novemis.cards.desktop.common;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class ScreenBase extends ScreenAdapter {

    protected Stage stage;

    public abstract void onShow();
    public abstract void update();


    @Override
    public final void show() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        onShow();
    }

    @Override
    public final void render(float delta) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        update();
        stage.act();
        stage.draw();
    }
}
