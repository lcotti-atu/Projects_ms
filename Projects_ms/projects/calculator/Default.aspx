<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <asp:Label ID="lblAns" runat="server"></asp:Label>
        
                    <br />
                    <asp:TextBox ID="mainoutput" runat="server" Font-Size="XX-Large" style="text-align:right " Height="39px"   Width="305px" ReadOnly="True"   >0</asp:TextBox>
                    <br />
        
                    <asp:Button ID="leftbrace" runat="server" Text="(" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Medium"
                         OnClick="leftbrace_Click"/>
               
                    <asp:Button ID="rightbrace" runat="server" Text=")" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Medium"
                        OnClick="rightbrace_Click"/>
              
                    <asp:Button ID="percent" runat="server" Text="%" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Medium"
                        OnClick="percent_Click"/>
                
                    <asp:Button ID="clear" runat="server" Text="AC" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" OnClick="clear_Click"/>
              
           
                    <br />
              
           
                    <asp:Button ID="seven" runat="server" Text="7" Width="75" Height="40" Font-Names="Questrial" OnClick="seven_Click"/>
               
                    <asp:Button ID="eight" runat="server" Text="8" Width="75" Height="40" Font-Names="Questrial" OnClick="eight_Click"/>
                
                    <asp:Button ID="nine" runat="server" Text="9" Width="75" Height="40" Font-Names="Questrial" OnClick="nine_Click"/>
               
                    <asp:Button ID="dividedby" runat="server" Text="÷" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Large" 
                        OnClick="dividedby_Click"/>
              
           
                    <br />
              
           
                    <asp:Button ID="four" runat="server" Text="4" Width="75" Height="40" Font-Names="Questrial" OnClick="four_Click"/>
               
                        <asp:Button ID="five" runat="server" Text="5" Width="75" Height="40" Font-Names="Questrial" OnClick="five_Click"/>
                
                       <asp:Button ID="six" runat="server" Text="6" Width="75" Height="40" Font-Names="Questrial" OnClick="six_Click"/>
                 
                       <asp:Button ID="multipliedby" runat="server" Text="×" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Large"
                           OnClick="multipliedby_Click"/>
               
                    <br />
               
                    <asp:Button ID="one" runat="server" Text="1" Width="75" Height="40" Font-Names="Questrial" OnClick="one_Click"/>
               
                    <asp:Button ID="two" runat="server" Text="2" Width="75" Height="40" Font-Names="Questrial" OnClick="two_Click"/>
                
                    <asp:Button ID="three" runat="server" Text="3" Width="75" Height="40" Font-Names="Questrial" OnClick="three_Click"/>
               
                    <asp:Button ID="subtractedby" runat="server" Text="-" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Large"
                        OnClick="subtractedby_Click"/>
              
                    <br />
              
                    <asp:Button ID="zero" runat="server" Text="0" Width="75" Height="40" Font-Names="Questrial" OnClick="zero_Click"/>
               
                        <asp:Button ID="decimalPoint" runat="server" Text="." Width="75" Height="40" Font-Names="Questrial" Font-Bold="true" OnClick="decimal_Click"/>
                
                         <asp:Button ID="equalto" runat="server" Text="=" BackColor="Blue" ForeColor="White" Width="75" Height="40" Font-Names="Questrial"  
                             Font-Size="Large" OnClick="equalto_Click"/>
              
                       <asp:Button ID="addedby" runat="server" Text="+" Width="75" Height="40" Font-Names="Questrial" BackColor="#C0C0C0" Font-Size="Large"
                           OnClick="addedby_Click"/>
               
                    <br />
                    <br />
                    <br />
                    <br />
                    <asp:Label ID="lblRestrictions" runat="server" Text="A" Visible="False"></asp:Label>
               
        <br />
        <asp:Label ID="Label1" runat="server" Text="Label" Visible="False"></asp:Label>
    </div>
    </form>
</body>
</html>
