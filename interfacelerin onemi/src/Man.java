
class databaseManager{
	public void adddatabase(Idatabase database)
	{
		database.add();
	}
	public void updatedatabase(Idatabase database)
	{
		database.update();
	}
	public void getdatabase(Idatabase database)
	{
		database.get();
	}
	public void deletedatabase(Idatabase database)
	{
		database.delete();
	}
}

public class Man {
	public static void main(String[] args) {
		databaseManager manager=new databaseManager();
		manager.adddatabase(new mongodatabase());
		manager.adddatabase(new oracledatabase() );
		manager.adddatabase(new mongodatabase() );
	}
}
