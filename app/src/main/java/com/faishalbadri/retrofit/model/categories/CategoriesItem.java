package com.faishalbadri.retrofit.model.categories;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CategoriesItem{

	@SerializedName("category_name")
	private String categoryName;

	@SerializedName("category_id")
	private int categoryId;

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	@Override
 	public String toString(){
		return 
			"CategoriesItem{" + 
			"category_name = '" + categoryName + '\'' + 
			",category_id = '" + categoryId + '\'' + 
			"}";
		}
}