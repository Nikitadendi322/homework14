import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Author michaelBulgakov = new Author("Michael", "Bulgakov");
        Author joshuaBlock = new Author("Joshua","Block");

        Book firstBook = new Book("dog's heart", michaelBulgakov, 1925);

        System.out.println(joshuaBlock.equals(firstBook));
        System.out.println(firstBook.getBookName()+" " +firstBook.getPublishyear()+" "+ firstBook.getAuthor().getName()+" "+firstBook.getAuthor().getSurname());

        System.out.println(firstBook);
        Book secondBook=new Book("Effective java", new Author("Joshua","Block","2015"));
        firstBook.setPublishyear(2020);
        System.out.println(firstBook.getPublishyear());

        System.out.println("Author");
        Author michaelBulgakov=new Author("michael","bulgakov");
        Author joshuaBlock=new Author("joshua","Block");
        Author levTolsoy= new Author("lev","tolstoy");
        System.out.println("Author copies equal: "+ michaelBulgakov.equals(joshuaBlock));
        System.out.println("Author copies equal by hashCode: "+ (michaelBulgakov.hashCode() == joshuaBlock.hashCode()));
        System.out.println("Author equal: "+michaelBulgakov.equals(levTolsoy));
        System.out.println("Author copies equal by hashCode:"+(michaelBulgakov.hashCode()==levTolsoy.hashCode()));

        System.out.println(michaelBulgakov);
        System.out.println(levTolsoy);
        System.out.println();
    }

}