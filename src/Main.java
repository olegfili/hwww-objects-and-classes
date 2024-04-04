public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author(" Лев " , "Толстой");
        Author dostoevsky = new Author(" Фёдор ", "Достаевский");
        Book warAndPeace = new Book ("Война и Мир", tolstoy , 1867);
        Book brothersKaramazov  = new Book ("Братья Карамазовы" , dostoevsky , 1880);
        warAndPeace.setPublicationYear(1900);
        System.out.println("Название книги: " + warAndPeace.getBookName()+ ". Автор: " + warAndPeace.getAuthor().getFirstName() + warAndPeace.getAuthor().getLastName() + ". Год издания: " + warAndPeace.getPublicationYear());
        System.out.println("Название книги: "  + brothersKaramazov.getBookName() + ". Автор: " + brothersKaramazov.getAuthor().getFirstName() + brothersKaramazov.getAuthor().getLastName()+ ". Год издания: " + brothersKaramazov.getPublicationYear() );

    }
}