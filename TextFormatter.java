public class TextFormatter{
	//private String line;
	private static String line;
	
	public static void main(String [] args){
		line = "aabaccb";
		System.out.println(findString("a",0));
		System.out.println(findString("b",4));
		System.out.println(findString("c",0));
	}
	
	/*public TextFormatter(String lineToFormat){
		line = lineToFormat;
		return null;
	}*/
	
	private static int findString(String str, int start){
		String character;
		String rchar;
		String lchar;
		for(int i = start; i < line.length(); i++){
		
			character = line.substring(i,i+1);
			if(i+2 > line.length()){
				rchar = "N/A";}
			else{
				rchar = line.substring(i+1, i+2);}
			if(i == 0){
				lchar = "N/A";}
			else{
				lchar = line.substring(i-1, i);}
			
			if(character.equals(str) && !(rchar.equals(str)) && !(lchar.equals(str))){
					return i;
			}
			/*System.out.println("char = " + character);
			System.out.println("lchar = " + lchar);
			System.out.println("rchar = " + rchar);*/
		}
		return -1;
	}
	
	/*private int countStrings(String str){
	return 0;
	}
	
	public String convertItalics(){
	return null;
	}*/
}