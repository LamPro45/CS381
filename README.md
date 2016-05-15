# CS381
///////
public double arrcs(){
	String arrc="";
	String endcal="";
	


	while(i<s.length()){
		if(s.charAt(i)=='('){
		
			i++;
			while(s.charAt(i)!=')'&&(i<s.length())){
				arrc+=String.format(s.charAt(i)+"");
				i++;
			}
			endcal+=String.format(cal(arrc)+"");
			if(s.charAt(i)==')'&&(i<s.length()-1)){
				endcal+=s.substring(i, s.length());
				i++;
				break;
				
			}
		}
		else if(s.charAt(i)!='('){
			endcal+=String.format(s.charAt(i)+"");
			i++;
		}
		else if (s.contains("s")||s.contains("c")||s.contains("t"))
		{
			endcal+=String.format(scien()+"");
			
		}
		
	}
	
