import java.io.InputStreamReader;
import java.io.IOException;

class Bubblesort {

	/**
	* @throws IOException
	*/
	public static void main(String[] args) {
		try{
			InputStreamReader stdin = new InputStreamReader(System.in);
			int in = 0;
			while( (in = stdin.read()) != -1) {
				System.out.println(in);
			}
			
			stdin.close();
		}catch(Exception e){
		}
	}
}
