package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PreetyJson {

    public static void main(String args[]) {

        ArrayList<String> op = new PreetyJson().prettyJSON("[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]");

        for (int i = 0; i < op.size(); i++) {
            System.out.println(op.get(i));
        }

    }

    public ArrayList<String> prettyJSON(String a) {

        ArrayList<Character> openingTokens = new ArrayList<>(Arrays.asList('{', '['));

        ArrayList<Character> closingTokens = new ArrayList<>(Arrays.asList('}', ']'));

        ArrayList<Character> normalTokens = new ArrayList<>(Arrays.asList(',', ':'));

        ArrayList<Character> stringLiteral = new ArrayList<>(Arrays.asList('"'));

        ArrayList<String> output = new ArrayList<>();

        boolean indentationOn = false;

        boolean normalTokenSign = false;


        for (int i = 0; i < a.length(); i++) {

            if (openingTokens.contains(a.charAt(i))) {

                output.add("" + a.charAt(i));

                indentationOn = true;

            } else if (closingTokens.contains(a.charAt(i))) {

                output.add("" + a.charAt(i));

                indentationOn = false;

            } else {

                StringBuilder temp = new StringBuilder();


                if (indentationOn) {

                    temp.append("\t");

                }

                while (a.charAt(i) != '}' || a.charAt(i) != ']' || a.charAt(i) != ',' || a.charAt(i) != ':') {

                    temp.append(a.charAt(i));

                    i++;

                }

                if (a.charAt(i) != ',' || a.charAt(i) != ':') {

                    temp.append(a.charAt(i));

                }

                temp.append("\"");

                output.add(temp.toString());

            }


        }

        return output;
    }
}
