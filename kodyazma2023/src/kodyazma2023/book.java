package kodyazma2023;

public class book implements Comparable<book>{
	public String name;
	public double price;
	public double totalp;
	public book(String name,double price)
	{
		this.name=name;
		this.price=price;
		this.totalPrice();
	}
	public double totalPrice() {
		totalp= this.price+0.2*this.price;
		return totalp;
	}
	@Override
	public String toString(){
		return "name : "+this.name+" price : "+this.price;
	}
	@Override
	public int compareTo(book b) {
	    double diff = this.totalPrice() - b.totalPrice();
	    if (diff < 0) {
	        return -1;
	    } else if (diff > 0) {
	        return 1;
	    } else {
	        return 0;
	    }
	}

}
