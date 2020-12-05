import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainMapper {
    public static void main(String[] args) {
        // Устанавливаем соединение с базой данных по определенному url,
        // используя определенные user и password.
        Connection connection = DriverManager.getConnection(url, user, password);
        ProductMapper productMapper = new ProductMapper(connection);

        try {
            Product product = productMapper.findProductById(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (RecordNotFoundException e) {
            e.printStackTrace();
        }
    }
}
