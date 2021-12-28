package com.qa.main.function;


public class CekGanjilGenap {
	public String cekGanjilgenap(int nilai) {
		if(nilai%2==0) {
			return "genap";
		}else {
			return  "ganjil";
		}
	}

}
