import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf

class ProtoBufSerialize(): GenericSerializer {

    override fun serializeData(studentInfo: StudentInfo) {
        val myData = ProtoBuf.encodeToByteArray(studentInfo)

        println(myData[0].toString() + " - " + myData[1].toString() + " - " + myData[2].toString())
    }

}