package ie.cit.caf.lc_assignment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ChObject {
	
	private int id;
	private String title;
	private int date;
	private String medium;
	private String creditline;
	private String description;
	private String gallery_text;
	
	public String toString() {
		String chObjectAsString = "\n-----Cultural Heritage Object-----" + "\nID: " + id + "\nTitle: " + title + "\nDate: " + date +
				"\nMedium: " + medium + "\nCreditline: " + creditline + "\nDescription: " + description +
				"\nGallery Text: " + gallery_text;
		return chObjectAsString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getCreditline() {
		return creditline;
	}

	public void setCreditline(String creditline) {
		this.creditline = creditline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGallery_text() {
		return gallery_text;
	}

	public void setGallery_text(String gallery_text) {
		this.gallery_text = gallery_text;
	}
	
	

}
