package com.wangdesen.dp.command;

/**
 * ConcreteCommand(播放命令)
 * 
 * @author wangdesen
 * */
public class PlayCommand implements Command {

	private AudioPlayer audioPlayer;
	
	public PlayCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}
	
	@Override
	public void execute() {
		audioPlayer.play();
	}

}
