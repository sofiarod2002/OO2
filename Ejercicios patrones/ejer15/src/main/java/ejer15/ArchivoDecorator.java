package ejer15;

public  class ArchivoDecorator extends FileManager{
private FileManager file;

public ArchivoDecorator(FileManager file) {
	this.file = file;
}

public String prettyprint() {
	return file.prettyprint();
}

public FileManager getFile() {
	return file;
}


	
}
