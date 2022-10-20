import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class JSONSerialize(): GenericSerializer {

    override fun serializeData(studentInfo: StudentInfo) {
        val myData = Json.encodeToString(studentInfo)

        println(myData)
    }

}