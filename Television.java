/** 
*The purpose of this class is to model a television
*Jason Li 9/28/21
*/

public class Television {
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
	//Create a constructor - Frederick Nguy
	public Television (String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	//Define accessor methods getVolume, getChannle, getManufacturer, etc
	public int getVolume()
	{
		return volume;
	}
	public void setVolume(int volume) 
	{
		this.volume = volume;
	}
	public void increaseVolume()
	{
		volume++;
	}
	public void decreaseVolume() 
	{
		volume--;
	}
	public int getChannel()
	{
		return channel;
	}
	public void setChannel(int channel)
	{
		this.channel = channel;
	}
	public void power()
	{
		powerOn = !powerOn;
	}
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	

}
