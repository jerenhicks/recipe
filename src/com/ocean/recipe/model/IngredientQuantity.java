package com.ocean.recipe.model;

public class IngredientQuantity {
	
	private Ingredient ingredient;
	private int amount;
	private Unit unit;
	
	public IngredientQuantity() {
		
	}
	
	public IngredientQuantity(Ingredient ingredient, int amount, Unit unit) {
		this.ingredient = ingredient;
		this.amount = amount;
		this.unit = unit;
	}
	
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	

}
