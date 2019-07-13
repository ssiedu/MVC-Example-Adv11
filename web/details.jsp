<jsp:useBean scope="session" id="data" class="mypkg.ProductBean"/>
<html>
    <body>
        <h3>Product-Details</h3>
        <hr>
        <pre>
            PCode       <jsp:getProperty name="data" property="pcode"/>
            Name        <jsp:getProperty name="data" property="pname"/>
            Desc        <jsp:getProperty name="data" property="pdesc"/>
            Catg        <jsp:getProperty name="data" property="pcat"/>
            Price       <jsp:getProperty name="data" property="price"/>
        </pre>
        <hr>
        <a href="search.jsp">Search-More</a><br>
        <a href="index.jsp">Home</a>
    </body>
</html>
