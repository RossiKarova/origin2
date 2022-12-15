package academy.learnprogramming.flickrbrowser

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

import kotlinx.android.synthetic.main.activity_photo_details.*

class PhotoDetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)
        activateToolBar(true)
    }
}
