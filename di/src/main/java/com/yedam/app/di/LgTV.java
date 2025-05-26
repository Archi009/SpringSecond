package com.yedam.app.di;

public class LgTV implements TV {

	private Speaker speaker;
	
	
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public LgTV() {
        System.out.println("===> LgTV");
    }

    public void powerOn() {
        System.out.println("LgTV powerOn.");
    }
    public void powerOff() {
        System.out.println("LgTV powerOff.");
    }
    public void volumeUp() {
    	speaker.volumeUp();
    }
    public void volumeDown() {
    	speaker.volumeDown();
    }
}
