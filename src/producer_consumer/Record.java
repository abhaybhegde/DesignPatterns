package producer_consumer;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;


public class Record {
	
	final static Logger logger = Logger.getLogger(Record.class);
	
	private String firstName;
	private String lastName;
	private float salary;
	private String department;
	
	
	public Record(String firstName,String lastName, float salary, String department) {
		createJsonData(firstName,lastName,salary,department);
	}


	private void createJsonData(String firstName, String lastName, float salary, String department) {
		
		JSONObject json = new JSONObject();
		
		try {
			json.append("first_name", firstName);
			json.append("last_name", lastName);
			json.append("salary", salary);
			json.append("department", department);
		} catch (JSONException e) {
			logger.debug("Error while constructing JSON");
			e.printStackTrace();
		}

		
		
	}

}
