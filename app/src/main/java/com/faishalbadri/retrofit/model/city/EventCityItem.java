package com.faishalbadri.retrofit.model.city;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class EventCityItem{

	@SerializedName("event_city_id")
	private int eventCityId;

	@SerializedName("event_city_name")
	private String eventCityName;

	public void setEventCityId(int eventCityId){
		this.eventCityId = eventCityId;
	}

	public int getEventCityId(){
		return eventCityId;
	}

	public void setEventCityName(String eventCityName){
		this.eventCityName = eventCityName;
	}

	public String getEventCityName(){
		return eventCityName;
	}

	@Override
 	public String toString(){
		return 
			"EventCityItem{" + 
			"event_city_id = '" + eventCityId + '\'' + 
			",event_city_name = '" + eventCityName + '\'' + 
			"}";
		}
}