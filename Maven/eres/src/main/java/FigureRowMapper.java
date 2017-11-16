import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
        import java.sql.SQLException;

public class FigureRowMapper implements org.springframework.jdbc.core.RowMapper{
    public Figure mapRow(ResultSet resultSet, int i) throws SQLException{
        return new Figure(
                resultSet.getString("name"),
                resultSet.getInt("numberofangles"));

    }

    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}

