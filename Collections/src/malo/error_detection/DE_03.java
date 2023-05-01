package malo.error_detection;

import java.util.ArrayList;
import java.util.Iterator;

/*
    @author Blas "MaLeVo" <https://github.com/BlasAC>

	ArrayList<String> = new ArrayList()
	bebidas.put(“café);
	bebidas.add(“té”);
	Iterator<String> it =bebidas.iterator();
	whale (it.next()){
	if (it.next().equals(“café”)){
	it.remove();
	}
*/
public class DE_03 {
	
	public static void main(String[] args) {
		
		ArrayList<String> bebidas = new ArrayList();
		bebidas.add("café");
		bebidas.add("té");
		Iterator<String> it = bebidas.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals("café")) {
				it.remove();
			}
		}
	}
}
