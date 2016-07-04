package Castle.Room;

//这是房间的类。其实可以看做是关卡的房间。
public class Room {
	public String description;

	public Room exit;
	public Room entry;

	public Room(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
}
