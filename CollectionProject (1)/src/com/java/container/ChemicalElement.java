package com.java.container;


interface Reactive { 
	
}

interface Responsive extends Reactive { 
	
}

interface ProActive extends Responsive {
	
}

class Student implements Reactive {
	
}
class Executive implements Responsive {
	
}
class Developer implements ProActive {
	
}

class LocalTrain
{
	void searchForSeats(Reactive r ) {
		
	}
}
class Flight  {
	void searchForSeats(Responsive r) {
		
	}
}
class Neova
{
	void workForProjects(ProActive pro) {
		
	}
}
//chemicalElement1.compareTo(chemicalElement2)
public class ChemicalElement implements Comparable<ChemicalElement> {
	
	private int atomicNumber;
	private String atomicName;
	private String atomicFormula;
	private double atomicWeight;
	
	//x =100   y = 100 
	//if (x<y) return x-y;
	// else if (x>y) return x-y;
	//else return 0;
	
	/*@Override
	public int compareTo(ChemicalElement o) {
		System.out.println("comparing "+atomicNumber+ " with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}*/
	
	@Override
	public int compareTo(ChemicalElement o) {
		System.out.println("comparing "+atomicFormula+ " with "+o.atomicFormula);
		return atomicFormula.compareTo(o.atomicFormula);
	}
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}


	
	
}
