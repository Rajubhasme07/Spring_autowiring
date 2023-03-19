package mybeans;




public class Address {

	
	private String c_city;
	private String c_pin;
	private String cs_add;
	
	

	public String getC_city() {
		return c_city;
	}



	public void setC_city(String c_city) {
		this.c_city = c_city;
	}



	public String getC_pin() {
		return c_pin;
	}



	public void setC_pin(String c_pin) {
		this.c_pin = c_pin;
	}



	public String getCs_add() {
		return cs_add;
	}



	public void setCs_add(String cs_add) {
		this.cs_add = cs_add;
	}



	@Override
	
	public String toString() {
		return "Address [c_city=" + c_city + ", c_pin=" + c_pin + ", cs_add=" + cs_add + "]";
	}
	
	
	
}
