/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *	 	|_ Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class Music {
	
	private String title;
	private String singer;

	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

}
