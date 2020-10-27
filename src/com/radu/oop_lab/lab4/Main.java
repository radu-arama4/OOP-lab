package com.radu.oop_lab.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //First part
        //Incorrect parentheses
        System.out.println(Expression.checkExpressionForParentheses("((())"));
        //Correct parentheses
        System.out.println(Expression.checkExpressionForParentheses("((()))"));

        String filePath = new File("").getAbsolutePath();

        BufferedReader reader = new BufferedReader(new FileReader(filePath +
                "\\src\\com\\radu\\oop_lab\\lab4\\one_expression.txt"));

        try
        {
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                if (!(line.startsWith("*")))
                {
                    System.out.println(line);
                    System.out.println(Expression.checkExpressionForParentheses(line));
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        finally
        {
            reader.close();
        }

        //Second part

        reader = new BufferedReader(new FileReader(filePath +
                "\\src\\com\\radu\\oop_lab\\lab4\\three_expressions.txt"));

        try
        {
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                if (!(line.startsWith("*")))
                {
                    System.out.println(line);
                    System.out.println(Expression.checkExpressionForParentheses(line));
                }
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        finally
        {
            reader.close();
        }

    }
}
