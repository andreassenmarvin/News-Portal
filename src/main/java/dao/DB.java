package dao;
import org.sql2o.*;
import java.net.URI;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DB {

    //    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/news_portal", "marvin", "family");
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-3-227-44-84.compute-1.amazonaws.com:5432/d1htma1u288veo", "wcazoxrhtknfuh", "cdcc7bcffebf84e13f78e8aaa05cfbfda95509ed3f7c487889f1e58f0df70903");


}