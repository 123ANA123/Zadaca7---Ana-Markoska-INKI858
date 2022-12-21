package Zadaca5a;

import java.util.Set;
import java.util.TreeSet;
public class Maina {
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("Pyridoxine");
		mnozestvo1.add("Retinol");
		mnozestvo1.add("Ascorbic acid");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("Pyridoxine");
		mnozestvo2.add("Thiamine");
		mnozestvo2.add("Riboflavin");

		System.out.println("Presek od dvete mnozestva");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);

	}
}
