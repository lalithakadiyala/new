package difemp;

public class difemp {




	public static void main(String[] args){

		etouch empobj= new etouch( "Lalitha", 700000, 700.90, "Assistant");
		empobj.display();

		Techm1 Techobj= new Techm1 ("AKshaya", 879898, 980.98, "AGSA");
		Techobj.display1();

	}


}

class etouch{

	String ename;
	int salary;
	Double bonus;
	String Team;

	static final String  vendor="ETOUCH";

	etouch( String en, int sal,Double bon, String Te){
		ename=en;
		salary= sal;
		bonus=bon;
		Team=Te;
	}

	Double getbonus2(){
		Double bonus2=salary * 0.05;
		return bonus2;
	}

	void display(){
		System.out.println( vendor);
		System.out.println("Ename :"  +ename);
		System.out.println("Salary : " +salary);
		System.out.println("bonus  :"  +bonus);
		System.out.println(" Team :" +Team);
		System.out.println( "Chritmas bounus is  :" +getbonus2());


	}
}

class Techm1{
	String ename;
	int salary;
	Double bonus;
	String Team;

	static final String  vendor= "Techmahindra";

	Techm1(String en, int sa,Double b, String Tea){
		ename=en;
		salary=sa;
		bonus=b;
		Team=Tea;

	}

	Double getinc(){
		Double inc=salary * 0.70;
		return inc;
	}



	void display1(){
		System.out.println( vendor);
		System.out.println("Ename :"  +ename);
		System.out.println("Salary : " +salary);
		System.out.println("bonus  :"  +bonus);
		System.out.println(" Team :" +Team);
		System.out.println("Chritsmas bonus is : "  +getinc());


	}
}