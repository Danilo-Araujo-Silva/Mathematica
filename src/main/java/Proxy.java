import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proxy {

	public static void main(String args[]) throws Throwable {
		Process process = new ProcessBuilder("../mathematica/proxy.m", args[0]).start();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String lineSeparator = System.getProperty("line.separator");

		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(lineSeparator);
		}

		System.out.print(stringBuilder.toString());
	}
}