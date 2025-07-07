package arrays;

public class ArraY_of_Class_Objects_Driver {

	public static void main(String[] args) {
		
		ArraY_of_Class_Objects[] db = new ArraY_of_Class_Objects[5];
		
		db[0]=new ArraY_of_Class_Objects("Omkar","KVN",22,875);
		db[1]=new ArraY_of_Class_Objects("ram","Sandip",27,8745);
		db[2]=new ArraY_of_Class_Objects("Sham","Moern",45,63);
		db[3]=new ArraY_of_Class_Objects("A","asa",74,785);
		db[4]=new ArraY_of_Class_Objects("Rancho","swsw",45,7854);
		System.out.println(db[4].name);
		
		for(int i = 0 ; i <db.length;i++)
		{
			System.out.println("The Students Database " + db[i]);
		}
		
	}
	}


