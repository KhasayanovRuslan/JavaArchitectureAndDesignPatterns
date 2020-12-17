import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findProductById(int id) throws SQLException,RecordNotFoundException {
        PreparedStatement statement = connection.prepareStatement(
                                             "SELECT * FROM products WHERE id = ?");
        statement.setInt(1,id);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt(1));
                product.setTitle(resultSet.getString(2));
                product.setDescription(resultSet.getString(3));
                product.setCost(resultSet.getInt(4));
                return product;
            }
        }

        throw new RecordNotFoundException(id);
    }

}
