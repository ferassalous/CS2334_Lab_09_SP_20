import java.util.ArrayList;

/**
 * Implementation of the Hotel abstract class. Checks in and checks out Guests from the Hotel based on the Stack data structure.
 * Stacks are based on the LIFO principle, which means the last Room inserted into the Hotel is the first Room
 * to be removed from the hotel. 
 *  @author Feras Salous
 *  @version 02-29-2020
 *  @version 03-22-2020
 */
public class StackHotel<T> extends Hotel<T> {
   /*
    * TODO:Initialize the ArrayList
    */
	private ArrayList<Guest<T>> guests;
	private static final int MAX_ROOMS_AVAILABLE = 10;
	
	private int topOfStack;
	
	public StackHotel(T hotelName) {
		
		topOfStack = 0;
		
	}
	
	public int getTopOfStack() {
		return this.topOfStack;
	}
	/**
	 * Adds a guest into our hotel. If we reach the maximum available rooms in the hotel, which is a defined constant return false
	 * If we have space available for the guest, add them into the hotel, increase the capacity, and return true.
	 * @return true if we are able to add the guest, false otherwise.
	 */
	@Override
	public boolean addGuest(Guest<T> guest) {
		//TODO
	}
	/**
	 * Retrives the number of guests currently checked into our hotel 
	 * @return the number of guests currently checked in
	 * 
	 */
	@Override
	public int numGuestsCheckedIn() {
		//TODO
		
	}
	/**
	 * Retrieves the next guest to be checked out of the StackHotel data structure. 
	 * For stacks the last element to be inserted into the stack is the first element to be removed. 
	 * In our case that means the last person to be checked into the hotel is the first one that will be checked
	 * out, upon the call of the checkout method. 
	 */
	@Override
	public Guest<T> nextGuestToCheckOut() {
		//TODO
	
	}
	/**
	 * Checks out a guest from the hotel.
	 */
	@Override
	public Guest<T> checkOut() {
		//TODO
	}

	

}
