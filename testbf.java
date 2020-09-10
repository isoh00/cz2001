import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class testbf {
	public static void main(String[] args)
	{
		String data = "";
		try
		{	// extract a txt file as a variable, file has to be in the same directory
			data = new String(Files.readAllBytes(Paths.get("GCF_000195955.2_ASM19595v2_genomic.fna"))); 		}
		catch (IOException e) {
		      e.printStackTrace();
		    }
		System.out.println("Brute Force");
		BruteForce.Brute("CGTTAT",data);
		System.out.println();
		System.out.println("KMP");
		KMP.search("CGTTAT", data);
		return;
	}
}

