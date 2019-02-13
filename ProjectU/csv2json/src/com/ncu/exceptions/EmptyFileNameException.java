package com.ncu.exceptions;
public class EmptyFileNameException extends Exception{
	public EmptyFileNameException(String s)
	{
		super(s);
	}
}
class MissingExtensionException extends Exception{
	MissingExtensionException(String s)
	{
		super(s);
	}
}
class InvalidExtensionException extends Exception{
	InvalidExtensionException(String s)
	{
        super(s);
	}

}
class FileNameLengthException extends Exception{
	FileNameLengthException(String s)
	{
		super(s);
	}
}
class SpecialCharacterException extends Exception{
	SpecialCharacterException(String s)
	{
		super(s);
	}
}
class FileNotAvailableException extends Exception{
	FileNotAvailableException(String s)
	{
		super(s);
	}
}
class FileAlreadyExistsException extends Exception{
	FileAlreadyExistsException(String s)
	{
		super(s);
	}
}
