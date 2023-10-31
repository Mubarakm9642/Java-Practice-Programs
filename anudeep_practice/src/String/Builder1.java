package String;

public class Builder1 {
	public static void main(String[] args) {
	// Create an empty StringBuilder with no initial content
	StringBuilder stringBuilder = new StringBuilder();

    // Append some content to the StringBuilder
    stringBuilder.append("Hello, ");
    stringBuilder.append("this is ");
    stringBuilder.append("a StringBuilder ");
    stringBuilder.append("example.");

    // Convert StringBuilder to a String and print it
    String result = stringBuilder.toString();
    System.out.println(result);
	}


}
