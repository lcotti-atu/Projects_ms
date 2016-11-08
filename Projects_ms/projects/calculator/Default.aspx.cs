using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Text.RegularExpressions;

public partial class _Default : System.Web.UI.Page
{
    private int _leftbracecount;
    private int _rightbracecount;
    private char _lastchar;
    private char _beforelastchar;
    private String _mainoutputtext;
    private char[] num = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    protected void Page_Load(object sender, EventArgs e)
    {
        _mainoutputtext = mainoutput.Text;
        if (!_mainoutputtext.Equals("0"))
        {
            _lastchar = _mainoutputtext[_mainoutputtext.Length - 1];
            if (_mainoutputtext.Length > 1)
            {
                _beforelastchar = _mainoutputtext[_mainoutputtext.Length - 2];
            }
            for (int i = 0; i < _mainoutputtext.Length; i++)
            {
                if (_mainoutputtext[i] == '(')
                {
                    _leftbracecount++;
                }
                else if (_mainoutputtext[i] == ')')
                {
                    _rightbracecount++;
                }
            }
        }
        else
        {
            _mainoutputtext = "";
        }
    }
    protected void leftbrace_Click(object sender, EventArgs e)
    {
        if (!_mainoutputtext.Equals(""))
        {
            mainoutput.Text = _mainoutputtext + "(";
        }
        else
        {
            mainoutput.Text = "(";
        }
        lblRestrictions.Text = leftbrace.Text;
        clear.Text = "CE";
    }
    protected void rightbrace_Click(object sender, EventArgs e)
    {
        if (_leftbracecount > _rightbracecount && _lastchar != '(')
        {
            mainoutput.Text = _mainoutputtext + ")";
            lblRestrictions.Text = rightbrace.Text;
            clear.Text = "CE";
        }       
    }
    protected void percent_Click(object sender, EventArgs e)
    {
        if (_lastchar != '+' && _lastchar != '-' && _lastchar != '×' && _lastchar != '÷' && _lastchar != '(') 
        {
            mainoutput.Text = _mainoutputtext + "%";
            lblRestrictions.Text = percent.Text;
            clear.Text = "CE";
        }       
    }

