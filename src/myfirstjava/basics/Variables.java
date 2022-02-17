package myfirstjava.basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String nameVariable = "Johan";
			System.out.println("This is my String Value " + " = " + nameVariable);
			
			int myNum = 15;
			System.out.println("This is my Int Value " + " = " + myNum);
			
			char myChar = 't';
			System.out.println("This is my Char Value " + " = " + myChar);
			
			boolean myBoolean1, myBoolean2;
			myBoolean1 = true;
			myBoolean2 = false;
			System.out.println("This is my Boolean Value 1 " + " = " + myBoolean1);
			System.out.println("This is my Boolean Value 2 " + " = " + myBoolean2);
			
			float myFloat = (float) 15.00;
			System.out.println("This is my Float Value " + " = " + myFloat);
			
			//Operators
			int myOperator = 100 + 50;
			System.out.println("This is my Operator Value " + " = " + myOperator);

			int myOperator2 = myOperator + 50;
			System.out.println("This is my Operator2 Value " + " = " + myOperator2);
			
			int myOperator3 = myOperator + myOperator2;
			System.out.println("This is my Operator3 Value " + " = " + myOperator3);
			
			int myOperator4 = 100 - 50;
			System.out.println("This is my Operator4 Value " + " = " + myOperator4);

			int myOperator5 = myOperator3 - 50;
			System.out.println("This is my Operator5 Value " + " = " + myOperator5);
			
			int myOperator6 = myOperator5 - myOperator4;
			System.out.println("This is my Operator6 Value " + " = " + myOperator6);
			
			int myOperator7 = 100 * 50;
			System.out.println("This is my Operator7 Value " + " = " + myOperator7);

			int myOperator8 = myOperator3 * 5;
			System.out.println("This is my Operator8 Value " + " = " + myOperator8);
			
			int myOperator9 = myOperator5 * myOperator4;
			System.out.println("This is my Operator9 Value " + " = " + myOperator9);

			int myOperator10 = 100 / 50;
			System.out.println("This is my Operator10 Value " + " = " + myOperator10);

			int myOperator11 = myOperator3 / 5;
			System.out.println("This is my Operator11 Value " + " = " + myOperator11);
			
			int myOperator12 = myOperator5 / myOperator4;
			System.out.println("This is my Operator12 Value " + " = " + myOperator12);

			//Modus
			int x = 5;
			int y = 2;
			System.out.println(x % y);
			
			//Increment
			int z = 5;
			++z;
			System.out.println(z);
			
			//Decrement
			int v = 5;
			--v;
			System.out.println(v);
			
			//assignment operators
			int a = 5;
			//a = a +3;
			a += 3;
			System.out.println(a);
			
			int b = 5;
			//b = b - 3;
			b -= 3;
			System.out.println(b);
				
			int c = 5;
			//c = c / 3;
			c /= 3;
			System.out.println(c);
			
			int d = 5;
			//d = d * 3;
			d *= 3;
			System.out.println(d);
	
			//Java Comparisons
			int e = 10;
			int f = 20;
			System.out.println( e == f);
			System.out.println( e != f);
			System.out.println( e > f);
			System.out.println( e < f);
			System.out.println( e >= f);
			System.out.println( e <= f);
			
			String txt1 = "ABCDEFGHIJKLMNOP";
			System.out.println("The length of the txt string is " + txt1.length());

			// other string methods toUpperCase and toLowerCase
			String txt = "Hello World";
			System.out.println(txt.toUpperCase());
			System.out.println(txt.toLowerCase());

			//Index Of
			String txt2 = "Please locate the 8 char of";
			System.out.println(txt2.indexOf("8"));
			System.out.println(txt2.indexOf("P"));
			System.out.println(txt2.indexOf("e"));
			System.out.println(txt2.indexOf("o"));
			System.out.println(txt2.indexOf("7"));
			
			//Concatination 
			String firstName = "Piet";
			String lastName = "Helpme";
			System.out.println(firstName + " " + lastName);
			System.out.println(firstName.concat(lastName));

			// the int will be automatically converted to string when concatted in this manner
			System.out.println(firstName + " " + x);

			// special chars
			String txt4 = "We are the so-called \"Vikings\" from the north";
			System.out.println(txt4);

			String txt5 = "We are the so-called 'Vikings' from the north";
			System.out.println(txt5);

			String txt6 = "We are the so-called \\Vikings\\ from the north";
			System.out.println(txt6);
			
			String txt14 = "We are the so-called Vikings' from the north";
			System.out.println(txt14);

			String txt15 = "We are the so-called Vikings \n from the north";
			System.out.println(txt15);

			String txt16 = "We are the so-called Vikings \t from the north";
			System.out.println(txt16);		
			
			//Java uses the + operator for both addition and concatenation.
			//Numbers are added. Strings are concatenated.
			int x1 = 10;
			int y1 = 10;
			int z1 = x1 + y1;
			System.out.println(z1);

			String xx = "10";
			String yy = "20";
			String zz = xx + yy;
			System.out.println(zz);
			
			String s1 = "AutomationProgramS12022";
			String s2 = "2022-02-08";
			// account number: 44444
			System.out.println(s1.substring(2,4));
			System.out.println(s1.substring(5,7));
			System.out.println(s2.substring(0,4));
			System.out.println(s2.substring(5,7));
			// Revese substring
			System.out.println(s1);
			
			//Boolean Values
			boolean isJavaFun = true;
			boolean isFishTasty = false;
			System.out.println(isJavaFun);
			System.out.println(isFishTasty);
			
			int x9 = 10;
			int y9 = 9;
			System.out.println(x9 > y9);

			System.out.println(8 > 10);

			System.out.println(15 == 10);
			
			int x10 = 20;
			int y10 = 18;
			if (x10 > y10) {
			System.out.println("20 is greater than 18");
			}
			
			
