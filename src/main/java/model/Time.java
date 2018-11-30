package model;

public class Time {
	private long id;
	private String code;
	private String name;
	private String currency;

	public Time(long id, String code, String name, String currency) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.currency = currency;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", currency=" + currency + "]";
	}
	
	

}

