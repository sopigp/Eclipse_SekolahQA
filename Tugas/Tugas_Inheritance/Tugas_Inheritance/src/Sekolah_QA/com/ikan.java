package Sekolah_QA.com;

public class ikan extends Animal {
	
	public void introduce1()
	{
		System.out.println("Me : Hello Fish! How are you?");
	}

	@Override
	public void animal_sound()
	{
		System.out.println("The fish says : Blub..blub..Blub");
	}
	
	public void introduce2()
	{
		System.out.println("Me : Can you tell me, How do you move?");
	}
	
	@Override
	public void move()
	{
	}
	
	public void introduce3()
	{
		System.out.println("Me : That's cool! so where do you live?");
	}
	
	@Override
	public void live_in()
	{
	}
	
	public void introduce4()
	{
		System.out.println("Me : you are one of the animals that are always targeted, how can you breed?");
	}
	
	@Override
	public void breed()
	{
	}
	
	public void introduce5()
	{
		System.out.println("Me : ok, thanks for your time, see you later and have a good night!");
	}
	

}
