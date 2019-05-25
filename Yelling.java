
public class Yelling 
{
 public String Scream (String name)
 {
	 if(name == "Peter")
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