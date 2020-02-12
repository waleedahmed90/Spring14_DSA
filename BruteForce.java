public class BruteForce {

	public static void main(String[] args) {
		String s = "aacccbabbbbcccbabababababa";
		String sub = "baba";

		char[] M = s.toCharArray();
		char[] N = sub.toCharArray();

		boolean found = false;
		boolean flag=false;
	
		
		for(int i=0;i<M.length - N.length;i++) 	//i = 0..14
			{
				//curr = i;
				for(int j=0;j<N.length;j++)	//i = 0..3
				{
					if(N[j]==M[i+j])
					{
						found=true;
					}
					else
					{
						found=false;
						break;//inner loop
					}
			}
				
				
			if(found){
				System.out.println("Found at index:"+i);
				break;//outer loop
			}
		}
		
		if(!found){
			System.out.println("Not Found");
		}
		
	}

}
