package OopsPrograms;

abstract class Book1{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class BookTitle extends Book1{

	@Override
	void setTitle(String s) {
//		System.out.println("The title is : "+s);
		title = s;
	}
	
}


public class ExampleAbstract {

	public static void main(String[] args) {

		BookTitle bt = new BookTitle();
		bt.setTitle("A tale of two cities");
		System.out.println("The title is : "+bt.getTitle());
	}

}