//			int time1 = 19;
//			if (time1 < 10 ) {
//			System.out.println("good Morning.");
//			} else if (time1 < 20) {
//			System.out.println("good day.");
//			} else {
//			System.out.println("Good Evening");
//			}

			int age = 13;
			if (age < 13 ) {
			System.out.println("Age is a that of a Child");
			} else if (age <= 20) {
			System.out.println("Age is a that of a Teenager");
			} else {
			System.out.println("Age is a that of a Adult");
			}
			// child < 13
			// teen < 21
			// adult > 21

			int time2 = 17;
			String result1 = (time2 < 18) ? "good day." : "Good evening.";
			System.out.println(result1);
			
			// using a switch statement
			// day is 6 then print Saturday
			// day 7 thing pring it's Sunday
			// otherwise print "Looking forward to the Weekend"
			
			int day1 = 6;
			switch (day1) {
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default: System.out.println("Looking forward to the Weekend");
			break; 
			}
			
			
			//While Loop
			
//			int i = 0;
//			while  (i < 5) {
//				System.out.println(i);
//				i++;
//			}
//			
			//Do While
			
//			int i = 0;
//			do {
//			
//				System.out.println(i);
//				i++;
//			}
//			while  (i < 5);
			
//			for (int i = 0; i < 5; i++) {
//				System.out.println(i);
//				}
			
//			for (int i= 0; i<=10; i=i+2) {
//				System.out.println(i);
//				}
			
//			String[] cars = {"volvo","BMW","Ford","Mazda"};
//			for (String i : cars) {
//			System.out.println(i);
//			}
			
			String[] fruit = {"apple","lemon","kiwi","banana"};
			for (String i : fruit) {
								System.out.println("the fruit is"+ " " + i);
			}

			String[] friend = {"Francien","Zelda","Dot","Marion"};
			for (String i : friend) {if (i == "Dot") {
								System.out.println("My Best friend is"+ " " + i);}
			}
			
			System.out.println("Hello \n\tAntoinette");
	}

}
