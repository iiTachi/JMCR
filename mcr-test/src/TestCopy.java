
import java.util.Collections;
import java.util.Vector;


public class TestCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>();
		v1.add("1");
		v1.add("0");
		v2.add("0");
		v2.add("1");
//		Vector<String> v3 = v1;
//		Vector<String> v4 = v2;
//		v3.addAll(v4);
		Vector<String> copy = new Vector<>(v1);
		Collections.sort(copy);
//		System.out.println(v1);
//		System.out.println(copy);
		Collections.sort(v2);
		System.out.println(copy.equals(v2));
//		if (copy.equals(v2)){
//			continue;
//		}
		v1.toString();
		System.out.println(v1);
		
	}

}
