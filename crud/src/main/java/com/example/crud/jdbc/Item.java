package com.example.crud.jdbc;

public class Item {
	private int itemid;
     private String itemname;
     private String itemdescription;
     private int itemprice;
	public Item(int itemid, String itemname, String itemdescription, int itemprice) {
		 this.itemid=itemid;
		 this.itemname=itemname;
		 this.itemdescription=itemdescription;
		 this.itemprice=itemprice;
		
		// TODO Auto-generated constructor stub
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() { 
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
     
}
