package com.tax.app;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"name", "address", "pan", "dateofbirth", "assessmentyear","income","tds","taxdeducted"})
@XmlRootElement 
public class TaxPayers {

	private String name;
	private String address;
	private String pan;
	private String dateofbirth;
	private String assessmentyear;
	private String income;
	private String tds;
	private String taxdeducted;
	
	public TaxPayers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxPayers(String name, String address, String pan, String dateofbirth, String assessmentyear, String income,
			String tds, String taxdeducted) {
		super();
		this.name = name;
		this.address = address;
		this.pan = pan;
		this.dateofbirth = dateofbirth;
		this.assessmentyear = assessmentyear;
		this.income = income;
		this.tds = tds;
		this.taxdeducted = taxdeducted;
	}
	
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	@XmlElement 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement 
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@XmlElement 
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	

	@XmlElement 
	public String getAssessmentyear() {
		return assessmentyear;
	}
	public void setAssessmentyear(String assessmentyear) {
		this.assessmentyear = assessmentyear;
	}
	
	@XmlElement 
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	@XmlElement 
	public String getTds() {
		return tds;
	}
	public void setTds(String tds) {
		this.tds = tds;
	}
	
	@XmlElement 
	public String getTaxdeducted() {
		return taxdeducted;
	}
	public void setTaxdeducted(String taxdeducted) {
		this.taxdeducted = taxdeducted;
	}
	
}
