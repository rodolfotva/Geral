package file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public final class SearchFile2 extends SimpleFileVisitor<Path> {

	int x = 0;
	
	/**
	 * visita apenas arquivos
	 */
	public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException {
		
		if(x%2 == 0){
			System.out.println(file+" ");
		} else {
			System.out.println(file);
		}
		return FileVisitResult.CONTINUE;
	}
}
