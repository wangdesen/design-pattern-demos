package com.wangdesen.dp.command;

/**
 * ConcreteCommand(停止命令)
 * 
 * @author wangdesen
 * */
public class StopCommand implements Command {

	private AudioPlayer audioPlayer;
	
	public StopCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.stop();
	}

}
