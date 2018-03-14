package headFirst.decorate;

public abstract class Beverage {
        
	public String description = "";
	
	public String size;
	
	
	public String getDescription(){
		return description;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	public abstract  double cost();
	
	
	
	
	
}
