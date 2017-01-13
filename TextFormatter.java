public class TextFormatter{
	//private String line;
	private static String line;
	
	public static void main(String [] args){
		line = "aabaccb";
		System.out.println(countStrings("a"));
		System.out.println(countStrings("b"));
		System.out.println(countStrings("c"));
	}
	
	/*public TextFormatter(String lineToFormat){
		line = lineToFormat;
		return null;
	}*/
	
	/*private static int findString(String str, int start){
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
		}
		return -1;
	}*/
	
	/*private static int countStrings(String str){
		String character;
		String rchar;
		int finalcnt = 0;
		for(int i = 0; i < line.length(); i++){

			character = line.substring(i,i+1);
			if(i+2 > line.length()){
				rchar = "N/A";}
			else{
				rchar = line.substring(i+1, i+2);}
			
			if(character.equals(str) && !(rchar.equals(str))){
				finalcnt += 1;
			}
			
			if(character.equals(str) && rchar.equals(str)){
				i += 2;
			}
		}
		return finalcnt;
	}*/
	
	public static String convertItalics(){
		int count = 0;
		String character;
		String rchar;
		int finalcnt = 0;
		for(int i = 0; i < line.length(); i++){

			character = line.substring(i,i+1);
			if(i+2 > line.length()){
				rchar = "N/A";}
			else{
				rchar = line.substring(i+1, i+2);}
			
			if(character.equals(str) && !(rchar.equals(str))){
				finalcnt += 1;
			}
		for(int i = 0; i < line.length(); i++){
			if(character.equals("_")){
				if(rchar.equals("_")){
			
	}
}