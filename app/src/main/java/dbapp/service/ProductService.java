package dbapp.service;

import java.sql.Connection;

import dbapp.model.ProductRepository;

public class ProductService {

    private ProductRepository productRepository;
    private Connection conn;

    public ProductService(ProductRepository productRepository, Connection conn) {
        this.productRepository = productRepository;
        this.conn = conn;
    }

    public void 상품삭제(int id) {
        try {
            productRepository.deleteById(id);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void 상품수정(int id, String name, int price, int qty) {
        try {
            productRepository.updateById(id, name, price, qty);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void 상품등록(String name, int price, int qty) {
        try {
            productRepository.insert(name, price, qty);
            productRepository.insert(name, price, qty);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}