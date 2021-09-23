/**
 * 
 */

package trustly;

import trustly.models.Person;

/**
 * @author wesll
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var pessoa = new Person(25, "Weslley Felipe Brandt dos Santos", "Brazillian", "travel as many countries as possible!");
		System.out.println(pessoa.toString());
	}

}
