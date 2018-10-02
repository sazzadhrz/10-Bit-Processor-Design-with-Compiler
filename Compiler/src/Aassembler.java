import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Aassembler {
	public static void main(String[] args) throws IOException {

		Map<String, String> map = new HashMap<String, String>();

		map.put("LW", "000");
		map.put("SW", "001");
		map.put("ADD", "010");
		map.put("SUB", "011");
		map.put("MUL", "100");
		map.put("DIV", "101");
		map.put("ADDI", "110");

		map.put("R0", "00");
		map.put("R1", "01");
		map.put("R2", "10");
		map.put("R3", "11");

		String strLine = "";
		String str_data = "";
		String op, rs, rt, rd, line, hexStr, hex;
		int decimal;
//		 String result = null;

		// BufferedReader br = new BufferedReader(new
		// FileReader("C:\\Users\\DELL\\Desktop\\text.txt"));
		
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		while (strLine != null) {
			if (strLine == null)
				break;
			str_data += strLine;
			strLine = br.readLine();

		}
		// System.out.println(str_data);
		br.close();

		// Write File
		// File outFile = new File("C:\\Users\\DELL\\Desktop\\Machine
		// Code.txt");
		File outFile = new File("Machine Code.txt");
		File hexFile = new File("Hex Code.txt");

		/*
		 * // Create the file if (file.createNewFile()) {
		 * System.out.println("File is created!"); } else {
		 * System.out.println("File already exists."); }
		 */

		// Write Content

		BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
		BufferedWriter wr = new BufferedWriter(new FileWriter(hexFile));
		// writer.write(result);

		String str_dataM = str_data.replaceAll("[\\W]", " ");
		// System.out.println(str_data);

		StringTokenizer st = new StringTokenizer(str_dataM.toUpperCase());
		while (st.hasMoreTokens()) {
			// System.out.println(st.nextToken());

			switch (st.nextToken()) {
			case "LW":
				// System.out.println("hoiitese");

				op = "LW";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = "000";

				line = map.get(op) + map.get(rd) + map.get(rs) + rt;
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();
				

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			case "SW":
				// System.out.println("hoiitese");

				op = "SW";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = "000";

				line = map.get(op) + map.get(rd) + map.get(rs) + rt;
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();
				

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			case "ADD":
				// System.out.println("hoiitese");

				op = "ADD";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = st.nextToken();

				line = map.get(op) + map.get(rd) + map.get(rs) + map.get(rt) + "0";
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			case "SUB":
				// System.out.println("hoiitese");

				op = "SUB";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = st.nextToken();

				line = map.get(op) + map.get(rd) + map.get(rs) + map.get(rt) + "0";
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			case "MUL":
				// System.out.println("hoiitese");

				op = "MUL";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = st.nextToken();

				line = map.get(op) + map.get(rd) + map.get(rs) + map.get(rt) + "0";
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			case "DIV":
				// System.out.println("hoiitese");

				op = "DIV";
				rd = st.nextToken();
				rs = st.nextToken();
				rt = st.nextToken();

				line = map.get(op) + map.get(rd) + map.get(rs) + map.get(rt) + "0";
				// result = result + "\n" + line;
				
				decimal = Integer.parseInt(line,2);
				hexStr = Integer.toString(decimal,16);
				hex = String.format("%3s", hexStr).replace(' ', '0');
				System.out.println(hex);
				wr.write(hex);
				wr.newLine();

				writer.write(line);
				writer.newLine();

				System.out.println(line);
				System.out.println();
				break;

			default:
				break;

			}

		}

		// System.out.println(result);

		writer.close();
		wr.close();

	}

}
