package com.wangdesen.dp;

import com.wangdesen.dp.command.AudioPlayer;
import com.wangdesen.dp.command.Command;
import com.wangdesen.dp.command.Keypad;
import com.wangdesen.dp.command.PlayCommand;
import com.wangdesen.dp.command.RewindCommand;
import com.wangdesen.dp.command.StopCommand;

/**
 * 命令模式测试类
 * */
public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//录音机(Invoker)
		AudioPlayer audioPlayer = new AudioPlayer();
		
		//播放-倒带-停止(Command depends on Receiver)
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		
		//键盘
		Keypad keypad = new Keypad();
		
		//绑定命令(Invoker depends on Command)
		keypad.setPlayCommand(playCommand);
		keypad.setRewindCommand(rewindCommand);
		keypad.setStopCommand(stopCommand);
		
		//测试开始
		keypad.play();
		keypad.stop();
		keypad.rewind();
		keypad.play();
		keypad.stop();
		
	}

}
