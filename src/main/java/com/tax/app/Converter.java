package com.tax.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Converter {

	public JSONObject requestToJson(HttpServletRequest request) {
		
		StringBuffer sb = new StringBuffer();

		JSONObject jsonData = null;
		try {
			BufferedReader reader = request.getReader();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			JSONParser parser = new JSONParser();
			jsonData = null;
			jsonData = (JSONObject) parser.parse(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonData;
	}

	public String classToXml(String path, TaxPayers dataObject) throws Exception {

		try {
			JAXBContext jc = JAXBContext.newInstance(TaxPayers.class);
			Marshaller xmlM = jc.createMarshaller();
			xmlM.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			FileOutputStream fos = new FileOutputStream(new File(path));
			xmlM.marshal(dataObject, fos);
			fos.close();
			return "DATA STORED SUCESSFULLY";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}

	public Object jsonToClass(JSONObject jsonObj) {
		String name = (String) jsonObj.get("name");
		String address = (String) jsonObj.get("address");
		String pan = (String) jsonObj.get("pan");
		String dob = (String) jsonObj.get("dateofbirth");
		String assessmentYear = (String) jsonObj.get("assessmentyear");
		String income = (String) jsonObj.get("income");
		String tds = (String) jsonObj.get("tds");
		String taxdeducted = (String) jsonObj.get("taxdeducted");
		TaxPayers TaxPayersObj = new TaxPayers(name, address, pan, dob, assessmentYear, income, tds, taxdeducted);
		return TaxPayersObj;
	}

}
