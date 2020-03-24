import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class represents a Hotel. This class is abstract due to the fact of how
 * we are implementing the stacks and queues. Here we will provide a blueprint
 * for our StackHotel and QueueHotel to implement. The order in which Rooms are
 * added into the hotel will also depend on how the StackHotel and QueueHotel
 * implement the abstract methods in this class.
 * 
 * @author Feras Salous
 * @version 02-29-2020
 * @version 03-24-2020
 *
 */
public abstract class Hotel <T>{

	/**
	 * The name of the hotel
	 */
	private T hotelName;

	public static final DateTimeFormatter FORMAT_HOTEL_TIME = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mma");

	protected Hotel(T hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * Adds a new guest to the hotel The guest will remain in our hotel until
	 * checkOut() is completed.
	 * 
	 * @param guest
	 * @return true if the guest is added, false otherwise.
	 */
	public abstract boolean addGuest(Guest<T> guest);

	/**
	 * Determines the number of guests that have been added to the hotel but have
	 * yet to checkout.
	 * 
	 * @return The number of guests currently in the hotel that have not checked out
	 *         yet
	 */
	public abstract int numGuestsCheckedIn();

	/**
	 * Determines the next guests to check out of the hotel. The StackHotel and the
	 * QueueHotel will provide these implementations. What this means is that the
	 * StackHotel will return the last guest to be inserted into hotel and the
	 * QueueHotel will return the first guest inserted into the hotel.
	 * 
	 * 
	 * @return the next room to be checked out.
	 */
	public abstract Guest<T> nextGuestToCheckOut();

	/**
	 * Checks out a guest from the hotel while also updating the StackHotel and
	 * QueueHotel data structures appropriately. Everytime a guest is checked out
	 * from the hotel increment the date they checked in by ONE day.
	 * 
	 * @return the room which is being checked out
	 */
	public abstract Guest<T> checkOut();

	/**
	 * Checks out the person from the hotel and calculates the time the person
	 * stayed in the hotel.
	 * 
	 * @param timeStayed the time the person stayed in the hotel
	 * @return A string in the format: "Hotel Name: <hotelName>\n" "Guest Checking
	 *         out: room.toString()" "Length of Stay: <Number of days at the hotel>
	 *         "Checked In: timeCheckedIn Checked Out: timeCheckedOut"
	 * 
	 *         IF there are no rooms in the hotel return a String in the format "No
	 *         rooms are currently taken at the <hotelName>"
	 */
	public String checkOut(LocalDateTime timeCheckedOut) {
		//TODO: Get the guest checking out
		Guest<T> guestCheckedOut = checkOut();
		StringBuilder sb = new StringBuilder();

		if (guestCheckedOut == null) {
			sb.append("No rooms are currently taken at the " + this.hotelName.toString());
			return sb.toString();
		}
		// TODO: Get the time the Guest checked in
		LocalDateTime timeCheckedIn = guestCheckedOut.getTimeCheckedIn();

		/*
		 * TODO: Format the time checked in using the DateTimeFormatter defined above:
		 * The reason we will be doing this is because LocalDateTime is configured to be 
		 * represented in a format as such 2016-11-09T11:44:44.797, but we would like it to be
		 * formatted as such: mm/DD/yyyy h:mma.  
		 */
		String formattedTimeCheckedIn = timeCheckedIn.format(FORMAT_HOTEL_TIME);

		//TODO: Format the time checked out from the hotel.
		String formattedTimeCheckedOut = timeCheckedOut.format(FORMAT_HOTEL_TIME);

		/* 
		* TODO: Calculate the total time stayed at the hotel
		* Take a look here for you may be able to compute Durations between LocalDateTime objects.: 
		* https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html 
		*
		*/
		Duration durationOfStay = Duration.between(timeCheckedIn, timeCheckedOut);
		
		/*
		 * DO NOT TOUCH THIS PLEASE. 
		 */
		sb.append("Hotel Name: " + this.hotelName + "\n");
		sb.append("Guest Checking Out: " + guestCheckedOut.toString() + "\n");
		sb.append("Length of Stay: ");
		if (durationOfStay.toDays() == 1) {
			sb.append(durationOfStay.toDays() + " Day" + "\n");
		} else {
			sb.append(durationOfStay.toDays() + " Days" + "\n");
		}
		sb.append("Checked In: " + formattedTimeCheckedIn + " Checked Out: " + formattedTimeCheckedOut);

		return sb.toString();
	}

}
