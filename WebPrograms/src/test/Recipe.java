package test;

public class Recipe  {

	private String name;
	private Ingredients ingrdients;
	
	
	
	public Recipe() {
		
	}
	
	public Recipe(String recipe, Ingredients ingrdients) {
		super();
		this.name = recipe;
		this.ingrdients = ingrdients;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ingredients getIngrdients() {
		return ingrdients;
	}

	public void setIngrdients(Ingredients ingrdients) {
		this.ingrdients = ingrdients;
	}

	@Override
	public String toString() {
		return "Recipe [recipe=" + name +", ingrdients:" + ingrdients + "]";
	}
	
	
	
	
}
