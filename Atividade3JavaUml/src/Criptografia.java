import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Criptografia {

	static StringBuilder sb = new StringBuilder();

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		String palavra;
		String arquivo = "D:\\mensagemCodificada.txt";

		System.out.println("Digite a senha q deseja criptografar:");
		palavra = read.nextLine();

		for (int i = 0; i < palavra.length(); i++) {
			setChar(i + 1, palavra.charAt(i));
		}

		gravar(arquivo);
		sb = new StringBuilder();
		ler(arquivo);

	}

	static void setChar(int ascII, char letra) {

		int letraCriptografada = ascII + (int) letra;
		sb.append((char) letraCriptografada);

	}

	static void gravar(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(sb.toString());
		buffWrite.close();

		System.out.println("Arquivo gravado com sucesso ----> " + path);
	}

	static void ler(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String palavraCriptografada = buffRead.readLine();
		buffRead.close();
		int j = 1;

		for (int i = 0; i < palavraCriptografada.length(); i++) {
			setChar(i - j, palavraCriptografada.charAt(i));
			j = j + 2;
		}

		String arquivo = "D:\\mesagemDecodificada.txt";
		gravar(arquivo);

	}

}
