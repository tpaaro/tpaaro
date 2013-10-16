package praktikum6;

public class SuvaKlass {
	public static int suvalineArv(int algus, int lõpp) {
		int vahemik = lõpp - algus + 1;

		return (int) (Math.random() * vahemik) + algus;

	}

}

