package com.schieben.ussd.model;

public class Forfait {
	
   private String prix, thumbnailUrl;

	public Forfait(String prix, String thumbnailUrl) {
		this.prix = prix;
		this.thumbnailUrl = thumbnailUrl;
	}
	
	public String getPrix() {
		return prix;
	}
	
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
  
}