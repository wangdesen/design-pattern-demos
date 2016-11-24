package com.wangdesen.dp.command;

/**
 * Invoker(键盘)
 * */
public class Keypad {

	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;
	
	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	/**
	 * 播放
	 * */
	public void play(){
		playCommand.execute();
	}
	
	/**
	 * 倒带
	 * */
	public void rewind(){
		rewindCommand.execute();
	}
	
	/**
	 * 停止
	 * */
	public void stop(){
		stopCommand.execute();
	}
}
