package academy.learnprogramming.flickrbrowser

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

/**
 * Created by timbuchalka for Android Oreo with Kotlin course
 * from www.learnprogramming.academy
 */

class FlickrImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var thumbnail: ImageView = view.findViewById(R.id.thumbnail)
    var title: TextView = view.findViewById(R.id.title)
}

class FlickrRecyclerViewAdapter(private var photoList : List<Photo>) : RecyclerView.Adapter<FlickrImageViewHolder>() {
    private val TAG = "FlickrRecyclerViewAdapt"

    override fun getItemCount(): Int {
//        Log.d(TAG, ".getItemCount called")
<<<<<<< HEAD
        return if (photoList.isNotEmpty()) photoList.size else 1
=======
        return if (photoList.isNotEmpty()) photoList.size else 0
>>>>>>> e6e072bfe9680f8a298294b094213d25589d5f08
    }

    fun loadNewData(newPhotos: List<Photo>) {
        photoList = newPhotos
        notifyDataSetChanged()
    }

    fun getPhoto(position: Int): Photo? {
        return if (photoList.isNotEmpty()) photoList[position] else null
    }

    override fun onBindViewHolder(holder: FlickrImageViewHolder, position: Int) {
        // Called by the layout manager when it wants new data in an existing view
<<<<<<< HEAD
        if (photoList.isEmpty()){
            holder.thumbnail.setImageResource(R.drawable.placeholder)
            holder.title.setText(R.string.empty_photo)
        }else {
            val photoItem = photoList[position]
            Picasso.with(holder.thumbnail.context).load(photoItem.image)
=======

        val photoItem = photoList[position]
//        Log.d(TAG, ".onBindViewHolder: ${photoItem.title} --> $position")
        Picasso.with(holder.thumbnail.context).load(photoItem.image)
>>>>>>> e6e072bfe9680f8a298294b094213d25589d5f08
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(holder.thumbnail)

<<<<<<< HEAD
            holder.title.text = photoItem.title

        }


=======
        holder.title.text = photoItem.title
>>>>>>> e6e072bfe9680f8a298294b094213d25589d5f08
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlickrImageViewHolder {
        // Called by the layout manager when it needs a new view
        Log.d(TAG, ".onCreateViewHolder new view requested")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.browse, parent, false)
        return FlickrImageViewHolder(view)
    }
}