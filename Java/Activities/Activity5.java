package Activities;

public class Activity5 {

public static void main (String[] args)
{
    String title = "Horror book";
    Book newNovel = new MyBook();
    newNovel.setTitle(title);
    System.out.println("The tile of the book is : "+newNovel.getTitle());

}

}
