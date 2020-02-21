<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<HTML>
   <HEAD>
      <TITLE>Search Results</TITLE>
   </HEAD>
   <BODY>
      <%@ include file="/jsp/searchHeader.jspf" %>
      Search results for keyword <B><c:out value='${search.username}'/></B>:
      <BR/>
 <table border="2" width="1" cellspacing="1" cellpadding="2">
            <thead>
                <tr>
                    <th>Message Trace </th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th> Date From: </th>
                    <th><input type="email" name="t1" value=""  required/></th>
                    <th>
                    <th>Provider CRM Instance ID:</th>
                     <th><input type= "text" name="t7" value="" pattern ="\d{10}"    required /></th>
                </tr>
                </tr>
                <tr>
                    <th> Date To:</th>
                    <th><input type="password" name="t2" value="" required /></th>
                    <th>
                    <th>Outbound CRM Instance ID:</th>
                     <th><input type= "text" name="t8" value="" pattern ="\d{10}"    required /></th>
                </tr>
                </tr>
                <tr>
                    <th> Trace ID: </th>
                    <th><input type="text" name="t3" value="" required /></th>
                    <th>
                    <th>State Code Description</th>
                     <th><input type= "text" name="t9" value="" pattern ="\d{10}"    required /></th>
                </tr>
                </tr>
                <tr>
                    <th>Request ID:</th>
                     <th><input type= "text" name="t4" value="" pattern ="\d{10}"    required /></th>
                     <th>
                    <th>Status Code:</th>
                    <th><input type= "text" name="t10" value="" pattern ="\d{10}"    required /></th>
                </tr>
                </tr>
                 <tr>
                    <th>Queue Item ID:</th>
                     <th><input type= "text" name="t5" value="" pattern ="\d{10}"    required /></th>
                </tr>
                 <tr>
                    <th>Notification ID:</th>
                     <th><input type= "text" name="t6" value="" pattern ="\d{10}"    required /></th>
                </tr>
                
                
                
                
                <tr>
                    <td><input type="submit" value="Submit " name="b1" /></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

   </BODY>
</HTML>
