
	package monster.model;

	public class MarshMellowMonster {
		
		private String name;
		private double numOfLeg;
		private double amountOfHair;
		private boolean hasBellyButton;
		private int armCount;
		private int eyeCount;
		private int noseCount;
		
		public MarshMellowMonster()//nothing constructor
		{
			
		}
		
		public MarshMellowMonster(String name, int eyeCount)//partial constructor.
		{
			this.name = name;//specify names
			this.eyeCount = eyeCount; 
		}
		
		public MarshMellowMonster(double amountOfHair, int armCount, int eyeCount, boolean hasBellyButton, String name, int noseCount,double numOfLeg)
		{
			this.amountOfHair = amountOfHair;//define the int with an equal sign the right amount gets shoved to the left amount.
			this.armCount = armCount;
			this.eyeCount = eyeCount;
			this.hasBellyButton = hasBellyButton;
			this.name = name;
			this.noseCount = noseCount;
			this.numOfLeg = numOfLeg; 
		}
		public String getName()//getter
		{
			return name;
		}
		
		public double getNumOfLeg()
		{
			return numOfLeg;
		}
		
		public double  getNumOfHair()
		{
			return amountOfHair;
		}
		
		public int getArmCount()
		{
			return armCount;
		}
	public int getEyeCount()
	{
		return eyeCount;
	}
		
	public int getNoseCount()
	{
		return noseCount;
	}

	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
	}



