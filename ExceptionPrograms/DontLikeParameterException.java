import java.lang.Exception;

public class DontLikeParameterException extends Exception
{
	public DontLikeParameterException()
	{
	}
	
	public DontLikeParameterException(String reason)
	{
		super(reason);
	}
}