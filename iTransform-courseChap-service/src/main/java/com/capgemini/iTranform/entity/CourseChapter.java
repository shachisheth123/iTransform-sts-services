package com.capgemini.iTranform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Document(collection="courseChapter")

//@CrossOrigin("*")
public class CourseChapter {

	@Id
	private String chapterName;
	private String chaptermodule;
	private String moduleName;
	private String moduleDetails;
	private String title;
	private String description;
	private String subtitle;
	private String subdescription;
	private String subtitle1;
	private String subdescription1;
	
	
	public CourseChapter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CourseChapter(String chapterName, String chaptermodule, String moduleName, String moduleDetails,
			String title, String description, String subtitle, String subdescription, String subtitle1,
			String subdescription1) {
		super();
		this.chapterName = chapterName;
		this.chaptermodule = chaptermodule;
		this.moduleName = moduleName;
		this.moduleDetails = moduleDetails;
		this.title = title;
		this.description = description;
		this.subtitle = subtitle;
		this.subdescription = subdescription;
		this.subtitle1 = subtitle1;
		this.subdescription1 = subdescription1;
	}
	
	
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public String getChaptermodule() {
		return chaptermodule;
	}
	public void setChaptermodule(String chaptermodule) {
		this.chaptermodule = chaptermodule;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleDetails() {
		return moduleDetails;
	}
	public void setModuleDetails(String moduleDetails) {
		this.moduleDetails = moduleDetails;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getSubdescription() {
		return subdescription;
	}
	public void setSubdescription(String subdescription) {
		this.subdescription = subdescription;
	}
	public String getSubtitle1() {
		return subtitle1;
	}
	public void setSubtitle1(String subtitle1) {
		this.subtitle1 = subtitle1;
	}
	public String getSubdescription1() {
		return subdescription1;
	}
	public void setSubdescription1(String subdescription1) {
		this.subdescription1 = subdescription1;
	}

	
	
	
}
