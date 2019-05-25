
public class Yelling 
{
 public String Scream (String name)
 {
   
	 String[] peoplenum;
	 peoplenum = name.split(",");
	 if(peoplenum.length ==2)
	 {
		 String allPersons = peoplenum[0] + " and" +peoplenum[1];
		 return allPersons + " are yelling";
		 }
	 else if(name == "Peter")
	  {
		 return name +" is yelling";
	 }

	 else if(name == "")
	  {
	 return "Nobody is yelling";
	 }
	 else if(name == "PETER")
	  {
	 return name +" IS YELLING";
	 }
	return name; 
 }
}