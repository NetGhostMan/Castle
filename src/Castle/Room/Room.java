package Castle.Room;

//这是房间的类。其实可以看做是关卡的房间。
public class Room {
	public String description;
//    public Room northExit;
//    public Room southExit;
//    public Room eastExit;
//    public Room westExit;
	//由于是关卡，所以就不设置4个出口了，只有出口和入口
	public Room exit;
	public Room entry;
    

    public Room(String description) 
    {
        this.description = description;
    }

//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }
    //所以也不用设置出口的位置了。
    

    @Override
    public String toString()
    {
        return description;
    }
}