    protected void clear_Click(object sender, EventArgs e)
    {
        if (clear.Text == "CE")
        {
            string k = "";

            string s = mainoutput.Text;
            for (int i = 0; i < s.Length; i++)
            {
                if (i == s.Length - 1)
                {
                    mainoutput.Text = k;
                    break;
                }
                k = k + s[i];


            }
            if (mainoutput.Text == "")
            {
                mainoutput.Text = "0";
            }
        }
        else if (clear.Text == "AC")
        {
            lblAns.Text = "Ans=" + mainoutput.Text;
            mainoutput.Text = "0";
        }
    }
    protected void seven_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + seven.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = seven.Text;

        }
        lblRestrictions.Text = seven.Text;
        clear.Text = "CE";
    }
    protected void eight_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + eight.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = eight.Text;

        }

        lblRestrictions.Text = eight.Text;
        clear.Text = "CE";
    }
    protected void nine_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + nine.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = nine.Text;

        }
        lblRestrictions.Text = nine.Text;
        clear.Text = "CE";
    }
    protected void dividedby_Click(object sender, EventArgs e)
    {

        if (_mainoutputtext.Equals(""))
        {

            mainoutput.Text = "0" + dividedby.Text;
            lblRestrictions.Text = dividedby.Text;
            clear.Text = "CE";
        }
        else if ((_lastchar == '-' || _lastchar == '+' || _lastchar == '×' || _lastchar == '÷'))
        {
            if (mainoutput.Text.Contains('9') || mainoutput.Text.Contains('8') || mainoutput.Text.Contains('7') || mainoutput.Text.Contains('6') || mainoutput.Text.Contains('5') || mainoutput.Text.Contains('4') || mainoutput.Text.Contains('3') || mainoutput.Text.Contains('2') || mainoutput.Text.Contains('1') || mainoutput.Text.Contains('0'))
            {
                string k = "";

                string s = mainoutput.Text;
                for (int i = 0; i < s.Length; i++)
                {
                    if (i == s.Length - 1)
                    {
                        mainoutput.Text = k + "÷";
                        break;
                    }
                    k = k + s[i];

                }
                lblRestrictions.Text = dividedby.Text;
                clear.Text = "CE";
            }
        }
        else
        {
            mainoutput.Text = _mainoutputtext + dividedby.Text;
            lblRestrictions.Text = dividedby.Text;
            clear.Text = "CE";
        }
        
    }
    protected void four_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + four.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = four.Text;

        }
        lblRestrictions.Text = four.Text;
        clear.Text = "CE";
    }
    protected void six_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + six.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = six.Text;

        }
        lblRestrictions.Text = six.Text;
        clear.Text = "CE";
    }
    protected void five_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + five.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = five.Text;

        }
        lblRestrictions.Text = five.Text;
        clear.Text = "CE";
    }
    protected void multipliedby_Click(object sender, EventArgs e)
    {

        if (_mainoutputtext.Equals(""))
        {

            mainoutput.Text = "0" + multipliedby.Text;
            lblRestrictions.Text = multipliedby.Text;
            clear.Text = "CE";
        }
        else if ((_lastchar == '-' || _lastchar == '+' || _lastchar == '×' || _lastchar == '÷'))
        {
            if (mainoutput.Text.Contains('9') || mainoutput.Text.Contains('8') || mainoutput.Text.Contains('7') || mainoutput.Text.Contains('6') || mainoutput.Text.Contains('5') || mainoutput.Text.Contains('4') || mainoutput.Text.Contains('3') || mainoutput.Text.Contains('2') || mainoutput.Text.Contains('1') || mainoutput.Text.Contains('0'))
            {
                string k = "";

                string s = mainoutput.Text;
                for (int i = 0; i < s.Length; i++)
                {
                    if (i == s.Length - 1)
                    {
                        mainoutput.Text = k + "×";
                        break;
                    }
                    k = k + s[i];

                }
                lblRestrictions.Text = multipliedby.Text;
                clear.Text = "CE";
            }
         }

        else
        {
            mainoutput.Text = _mainoutputtext + multipliedby.Text;
            lblRestrictions.Text = multipliedby.Text;
            clear.Text = "CE";
        }
    }
    protected void one_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + one.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = one.Text;

        }
        lblRestrictions.Text = one.Text;
        clear.Text = "CE";
    }
    protected void two_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + two.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = two.Text;

        }
        lblRestrictions.Text = two.Text;
        clear.Text = "CE";
    }
    protected void three_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + three.Text;
        mainoutput.Text = insertMultiplier(mainoutput.Text);
        if (lblRestrictions.Text == "=")
        {
            mainoutput.Text = "";
            mainoutput.Text = three.Text;

        }
        lblRestrictions.Text = three.Text;
        clear.Text = "CE";
    }
    protected void subtractedby_Click(object sender, EventArgs e)
    {
        if ((_lastchar == '-' || _lastchar == '+'))
        {
            if (mainoutput.Text.Contains('9') || mainoutput.Text.Contains('8') || mainoutput.Text.Contains('7') || mainoutput.Text.Contains('6') || mainoutput.Text.Contains('5') || mainoutput.Text.Contains('4') || mainoutput.Text.Contains('3') || mainoutput.Text.Contains('2') || mainoutput.Text.Contains('1') || mainoutput.Text.Contains('0'))
            {
                string k = "";

                string s = mainoutput.Text;
                for (int i = 0; i < s.Length; i++)
                {
                    if (i == s.Length - 1)
                    {
                        mainoutput.Text = k + "-";
                        break;
                    }
                    k = k + s[i];

                }
            }
            lblRestrictions.Text = subtractedby.Text;
            clear.Text = "CE";
        }
        else
        {
            mainoutput.Text = _mainoutputtext + subtractedby.Text;
            lblRestrictions.Text = subtractedby.Text;
            clear.Text = "CE";
        }
        
    }
    protected void zero_Click(object sender, EventArgs e)
    {
        if (!_mainoutputtext.Equals(""))
        {
            mainoutput.Text = _mainoutputtext + zero.Text;
            mainoutput.Text = insertMultiplier(mainoutput.Text);
            if (lblRestrictions.Text == "=")
            {
                mainoutput.Text = "";
                mainoutput.Text = zero.Text;

            }
            lblRestrictions.Text = zero.Text;
        }
        clear.Text = "CE";
    }
    protected void decimal_Click(object sender, EventArgs e)
    {
        mainoutput.Text = _mainoutputtext + decimalPoint.Text;
        lblRestrictions.Text = decimalPoint.Text;
        clear.Text = "CE";
    }
    protected void equalto_Click(object sender, EventArgs e)
    {
        string s = mainoutput.Text;
        if (s.Contains('+') || s.Contains('-') || s.Contains('×') || s.Contains('÷') || s.Contains('(') || s.Contains(')') || s.Contains('%'))
        {
            lblAns.Text = mainoutput.Text + "=";

        }

        else
        {

            lblAns.Text = "Ans=" + mainoutput.Text;
        }
        if (_lastchar == '+' || _lastchar == '-' || _lastchar == '×' || _lastchar == '÷' || _lastchar == 'r' || _lastchar == '(')
        {
            mainoutput.Text = "Error";
        }
        else
            mainoutput.Text = evaluate_expression(_mainoutputtext);
        lblRestrictions.Text = equalto.Text;
        clear.Text = "AC";
    }
    protected void addedby_Click(object sender, EventArgs e)
    {

        if (_mainoutputtext.Equals(""))
        {
            mainoutput.Text = "0" + addedby.Text;
        }
        else if ((_lastchar == '-' || _lastchar == '+' || _lastchar == '×' || _lastchar == '÷'))
        {
            if (mainoutput.Text.Contains('9') || mainoutput.Text.Contains('8') || mainoutput.Text.Contains('7') || mainoutput.Text.Contains('6') || mainoutput.Text.Contains('5') || mainoutput.Text.Contains('4') || mainoutput.Text.Contains('3') || mainoutput.Text.Contains('2') || mainoutput.Text.Contains('1') || mainoutput.Text.Contains('0'))
            {
                string k = "";

                string s = mainoutput.Text;
                for (int i = 0; i < s.Length; i++)
                {
                    if (i == s.Length - 1)
                    {
                        mainoutput.Text = k + "+";
                        break;
                    }
                    k = k + s[i];

                }
            }
            else
            {
            }
        }
        else
            mainoutput.Text = _mainoutputtext + addedby.Text;

        lblRestrictions.Text = addedby.Text;
        clear.Text = "CE";
    }
    protected String evaluate_expression(String expression)
    {
        String exp = expression;
        exp = exp.Replace(")(", ")×(").Replace(").(", ")×(");
        return evaluateRpn(convertToRpn(exp)).ToString();
    }

    protected String insertMultiplier(String expression)
    {
        String exp = expression;
        char[] num = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        //   char[] oper = new char[] { }
        for (int i = 0; i < expression.Length - 1; i++)
        {
            if (expression[i] == '%' && num.Contains(expression[i + 1]))
            {
                exp = expression.Substring(0, i + 1) + "×" + expression.Substring(i + 1);
            }
            else if (expression[i] == ')' && num.Contains(expression[i + 1]))
            {
                exp = expression.Substring(0, i + 1) + "×" + expression.Substring(i + 1);
            }
            else if (num.Contains(expression[i]) && expression[i + 1] == '(')
            {
                exp = expression.Substring(0, i + 1) + "×" + expression.Substring(i + 1);
            }
        }
        return exp;
    }

    protected String convertToRpn(String exp) //reverse polish notation
    {
        String rpn = "";
        Boolean negativeNumberHandler = false;
        Boolean operatorEncountered = false;
        Stack<char> operatr = new Stack<char>();
        Boolean numberEnds = false;
        for (int i = 0; i < exp.Length; i++)
        {
            char c = exp[i];
            if (i == 0 || operatorEncountered)
            {
                negativeNumberHandler = true;
            }
            if ((c == '(' || c == '+' || c == '-' || c == '÷' || c == '×') && !(negativeNumberHandler && c=='-'))
            {
                numberEnds = true;
                operatorEncountered = true;
                while (operatr.Count > 0 && higherprecedence(c, operatr.Peek()) && nextoperator(exp.Substring(i)) != '%')
                {
                    rpn = rpn + " " + operatr.Pop();
                }
                operatr.Push(c);
            }
            else if (c == ')')
            {
                numberEnds = true;
                while (operatr.Count > 0 && operatr.Peek() != '(')
                {
                    rpn = rpn + " " + operatr.Pop();
                }
                operatr.Pop();
            }
            else if (c == '%')
            {
                numberEnds = true;
                rpn = rpn + " " + c;
                if (operatr.Count > 0)
                {
                    rpn = rpn + " " + operatr.Pop();
                }
            }
            else
            {
                if (numberEnds) rpn = rpn + " " + exp[i];
                else rpn = rpn + exp[i];
                numberEnds = false;
                negativeNumberHandler = false;
                operatorEncountered = false;
            }
        }
        while (operatr.Count > 0)
        {
            rpn = rpn + " " + operatr.Pop();
        }
        Label1.Text = rpn + " ";
        return rpn + " ";
    }
    protected Boolean higherprecedence(char a, char b)
    {
        Boolean preceded = false;
        switch (a)
        {
            case '×':
                if (b == '×' || b == '÷')
                {
                    preceded = true;
                }
                break;
            case '÷':
                if (b == '×' || b == '÷')
                {
                    preceded = true;
                }
                break;
            case '+':
                if (b == '+' || b == '-' || b == '×' || b == '÷' || b == '%')
                {
                    preceded = true;
                }
                break;
            case '-':
                if (b == '+' || b == '-' || b == '×' || b == '÷' || b == '%')
                {
                    preceded = true;
                }
                break;
            case '%':
                if (b == '×' || b == '÷' || b == '%')
                {
                    preceded = true;
                }
                break;
            case '(':
                break;
            case ')':
                break;
        }
        return preceded;
    }

    protected double evaluateRpn(String rpnexpression)
    {
        Stack<double> evaluator = new Stack<double>();
        String pushnumber = "";
        Boolean newNumber = true;
        for (int i = 0; i < rpnexpression.Length; i++)
        {
            char c = rpnexpression[i];

            if (num.Contains(c) || c == '.' || (newNumber && c == '-' && i != rpnexpression.Length - 1 && rpnexpression[i+1]!=' '))
            {
                pushnumber = pushnumber + c;
                newNumber = false;
            }
            else if (c == ' ' && pushnumber != "")
            {
                evaluator.Push(Convert.ToDouble(pushnumber));
                pushnumber = "";
                newNumber = true;
            }
            else if (c == '-' || c == '+' || c == '×' || c == '÷')
            {
                evaluator.Push(calculate(evaluator.Pop(), evaluator.Pop(), c));
                newNumber = true;
            }
            else if (c == '%')
            {
                char nextoperator = ' ';
                newNumber = true;
                for (int j = i + 1; j < rpnexpression.Length; i++, j++)
                {
                    if (num.Contains(rpnexpression[j]) && rpnexpression[j] != '.' && rpnexpression[j] != ' ')
                    {
                        break;
                    }
                    if (!num.Contains(rpnexpression[j]) && rpnexpression[j] != '.' && rpnexpression[j] != ' ')
                    {
                        nextoperator = rpnexpression[j];
                        i = j;
                        break;
                    }
                }

                if (nextoperator == ' ')
                {
                    evaluator.Push(evaluator.Pop() / 100);
                    continue;
                }
                if (nextoperator == '%')
                {
                    double z;

                    double value;
                    z = evaluator.Pop();
                    if (z == '%')
                    {
                        double x = evaluator.Pop();
                        value = x / 100;
                        value = value / 100;
                        evaluator.Push(value);
                        continue;

                    }
                    else
                    {
                        value = z / 100;
                        value = value / 100;
                        evaluator.Push(value);
                        continue;
                    }

                }
                double a = evaluator.Pop();
                double b = evaluator.Pop();
                if (nextoperator == '+')
                {
                    evaluator.Push(b + a * b / 100);
                }
                else if (nextoperator == '-')
                {
                    evaluator.Push(b - a * b / 100);
                }
                else if (nextoperator == '×')
                {
                    evaluator.Push(a * b / 100);
                }
                else if (nextoperator == '÷')
                {
                    evaluator.Push(b * 100 / a);
                }
            }
        }
        return evaluator.Pop();
    }

    protected double calculate(double a, double b, char oprtr)
    {
        double value = 0;
        switch (oprtr)
        {
            case '+':
                value = b + a;
                break;
            case '-':
                value = b - a;
                break;
            case '×':
                value = b * a;
                break;
            case '÷':
                value = b / a;
                break;
        }
        return value;
    }

    protected char nextoperator(String expression)
    {
        char exp = ' ';
        for (int i = 0; i < expression.Length; i++)
        {
            if (!num.Contains(expression[i]) && expression[i] != '.')
            {
                exp = expression[i];
            }
        }
        return exp;
    }

    protected char previousoperator(String expression)
    {
        char exp = ' ';
        for (int i = expression.Length-1; i >= 0; i--)
        {
            if (!num.Contains(expression[i]) && expression[i] != '.')
            {
                exp = expression[i];
            }
        }
        return exp;
    }
}
