package ru.novemis.cards.mainmenu;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import ru.novemis.cards.common.ScreenBase;
import ru.novemis.cards.widgets.Widgets;

public class MainMenuScreen extends ScreenBase {

    Image img;

    @Override
    public void onShow() {
        img = Widgets.image()
                .textureName("badlogic.jpg")
                .x(100).y(100)
                .width(150).height(150)
                .onClick(() -> System.out.println("OK"))
                .create();

        stage.addActor(img);
    }

    @Override
    public void update() {
        boolean not = 1 == 1;
    }
}
