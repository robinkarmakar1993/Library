<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
 <html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Message Trace</title>
</head>
<form>
    <body>
        <table border="2" width="1" cellspacing="1" cellpadding="2">
            <thead>
                <tr>
                    <th>Message Trace </th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td> Date From: </td>
                    <td><input type="email" name="t1" value=""  required/></td>
                </tr>
                <tr>
                    <td>Date To:</td>
                    <td><input type="password" name="t2" value="" required /></td>
                </tr>
                <tr>
                    <td> Trace ID: </td>
                    <td><input type="text" name="t3" value="" required /></td>
                </tr>
                <tr>
                    <td>Request ID:</td>
                     <td><input type= "text" name="t4" value="" pattern ="\d{10}"    required /></td>
                </tr>
                 <tr>
                    <td>Queue Item ID:</td>
                     <td><input type= "text" name="t5" value="" pattern ="\d{10}"    required /></td>
                </tr>
                 <tr>
                    <td>Notification ID:</td>
                     <td><input type= "text" name="t6" value="" pattern ="\d{10}"    required /></td>
                </tr>
                <tr>
                    <td>Provider CRM Instance ID:</td>
                     <td><input type= "text" name="t7" value="" pattern ="\d{10}"    required /></td>
                </tr>
                <tr>
                    <td>Outbound CRM Instance ID:</td>
                     <td><input type= "text" name="t8" value="" pattern ="\d{10}"    required /></td>
                </tr>
                <tr>
                    <td>State Code Description</td>
                     <td><input type= "text" name="t9" value="" pattern ="\d{10}"    required /></td>
                </tr>
                <tr>
                    <td>Status Code:</td>
                    <td><input type= "text" name="t10" value="" pattern ="\d{10}"    required /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit " name="b1" /></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
      </body>
</form>
</html>