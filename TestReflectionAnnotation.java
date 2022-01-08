package ma.education.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		Class c = CalculatriceMath.class;
		Programmer	Programmer = (Programmer)
				
c.getAnnotation(Programmer.class);
		
System.out.println(Programmer.id()+":"+Programmer.name());
	
	}
}
