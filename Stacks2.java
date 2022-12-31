import java.io.*;
import java.util.*;

public class Stacks2 {
    public static void main(String[]args) {
        String str=new String("/a/./b/../../c/");
        String res=Simplify(str);
        System.out.println(res);
    }
    static String Simplify(String str){
        Stack<String> st=new Stack<>();
        String res="";
        res+='/';
        int len_str=str.length();

        for(int i=0; i<len_str; i++){
            String dir="";
            while(i<len_str && str.charAt(i)=='/')
            i++;
            while(i<len_str && str.charAt(i)!='/'){
            dir=dir+str.charAt(i);
            i++;
            }
            if(dir.equals("..")==true){
                if(!st.empty())
                st.pop();
            }
            else if(dir.equals(".")==true)
            continue;
            else if(dir.length()!=0)
            st.push(dir);
        }
        Stack<String> st1=new Stack<String>();
        while(!st.empty()){
            st1.push(st.pop());
        }
        while(!st1.empty()){
            if(st1.size()!=1)
            res+=(st1.pop()+'/');
            else
            res+=st1.pop();
        }
return res;
    }
}
