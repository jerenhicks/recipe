package com.ocean.recipe.model;

/**
 * Represents an ingredient.
 * @author arcticrain
 *
 */
public class Ingredient {
	/** name of this ingredient.*/
	private String name;
	
	/**
	 * Constructor.
	 */
	public Ingredient() {
		
	}
	
	/**
	 * Constructor.
	 * @param name - name of the ingredient.
	 */
	public Ingredient(String name) {
		
	}

	/**
	 * Returns the name of the ingredient.
	 * @return name of the ingredient.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the ingredient.
	 * @param name - what to set the ingredient name to.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
