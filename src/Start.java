import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Start {

	public static void print(int[] arr){
		for(int j=0;j<arr.length;j++){
			System.out.print(Integer.toString(arr[j])+"\t");
		}
		System.out.println();
	}
	
	public static int rec(int n){
		if(n==1)
			return 1;
		else
			return n*rec(n-1);
	}
	
	public static int biggestSilk(int[][] arr,int length){
		int less_y=arr[0][1];
		int less_x=arr[0][0];
		int most_y=arr[0][1];
		int most_x=arr[0][0];
		
	    for(int i=0;i<length;i++){
	    	for(int j=0;j<2;j++){
	    		if(j==0){
		    		if(arr[i][j]>most_x && arr[i][j] != -1)
		    			most_x=arr[i][j];
		    		if(arr[i][j]<less_x && arr[i][j] != -1)
		    			less_x=arr[i][j];
		    		}
	    		else{
		    		if(arr[i][j]>most_y && arr[i][j] != -1)
		    			most_y=arr[i][j];
		    		if(arr[i][j]<less_y && arr[i][j] != -1)
		    			less_y=arr[i][j];
	    		}	
	    	}		
	    }
	    
		return (most_y-less_y)*(most_x-less_x);
	}
	public static int[][] copy(int[][] arr,int length){
	    int[][] new_arr=new int[length][2];
		for(int i=0;i<length;i++){
	    	for(int j=0;j<2;j++){
	    		new_arr[i][j]=arr[i][j];
	    	}
	    }
		return new_arr;
	}
	
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            int counter=s.length();
            while(counter!=0){
            	if(s.charAt(counter-1)==0){
            		counter--;
            	}
            	else{
            		String sub=s.substring(counter-1);
            		for(int i=sub.length()-1;i<=0;i--){
            			if(Integer.parseInt(sub)-Integer.parseInt(s.substring(counter-1-i,counter-1))==1){
            				
            			}
            		}
            	}
            }
                 
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int good_break=score[0];
        int bad_break=score[0];
        int good_break_counter=0;
        int bad_break_counter=0;
        
        for(int score_i=0; score_i < n; score_i++){
           if(score[score_i]>good_break){
        	   good_break=score[score_i];
        	   good_break_counter++;
           }
           if(score[score_i]<bad_break){
        	   bad_break=score[score_i];
        	   bad_break_counter++;
           }
           
        }
		
		System.out.println(Integer.toString(good_break_counter)+" "+Integer.toString(bad_break_counter));
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 come back
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int k=scan.nextInt();
	    int[][] stains=new int[n][2];
	    
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<2;j++)
	    		stains[i][j]=scan.nextInt();
	    }
		int largestSize=biggestSilk(stains,n);
		int counter=0;

	    for(int i=0;i<n;i++){
	    	int[][] partial=copy(stains,n);
	    	partial[i][0]=-1;
	    	partial[i][1]=-1;
	    	for(int j=0;j<n;j++){
	    		int recover_a=partial[j][0];
	    		int recover_b=partial[j][1];
	    		if(i!=j){
	    	    	partial[j][0]=-1;
	    	    	partial[j][1]=-1;
	    		}
	    	if(biggestSilk(partial,n)<largestSize)
	    		counter++;
	    	partial[j][0]=recover_a;
	    	partial[j][1]=recover_b;
	    	}
	    }
	    System.out.println(counter);
	    
	    */
		/*
		int[][] a=new int[][]{
			{1,		2,		3,		4},
			{11,	22,		33,		44},
			{111,	222,	333,	444},
			{1111,	2222,	3333,	4444}
		};
		int[][] b=a;
		a[2][2]=100;
		
	    for(int i=0;i<4;i++){
	    	for(int j=0;j<4;j++)
	    		System.out.println(b[i][j]);
	    }
		
		*/
		
		
		
		
		
		
		/*
        String alpha="abcdefghijklmnopqrstuvwxyz";
        
		int height=0;
		int char_count;
        
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        for(int i=0;i<word.length();i++){	
        	if(height<h[alpha.indexOf(word.charAt(i))])
        		height=h[alpha.indexOf(word.charAt(i))];
        }
        System.out.println(Integer.toString(height*word.length()));
		*/
		/*
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		for(int i=0;i<n;i++){
			String line=in.nextLine();
			String part1="";
			String part2="";
				for(int j=0;j<line.length();j++){
					if(j%2==0)
						part1+=line.charAt(j);
					else
						part2+=line.charAt(j);
				}
			System.out.println(part1+" "+part2);
		}
		*/
		/*
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int apples_sum=0;
        int oranges_sum=0;
        
        int x=100000;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if((apple[apple_i]>0) && (a+apple[apple_i]>=s))
                apples_sum++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if((orange[orange_i]<0) && (b+orange[orange_i]<=t))
                oranges_sum++;
        }
        System.out.println(apples_sum);
        System.out.println(oranges_sum);


		*/
		/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        if(n<=1000 && n>=1){
	        for(int i=arr.length-1;i>=0;i--){
	        	System.out.print(Integer.toString(arr[i])+" "); 
	        }
        }
        in.close();
        */
		/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map m =new HashMap();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            m.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(m.containsKey(s)){
            	System.out.println(String.format("%1$s=%2$d", s,m.get(s)));
            }
            else
            	System.out.println("Not found");
        }
        in.close();
        */
		
		/*come back
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<=12 && n>= 2){
			System.out.println(Integer.toString(rec(n)));
		}
		
		*/
		/*
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0;
        sum+=arr[0][0];
        sum+=arr[0][0+1];
        sum+=arr[0][0+2];
        sum+=arr[0+1][0+1];
        sum+=arr[0+2][0];
        sum+=arr[0+2][0+1];
        sum+=arr[0+2][0+2];
        
        
        int temp_sum=0;
        
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){      
                if(arr[i][j]>=-9 && arr[i][j]<=9){
            	temp_sum=0;
                if(i+2<=5 && j+2<=5){
                    temp_sum+=arr[i][j];
                    temp_sum+=arr[i][j+1];
                    temp_sum+=arr[i][j+2];
                    temp_sum+=arr[i+1][j+1];
                    temp_sum+=arr[i+2][j];
                    temp_sum+=arr[i+2][j+1];
                    temp_sum+=arr[i+2][j+2];
                    
                    if(temp_sum>sum)
                        sum=temp_sum;
                  }
            }
          }
            
        }
        
        System.out.println(sum);  
		*/
		/*
		 * 
		 * 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String binary=Integer.toBinaryString(n);
        int consecutive=0;
        int longest_consecutive=0;
        
        for(int i=0;i<binary.length();i++){
        	if(binary.charAt(i)=='1')
        		consecutive++;
        	else
        		if(longest_consecutive<consecutive){
        			longest_consecutive=consecutive;
        			consecutive=0;
        		}
        		else
        			consecutive=0;
        }
        if(consecutive>longest_consecutive)
        	System.out.print(consecutive);
        else
        	 System.out.print(longest_consecutive);
		
		*/
		
		
		/* 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(String.format("%1$d * %2$0100d = %3$d",n,i,n*i));
        }
*/
		
		/*

		long first=1;
		long second=2;
		long third=3;
		
		long smalest=first;
		long largest=first;
		
		long sum_smalest=0;
		long sum_largest=0;
		
		int ind_smallest=0;
		int ind_largest=0;
		
		
		Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
		
        if( (1 <= a && a <= Math.pow(10, 9)) && (1 <= b && b <= Math.pow(10, 9)) && (1 <= c && c <= Math.pow(10, 9)) && (1 <= d && d <= Math.pow(10, 9)) && (1 <= e && e <= Math.pow(10, 9))){
		long arr[]={
				a,b,c,d,e
		};
		
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smalest){
				smalest=arr[i];
				 ind_smallest=i;
			}
				
			if(arr[i]>largest){
				largest=arr[i];
				 ind_largest=i;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(i!=ind_smallest)
				sum_smalest+=arr[i];
			if(i!=ind_largest)
				sum_largest+=arr[i];
		}
		System.out.println(Long.toString(sum_largest)+" "+Long.toString(sum_smalest));
        }
        */
		/*
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>=1 && n<=300){
		System.out.println(n);

			int arr[]=new int[3];
			arr[0]=0;
			arr[1]=1;
			arr[2]=n-1;
			int count=0;
			print(arr);
			while(count!=3-1){
				int new_arr[]=new int[3];
				for(int j=0;j<3;j++){
					new_arr[(j+1)%3]=arr[j];
				}
				print(new_arr);
				count++;
				arr=new_arr;
			}
		}
*/
		/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
	         for(int a_i=0; a_i < n; a_i++){
	            b[(a_i+k)%n] = a[a_i];
	        }
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(b[m]);
        }
		*/
		/*
		Scanner in= new Scanner(System.in);
		String time=in.next();
		String temp=time.substring(time.length()-2);
		if(temp.equals("AM")){
			if(time.substring(0,2).equals("12")){
				System.out.print("00"+time.substring(2,8));
			}
			else
				System.out.print(time.substring(0,8));
		}
		
		if(temp.equals("PM")){
			if(time.substring(0,2).equals("12")){
				System.out.print("12"+time.substring(2,8));
			}
			else
				System.out.print(Integer.toString(12+Integer.parseInt(time.substring(0, 2)))+time.substring(2,8));
		}
		in.close();
		
		
		*/
		
		/*Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char arr[]=new char[n];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=' ';
		}
		
		for(int i=arr.length-1;i>=0;i--){
			arr[i]='#';
			
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
		
		in.close();
		}*/
		
		/*Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1){
	         ans = "Weird";
	      }
	      else{
	         // Complete the code
	          if((n>=2 && n<= 5) || n>=20)
	              ans="Not Weird";
	      }
	      System.out.println(ans);
		*/
		
		
		
		
		/*
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int zerosSum=0;
        int positivesSum=0;
        int negativeSum=0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0)
                zerosSum++;
            if(arr[arr_i]>0)
                positivesSum++;
            if(arr[arr_i]<0)
                 negativeSum++;
        }
        float zerosFraction=(float)zerosSum/n;
        float positivesFraction=(float)positivesSum/n;
        float negativeFraction=(float)negativeSum/(float)n;
        DecimalFormat test=new DecimalFormat("#0.000");
        
        System.out.println(Float.parseFloat(test.format(positivesFraction)));
        System.out.println(negativeFraction);
        System.out.println(zerosFraction);
		
		*/
		
		
		
		
	/*	
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip=(mealCost*tipPercent)/100;
        double tax=(mealCost*taxPercent)/100;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost+tip+tax);
      
        // Print your result
        System.out.print(totalCost);
		*/
		
		/*
        *  Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fDiagonal=0;
        int sDiagonal=0;

        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                
                if(a_i==a_j)
                {
                    fDiagonal+=a[a_i][a_j];
                    System.out.print("here1");
                }
                
                if(a_i+a_j==n-1)
                {
                    sDiagonal+=a[a_i][a_j];
                    System.out.print("here2");
                }
            }
           
        }
        System.out.print(Math.abs(fDiagonal-sDiagonal));
		*/
		
		
		/*
		Scanner sc=new Scanner(System.in);
        int size_FirstList=Integer.parseInt(sc.nextLine());
        List<String> first_List=Arrays.asList(sc.nextLine().split(" "));
        int size_SecondList=Integer.parseInt(sc.nextLine());
        List<String> second_List=Arrays.asList(sc.nextLine().split(" "));
        Set<Integer> set=new HashSet<Integer>();
        if(size_FirstList <= 1000010 && size_SecondList <= 1000010 && size_FirstList <= size_SecondList ) {
        for(int i=0 ; i<size_FirstList ; i++){
            if(Collections.frequency(first_List,first_List.get(i)) != Collections.frequency(second_List,first_List.get(i)))
            	set.add(Integer.parseInt(first_List.get(i)));
        }
        for(int j : set){
        	System.out.print(j);
        	System.out.print(" ");
        }
        
	}*/
        
        /*
         * Day zero
         *         // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
         */
        
        
        
        
}
}


