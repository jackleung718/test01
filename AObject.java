package testing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;

import EMSD.Util.EmsdUtil;
import PSPS.Forms.ApplicationSQL;
import PSPS.System.DateHandler;
import iAMSmartDTKLite.Exception.iAMSmartException;
import iAMSmartDTKLite.Json.SmartJSON;
import iAMSmartDTKLite.Util.ApiUtil;

public class AObject {
 String valueA;
 String valueB;
	
 
   public AObject(String valueA,String valueB) {
	   this.valueA= valueA;
	   this.valueB=valueB; 
   }
   
   public String toString() {
	    return "{" +
	            "valueA:" + valueA + ","
	           +
	           "valueB:" + valueB 
	           +
	            '}';
	 }

	public static void main(String[] args) throws SQLException, ParseException  {
JSONArray myJSON = new JSONArray("[\"idNo\",\"prefix\",\"enName\"]");
System.out.println(myJSON.toString());
SmartJSON temp1 = new SmartJSON();
String t1 = "11";
String t2 = "22";
123
temp1.smartPut(t1, new Object[] {t2});
System.out.println(temp1.toString());

ArrayList <String> a1 = new ArrayList();
a1.add(t1);
a1.add(t2);
System.out.println(a1.toString());
	}
	}

