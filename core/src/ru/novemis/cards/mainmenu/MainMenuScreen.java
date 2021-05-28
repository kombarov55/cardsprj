package ru.novemis.cards.mainmenu;

import ru.novemis.cards.common.ScreenBase;
import ru.novemis.cards.common.Skins;
import ru.novemis.cards.widgets.Widgets;

public class MainMenuScreen extends ScreenBase {

    @Override
    public void onShow() {
        stage.addActor(Widgets.textButton()
                .x(200)
                .y(200)
                .width(200)
                .height(50)
                .skin(Skins.custom.get())
                .text("Сатана Любит меня!")
                .onClick(() -> {})
                .create());
    }

    @Override
    public void update() {
        boolean not = 1 == 1;
    }
}
