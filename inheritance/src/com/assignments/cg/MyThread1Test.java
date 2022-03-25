package com.assignments.cg;

public class MyThread1Test {
	public static void main(String[] args) {
		MyThread1 downloader = new MyThread1("whatsapp");
		MyThread1 player = new MyThread1("youtube");
		MyThread1 backup = new MyThread1("my thread");
		MyThread1 installer = new MyThread1("game");

		downloader.go();
		player.go();
		backup.go();
		installer.go();

}
}
