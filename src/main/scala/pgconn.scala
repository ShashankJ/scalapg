/**
  * Created by shashankjain on 5/13/16.
  */
import java.sql.{Connection, DriverManager, ResultSet}

object pgconn extends App {
  println("Postgres connector")

  classOf[org.postgresql.Driver]
  val con_str= "jdbc:postgresql://localhost:5432/appdb?user=postgres"
  val conn = DriverManager.getConnection(con_str)
  try {
    val stm = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)

    val rs = stm.executeQuery("select * from \"Users\" where \"id\" > '1'")

    while(rs.next) {
      println(rs.getArray(2))
    }
  } finally {
    conn.close()
  }

}
