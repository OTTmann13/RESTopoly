package de.studentcorp.monopoly.monopoly.dice;

import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

public class DiceController {
	public DiceController(final DiceService diceService){
		get("/roll", new Route() {
			
			@Override
			public Object handle(Request arg0, Response arg1) throws Exception {
				return diceService.getDice();
			}
		});
	}
}
