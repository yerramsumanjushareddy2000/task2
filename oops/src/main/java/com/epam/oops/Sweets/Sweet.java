package com.epam.oops.Sweets;

public class Sweet implements Comparable<Sweet> {

	private String name;
	private int price;
	private int weight;
	
	public Sweet(String name,int price,int weight) {
		
		this.name = name;
		this.price = price;
		this.weight = weight;
		
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getPrice(int price) {
		return price;
	}
	
	public int getWeight(int weight) {
		return weight;
	}
	
	@Override
	public int compareTo(Sweet o) {
		if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
	}
	
	 @Override
	    public String toString() {
	        return "Sweets{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                ", weight=" + weight +
	                '}';
	    }

}
