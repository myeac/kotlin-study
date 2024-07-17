package data_study.data_class

import kotlin.random.Random

data class Article(
    val title: String,
    val content: String,
    val numberReaders: Int,
)

fun executeArticleData() {
    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles = arrayListOf<Article>()

    for (article in articles) {
        newArticles.add(article)
        val newArticle = article.copy(title = article.title + " for my blog")
        articles.add(newArticle)
    }
    newArticles.forEach { println(it) }
}

private fun getArticle(): Article {
    val randomTitle = "tile of book nubmer " + Random.nextInt(100)
    val numberReaders = Random.nextInt(1000)
    return Article(randomTitle, "random content", numberReaders)
}