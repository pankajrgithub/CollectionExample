package ArrayList;

public class Demo {

	public static void main(String[] args) 
	{
	    /*
		String s="RajKumar";  //Objects of String are immutable
	      String l="Dubey";
	      String sname[]= {"Pankaj","Deepak","Mohit"}; //string array
		 
		System.out.println("Name:"+s);
		System.out.println("length of string:"+s.length());
        System.out.println("find the index of string using indexOf():"+s.indexOf('j'));
        
        System.out.println("concate string using +:"+s +" "+l);
        System.out.println("concate string using method concate():"+s.concat(l));
        
        */
        StringBuffer sb=new StringBuffer("Geek"); //mutable
        
        sb.append("mohit"); //to add new item
        sb.append("ram");
        sb.append("kumar");
       
        System.out.println("String buffer:"+sb);
  
        //conversation string buffer to string builder
       
        String str=sb.toString();
        
        StringBuilder sbl=new StringBuilder(str);
        
        sbl.append("Added"); //add new item on string builder
        System.out.println("String Builder:"+sbl);
        
        //Print String sname[]= {"Pankaj","Deepak","Mohit"};
	
       String empName[]= {"Rahul","Dinesh","Kamlesh","Mohit"};
       
       for(String emp:empName)
       {
       System.out.println(emp);
       }
	}

}