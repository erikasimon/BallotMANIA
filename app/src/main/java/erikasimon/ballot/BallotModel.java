package erikasimon.ballot;

/**
 * Created by Erika on 4/13/15.
 */
import java.util.ArrayList;

/**
 * Created by danielkellam on 4/3/15.
 */
public class BallotModel {
    String[] StringList;
    private int BallotID;
    private int UserID;
    private int Score;
    private String c1w,c2w,c3w,c4w,c5w,c6w,c7w,c8w,c9w,c10w,c11w,c12w,c13w,c14w,c15w,c16w,c17w,c18w,c19w,c20w,c21w,c22w,c23w,c24w;


    public BallotModel(ArrayList<String> info, int userid, int ballotid, int score)
    {
        UserID = userid;
        BallotID = ballotid;
        Score = score;
        c1w=info.get(0);
        c2w=info.get(1);
        c3w=info.get(2);
        c4w=info.get(3);
        c5w=info.get(4);
        c6w=info.get(5);
        c7w=info.get(6);
        c8w=info.get(7);
        c9w=info.get(8);
        c10w=info.get(9);
        c11w=info.get(10);
        c12w=info.get(11);
        c13w=info.get(12);
        c14w=info.get(13);
        c15w=info.get(14);
        c16w=info.get(15);
        c17w=info.get(16);
        c18w=info.get(17);
        c19w=info.get(18);
        c20w=info.get(19);
        c21w=info.get(20);
        c22w=info.get(21);
        c23w=info.get(22);
        c24w=info.get(23);

        StringList = new String[]{
                c1w,c2w,c3w,c4w,c5w,c6w,c7w,c8w,c9w,c10w,c11w,c12w,c13w,c14w,c15w,c16w,c17w,c18w,c19w,c20w,c21w,c22w,c23w,c24w
        };


    }

    public String[] getBallotWinnerList()
    {
        return StringList;
    }

    public int getBallotID() {
        return BallotID;
    }

    public int getUserID() {
        return UserID;
    }

    public int getScore() {
        return Score;
    }

    public String getC1w() {
        return c1w;
    }

    public String getC2w() {
        return c2w;
    }

    public String getC3w() {
        return c3w;
    }

    public String getC4w() {
        return c4w;
    }

    public String getC5w() {
        return c5w;
    }

    public String getC6w() {
        return c6w;
    }

    public String getC7w() {
        return c7w;
    }

    public String getC8w() {
        return c8w;
    }

    public String getC9w() {
        return c9w;
    }

    public String getC10w() {
        return c10w;
    }

    public String getC11w() {
        return c11w;
    }

    public String getC12w() {
        return c12w;
    }

    public String getC13w() {
        return c13w;
    }

    public String getC14w() {
        return c14w;
    }

    public String getC15w() {
        return c15w;
    }

    public String getC16w() {
        return c16w;
    }

    public String getC17w() {
        return c17w;
    }

    public String getC18w() {
        return c18w;
    }

    public String getC19w() {
        return c19w;
    }

    public String getC20w() {
        return c20w;
    }

    public String getC21w() {
        return c21w;
    }

    public String getC22w() {
        return c22w;
    }

    public String getC23w() {
        return c23w;
    }

    public String getC24w() {
        return c24w;
    }
}
