package com.showroom.core;

public enum Acctype {
	SAVING(0),CURRENT(1000),FD(50000),LOAN(10000);
	private int minbal;
	private Acctype(int colorCost) {
		this.minbal = colorCost;
	}
	public int getAcc_minbal() {
		return minbal;
	}
//	public void setAcc_minbal(int colorCost) {
//		this.minbal = colorCost;
//	}
	@Override
	public String toString()
	{
		return name()+" @ "+minbal;
	}
//	public String toString_name()
//	{
//		return name();
//	}
//	
//	public int compairr(Acctype o) {
//		return name().compareTo(o.name());
//	}
}
