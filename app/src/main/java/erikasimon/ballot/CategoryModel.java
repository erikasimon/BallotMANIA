package erikasimon.ballot;

public class CategoryModel {
    private String CategoryName;
    private int CategoryID;
    private String CategoryWinner;

    public CategoryModel(String name, int id, String winner)
    {
        CategoryName = name;
        CategoryID = id;
        CategoryWinner = winner;
    }

    public String getCategoryName()
    {
        return CategoryName;
    }

    public int getCategoryID()
    {
        return CategoryID;
    }

    public String getCategoryWinner()
    {
        return CategoryWinner;
    }
}
