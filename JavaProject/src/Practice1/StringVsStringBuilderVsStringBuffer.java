package Practice1;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// String-- Immutable-- Original value not changes
		
		String s="welcome";
		s.concat(" to java");
		System.out.println(s);
		
		// StringBuilder -- mutable-- original value changes
		StringBuilder s1 = new StringBuilder("welcome");
		s1.append(" to Java");
		System.out.println(s1);
		
		// StringBuffer-- mutable-- Original value changes
		
		StringBuffer s2 = new StringBuffer("welcome");
		s2.append(" to Java");
		System.out.println(s2);
	}

}
