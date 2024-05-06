package code.library.var2;

public class BookService {

    UserInput ui = new UserInput();

    public Book createBook(){

       String author = ui.inputText("Введите автора: ");
       String description = ui.inputText("Введите описание автора: ");

       Author bookAuthor = new Author(author, description);


       String bookName = ui.inputText("Введите название книги: ");
       int pages = ui.inputInt("Введите количество страниц: ");
       String catalogNumber = ui.inputText("Введите номер по каталогу: ");

       Book newBook = new Book(bookName,bookAuthor,pages,catalogNumber);

       return newBook;
    }


    public Book[] createLibrary(){
        int totalBooks = ui.inputInt("Введите общее количество книг: ");

        Book[] books = new Book[totalBooks];

        for (int i = 0; i < totalBooks; i++) {
            books[i] = createBook();
        }

        return books;
    }


}
