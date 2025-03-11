package com.carl.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-11 21:17
 * @version: 1.0
 */
public class JdbcUtil {
    private static final String USER_DB="test_user";

    private static final String ORDER_DB="test_order";

    private static final Map<String, Connection> dbToConnectionMap=new ConcurrentHashMap<>();

    /**
     * 静态代码块，类加载的时候就进行初始化
     */
    static {
        Arrays.asList(USER_DB,ORDER_DB).forEach(JdbcUtil::init);
    }
    private static void init(String db){
        if (!dbToConnectionMap.containsKey(db) || dbToConnectionMap.get(db)==null){
            synchronized (JdbcUtil.class){
                if (dbToConnectionMap.get(db)==null){
                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/"+db+"?serverTimezone=GMT%2B8&useSSL=false"
                                , "root"
                                , "123456");
                        dbToConnectionMap.put(db,connection);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 执行sql
     * @param sql
     * @param arg
     */
    public static void executeSql(String sql,String arg){
        String db = Context.getDb();
        try(Connection connection = dbToConnectionMap.get(db);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,arg);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Context.removeDb();
        }
    }
}
