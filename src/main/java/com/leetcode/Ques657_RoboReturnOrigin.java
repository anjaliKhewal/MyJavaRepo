package com.leetcode;

public class Ques657_RoboReturnOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bol = judgeCircle("RLUD");
		
		System.out.println(bol);
		

	}
	
	  public static boolean judgeCircle(String moves) {
		  int L =0;
		  int R =0;
		  int U = 0;
		  int D = 0;
		  for(int i =0;i<moves.length();i++) {
			  
			 /* switch(moves.charAt(i)) {
			  case 'L':
				  L++;
				  break;
			  case 'R':
				  R++;
				  break;
			  case 'U':
				  U++;
				  break;
			  case 'D':
				  D++;
				  break;
			  }*/
			  
			  if(moves.charAt(i)=='L')
				  L++;
			  else if(moves.charAt(i)=='R')
				  R++;
			  else if(moves.charAt(i)=='U')
				  U++;
			  else if(moves.charAt(i)=='D')
				  D++;
		  }
		  System.out.println(L+" "+R+" "+U+" "+D);
		  if(L-R==0 && U-D==0)
	        return true;
		  
		  return false;
	    }

}
