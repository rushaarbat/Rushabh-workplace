package com.java.container;

class Shop
{
	
}

class DairyShop extends Shop
{
	static Curd purchaseCurd() {
		Curd crd = new Cow().milkACow().coagulate();
		return crd;
	}
	static ClarifiedButter purchaseGhee() {
		ClarifiedButter ghee = new Cow().milkACow().coagulate().churn().boil();
		return ghee;
	}
}
public class AssociationProject {
	public static void main(String[] args) {
		
		Curd crd = DairyShop.purchaseCurd();
		
		ClarifiedButter ghee = DairyShop.purchaseGhee();
		
		/*
		Cow theCow = new Cow();
		
		Milk milk = theCow.milkACow();
		milk.showMilk();
		
		Curd theCurd = milk.coagulate();
		theCurd.showCurd();
		
		Butter butter = theCurd.churn();
		butter.showButter();
	
		ClarifiedButter ghee = butter.boil();
		
		ghee.eat();
		*/
		//Milk m= new Milk();
		//m.showMilk();
		
		//Curd curd = new Curd();
		//curd.showCurd();
		
		
	}
}

class Cow
{
	Milk milkACow() {
		return new Milk();
	}
}
class Milk
{
	void showMilk() {
		System.out.println("Milk is good for the healthy muscles....");
	}
	
	Curd coagulate() {
		return new Curd();
	}
}
class Curd
{
	void showCurd() {
		System.out.println("Eat Curd with healthy food....");
	}
	
	Butter churn() {
		Butter butter = new Butter();
		return butter;
	}
	
}

class Butter {
	void showButter() {
		System.out.println("Eat chapati/roti with butter...");
	}
	
	ClarifiedButter boil() {
		return new ClarifiedButter();
	}
}


class ClarifiedButter {
	void eat() {
		System.out.println("Eat a spoonfull of clarifiedbutter for a healthy life....");
	}
	
}