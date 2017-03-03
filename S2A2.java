public class S2A2
{
    public static void main(String args[])
    {
		int n=3, c, k, space=1,m=1;
		char start='a'-1;
        space = n-1;
		
        for(k=1; k<=n; k++) // for printing spaces
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space--;
            for(c=1; c<=k; c++)  // for first half of row
            {
                char ch = (char) (start + c);
				System.out.print(ch);
				
            }
			for(c=k-1; c>=1; c--) // for second half of row
            {
                char ch = (char) (start + c);
				System.out.print(ch);
				
            }
            System.out.println();
        }
		
        space = 1;
		
        for(k=1; k<=(n-1); k++)
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space++;
          	for(c=1; c<=n-k; c++)  // for first half of row
            {
                char ch = (char) (start + c);
				System.out.print(ch);
							
            }
			for(c=n-k-1; c>=1; c--) // for second half of row
            {
                char ch = (char) (start + c);
				System.out.print(ch);
				
            }
            System.out.println();
        }
		
    }
}