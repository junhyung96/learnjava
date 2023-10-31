package javaStudy;

public interface TV {
	// 인터페이스는 이런 기능이 있다라는 것만 알려주고 실제 기능 구현은 하지 않음
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	// 추상 메서드와 비슷함
	public void turnOn(); 
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
}
