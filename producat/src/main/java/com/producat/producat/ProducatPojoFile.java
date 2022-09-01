package com.producat.producat;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producatt")
public class ProducatPojoFile {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	int ProdacatId;
	String ProductName;
	String ProductType;
	String ProductCategory;
	String ProductPrice;
	String Discount;
	String GST;
	String DeliveyChargeRs;
	public ProducatPojoFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProducatPojoFile(int prodacatId, String productName, String productType, String productCategory,
			String productPrice, String discount, String gST, String deliveyChargeRs) {
		super();
		ProdacatId = prodacatId;
		ProductName = productName;
		ProductType = productType;
		ProductCategory = productCategory;
		ProductPrice = productPrice;
		Discount = discount;
		GST = gST;
		DeliveyChargeRs = deliveyChargeRs;
	}
	@Column(name="ProdacatId")
	public int getProdacatId() {
		return ProdacatId;
	}
	public void setProdacatId(int prodacatId) {
		ProdacatId = prodacatId;
	}
	@Column(name="ProductName")
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	@Column(name="ProductType")
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	@Column(name="ProductCategory")
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	@Column(name="ProductPrice")
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	@Column(name="Discount")
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	@Column(name="GST")
	public String getGST() {
		return GST;
	}
	
	public void setGST(String gST) {
		GST = gST;
	}
	@Column(name="DeliveyChargeRs")
	public String getDeliveyChargeRs() {
		return DeliveyChargeRs;
	}
	public void setDeliveyChargeRs(String deliveyChargeRs) {
		DeliveyChargeRs = deliveyChargeRs;
	}
	@Override
	public String toString() {
		return "ProducatPojoFile [ProdacatId=" + ProdacatId + ", ProductName=" + ProductName + ", ProductType="
				+ ProductType + ", ProductCategory=" + ProductCategory + ", ProductPrice=" + ProductPrice
				+ ", Discount=" + Discount + ", GST=" + GST + ", DeliveyChargeRs=" + DeliveyChargeRs + "]";
	}
	
	
	
}
