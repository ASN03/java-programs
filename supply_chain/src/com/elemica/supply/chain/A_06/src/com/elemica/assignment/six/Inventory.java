package com.elemica.assignment.six;

public class Inventory {
	private String item, itemCode;
	private Integer itemNo, quantity;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Inventory(String item, Integer itemNo, String itemCode, Integer quantity) {
		this.item = item;
		this.itemNo = itemNo;
		this.itemCode = itemCode;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "item:" + item + "  itemNo:" + itemNo + "  itemCode:" + itemCode + "  quantity:" + quantity;
	}
}
