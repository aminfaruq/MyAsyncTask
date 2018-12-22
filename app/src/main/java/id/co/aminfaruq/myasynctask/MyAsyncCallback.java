package id.co.aminfaruq.myasynctask;

public interface MyAsyncCallback {
    void onPreExecute();

    void onPostExecute(String text);
}
