
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.{Schema, Session, SessionFactory}
import org.squeryl.adapters.PostgreSqlAdapter


/**
  * Created by shashankjain on 5/13/16.
  */
object squerylconn extends App {

  println("Starting squryl")
  Class.forName("org.postgresql.Driver")
  SessionFactory.concreteFactory = Some(() =>
    Session.create(java.sql.DriverManager.getConnection("jdbc:postgresql://localhost:5432/appdb",
      "postgres", "postgres"), new PostgreSqlAdapter))

  transaction {
      import Library._
      //Prints schema to standard output
      printDdl
      //get
      users.map(s => println(s"${s.id} -> ${s.name}"))
  }


}

object Library extends Schema {
  val users = table[Users]

}
