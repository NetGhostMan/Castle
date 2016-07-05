package Castle.level;

import Castle.Exception.GameException;

public class test {
	public void isYes(String str) throws GameException{
		if (str.equals("huzhiqiang")){
			System.out.println("答对了！");
		}else{
			throw new GameException();
		}
	}
}
