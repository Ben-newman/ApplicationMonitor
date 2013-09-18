/*
 * Basic Java Bean that contains the information for each individual application
 * 
 * @author: Ben Newman
 * 
 */
public class Application 
{
	private String title;
	private String version;
	private String description;

	public Application(String title, String version)
	{
		this.title = title;
		this.version = version;
	}
	
	
	//basic getter and setter methods
	public String getVersion() { return version; }

	public void setVersion(String version) { this.version = version; }

	public String getDescription() { return description; }

	public void setDescription(String description) { this.description = description; }

	public String getTitle() { return title; }
	
	public String getAppDetails() { return title+"\t"+version; }

}
