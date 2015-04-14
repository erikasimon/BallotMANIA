package erikasimon.ballot;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MyBallotsActivity extends ActionBarActivity {

    private TextView BestPictureTextView;
    private TextView LeadingActorTextView;
    private TextView LeadingActressTextView;
    private TextView SupportingActorTextView;
    private TextView SupportingActressTextView;
    private TextView AnimatedFilmTextView;
    private TextView CinematographyTextView;
    private TextView CostumeDesignTextView;
    private TextView DirectingTextView;
    private TextView DocumentaryFeatureTextView;
    private TextView DocumentaryShortSubjectTextView;
    private TextView FilmEditingTextView;
    private TextView ForeignLanguageFilmTextView;
    private TextView MakeupAndHairstylingTextView;
    private TextView MusicOriginalScoreTextView;
    private TextView MusicOriginalSongTextView;
    private TextView ProductionDesignTextView;
    private TextView ShortFilmAnimatedTextView;
    private TextView ShortFilmLiveActionTextView;
    private TextView SoundEditingTextView;
    private TextView SoundMixingTextView;
    private TextView VisualEffectsTextView;
    private TextView WritingAdaptedScreenplayTextView;
    private TextView WritingOriginalScreenplayTextView;

    private ArrayList<TextView> CategoryTextViews;
    private ArrayList<TextView> NomineeTextViews;

    private TextView BPictureTextView;
    private TextView LActorTextView;
    private TextView LActressTextView;
    private TextView SActorTextView;
    private TextView SActressTextView;
    private TextView AFilmTextView;
    private TextView CinemaTextView;
    private TextView CDesignTextView;
    private TextView DirectTextView;
    private TextView DFeatureTextView;
    private TextView DSSubjectTextView;
    private TextView FEditingTextView;
    private TextView FLFilmTextView;
    private TextView MAHairstylingTextView;
    private TextView MOScoreTextView;
    private TextView MOSongTextView;
    private TextView PDesignTextView;
    private TextView SFAnimatedTextView;
    private TextView SFLActionTextView;
    private TextView SEditingTextView;
    private TextView SMixingTextView;
    private TextView VEffectsTextView;
    private TextView WAScreenplayTextView;
    private TextView WOScreenplayTextView;

    private TextView ScoreTextView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ballots);

        this.BestPictureTextView = (TextView) this.findViewById(R.id.BestPicture);
        this.LeadingActorTextView = (TextView) this.findViewById(R.id.LeadingActor);
        this.LeadingActressTextView = (TextView) this.findViewById(R.id.LeadingActress);
        this.SupportingActorTextView = (TextView) this.findViewById(R.id.SupportingActor);
        this.SupportingActressTextView = (TextView) this.findViewById(R.id.SupportingActress);
        this.AnimatedFilmTextView = (TextView) this.findViewById(R.id.AnimatedFilm);
        this.CinematographyTextView = (TextView) this.findViewById(R.id.Cinematography);
        this.CostumeDesignTextView = (TextView) this.findViewById(R.id.CostumeDesign);
        this.DirectingTextView = (TextView) this.findViewById(R.id.Directing);
        this.DocumentaryFeatureTextView = (TextView) this.findViewById(R.id.DocumentaryFeature);
        this.DocumentaryShortSubjectTextView = (TextView) this.findViewById(R.id.DocumentaryShortSubject);
        this.FilmEditingTextView = (TextView) this.findViewById(R.id.FilmEditing);
        this.ForeignLanguageFilmTextView = (TextView) this.findViewById(R.id.ForeignLanguageFilm);
        this.MakeupAndHairstylingTextView = (TextView) this.findViewById(R.id.MakeupAndHairstyling);
        this.MusicOriginalScoreTextView = (TextView) this.findViewById(R.id.MusicOriginalScore);
        this.MusicOriginalSongTextView = (TextView) this.findViewById(R.id.MusicOriginalSong);
        this.ProductionDesignTextView = (TextView) this.findViewById(R.id.ProductionDesign);
        this.ShortFilmAnimatedTextView = (TextView) this.findViewById(R.id.ShortFilmAnimated);
        this.ShortFilmLiveActionTextView = (TextView) this.findViewById(R.id.ShortFilmLiveAction);
        this.SoundEditingTextView = (TextView) this.findViewById(R.id.SoundEditing);
        this.SoundMixingTextView = (TextView) this.findViewById(R.id.SoundMixing);
        this.VisualEffectsTextView = (TextView) this.findViewById(R.id.VisualEffects);
        this.WritingAdaptedScreenplayTextView = (TextView) this.findViewById(R.id.WritingAdaptedScreenplay);
        this.WritingOriginalScreenplayTextView = (TextView) this.findViewById(R.id.WritingOriginalScreenplay);

        CategoryTextViews = new ArrayList<TextView>();
        NomineeTextViews = new ArrayList<TextView>();

        CategoryTextViews.add(BestPictureTextView);
        CategoryTextViews.add(LeadingActorTextView);
        CategoryTextViews.add(LeadingActressTextView);
        CategoryTextViews.add(SupportingActorTextView);
        CategoryTextViews.add(SupportingActressTextView);
        CategoryTextViews.add(AnimatedFilmTextView);
        CategoryTextViews.add(CinematographyTextView);
        CategoryTextViews.add(CostumeDesignTextView);
        CategoryTextViews.add(DirectingTextView);
        CategoryTextViews.add(DocumentaryFeatureTextView);
        CategoryTextViews.add(DocumentaryShortSubjectTextView);
        CategoryTextViews.add(FilmEditingTextView);
        CategoryTextViews.add(ForeignLanguageFilmTextView);
        CategoryTextViews.add(MakeupAndHairstylingTextView);
        CategoryTextViews.add(MusicOriginalScoreTextView);
        CategoryTextViews.add(MusicOriginalSongTextView);
        CategoryTextViews.add(ProductionDesignTextView);
        CategoryTextViews.add(ShortFilmAnimatedTextView);
        CategoryTextViews.add(ShortFilmLiveActionTextView);
        CategoryTextViews.add(SoundEditingTextView);
        CategoryTextViews.add(SoundMixingTextView);
        CategoryTextViews.add(VisualEffectsTextView);
        CategoryTextViews.add(WritingAdaptedScreenplayTextView);
        CategoryTextViews.add(WritingOriginalScreenplayTextView);

        this.BPictureTextView = (TextView) this.findViewById(R.id.BPicture);
        this.LActorTextView = (TextView) this.findViewById(R.id.LActor);
        this.LActressTextView = (TextView) this.findViewById(R.id.LActress);
        this.SActorTextView = (TextView) this.findViewById(R.id.SActor);
        this.SActressTextView = (TextView) this.findViewById(R.id.SActress);
        this.AFilmTextView = (TextView) this.findViewById(R.id.AFilm);
        this.CinemaTextView = (TextView) this.findViewById(R.id.Cinema);
        this.CDesignTextView = (TextView) this.findViewById(R.id.CDesign);
        this.DirectTextView = (TextView) this.findViewById(R.id.Direct);
        this.DFeatureTextView = (TextView) this.findViewById(R.id.DFeature);
        this.DSSubjectTextView = (TextView) this.findViewById(R.id.DSSubject);
        this.FEditingTextView = (TextView) this.findViewById(R.id.FEditing);
        this.FLFilmTextView = (TextView) this.findViewById(R.id.FLFilm);
        this.MAHairstylingTextView = (TextView) this.findViewById(R.id.MAHairstyling);
        this.MOScoreTextView = (TextView) this.findViewById(R.id.MOScore);
        this.MOSongTextView = (TextView) this.findViewById(R.id.MOSong);
        this.PDesignTextView = (TextView) this.findViewById(R.id.PDesign);
        this.SFAnimatedTextView = (TextView) this.findViewById(R.id.SFAnimated);
        this.SFLActionTextView = (TextView) this.findViewById(R.id.SFLAction);
        this.SEditingTextView = (TextView) this.findViewById(R.id.SEditing);
        this.SMixingTextView = (TextView) this.findViewById(R.id.SMixing);
        this.VEffectsTextView = (TextView) this.findViewById(R.id.VEffects);
        this.WAScreenplayTextView = (TextView) this.findViewById(R.id.WAScreenplay);
        this.WOScreenplayTextView = (TextView) this.findViewById(R.id.WOScreenplay);

        this.ScoreTextView = (TextView) this.findViewById(R.id.Score);

        NomineeTextViews.add(BPictureTextView);
        NomineeTextViews.add(LActorTextView);
        NomineeTextViews.add(LActressTextView);
        NomineeTextViews.add(SActorTextView);
        NomineeTextViews.add(SActressTextView);
        NomineeTextViews.add(AFilmTextView);
        NomineeTextViews.add(CinemaTextView);
        NomineeTextViews.add(CDesignTextView);
        NomineeTextViews.add(DirectTextView);
        NomineeTextViews.add(DFeatureTextView);
        NomineeTextViews.add(DSSubjectTextView);
        NomineeTextViews.add(FEditingTextView);
        NomineeTextViews.add(FLFilmTextView);
        NomineeTextViews.add(MAHairstylingTextView);
        NomineeTextViews.add(MOScoreTextView);
        NomineeTextViews.add(MOSongTextView);
        NomineeTextViews.add(PDesignTextView);
        NomineeTextViews.add(SFAnimatedTextView);
        NomineeTextViews.add(SFLActionTextView);
        NomineeTextViews.add(SEditingTextView);
        NomineeTextViews.add(SMixingTextView);
        NomineeTextViews.add(VEffectsTextView);
        NomineeTextViews.add(WAScreenplayTextView);
        NomineeTextViews.add(WOScreenplayTextView);

        NomineeTextViews.add(ScoreTextView);

        new GetBallotsTask().execute(new ApiConnector());
        new GetAllCategoriesTask().execute(new ApiConnector());



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_ballots, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void TextName(String Cat, TextView text)
    {
        text.setText(Cat);
    }

    public List<CategoryModel> addToCategoryList(List<CategoryModel> L, JSONArray jsonArray, String RowName, String id, String winID)
    {
        String s = "";
        String w = "";
        int t;
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject json = null;
            try {
                json = jsonArray.getJSONObject(i);
                s = json.getString(RowName);
                t = json.getInt(id);
                w = json.getString(winID);
                CategoryModel Cat = new CategoryModel(s,t,w);
                L.add(Cat);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return L;
    }

    public List<BallotModel> addToBallotList(List<BallotModel> L, JSONArray jsonArray, String uID, String BallotID,String Score,String C1W,String C2W,String C3W,String C4W,String C5W,String C6W,String C7W,String C8W,String C9W,String C10W,String C11W,String C12W,String C13W,String C14W,String C15W,String C16W,String C17W,String C18W,String C19W,String C20W,String C21W,String C22W,String C23W,String C24W)
    {
        ArrayList<String> CatList = new ArrayList<String>();
        int a,b,c;
        String d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa;
        for (int ii = 0; ii < jsonArray.length(); ii++) {

            JSONObject json = null;
            try {
                json = jsonArray.getJSONObject(ii);
                a = json.getInt(uID);
                b = json.getInt(BallotID);
                c = json.getInt(Score);
                d = json.getString(C1W);
                e = json.getString(C2W);
                f = json.getString(C3W);
                g = json.getString(C4W);
                h = json.getString(C5W);
                i = json.getString(C6W);
                j = json.getString(C7W);
                k = json.getString(C8W);
                l = json.getString(C9W);
                m = json.getString(C10W);
                n = json.getString(C11W);
                o = json.getString(C12W);
                p = json.getString(C13W);
                q = json.getString(C14W);
                r = json.getString(C15W);
                s = json.getString(C16W);
                t = json.getString(C17W);
                u = json.getString(C18W);
                v = json.getString(C19W);
                w = json.getString(C20W);
                x = json.getString(C21W);
                y = json.getString(C22W);
                z = json.getString(C23W);
                aa = json.getString(C24W);

                CatList.add(d);
                CatList.add(e);
                CatList.add(f);
                CatList.add(g);
                CatList.add(h);
                CatList.add(i);
                CatList.add(j);
                CatList.add(k);
                CatList.add(l);
                CatList.add(m);
                CatList.add(n);
                CatList.add(o);
                CatList.add(p);
                CatList.add(q);
                CatList.add(r);
                CatList.add(s);
                CatList.add(t);
                CatList.add(u);
                CatList.add(v);
                CatList.add(w);
                CatList.add(x);
                CatList.add(y);
                CatList.add(z);
                CatList.add(aa);

                BallotModel Bal = new BallotModel(CatList, a, b ,c);
                L.add(Bal);
            } catch (JSONException ee) {
                ee.printStackTrace();
            }

        }
        return L;
    }

    private class GetAllCategoriesTask extends AsyncTask<ApiConnector, Long, JSONArray> {
        List<CategoryModel> cat;
        public GetAllCategoriesTask()
        {
            cat = new ArrayList<CategoryModel>();
        }

        @Override
        protected JSONArray doInBackground(ApiConnector... params) {
            return params[0].GetAllCategories();
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {

            cat = addToCategoryList(cat, jsonArray, "CategoryName", "CategoryID", "CategoryWinner");
            int score = 0;
            for(int i = 0; i < CategoryTextViews.size(); i++)
            {
                TextName(cat.get(i).getCategoryName(), CategoryTextViews.get(i));

                if(cat.get(i).getCategoryWinner().equals(NomineeTextViews.get(i).getText().toString()))
                {
                    /*int score = Integer.parseInt(ScoreTextView.getText().toString())*/;
                    score +=10;
                    ScoreTextView.setText(score+"");
                    NomineeTextViews.get(i).setBackgroundColor(Color.parseColor("#008000"));
                }
            }
        }
    }

    private class GetBallotsTask extends AsyncTask<ApiConnector, Long, JSONArray> {
        List<BallotModel> bal;
        public GetBallotsTask()
        {
            bal = new ArrayList<BallotModel>();
        }

        @Override
        protected JSONArray doInBackground(ApiConnector... params) {
            return params[0].GetBallots();
        }

        @Override
        protected void onPostExecute(JSONArray jsonArray) {

            ArrayList<String[]> Ballots;
            bal = addToBallotList(bal,jsonArray, "uID", "BallotID","Score","C1W","C2W","C3W","C4W","C5W","C6W","C7W","C8W","C9W","C10W","C11W","C12W","C13W","C14W","C15W","C16W","C17W","C18W","C19W","C20W","C21W","C22W","C23W","C24W");

            for(int i = 0; i < bal.size(); i++)
            {
                String[] ballot = bal.get(i).getBallotWinnerList();
                for(int t = 0; t < NomineeTextViews.size()-1;t++)
                {
                    NomineeTextViews.get(t).setText(ballot[t]);
                }
                NomineeTextViews.get(NomineeTextViews.size()-1).setText("" + bal.get(i).getScore());
            }
        }
    }


}

