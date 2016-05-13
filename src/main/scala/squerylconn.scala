
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{Schema, Session}
import org.squeryl.adapters.PostgreSqlAdapter


/**
  * Created by shashankjain on 5/13/16.
  */
object squerylconn extends App {

  println("Starting squryl")
  Class.forName("org.postgresql.Driver")
  val session = Session.create(java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/appdb",
    "postgres", "postgres"), new PostgreSqlAdapter)
  using(session) {
    import Library._
    create

    }


}

object Library extends Schema {
  val users = table[Users]

}
