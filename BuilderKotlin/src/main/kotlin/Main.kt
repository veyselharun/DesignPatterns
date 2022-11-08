fun main(args: Array<String>) {

    /**
     * Creating a default mail object.
     * What if we need to add a new field to the class or to change the order?
     * We need to track the order and changes and make changes in both places.
     */
    val myMail1 = Mailv1(
        listOf("student1@sakarya.edu.tr"),
        null,
        "Announcement ",
        null,
        true
    )



    /**
     * With Builder design pattern we can easily create complex objects.
     * We get help from default arguments and named arguments.
     * Provided empty list for cc. Not so convenient.
     */

    /**
     * Provided empty list for cc. Not so convenient.
     */
    val myMail2 = Mailv2(
        listOf("student1@sakarya.edu.tr"),
        listOf(),
        "Announcement "
    )

    /**
     * Used named arguments. More convenient.
     * No need use empy list for cc.
     */
    val myMail3 = Mailv2(
        title = "Announcement",
        to = listOf("student1@sakarya.edu.tr")
    )

}