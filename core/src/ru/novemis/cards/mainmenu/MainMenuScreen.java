package ru.novemis.cards.mainmenu;

import ru.novemis.cards.common.ScreenBase;
import ru.novemis.cards.widgets.Widgets;

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
