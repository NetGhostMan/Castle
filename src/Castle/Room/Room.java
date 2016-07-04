package Castle.Room;

import Castle.ActionListener.ActionListener;

//这是房间的类。其实可以看做是关卡的房间。
public class Room {
	public String description;

	public Room(String description) {
		this.description = description;
	}

	//实现了监听的控制反转过程。
	public void addActionListener(ActionListener actionListener) {
		actionListener.actionPerformed();
	}

	@Override
	public String toString() {
		return description;
	}
}
