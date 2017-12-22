package com.faishalbadri.retrofit.model.city;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CityResponse{

	@SerializedName("event_city")
	private List<EventCityItem> eventCity;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setEventCity(List<EventCityItem> eventCity){
		this.eventCity = eventCity;
	}

	public List<EventCityItem> getEventCity(){
		return eventCity;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"CityResponse{" + 
			"event_city = '" + eventCity + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}