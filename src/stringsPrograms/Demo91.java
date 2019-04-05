package stringsPrograms;

class Demo91 
{
	public static void main(String[] args) 
	{
		String s1="Hellollo";
		System.out.println(s1.length());
		System.out.println(s1.concat("Hello"));
		System.out.println(s1);
		
		System.out.println("---------------------------");
		String s2=new String();
		System.out.println(s2);
		System.out.println(s2.isEmpty());		
		
		System.out.println("---------------------------");
		System.out.println(s2.concat("Deve"));
		System.out.println(s2.startsWith("Bangalore"));
		System.out.println(s2.endsWith("10"));
		
		/*Equals Method string class*/
		System.out.println("**************** equals() Method string class******************");
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals(s2));
		System.out.println(s2.equals(null));
		System.out.println(new String("Java").equals("java"));
		System.out.println(new String("java").equals("java"));
		System.out.println("java".equals("java"));
		System.out.println("".equals(""));
		
		/*equalsIgnoreCase Method string class*/
		System.out.println("**************** equalsIgnoreCase Method string class ******************");
		System.out.println(new String("Java").equalsIgnoreCase("java"));
		
		
		System.out.println("**************** indexof Method string class****************************");
		s1="JavaDeveloper";
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf("Deve"));
		System.out.println(s1.indexOf('e',6));
		System.out.println(s1.indexOf("Deve",5));
		
		s1="the girl is watching the brid and boy is watching the brids";
		
		System.out.println(s1.indexOf("the",3));
		System.out.println(s1.indexOf('Z'));
		
		/*How many times character is repeated*/
		System.out.println("---------How many times character A is repeated in ASHOKA--------------");
		s1="ASHOKA";
		int index=0;
		int cntr=0;
		while(s1.indexOf('A',index)!=-1)
		{
			index=s1.indexOf('A',index);
			cntr++;
			index=index+1;			
		}
		System.out.println("'A' is repeated "+ cntr + " times");
		
		/*How many times character is repeated*/
		System.out.println("---------How many times word 'love' is repeated in s1 string------------------");
		
		s1="I love java and I love selenium and I love MT and I love my India";
		String srchWord="love";
		int index1=0;
		int cntr1=0;
		while((index1=s1.indexOf(srchWord,index1))!=-1)
		{
			cntr1++;
			index1=index1+srchWord.length();		
		}
		System.out.println("No of occurance of "+ srchWord + " is "+ cntr1 + " times");
		
		/*Replace methods string class*/
		System.out.println("---------replace------------------");
		s1="JavaDeveloper";
		System.out.println(s1.replace('e','E'));
		System.out.println(s1.replace("e","Engineer"));
		
		System.out.println(s1.replaceAll("l", "L"));
		
		System.out.println("*********************chartAt() methods string class***********************");
		
		s1="JavaDeveloper";
		System.out.println(s1.charAt(0));//J
		System.out.println(s1.charAt(s1.length()-1));
		
		char ch=s1.charAt(1);
		System.out.println(ch);
		
		System.out.println("--------To print character in string ---------------------------------");
		s1="JackAndJill";
		for(int i=0;i<s1.length();i++)
			System.out.print(s1.charAt(i));
		System.out.println("");
		
		System.out.println("------To printing character present in string in reverse order-----------");
		for(int i=s1.length()-1;i>=0;i--)
			System.out.print(s1.charAt(i));
				System.out.println();
				
		System.out.println("------------1. To Reverse a string--------");
		//reverse a string
		s1="Qspiders";
		String s3="";
		for(int i=s1.length()-1;i>=0;i--)
			s3=s3+s1.charAt(i);
		System.out.print(s3);
		System.out.println();
		
		System.out.println("*********************************************************************************");
		s1="JavaDeveloper";
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.contains("Deve"));
		
		System.out.println("DA".compareTo("CA"));
		System.out.println("To convert to upppercase --- " + s1.toUpperCase());
		System.out.println("To convert to Lowercase -- " +s1.toLowerCase());
		
		System.out.println("----------- 2.Reversing a string using charter Array--------");
		char chars[] = s1.toCharArray(); //converting string to chart Array
		String s4="";
		//Reversing a string using charter Array
		for(int i=chars.length-1;i>=0;i--)
			s4=s4+chars[i];
		System.out.println(s4);
		
		s1="VINOD";
		char chars1[]=s1.toCharArray();
		for(int i=0;i<chars1.length;i++)
			System.out.println(chars1[i]+"\t"+(int)chars1[i]+"\t"+(char)(chars1[i]+1)+"\t"+(chars1[i]+1) +"\t"+ ++chars1[i]);
		
		System.out.println("************* Lenth() method *************************************** ");
		
		System.out.println(new String("HEllo").length());
		System.out.println("Bangalore".length());
		s4="  Hello  ";
		System.out.println(s4.length());
		
		System.out.println("************* trim() method *************************************** ");
		s4.trim();
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		
		System.out.println("************* Substring() method****************************************");
		s1="JavaDeveloper";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(4,s1.length()));
		System.out.println(s1.substring(4,11));
		
		String str="Welcome Aklesh singh Yadav to stack overflow.com";
		System.out.println(str.substring(8,27));
		String str1="Welcome Ranbeer singh to stack overflow.com";
		//System.out.println(str1.substring(8,27)); //"Ranbeer singh to st"
		System.out.println(str1.substring(8,str1.indexOf("to stack")-1));
		
		/*String str2="Welcome tomoto singh to stack overflow.com";
		System.out.println(str2.substring(8,str2.indexOf("to stack")-1)); //"tomoto singh"
		System.out.println(str2.substring(8,str2.indexOf("to")-1)); //java.lang.StringIndexOutOfBoundsException:*/
		
		System.out.println("****************** split() method ***************************************");
		String strr="I Love Java class";
		System.out.println(strr.split(" "));
		System.out.println("------------3. To Reverse a string using split--------");
		String words[]=strr.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
			System.out.print(words[i]+" ");
		
	}
}
