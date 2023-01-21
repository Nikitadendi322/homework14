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
    }
}