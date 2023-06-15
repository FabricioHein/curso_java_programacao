import java.util.List;
import java.util.ArrayList;

public class ListaExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Fabricio");
		list.add("Lucas");
		list.add("Roberto");
		list.add("Alex");

		for (String x : list) {
			System.out.println(x);
		}
		

	}

}
