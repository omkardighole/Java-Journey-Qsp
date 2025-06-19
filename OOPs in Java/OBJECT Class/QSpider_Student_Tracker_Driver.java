class QSpider_Student_Tracker{
	String name;
	String  mail;
	long phn;
	String batch;
	
  public QSpider_Student_Tracker(){};
  
  public QSpider_Student_Tracker(String name,String  mail,long phn,String batch)
  {
	  this.name=name;
	  this.mail=mail;
	  this.phn=phn;
	  this.batch=batch;
  }
  public int hashCode()
  {
	  return name.hashCode()+mail.hashCode()+batch.hashCode()+(int)phn;
  }
  
  public boolean equals(Object o)
  {
	  QSpider_Student_Tracker q = (QSpider_Student_Tracker)o;
	  
	  if(this.name==q.name && this.mail==q.mail && this.batch==q.batch && this.phn==q.phn )
	  {		System.out.println("Duplicate student found");
		  return true;
	  }
	  return false;
  }
}
public class QSpider_Student_Tracker_Driver{
	public static void main(String [] args)
	{
		QSpider_Student_Tracker q1 = new QSpider_Student_Tracker("omkar","omidighole143@gmail.com",7666002113l,"E8");
		QSpider_Student_Tracker q2 = new QSpider_Student_Tracker("omkar","omidighole143@gmail.com",7666002113l,"E8");
		System.out.println("Q1 " +q1);
		System.out.println("Q2 " +q2);
		System.out.println("Equals method " + q1.equals(q2));
		System.out.println("== method " + (q1==q2));
	}
}
		

     