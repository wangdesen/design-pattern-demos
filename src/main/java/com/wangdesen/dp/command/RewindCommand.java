package com.wangdesen.dp.command;

/**
 * ConcreteCommand(倒带命令)
 * 
 * @author wangdesen
 * */
public class RewindCommand implements Command {

	private AudioPlayer audioPlayer;
	
	public RewindCommand(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.rewind();
	}

}
