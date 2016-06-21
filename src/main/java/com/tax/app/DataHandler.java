package com.tax.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class DataHandler
 */
public class DataHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DataHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String replyMsg=null;
		try{
			// CONVERTER CLASS IS WRITTEN TO HANDLE CONVERSIONS
			Converter converter = new Converter();
			
			// REQUEST TO JSON EXTRACTS JSON OBJECT FROM REQUEST OBJECT
			JSONObject jsonData = converter.requestToJson(request);
			
			// jsonToClass converts JSON object TO TaxPayers OBJECT
			TaxPayers TaxPayersObj = (TaxPayers) converter.jsonToClass(jsonData);
			
			// GET PATH OF DATA.XML
			String path = getServletContext().getRealPath("/data.xml");
			
			// CONVERT AND STORE XML IN DATA.XML ONTO PATH
			replyMsg = converter.classToXml(path, TaxPayersObj);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			replyMsg = e.toString();
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write(replyMsg);
		out.flush();
		out.close();
	}
	
}
