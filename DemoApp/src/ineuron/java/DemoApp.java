package ineuron.java;

public class DemoApp {

	public static void main(String[] args) {
		int [] a = {1,2,3};
		for (int i : a) {
			System.out.println(i);
		}
      String name = "luffy";
      int count = name.toUpperCase().length();
      System.out.println(count);
      
      StringBuffer sb = new StringBuffer("SAnji");
      sb.append("Zoro");
      System.out.println(sb);
      
      StringBuffer sb1 = new StringBuffer("SAnji");
      sb.append("Zoro");
      System.out.println(sb1);
	}

}
