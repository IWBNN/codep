package codeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJStack5 { //1406 (시간초과)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stL = new Stack<>();
        Stack stR = new Stack<>();

        String str = br.readLine();

        for(int i = 0;i < str.length();i++){
            stL.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i < n;i++){
            String command = br.readLine();

            if(command.equals("L")){
                if(!stL.empty()){
                    stR.push(stL.pop());
                }
            }else if(command.equals("D")){
                if(!stR.empty()){
                    stL.push(stR.pop());
                }
            } else if(command.equals("B")){
                if(!stL.empty()){
                    stL.pop();
                }
            } else if (command.contains("P")){
                char c = command.charAt(2);
                stL.push(c);
            }
        }
        while(!stL.empty()){
            stR.push(stL.pop());
        }
        while(!stR.empty()){
            System.out.print(stR.pop());
        }


    }
}
