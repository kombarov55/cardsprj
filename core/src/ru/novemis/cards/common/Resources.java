package ru.novemis.cards.common;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.collections4.map.LazyMap.lazyMap;

public class Resources {

    public static Map<String, Texture> textures = lazyMap(
            new HashMap<>(),
            path -> new Texture(Gdx.files.internal(path))
    );



}
