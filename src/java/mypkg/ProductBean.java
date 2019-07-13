package mypkg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductBean {
    private int pcode;
    private String pname;
    private String pdesc;
    private String pcat;
    private int price;
    private boolean found;

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }
    
    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getPcat() {
        return pcat;
    }

    public void setPcat(String pcat) {
        this.pcat = pcat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void searchProduct(int code){
        try{
            String sql="select * from products where pcode=?";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomdata","root","root");
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, code);
            ResultSet rs=ps.executeQuery();
            found=rs.next();
            if(found){
                pcode=rs.getInt(1);
                pname=rs.getString(2);
                pdesc=rs.getString(3);
                pcat=rs.getString(4);
                price=rs.getInt(5);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
