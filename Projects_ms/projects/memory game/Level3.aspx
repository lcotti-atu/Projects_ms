<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Level3.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
        <asp:ScriptManager ID="ScriptManager1" runat="server">
        </asp:ScriptManager>
            <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                <ContentTemplate>
                    <asp:Timer ID="Timer1" runat="server" Interval="1000">
                        <%--Interval="1000"--%>
                    </asp:Timer>
                    <asp:HiddenField ID="ResetHidden" runat="server" EnableViewState="False" OnValueChanged="ResetHidden_ValueChanged" Value="false"/>
                </ContentTemplate>
        </asp:UpdatePanel>
        <asp:UpdatePanel ID="UpdatePanel2" runat="server">
        <ContentTemplate>
        <br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
        <br />
                <asp:ImageButton ID="ImageButton0" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton1" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton2" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton9" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
            No of Clicks:<asp:Label ID="lblNoOfClicks" runat="server" Text="0"></asp:Label>
        <br />
                <asp:ImageButton ID="ImageButton3" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton4" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton5" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                
                <asp:ImageButton ID="ImageButton10" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                
        <br />
                <asp:ImageButton ID="ImageButton6" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton7" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton8" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton11" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
        <br />
                <asp:ImageButton ID="ImageButton12" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton13" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton14" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
                <asp:ImageButton ID="ImageButton15" runat="server" BackColor="Black" Height="102px" OnClick="ImageButtonClick" style="text-align: center" Width="100px"  ImageUrl="~/Image/dark.jpg"/>
        <br />  
             &nbsp;&nbsp;&nbsp; TIME:<asp:Label ID="lbltimer" runat="server" Text="0"></asp:Label>
                    &nbsp;&nbsp;&nbsp; SCORE:<asp:Label ID="lblScore" runat="server" Text="0"></asp:Label>
                    <asp:Button ID="saveButton" runat="server" Text="save" OnClick="saveClick" />
                
            </ContentTemplate>
        </asp:UpdatePanel>
    </div>
    <div id="screen" style='display:none;width:100%;height:100%;position:absolute; left:0; top:0;z-index: 1;background-color: white;filter: alpha(opacity=0, style=0);'>
	<table style="width:100%;height:100%">
	<tr><td></td></tr>
	</table>
	</div>
    </form>
</body>
    <script type="text/javascript">
        var reset = document.getElementById('<%=ResetHidden.ClientID%>');
        doEnable();
        function waitTillReset() {
            if (reset.value == 'true') {
                doDisable();
                setTimeout(function () {
                    doEnable();
                }, 800);
            }
        }
        function doEnable() {
            document.getElementById("screen").style.display = "none";
        }
        function doDisable() {
            document.getElementById("screen").style.width = document.body.scrollWidth;
            document.getElementById("screen").style.height = document.body.scrollHeight;
            document.getElementById("screen").style.display = "";
        }
        function abc() {
            alert('abc');
        }
</script>
</html>
