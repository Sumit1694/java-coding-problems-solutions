package Others;

class InvalidFileSizeException extends Exception
{
	InvalidFileSizeException(String message)
	{
		super(message);
	}
}

public class FileSizeChecker {

	public static void main(String[] args) throws InvalidFileSizeException {

          int fileSize = 7;

          fileSizeValidator(fileSize);
          System.out.println("file uploaded");
	}

	static void fileSizeValidator(int fileSize) throws InvalidFileSizeException
	{
		if(fileSize<0 || fileSize>5)
		{
			throw new InvalidFileSizeException("InvalidFileSizeException: Maximum upload size is 5MB");
		}
	}

}