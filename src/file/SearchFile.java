package file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchFile extends SimpleFileVisitor<Path> {
	
	/**
	 * busca apenas em arquivos
	 */
	public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException {
		PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.png");
		if(pm.matches(file.getFileName())){
			System.out.println(file);
		}
		return FileVisitResult.CONTINUE;
	}
}
