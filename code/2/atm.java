public class atm
{
	private String Name;
	private double Money=0;
	public atm()
	{
		setName("Thanawat");
		setMoney(0);
	}
	public atm(String aName,double aMoney)
	{
		
		setName(aName);
		setMoney(aMoney);
		
	}


	public void  setName(String aName)
	{
		Name = aName;
	}

	public String getName()
	{
		return Name;
	}

	public void setMoney(double aMoney)
	{
		Money=aMoney;
	}
	public double getMoney()
	{
		return Money;
	}
	public void Deposit(double aMoney)
	{
		setMoney(Money+aMoney);
	}
	public void Widthdraw(double aMoney)
	{
		setMoney(Money-aMoney);
	}
}
