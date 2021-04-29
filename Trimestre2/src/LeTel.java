import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeTel {
	public static String LeTeclado() throws IOException{
		String dado;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		dado = stdin.readLine();		
		return dado;
	}
}
