package at.fwd.swagger.spring.demo.user.model.showcase;


public class ShowcaseDatatypePrimitives {

	private byte singleByte;
	
	private short tinyNumber;
	
	private int counter;
	
	private long id;
	
	// TODO Swagger-Springfox-1.0.2: primitive type float not working yet here
	private float budgetFloat;
	
	private double budget;
	
	private boolean deleted;
	
	private char singleCharacter;

	public byte getSingleByte() {
		return singleByte;
	}

	public void setSingleByte(byte singleByte) {
		this.singleByte = singleByte;
	}

	public short getTinyNumber() {
		return tinyNumber;
	}

	public void setTinyNumber(short tinyNumber) {
		this.tinyNumber = tinyNumber;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getBudgetFloat() {
		return budgetFloat;
	}

	public void setBudgetFloat(float budgetFloat) {
		this.budgetFloat = budgetFloat;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public char getSingleCharacter() {
		return singleCharacter;
	}

	public void setSingleCharacter(char singleCharacter) {
		this.singleCharacter = singleCharacter;
	}

	
	
	
	
}
