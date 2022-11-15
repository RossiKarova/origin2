package academy.learnprogramming.flickrbrowser

import android.os.AsyncTask

class GetFlickrJsonData (private val listener: OnDAtaAvailable) : AsyncTask<String, Void, ArrayList<Photo>>() {

    private val TAG = "GetFlickrJsonData"

    interface OnDAtaAvailable{
        fun omDataAvailable (data: List<Photo>)
        fun onError(exception: Exception)
    }
}