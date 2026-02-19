package startingpratices;

public class BuffereBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(sb);
		StringBuilder sbs=new StringBuilder("Hii");
		System.out.println(sbs);
		
		//insert method, insert a new value based on index position

		System.out.println(sb.insert(1, "One"));
		System.out.println(sb.insert(0, "Zero"));
		
		//append , to add new string in the end
		System.out.println(sb.append(" apending new line"));
		
		//Replace - to replace anew string based on index value(starting and ending position)
		System.out.println(sb.replace(20, 30, " Replaced Value"));
		
		//Delete- based on start and end index position
		System.out.println(sb.delete(20,30));
		
		//Reverse - to reverse the string
		System.out.println(sb.reverse());
	}

}

