package com.tnsif.Day7;

class country
{
	private String cname;
	private String capital;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public country(String cname, String capital) {
		super();
		this.cname = cname;
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "country [cname=" + cname + ", capital=" + capital + "]";
	}
	
}

class state extends country
{
	private String sname;
	private String language;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public state(String cname, String capital,String sname,String language) {
		super(cname, capital);
		this.sname=sname;
		this.language=language;
	}
	@Override
	public String toString() {
		return "state [sname=" + sname + ", language=" + language + ", toString()=" + super.toString() + "]";
	}
	
}

class city extends state
{
	private String cityname;
	private String area;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public city(String cname, String capital, String sname, String language,String cityname, String area) {
		super(cname, capital, sname, language);
		this.cityname=cityname;
		this.area=area;
	}
	@Override
	public String toString() {
		return "city [cityname=" + cityname + ", area=" + area + ", toString()=" + super.toString() + "]";
	}
	
}


public class inheritance_example_multi_leve {

	public static void main(String[] args) {
		city c = new city("India","Delhi","Karnataka","Kannada","Benguluru","MSRIT");
		System.out.println(c);
	}

}
