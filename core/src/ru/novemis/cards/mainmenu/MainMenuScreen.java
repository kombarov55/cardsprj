package ru.novemis.cards.mainmenu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import ru.novemis.cards.common.Fonts;
import ru.novemis.cards.common.Resources;
import ru.novemis.cards.common.ScreenBase;
import ru.novemis.cards.common.Skins;
import ru.novemis.cards.config.Window;
import ru.novemis.cards.widgets.Widgets;

import static ru.novemis.cards.common.Skins.cloudFormUi;

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
//        stage.addActor(Widgets.textButton()
//                .text("фываролд asfd")
//                .skin(Resources.skins.get(cloudFormUi))
//                .x(100)
//                .y(100)
//                .width(200)
//                .height(200)
//                .onClick(() -> System.out.println("hello world"))
//                .build()
//        );


        Label label = new Label("фываолдж asdfasdf", new Label.LabelStyle(Fonts.generate(), Color.WHITE));
        label.setPosition(100, 100);

        stage.addActor(label);
    }

    @Override
    public void update() {
        boolean not = 1 == 1;
    }
}
