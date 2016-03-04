package input;

import java.util.List;


public class BetModel {

	private double moneyAmount;
	private List<Integer> list;
	
	BetModel()
	{
		
	}
	
	BetModel (double moneyAmount,List<Integer> list)
	  {
		  this.setMoneyAmount(moneyAmount);
		  this.setList(list);
	  }


	public double getMoneyAmount() {
		return moneyAmount;
	}


	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}


	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
	}
}
