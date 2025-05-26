package com.yedam.app.di;

public class SamsungTV implements TV {
	
	private Speaker speaker;// NullPointerError new // property name
	
	public SamsungTV() {
		System.out.println("===> SamsungTV");
	}
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}


	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
