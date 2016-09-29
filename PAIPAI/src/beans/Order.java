package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
	private Item[] items;
	
	public Order() {
	}	
	
	public Order(Item[] value) {
		items = value;
	}
	
    public void setItems(Item[] value ){
    	items = value;
    }

    public Item[] getItems() { 
    	return items; 
    }
}
