package mini1;

public class test 
{
	public static void main(String[] args)
	{
		System.out.println(mergePreservingRuns("", "ccdd"));
	}
	
	public static int countOccurrences(String t, String s, boolean allowOverlap)
	  {
		  int count = 0;
		  if (allowOverlap)
		  {
			  for (int i = 0; i < s.length() - t.length() + 1; i++)
			  {
				  for (int j = 0; j < t.length(); j++)
				  {
					  if (s.charAt(i + j) == t.charAt(j))
					  {
						  if ((j + 1) == t.length())
						  {
							  count++;
						  }
					  }
					  else
					  {
						  break;
					  }
				  }
			  }
		  }
		  return count;
	  }
	
	public static String mergePreservingRuns(String t, String s)
	  {
		  String result = "";
		  int i = 0;
		  int j = 0;
		  char a;
		  char b;
		  
		  while (!(i == t.length() && j == s.length()))
		  {
			  a = t.charAt(i);
			  if ( i < t.length())
			  {
				  while (a == t.charAt(i))
				  {
					  result += a;
					  i++;
					  if (i == t.length())
					  {
						  break;
					  }
				  }
			  }
			  
			  b = s.charAt(j);
			  if (j < s.length())
			  {
				  while (b == s.charAt(j))
				  {
					  result += b;
					  j++;
					  if (j == s.length())
					  {
						  break;
					  }
				  }
			  }  
		  }
		  return result;
	  }

}
