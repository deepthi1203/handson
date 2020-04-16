package mapcollections;

import java.io.Serializable;
import java.util.Date;

public class Project implements Comparable<Project>,Serializable,Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String domain;
	private Date startdate;
	private Date enddate;
	

	
	@Override
	public String toString() {
		return "Project [id=" + id + ", domain=" + domain + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}



	public Project(int id, String domain, Date startdate, Date enddate) {
		super();
		this.id = id;
		this.domain = domain;
		this.startdate = startdate;
		this.enddate = enddate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDomain() {
		return domain;
	}



	public void setDomain(String domain) {
		this.domain = domain;
	}



	public Date getStartdate() {
		return startdate;
	}



	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}



	public Date getEnddate() {
		return enddate;
	}



	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}



	@Override
	public int compareTo(Project arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
