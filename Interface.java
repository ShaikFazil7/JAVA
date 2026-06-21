interface Movie
{
    void Fight();
    void Comedy();
}
public class Interface implements Movie
{
    public void Fight()
    {
        System.out.println("KGF");
    }
    public void Comedy()
    {
        System.out.println("Padma");
    }
    public static void main(String[] args) {
        Interface I= new Interface();
        I.Fight();
        I.Comedy();
    }
}