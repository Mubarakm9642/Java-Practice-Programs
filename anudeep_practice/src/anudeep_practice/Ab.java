package anudeep_practice;

public class Ab {

}
class GH {

void funct1(GH val1) {

val1 = null;

}

void funct2(GH val2) {

val2 = null;

}

public static void main(String s[]) {

GH val1 = null;

GH val2 = null;

new GH().funct1(val1);

new GH().funct2(val2);

System.out.print(val1 +"");

System.out.print(val2);

}}
