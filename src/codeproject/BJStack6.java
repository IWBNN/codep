package codeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJStack6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<Integer>();
        int last = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch(S) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    que.offer(last);
                    break;
                case "pop" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    if(que.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(que.peek()).append("\n");
                    break;
                case "back" :
                    if(que.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Queue queue = new LinkedList();
//        StringBuilder sb = new StringBuilder();
//
//        int T = Integer.parseInt(br.readLine());
//        int last = 0;
//        for(int i = 0 ; i < T; i++){
//            String s = br.readLine();
//
//            if(s.contains("push")){
//                int c = (int) s.charAt(2);
//                last = c;
//                queue.add(c);
//            } else if(s.equals("pop")){
//                queue.poll();
//            } else if (s.equals("size")){
//                sb.append(queue.size()).append('\n');
//            } else if (s.equals("empty")){
//                if (queue.isEmpty()){
//                    sb.append("1").append('\n');
//                } else{
//                    sb.append("0").append('\n');
//                }
//            } else if (queue.equals("front")){
//                if (queue.isEmpty()){
//                    sb.append("-1").append('\n');
//                } else{ sb.append(queue.peek()).append('\n');
//                }
//            } else if (queue.equals("back")){
//                if (queue.isEmpty()){
//                    sb.append("-1").append('\n');
//                } else {
//                    sb.append(last).append('\n');
//                }
//            }
//        }
//        System.out.println(sb);
    }
}
