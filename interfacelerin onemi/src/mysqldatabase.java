import javax.sound.midi.Soundbank;

public class mysqldatabase implements Idatabase{

	@Override
	public void add() {
		System.out.println("mysql ekleme");
		
	}

	@Override
	public void delete() {
		
		System.out.println("silme ekleme");
	}

	@Override
	public void get() {
		
		System.out.println("mysql elde etme");
	}

	@Override
	public void update() {
		
		System.out.println("mysql güncelleme");
	}
	
}
