import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*

<applet code="FactApplet" width=400 height=300>

</applet>

*/

public class FactApplet extends Applet implements ActionListener{

TextField number,factorial;

Button compute;

public void init(){

Label numberp = new Label("Input Number: ");

Label factorialp = new Label("Factorial: ");

number= new TextField(30);

factorial = new TextField(30);

compute = new Button("Compute");

add(numberp);

add(number);

add(factorialp);

add(factorial);

add(compute);

compute.addActionListener(this);

    }

public void actionPerformed(ActionEvent e){

String snumber;

snumber = number.getText();

int inumber = Integer.parseInt(snumber);

factorial.setText(((Double)getFactorial(inumber)).toString());

    }

double getFactorial(int k)

{

double fact = 1;

for(int i=1;i<=k;i++)

fact = fact * i;

return fact;

    }

}