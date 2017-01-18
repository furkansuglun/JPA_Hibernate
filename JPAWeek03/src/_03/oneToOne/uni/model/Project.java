package _03.oneToOne.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String projectName;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [ID=" + ID + ", projectName=" + projectName + "]";
	}

	
	
	
	
	
}
