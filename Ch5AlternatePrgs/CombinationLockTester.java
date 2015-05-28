public class CombinationLockTester
{
	public static void main(String[] args)
	{
			CombinationLock theLock = new CombinationLock("ABC");
			
			theLock.setPosition("A");
			theLock.unlock();
			System.out.println(theLock.isOpen());
			
			theLock.setPosition("A");
			theLock.unlock();
			System.out.println(theLock.isOpen());
			
			theLock.setPosition("B");
			theLock.unlock();
			System.out.println(theLock.isOpen());
			
			theLock.setPosition("C");
			theLock.unlock();
			System.out.println(theLock.isOpen());
			
			theLock.lock();
			System.out.println(theLock.isOpen());
			
			theLock.unlock();
			System.out.println(theLock.isOpen());
			
			theLock.setPosition("A");			
			theLock.setPosition("B");			
			theLock.setPosition("C");
			theLock.unlock();
			System.out.println(theLock.isOpen());
	}
}