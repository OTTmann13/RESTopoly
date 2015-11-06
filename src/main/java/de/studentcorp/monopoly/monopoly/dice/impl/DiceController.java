package de.studentcorp.monopoly.monopoly.dice.impl;

import static spark.Spark.*;

import com.google.gson.Gson;

import spark.Request;
import spark.Response;
import spark.Route;

public class DiceController {
	Gson gson = new Gson();
	public DiceController(final DiceService diceService){
		get("/dice", new Route() {
			@Override
			public Object handle(Request request, Response response) throws Exception {
				String json = gson.toJson(diceService.getDice());
				response.status(200);
				return json;
			}
		});
	}
}
