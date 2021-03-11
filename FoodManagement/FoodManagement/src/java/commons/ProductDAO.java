
package commons;

import dtos.ProductDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ProductDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<ProductDTO> getProducts(String searchName) {
       ArrayList<ProductDTO> listProduct = new ArrayList<>();
        String query = "SELECT * from tblFoods where name like '%"+searchName+"%'" ;
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
              
            String id = rs.getString(1);
            String name = rs.getString(2);
            String description = rs.getString(3);
            float price  = Float.parseFloat(rs.getString(4));

            int cookingTime = rs.getInt(5);
            String status = rs.getString(6);
            String date = rs.getString(7);
      
                System.out.println(date);
                listProduct.add(new ProductDTO(id, name, description, price, cookingTime, status, date));
            }
        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return null;
        }
        return listProduct;
    }
    
    
     public ArrayList<ProductDTO> getallProduct() {
       ArrayList<ProductDTO> listProduct = new ArrayList<>();
        String query = "SELECT * from tblFoods" ;
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
              
            String id = rs.getString(1);
            String name = rs.getString(2);
            String description = rs.getString(3);
            float price  = Float.parseFloat(rs.getString(4));

            int cookingTime = rs.getInt(5);
            String status = rs.getString(6);
            String date = rs.getString(7);
      
                System.out.println(date);
                listProduct.add(new ProductDTO(id, name, description, price, cookingTime, status, date));
            }
        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return null;
        }
        return listProduct;
    }
    
    
    public ProductDTO getProduct(String proID) {
        ProductDTO product = null;
        String query = "SELECT * from tblFoods where id = '"+proID+"'" ;
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
              
            String id = rs.getString(1);
            String name = rs.getString(2);
            String description = rs.getString(3);
            float price  = Float.parseFloat(rs.getString(4));

            int cookingTime = rs.getInt(5);
            String status = rs.getString(6);
            String date = rs.getString(7);
                
            product = new ProductDTO(id, name, description, price, cookingTime, status, date);
                
            }
        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return null;
        }
        return product;
    }
    
    
    public Boolean updateProduct(ProductDTO productDTO) throws Exception {

        String query = "UPDATE tblFoods SET "
                + "name = '"+productDTO.getName()+"', "
                + "description = '"+productDTO.getDescription()+"' , "
                + "price = '"+productDTO.getPrice()+"', "
                + "cookingTime = '"+productDTO.getCookingTime()+"', "
                + "status = '"+productDTO.getStatus()+"', "
                + "createDate = '"+productDTO.getCreateDate()+"'"
                + "WHERE id = '"+productDTO.getId()+"'" ;
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return false;
        }
        return true;
    }
    
    
    public Boolean insertProduct(ProductDTO productDTO) throws Exception {

        String query = "INSERT tblFoods VALUES ('"+productDTO.getId()+"','"+productDTO.getName()+"','"+productDTO.getDescription()+"','"+productDTO.getPrice()+"','"+productDTO.getCookingTime()+"','"+productDTO.getStatus()+"','"+productDTO.getCreateDate()+"')";
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return false;
        }
        return true;
    }
    
 
    
    

    public Boolean deleteProduct(String idProduct) {
        String query = "DELETE tblFoods  WHERE id = '"+idProduct+"'";
        System.out.println(query);
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Erorr: " + e);
            return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) throws ParseException, Exception {
      ProductDAO daos = new ProductDAO();
            
        System.out.println(daos.deleteProduct("4"));
      
                
    }
}
