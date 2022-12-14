import java.net.URL

fun main(args: Array<String>) {

    // In this declaration the image is not obtained. Because it is
    // lazily assigned. The image will be get from the internet at
    // first call.
    val myLogo = Logo(
        "https://www.sakarya.edu.tr/kutuphane/resimler/gorsel-kimlik/logo-yatay.jpg",
    )

    // This is the first call to the image.
    // In this call, the image is get over the internet.
    println("First call to the image.")
    println(myLogo.image.size)

    // This is the second call to the image.
    // In this call, the image is not obtained over the internet.
    println("Second call to the image.")
    println(myLogo.image.size)
}

data class Logo(val url: String) {
    val image: ByteArray by lazy {
        println("Downloading the logo image.")
        URL(url).readBytes()
    }
}