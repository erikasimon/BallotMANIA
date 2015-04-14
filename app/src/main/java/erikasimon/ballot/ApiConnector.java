package erikasimon.ballot;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielkellam on 3/31/15.
 */
public class ApiConnector {

    public JSONArray GetAllCategories()
    {
        String url = "http://cwolf.cs.sonoma.edu:8018/Category";

        HttpEntity httpEntity = null;

        try
        {

            DefaultHttpClient httpClient = new DefaultHttpClient();  // Default HttpClient
            HttpGet httpGet = new HttpGet(url);

            HttpResponse httpResponse = httpClient.execute(httpGet);

            httpEntity = httpResponse.getEntity();



        } catch (ClientProtocolException e) {

            // Signals error in http protocol
            e.printStackTrace();

            //Log Errors Here



        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert HttpEntity into JSON Array
        JSONArray jsonArray = null;

        if (httpEntity != null) {
            try {
                String entityResponse = EntityUtils.toString(httpEntity);

                Log.e("Entity Response  : ", entityResponse);

                jsonArray = new JSONArray(entityResponse);

            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return jsonArray;


    }


    public JSONArray GetNomineesInOrderTheyAppear()
    {
        String url = "http://cwolf.cs.sonoma.edu:8018/Nominee";

        HttpEntity httpEntity = null;

        try
        {

            DefaultHttpClient httpClient = new DefaultHttpClient();  // Default HttpClient
            HttpGet httpGet = new HttpGet(url);

            HttpResponse httpResponse = httpClient.execute(httpGet);

            httpEntity = httpResponse.getEntity();



        } catch (ClientProtocolException e) {

            // Signals error in http protocol
            e.printStackTrace();

            //Log Errors Here



        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert HttpEntity into JSON Array
        JSONArray jsonArray = null;

        if (httpEntity != null) {
            try {
                String entityResponse = EntityUtils.toString(httpEntity);

                Log.e("Entity Response  : ", entityResponse);

                jsonArray = new JSONArray(entityResponse);

            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return jsonArray;


    }

    public JSONArray GetBallots()
    {
        String url = "http://cwolf.cs.sonoma.edu:8018/Ballot";

        HttpEntity httpEntity = null;

        try
        {

            DefaultHttpClient httpClient = new DefaultHttpClient();  // Default HttpClient
            HttpGet httpGet = new HttpGet(url);

            HttpResponse httpResponse = httpClient.execute(httpGet);

            httpEntity = httpResponse.getEntity();



        } catch (ClientProtocolException e) {

            // Signals error in http protocol
            e.printStackTrace();

            //Log Errors Here



        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert HttpEntity into JSON Array
        JSONArray jsonArray = null;

        if (httpEntity != null) {
            try {
                String entityResponse = EntityUtils.toString(httpEntity);

                Log.e("Entity Response  : ", entityResponse);

                jsonArray = new JSONArray(entityResponse);

            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return jsonArray;


    }

    public void SubmitBallot(BallotModel B)
    {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://10.0.2.2/SubmittBallot.php");

        String[] WinList = B.getBallotWinnerList();

        try {
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("uID", B.getUserID()+""));
            nameValuePairs.add(new BasicNameValuePair("BallotID", B.getBallotID()+""));
            nameValuePairs.add(new BasicNameValuePair("Score", B.getScore()+""));
            nameValuePairs.add(new BasicNameValuePair("C1W", WinList[0]));
            nameValuePairs.add(new BasicNameValuePair("C2W", WinList[1]));
            nameValuePairs.add(new BasicNameValuePair("C3W", WinList[2]));
            nameValuePairs.add(new BasicNameValuePair("C4W", WinList[3]));
            nameValuePairs.add(new BasicNameValuePair("C5W", WinList[4]));
            nameValuePairs.add(new BasicNameValuePair("C6W", WinList[5]));
            nameValuePairs.add(new BasicNameValuePair("C7W", WinList[6]));
            nameValuePairs.add(new BasicNameValuePair("C8W", WinList[7]));
            nameValuePairs.add(new BasicNameValuePair("C9W", WinList[8]));
            nameValuePairs.add(new BasicNameValuePair("C10W", WinList[9]));
            nameValuePairs.add(new BasicNameValuePair("C11W", WinList[10]));
            nameValuePairs.add(new BasicNameValuePair("C12W", WinList[11]));
            nameValuePairs.add(new BasicNameValuePair("C13W", WinList[12]));
            nameValuePairs.add(new BasicNameValuePair("C14W", WinList[13]));
            nameValuePairs.add(new BasicNameValuePair("C15W", WinList[14]));
            nameValuePairs.add(new BasicNameValuePair("C16W", WinList[15]));
            nameValuePairs.add(new BasicNameValuePair("C17W", WinList[16]));
            nameValuePairs.add(new BasicNameValuePair("C18W", WinList[17]));
            nameValuePairs.add(new BasicNameValuePair("C19W", WinList[18]));
            nameValuePairs.add(new BasicNameValuePair("C20W", WinList[19]));
            nameValuePairs.add(new BasicNameValuePair("C21W", WinList[20]));
            nameValuePairs.add(new BasicNameValuePair("C22W", WinList[21]));
            nameValuePairs.add(new BasicNameValuePair("C23W", WinList[22]));
            nameValuePairs.add(new BasicNameValuePair("C24W", WinList[23]));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            HttpResponse response = httpclient.execute(httppost);

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }

}
