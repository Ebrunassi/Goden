package br.com.dungeonsdragons.goden.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class DiceRollResponse {
	
	@JsonInclude
	private String diceRoll;
	@JsonInclude
	private int totalValue;
	
	public DiceRollResponse(String diceRoll, int totalValue) {
		this.diceRoll = diceRoll;
		this.totalValue = totalValue;
	}

	public String getDiceRoll() {
		return diceRoll;
	}

	public void setDiceRoll(String diceRoll) {
		this.diceRoll = diceRoll;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}	

}
