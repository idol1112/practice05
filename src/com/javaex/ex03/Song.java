package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(파라미터0개)");
	}
	
	public Song(String title, String artist, String album, String composer) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		System.out.println("Song(파라미터4개)");
	}//테스트로 넣어봤음
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer);
		this.year = year;
		this.track = track;
		System.out.println("Song(파라미터6개)");
		//this()괄호에 4개 파라미터가있는 생성자도 호출이 된다.
	}
	
	
	
	
	
}



