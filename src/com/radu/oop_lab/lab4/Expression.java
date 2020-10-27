package com.radu.oop_lab.lab4;

import java.util.Stack;

public class Expression {

    //static private String expression = null;


    static private String makeNewString(String expression){
        String newExpr = "";
        String[] chars = expression.split("");
        for(int i=0;i<chars.length;i++){
            if(chars[i].equals(")")||chars[i].equals("(")){
                newExpr = newExpr.concat(chars[i]);
            }
        }
        return newExpr;
    }

    static public boolean checkExpressionForParentheses(String expr){
        Stack<String> exp = new Stack<>();
        String[] chars = makeNewString(expr).split("");
        for(String ch:chars){
            if(ch.equals(")") && !exp.isEmpty() && exp.peek().equals("(")){
                exp.pop();
            }
            else{
                exp.push(ch);
            }
        }
        return exp.isEmpty();
    }


    public double inTwoParentheses(String exp){
        System.out.println(exp);
        String[] elements = {};
        elements=exp.split("\\+|\\-|\\)|\\(");
        String sign = exp.replaceAll("[0-9]+", " ");
        sign = sign.replaceAll("\\*", " ");
        sign = sign.replaceAll("/", " ");
        sign = sign.replaceAll("\\.", " ");
        sign = sign.replaceAll("\\(", " ");
        sign = sign.replaceAll("\\)", " ");
        String[] signs = sign.trim().split("\\s+");

//        for(String el:elements){
//            System.out.println(el);
//        }
//
//
//        for(String sgn:signs){
//            System.out.println(sgn);
//        }

        double result=Float.parseFloat(elements[0]);
        //double result=0;
        for(int i=1;i<elements.length;i++){
            if(signs[i-1].equals("+")){
                if(elements[i].contains("*")||elements[i].contains("/")){
                    result+=justMultDiv(elements[i]);
                }else{
                    result+=Float.parseFloat(elements[i]);
                }
            }else{
                if(elements[i].contains("*")||elements[i].contains("/")){
                    result-=justMultDiv(elements[i]);
                }else{
                    result-=Float.parseFloat(elements[i]);
                }
            }
            //System.out.println(result);
        }
        System.out.println("Result -> " + result);
        return result;
    }

    public double justMultDiv(String exp){
        String[] elements = exp.split("\\*|\\/");
        String sign = exp.replaceAll("[0-9]+", " ");
        sign = sign.replaceAll("\\.", " ");
        String[] signs = sign.trim().split(" ");
        double result = Float.parseFloat(elements[0]);
        for(int i=1;i<elements.length;i++){
            if(signs[i-1].equals("*")){
                result*=Float.parseFloat(elements[i]);
            }else{
                result/=Float.parseFloat(elements[i]);
            }
        }
        //System.out.println(result);
        return result;
    }
}
