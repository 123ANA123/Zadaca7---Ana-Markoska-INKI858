package Zadaca5b;
import java.util.Set;
import java.util.TreeSet;
public class Mainb {
	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("Pyridoxine");
		mnozestvo1.add("Retinol");
		mnozestvo1.add("Ascorbic acid");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("Pyridoxine");
		mnozestvo2.add("Thiamine");
		mnozestvo2.add("Ascorbic acid");

		System.out.println("Unija od dvete mnozhestva");
		mnozestvo1.addAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
