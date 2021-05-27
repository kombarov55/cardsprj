package ru.novemis.cards.desktop.mainmenu;

import com.badlogic.gdx.Gdx;
import ru.novemis.cards.desktop.common.ScreenBase;
import ru.novemis.cards.desktop.widgets.Widgets;

public class MainMenuScreen extends ScreenBase {

    @Override
    public void onShow() {
        stage.addActor(Widgets.image()
                .textureName("badlogic.jpg")
                .x(100).y(100)
                .width(150).height(150)
                .onClick(() -> Gdx.app.exit())
                .create());
    }

    @Override
    public void update() {

    }
}
