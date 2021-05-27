package ru.novemis.cards.mainmenu;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import ru.novemis.cards.common.ScreenBase;
import ru.novemis.cards.config.Window;
import ru.novemis.cards.widgets.Widgets;

public class MainMenuScreen extends ScreenBase {

    Image img;

    @Override
    public void onShow() {
        img = Widgets.image()
                .textureName("badlogic.jpg")
                .x(0).y(0)
                .width(Window.width).height(Window.height)
                .onClick(() -> System.out.println("OK"))
                .create();

        stage.addActor(img);
    }

    @Override
    public void update() {
        boolean not = 1 == 1;
    }
}
