/**
 * 
 */
package com.ofg.springbootsandbox.model;

/**
 * @author herb.chan
 *
 */
public class Song {
	
	private String title;
	private String artist;
	private int duration;
	
	
	/**
	 * @param title
	 * @param artist
	 * @param duration
	 */
	public Song(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}


	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}


	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String formattedDuration() {
		Integer minutes = duration / 60;
		Integer seconds = duration % 60;
		return minutes.toString() + "m " + seconds.toString() + "s";
	}

}
