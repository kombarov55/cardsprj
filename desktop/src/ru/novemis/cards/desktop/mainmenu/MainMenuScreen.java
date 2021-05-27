package ru.novemis.cards.desktop.mainmenu;

import ru.novemis.cards.desktop.common.ScreenBase;
import ru.novemis.cards.desktop.widgets.Widgets;

public class MainMenuScreen extends ScreenBase {

    @Override
    public void onShow() {
        stage.addActor(Widgets.image()
                .textureName("badlogic.jpg")
                .x(100).y(100)
                .width(150).height(150)
                .onClick(() -> System.out.println("OK"))
                .create());
    }

    @Override
    public void update() {

    }
}
