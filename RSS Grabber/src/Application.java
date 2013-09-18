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

	public Application(String title)
	{
		this.title = title;
	}
	
	
	//basic getter and setter methods
	public String getReleaseDate() { return version; }

	public void setReleaseDate(String releaseDate) { this.version = releaseDate; }

	public String getDescription() { return description; }

	public void setDescription(String description) { this.description = description; }

	public String getTitle() { return title; }

}
