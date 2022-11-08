import kotlinx.serialization.Serializable

@Serializable
data class StudentInfo(val studentId: String, val name: String, val surname: String)

fun main(args: Array<String>) {

    val studentInfo = StudentInfo("2022", "Munevver", "Sahika")
    

    val argument1 = "PBuf"
    // val argument1 = "JSON"

    val mySerializer = createSerializer(argument1)
    mySerializer.serializeData(studentInfo)

}


// Factory method
fun createSerializer(serializerType: String): GenericSerializer {

    val createdSerializer = when (serializerType) {
        "JSON" -> JSONSerialize()
        "PBuf" -> ProtoBufSerialize()
        else -> throw RuntimeException("Unknown serializer.")
    }

    return createdSerializer
}