package dao;
import models.navigate;
import models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oNavigateDao {
    public Sql2oNavigateDao() {
    }

    public List<navigate> allPaths() {
        String sql = "SELECT * from sitemap;";
        try (Connection con = DB.sql2o.open()) {
            return con.createQuery(sql)
                    .executeAndFetch(navigate.class);
        }
    }
}
