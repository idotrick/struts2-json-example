package org.idotrick.struts2.json.vo;

import java.io.Serializable;

import lombok.Data;

public class Row implements Serializable {
	private static final long serialVersionUID = 1L;
	private String col1;
	private String col2;
	private String col3;	
	private String col4;	
	private String col5;	
	private String col6;
	
	public static Row of(String col1, String col2, String col3, String col4, String col5, String col6) {
		return new Row(col1,col2,col3,col4,col5,col6);
	}
	
	private Row() {}
	
	private Row (String col1, String col2, String col3, String col4, String col5, String col6) {
		this.col1=col1;
		this.col2=col2;
		this.col3=col3;
		this.col4=col4;
		this.col5=col5;
		this.col6=col6;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public String getCol3() {
		return col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	public String getCol4() {
		return col4;
	}

	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getCol5() {
		return col5;
	}

	public void setCol5(String col5) {
		this.col5 = col5;
	}

	public String getCol6() {
		return col6;
	}

	public void setCol6(String col6) {
		this.col6 = col6;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
