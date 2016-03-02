package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import file.SearchFile;
import file.SearchFile2;
import file.SearchFile3;

public class MainFiles {

	public static void main(String... args) {
		try {
			Path pat1 = Paths.get("C:\\RodolfoTVA\\Temp");
			Path pat2 = Paths.get("C:\\RodolfoTVA\\Temp\\teste.txt");
			Path pat3 = Paths.get("C:\\RodolfoTVA\\Temp\\teste.txt");
			Path pat4 = Paths.get("C:\\RodolfoTVA\\Temp\\teste.txt");
			Path pat5 = Paths.get("C:\\RodolfoTVA\\Temp\\teste");
			Path pat6 = Paths.get("C:\\RodolfoTVA\\Temp\\teste\\rodolfo");
			Path pat7 = Paths.get("R:\\RodolfoTVA\\Temp");
			Path pat8 = Paths.get("C:\\RodolfoTVA\\Temp\\..\\..\\teste");
			Path pat9 = Paths.get("C:\\RodolfoTVA\\.\\..\\teste");

			// buscando arquivos png usando glob
			FileVisitor<Path> fv = new SearchFile();
			Files.walkFileTree(pat1, fv);

			System.out.println("");

			// buscando apenas arquivos
			FileVisitor<Path> fv2 = new SearchFile2();
			Files.walkFileTree(pat5, fv2);

			System.out.println("");

			// apenas diretorios
			FileVisitor<Path> fv3 = new SearchFile3();
			Files.walkFileTree(pat6, fv3);

			System.out.println("");

			// nao cria arquivo nao sei porque
			System.out.println(pat2.toString());
			File file = new File(pat2.toString());
			System.out.println(file.createNewFile());

			System.out.println("");

			// verifica se sao mesmos arquivos
			System.out.println(Files.isSameFile(pat2, pat3));

			System.out.println("");

			// Retorna os atributos do arquivo
			Map mapa = new HashMap<String, Object>();
			mapa = Files.readAttributes(pat4, "*");
			System.out.println(mapa);

			System.out.println("");

			// pegando root do caminho ou parte deles, divide pelas barras
			System.out.println(pat6.getRoot().toString());
			System.out.println(pat6.subpath(0, 3));
			// System.out.println(pat6.subpath(0, 5)); IllegalArgumentException

			System.out.println("");

			// junta os caminhos, praticamente uma concatenacao
			Path patTest = Paths.get(pat5.subpath(0, 3).toString(), pat6.subpath(0, 2).toString());
			System.out.println(patTest.toString());
			patTest = Paths.get(pat7.getRoot().toString(), pat6.subpath(0, 2).toString());
			System.out.println(patTest.toString());

			System.out.println("");

			// normalize, ajusta os pontos e dois pontos do caminho
			System.out.println(pat8.normalize().toString());
			System.out.println(pat9.normalize().toString());

			System.out.println("");

			// normalize, ajusta os pontos e dois pontos do caminho
			System.out.println(pat2.resolve(pat7));

			System.out.println("");

			// analisa as diferencas, se nao houver printa, se o root for diferente da exception
			//aqui teste/rodolfotva tem a mais no 6
			// como sair do 1 pra chegar no proximo
			System.out.println(pat1.relativize(pat6));
			//aqui manda voltar 2
			System.out.println(pat6.relativize(pat1));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
