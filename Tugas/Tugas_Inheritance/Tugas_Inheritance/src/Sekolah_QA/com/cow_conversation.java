package Sekolah_QA.com;

public class cow_conversation extends sapi {
	
	public void conversation2()
	{
		System.out.println("===================Cow Conversation==================");
	}

	@Override
	public void move() {
		System.out.println("The cow says : I move with my four legs ");
	}

	@Override
	public void live_in() {
		System.out.println("The cow says : Emm...sometimes I'm in the cage, but if I'm bored I'll go to the fields ");
	}

	@Override
	public void breed() {
		System.out.println("The cow says : I am a mammal, so I can give birth to reproduce offspring");
	}
}
