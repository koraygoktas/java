package hafta12_karsilastirma2;
import java.util.Comparator;
class NameComparator implements Comparator<worker>{
	@Override
	public int compare(worker w1 ,worker w2) {
		return w1.name.compareTo(w2.name);
	}
}

class AgeComparator implements Comparator<worker>{
	@Override
	public int compare(worker w1 ,worker w2) {
		return w1.age-w2.age;
	}
}

class WeightComparator implements Comparator<worker>{
	@Override
	public int compare(worker w1 ,worker w2) {
		return w1.weight-w2.weight;
	}
}
