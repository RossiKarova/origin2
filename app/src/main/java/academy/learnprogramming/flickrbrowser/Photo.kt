package academy.learnprogramming.flickrbrowser

class Photo(
    val title: String,
    val authorId: String,
    val link: String,
    val tags: String,
    val image: String,
    photoUrl: String
) {
    override fun toString(): String {
        return "Photo(title='$title', authorId='$authorId', link='$link', tags='$tags', image='$image')"
    }
}