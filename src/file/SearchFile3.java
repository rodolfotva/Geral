package file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public final class SearchFile3 extends SimpleFileVisitor<Path> {

	/**
	 * visita diretorios apenas, inclusive o mesmo
	 */
	public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes bfa) throws IOException {
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
}
