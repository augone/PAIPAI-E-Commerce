package beans;

import java.io.Serializable;

public class Item implements Serializable{
	private String name;
	private String quantity;
	public Item() {
		
	} 
	public Item(String name, String quantity) {
		this.name = name;
		this.quantity = quantity;
	} 

	public void setName( String value ) {
        name = value;
    }

    public void setQuantity( String value ) {
        quantity = value;
    }

    public String getName() { 
    	return name; 
    }

    public String getQuantity() { 
    	return quantity;
    }

}
