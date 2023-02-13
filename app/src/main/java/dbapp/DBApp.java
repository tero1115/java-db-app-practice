package dbapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dbapp.config.DBConfig;
import dbapp.model.Product;
import dbapp.model.ProductRepository;
import dbapp.service.ProductService;

public class DBApp {
    public static void main(String[] args) throws SQLException {
        // 1. 커넥션 가져오기
        Connection conn = DBConfig.getConnection();
        // 2. DAO를 메모리에 올리기
        ProductRepository productRepository = new ProductRepository(conn);
        // 3. SERVICE를 메모리에 올리기
        ProductService productService = new ProductService(productRepository, conn);

        // productService.상품등록("apple", 2000, 5);
        // Product product = productRepository.findById(1);
        // System.out.println(product.getId());
        // System.out.println(product.getName());
        // System.out.println(product.getPrice());
        // System.out.println(product.getQty());
        // System.out.println(product.getCreatedAt());

        List<Product> productList = productRepository.findAll();
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }
}