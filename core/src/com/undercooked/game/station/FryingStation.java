package com.undercooked.game.station;

import com.badlogic.gdx.math.Vector2;
import com.undercooked.game.food.Ingredient;
import com.undercooked.game.food.Ingredients;
import com.undercooked.game.screen.GameScreen;

public class FryingStation extends CookingStation {

	private final static Ingredient[] ALLOWED_INGREDIENTS = { Ingredients.formedPatty };

	public FryingStation(Vector2 pos, GameScreen game) {
		super(pos, 1, ALLOWED_INGREDIENTS, "particles/flames.party", "audio/soundFX/frying.mp3", game);
	}

}
