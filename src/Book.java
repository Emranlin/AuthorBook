public class Book {
    private String name;
    private Author author;
    private int price;
    private int qtyInStock = 0;

    Book (String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    Book (String name, Author author, int price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }


    public void setPrice(int price) {
        this.price = price;}
        public int getPrice() {
            return price;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public int getQtyInStock() {
        return this.qtyInStock;
    }

    public String toString() {
        String thebook = "'" + name + "'" + " by " + author.toString();
        return thebook;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public int getAuthorAge(){
        return author.getAge();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("qtyInStock = " + qtyInStock);

    }
}

