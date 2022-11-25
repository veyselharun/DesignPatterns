class ValidatingAddStudent : StudentData() {

    override fun addStudent(id: String, name: String, surname: String) {
        if (name.length > 20) {
            throw RuntimeException("Student name is longer than 20 characters!")
        }

        super.addStudent(id, name, surname)
    }

}