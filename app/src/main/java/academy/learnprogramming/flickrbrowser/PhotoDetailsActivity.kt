package academy.learnprogramming.flickrbrowser

import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.content_photo_details.*

class PhotoDetailsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)

        activateToolBar(true)

        val photo = intent.getSerializableExtra(PHOTO_TRANSFER) as Photo
<<<<<<< HEAD

//        photo_title.text = "Title" + photo.title
//        photo_tags.text = "Tags" + photo.tags

        photo_title.text = resources.getString(R.string.photo_title_text,photo.title)
        photo_tags.text = resources.getString(R.string.photo_tags_text, photo.tags)
        photo_author.text = photo.author


=======
        photo_title.text = photo.title
        photo_tags.text = photo.tags
        photo_author.text = photo.author

>>>>>>> e6e072bfe9680f8a298294b094213d25589d5f08
        Picasso.with(this).load(photo.link)
            .error(R.drawable.placeholder)
            .placeholder(R.drawable.placeholder)
            .into(photo_image)
    }
}

