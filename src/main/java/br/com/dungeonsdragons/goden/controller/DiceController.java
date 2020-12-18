package br.com.dungeonsdragons.goden.controller;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dungeonsdragons.goden.response.DiceRollResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api/")
public class DiceController {
	
	
	@GetMapping(value = "/diceRoll/{diceType}/{times}", produces = "application/json")
	@ApiResponses(value = @ApiResponse(code = 200, message = "OK", response = DiceRollResponse.class))
	public ResponseEntity<DiceRollResponse> diceRoll(@PathVariable int diceType, @PathVariable int times) {
		if(diceType == 4 || diceType == 6 || diceType == 8 || diceType == 12 || diceType == 20) {
			Random rand = new Random();
			int total = 0;
			for(int i = 0 ; i < times ; i++) {				
				int result = rand.nextInt(diceType) + 1;
				total += result;
			}
			
			DiceRollResponse r = new DiceRollResponse(times+"d"+diceType, total);
			return ResponseEntity.ok().body(r);
		}
		return ResponseEntity.noContent().build();
	}
}
