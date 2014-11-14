package src.ctec.hipster.model;

public class Hipster
{

	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	
	public Hipster()
	{
		name = null;
		age = -99;
		hipsterAlbums = null;
	}
	
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = new String [4];
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
}
