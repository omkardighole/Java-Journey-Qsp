package arrays;

public class Employe_Arrray_DataBase_Driver {

	public static void main(String[] args) {
		
		Employe_Arrray_DataBase []db = new Employe_Arrray_DataBase[5];
		
		db[0]=new Employe_Arrray_DataBase("RAM",1001,25000.0d,"IT",01);
		db[1]=new Employe_Arrray_DataBase("Omkar",1002,30000.0d,"Software Dept",02);
		db[2]=new Employe_Arrray_DataBase("Raj",1003,40000.0d,"Sales",03);
		db[3]=new Employe_Arrray_DataBase();
		db[4]=new Employe_Arrray_DataBase("Mohan",1004,5423.250d,"wSales",04);
		
		System.out.println(db[3]);
		
		for(int i = 0;i<db.length;i++)
		{
			System.out.println(db[i]);
		}
		

	}

}
