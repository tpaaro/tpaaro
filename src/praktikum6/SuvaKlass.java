package praktikum6;

public class SuvaKlass {
	public static int suvalineArv(int algus, int l�pp) {
		int vahemik = l�pp - algus + 1;

		return (int) (Math.random() * vahemik) + algus;

	}

}

