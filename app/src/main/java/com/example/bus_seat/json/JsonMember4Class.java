package com.example.bus_seat.json;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class JsonMember4Class implements Serializable {

	@SerializedName("sc")
	private String sc;

	@SerializedName("t")
	private String T;

	@SerializedName("n")
	private String N;

	public void setSc(String sc){
		this.sc = sc;
	}

	public String getSc(){
		return sc;
	}

	public void setT(String T){
		this.T = T;
	}

	public String getT(){
		return T;
	}

	public void setN(String N){
		this.N = N;
	}

	public String getN(){
		return N;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember4Class{" + 
			"sc = '" + sc + '\'' + 
			",t = '" + T + '\'' + 
			",n = '" + N + '\'' + 
			"}";
		}
}