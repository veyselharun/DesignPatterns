class LoggingGetStudent : StudentData() {

    override fun getStudent(id: String): String {
        println("Getting student information for id : $id")
        return super.getStudent(id)
    }

}