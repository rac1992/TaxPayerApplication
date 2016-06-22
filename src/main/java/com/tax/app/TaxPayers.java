package com.tax.app;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
public class TaxPayers{
	List<TaxPayer> taxPayer = new ArrayList<TaxPayer>();

	public TaxPayers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxPayers(List<TaxPayer> taxPayer) {
		super();
		this.taxPayer = taxPayer;
	}
	
	@XmlElement
	public List<TaxPayer> getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(List<TaxPayer> taxPayer) {
		this.taxPayer = taxPayer;
	}
}

