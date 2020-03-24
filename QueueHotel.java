import java.util.ArrayList;

/**
 * Implementation of the Hotel abstract class. Checks in and checks out Guests from the Hotel based on the Queue data structure.
 * Queues are based on the FIFO principle, which means the first Room inserted into the Hotel is the first Room
 * to be removed from the hotel. 
 *  @author Feras Salous
 *  @version 02-29-2020
 *  @version 03-22-2020
 */

public class QueueHotel<T> extends Hotel<T> {
   
	private int head; 
	private int tail;
	private static final int MAX_ROOMS_AVAILABLE = 10;
	/*
	 * TODO: Initialize the ArrayList
	 */
	ArrayList<Guest<T>> guests;
	private int numRooms;
	public QueueHotel(T hotelName) {
		//TODO: Initialize the variables above.
	}
	/**
	 * Determines if a guest is added to the QueueHotel. Check if there is enough capacity to add a new guest to the QueueHotel. 
	 * Remember for Queues, The new element to be inserted always goes at the end of the Queue.
	 * return true if the hotel can add the guest(i.e there must be space available in the hotel) otherwise return false.
	 */
	public int getTail() {
		return this.tail;
	}
	public int getHead() {
		return this.head;
	}
	
	@Override
	public boolean addGuest(Guest<T> guest) {
		//TODO

	}
	/**
	 * Retrieves number of guests currently still checked in the hotel
	 * @return the number of guests currently checked in the hotel.
	 */
	@Override
	public int numGuestsCheckedIn() {
		//TODO
	}

	/**
	 * Determines the next guest to be checked out of the hotel. 
	 * Recall for Queues this will be the first guest that has checked into the hotel.
	 * @return the next Guest to be checked out of the QueueHotel, if no guests are in the hotel return null.
	 */
	@Override
	public Guest<T> nextGuestToCheckOut() {
		//TODO
		
	}
	/**
	 * Checks out a guest from the QueueHotel. 
	 * For Queues this will be the first person that has checked into the hotel. 
	 * Keep in mind if a guest checks out of the hotel set the position of the in the QueueHotel of that guest as null, 
	 * due to the case we may want to add another guests later down the program.
	 * return the guest who has checked out, null if there are no guests to checkout.
	 * 
	 */
	@Override
	public Guest<T> checkOut() {
		//TODO
	}
}
