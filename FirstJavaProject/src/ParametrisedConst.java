
public class ParametrisedConst {
	  String names;

	  // constructor accepting single value
	  ParametrisedConst(String name) {
	    names = name;
	    System.out.println(names);
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  ParametrisedConst obj1 = new  ParametrisedConst("Ashwini");
		  ParametrisedConst obj2 = new  ParametrisedConst("Raj");
		  ParametrisedConst obj3 = new  ParametrisedConst("Radha");
	  }
	}
