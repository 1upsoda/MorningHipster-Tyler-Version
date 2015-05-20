package src.ctec.hipster.model;

public class Hipster
{
/**
 * the variable for the name of the hipster
 */
	private String name;
	/**
	 * the variable for the age of the hipster
	 */
	private int age;
	/**
	 * starts the array to hold the albums
	 */
	private String [] hipsterAlbums;
	
	/**
	 * sets the base numbers for the hipster information
	 */
	public Hipster()
	{
		name = null;
		age = -99;
		hipsterAlbums = null;
	}
	/**
	 * sets the how of each of the variables, if they will be a name age or album for an array, also sets the array to have 4 spots inside it 
	 * @param name
	 * @param age
	 */
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = new String [4];
	}
/**
 * returns the name it has set when called
 * @return
 */
	public String getName()
	{
		return name;
	}
/**
 * sets the name to whatever is called with it
 * @param name
 */
	public void setName(String name)
	{
		this.name = name;
	}
/**
 * returns the name when it is called
 * @return
 */
	public int getAge()
	{
		return age;
	}
/**
 * sets the age to whatever is called with it
 * @param age
 */
	public void setAge(int age)
	{
		this.age = age;
	}
/**
 * returns what songs are in the album
 * @return
 */
	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}
/**
 * sets the array to have those songs
 * @param hipsterAlbums
 */
	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
}
