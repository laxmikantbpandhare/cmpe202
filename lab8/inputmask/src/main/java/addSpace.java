
public class addSpace implements IdecorateValue{

	//private String str="";
	@Override
	public String addValue(String string) {
		// TODO Auto-generated method stub
	StringBuilder str = new StringBuilder();

	int i = 0,j=0;
	while(j<string.length()){
	if(i==4){
		str.append(" ");
		i=0;
	}
	
	    str.append(string.charAt(j)) ;
	    i++;
	    j++;

	}
		return str.toString();
	}
}
