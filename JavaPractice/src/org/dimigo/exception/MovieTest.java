/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *	 	|_ MovieTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class MovieTest {

	public static void main(String[] args) {
		
//		try {
			Movie[] movies = { new Movie("앤트맨", 12), new Movie("사도", 12),
					new Movie("베테랑", 15)};
			int age = 13;
			
			for(Movie movie : movies)
				try {
					buyTicket(movie, age);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}

	}
	
	public static void buyTicket(Movie movie, int age) throws Exception {
		if(movie.getLimitAge() > age) 
			throw new AgeCheckException(movie);
		else
			System.out.println(movie.getTitle() + " 영화 즐감하세용~~");
	}

}
