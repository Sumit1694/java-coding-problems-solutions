package Others;

class ProductOutOfStockException extends RuntimeException
{
	ProductOutOfStockException(String message)
	{
		super(message);
	}
}

public class ProductStockChecker {

	public static void main(String[] args) {

		int stock = 10;
		int buy = 15;

		try {
			if(buy>stock)
			{
				throw new ProductOutOfStockException("ProductOutOfStockException: Requested quantity not available");
			}
			else
			{
				System.out.println("Purchase successful: ");
			}
		}catch(RuntimeException e)
		{
		   System.out.println(e.getMessage());
		}
	}
}
