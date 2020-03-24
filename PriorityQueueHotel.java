import java.util.PriorityQueue;

/**
 * Welcome to the PriorityQueue Hotel. A PriorityQueue is used when the objects are supposed to be processed based on the priority.
 * We know a Queue follows the FIFO rule, but sometimes we may wish to reorder the elements according to a certain priority. 
 * In this class we will look into using the PriorityQueue to order Guests based on the room number they checked into using the 
 * compareTo method  implemented in the Guest class. The earliest date checked into the hotel will be the earliest date checked out.
 * That is the lowest room number in the PriorityQueue should be the fist one to check out.
 * 
 * Look into using the PriorirtyQueue library with many functions such as add, poll, etc... 
 * Here is the link: https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html
 * @author Feras Salous
 * @version 03-22-2020
 *
 */
public class PriorityQueueHotel<T> extends Hotel<T> {
	
	private PriorityQueue<Guest<T>> guestList;
	
	public PriorityQueueHotel(T hotelName) {
		super(hotelName);
		guestList = new PriorityQueue<Guest<T>>();
	}
	/**
	 * Add a Guest into the hotel. If the guest is added return true, otherwise return false.
	 */
	@Override
	public boolean addGuest(Guest<T> guest) {
		// TODO Auto-generated method stub
		return guestList.add(guest);
	}
	/**
	 * Retrieves the number of guests checked in to the hotel currently. 
	 * @return The number of guests checked into the hotel
	 * 
	 */
	@Override
	public int numGuestsCheckedIn() {
		// TODO Auto-generated method stub
		return guestList.size();
	}
	/**
	 * Retrieves the next guest to be checked out of the hotel.
	 * @return the next guest to be checked out.
	 */
	@Override
	public Guest<T> nextGuestToCheckOut() {
		// TODO Auto-generated method stub
		return guestList.peek();
	}
	/**
	 * Removes a Guest from the hotel.
	 * @return The guest who was checked out
	 */
	@Override
	public Guest<T> checkOut() {
		// TODO Auto-generated method stub
		return guestList.poll();
	}

}
