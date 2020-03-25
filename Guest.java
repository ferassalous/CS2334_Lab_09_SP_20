import java.time.LocalDateTime;

/**
 * Class representing a single Room. Rooms are added into the Hotel. The Room has two Characteristics, 
 * a Name which is the name of the person checking into the room and the time that they checked in.
 * The name is represented as a String, and the time checked in is represented as an int.
 * @author Feras Salous
 * @version 02-29-2020
 * @version 03-24-2020
 *
 */
public class Guest <T> implements Comparable<Guest<T>>{ 
	/**
	 * The name of the Guest checking in
	 */
	private T name;
	/**
	 * The time the Guest checked in
	 */
	private LocalDateTime timeCheckedIn;
	
	/**
	 * The room number of the Guest checking in
	 */
	private int roomNumber;

	public Guest() {
		
	} 
	public Guest(T name, LocalDateTime timeCheckedIn, int roomNumber) {
		//TODO: Initialize variables.
	}
	/*
	 * TODO: Generate getter for name
	 */
	
	public LocalDateTime getTimeCheckedIn() {
		
	}
	/*
	 * TODO: Format the toString
	 * Hint: Use StringBuilder to help in the formatting.
	 */
	/**
	 * The toString method for a Room.
	 * @return A string in the format
	 *"<name of person> In Room <roomNumber>\n"
	 */
	@Override
	public String toString() {
		//TODO
		
		
	}
	//TODO: Implement the compareTo method below
	/**
     * Comparison override. Comparison for Guests sorts the guests in order of when the guest
     * was checked in. You will be comparing the room number the guests checked in the hotel to determine there order.
     * 
     * @param other The other guest to compare this one to.
     * @return -1 if this guest room number is less the other guests room number
     *          0 if this guest room number is the same as the other guests room number
     *          1 if this guest guest room number is greater than the other guests room number
     *          */
	@Override
	public int compareTo(Guest<T> other) {
		//TODO
	}

}
