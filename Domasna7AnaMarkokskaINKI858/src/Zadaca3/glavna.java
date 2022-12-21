package Zadaca3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class glavna {
	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Vardar", "Rakomet", 20));
		list.add(new SportskiKlub("Sinalkok", "Odbojka", 20));
		list.add(new SportskiKlub("Barcelona", "Fudbal", 20));

		Collections.sort(list);
		for (SportskiKlub a : list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrojClenovi());
			System.out.println();
		}
	}
}
