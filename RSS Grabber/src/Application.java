
public class Application 
{
	private String title;
	private String releaseDate;
	private String description;

	public Application(String title)
	{
		this.title = title;
	}
	
	
	//basic getter and setter methods
	public String getReleaseDate() { return releaseDate; }

	public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

	public String getDescription() { return description; }

	public void setDescription(String description) { this.description = description; }

	public String getTitle() { return title; }

}
