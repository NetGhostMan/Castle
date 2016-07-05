package Castle.Main;

import java.util.Scanner;

import Castle.ActionListener.ActionListener;
import Castle.Exception.GameException;
import Castle.Room.Room;
import Castle.level.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room fst = new Room("第一关");
		
		// 初始化游戏；
		initGame();
		//执行游戏
		System.out.println("欢迎来到"+fst);
		fst.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed() {
				// TODO Auto-generated method stub
				test TEST = new test();
				String str = "huzhixiang";
				try {
					TEST.isYes(str);
				} catch (GameException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		gameOver();
	}

	// 游戏结束
	private static void gameOver() {
		// TODO Auto-generated method stub
		System.out.println("恭喜过关！游戏结束！");
	}

	// 初始化游戏
	private static void initGame() {
		// TODO Auto-generated method stub
		System.out.println("大家好！欢迎来玩改版后的城堡游戏\n在这里，你必须闯过每一关才能获得最后的胜利！\n输入‘go’开始游戏");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		while (!str.equals("go")) {
			System.out.println("请输入‘go’开始游戏");
			str = in.next();
		}
		in.close();
		gameGo();
	}

	// 游戏开始
	// 准备写个倒数,用for太快，谁会用时钟写呢？
	private static void gameGo() {
		// TODO Auto-generated method stub
		System.out.println("游戏开始！");
	}
}
