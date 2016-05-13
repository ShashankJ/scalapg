import org.squeryl.KeyedEntity

/**
  * Created by shashankjain on 5/13/16.
  */
class Users(
           val id: Int,
           val name: String,
           val acnum: Long,
           val phone: Long
           ) extends KeyedEntity[Int]
