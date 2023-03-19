package mybeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	
	private int cid;
	private String cname;
	
	
	@Autowired
	private Address address;
	
	
	









	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	
	

}
