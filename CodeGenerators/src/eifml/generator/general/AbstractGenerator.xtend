package eifml.generator.general

abstract class AbstractGenerator<T> {
	
	protected abstract def String fileName(T it);

	protected abstract def String folderName(T it);
	
	protected def String qualifiedName(T it) {

		return folderName + fileName
	}

}
