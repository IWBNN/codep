package codeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BJStack8 { //BJStack7 = BJS44
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String[] s = br.readLine().split(" ");

            // 첫 번째 단어에 대한 switch-case
            switch (s[0]) {

                case "push_front": {
                    dq.addFirst(Integer.parseInt(s[1]));
                    break;
                }

                case "push_back": {
                    dq.addLast(Integer.parseInt(s[1]));
                    break;
                }

                case "pop_front": {
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollFirst()).append('\n');
                    }
                    break;
                }

                case "pop_back": {
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollLast()).append('\n');
                    }
                    break;
                }

                case "size": {
                    sb.append(dq.size()).append('\n');
                    break;
                }

                case "empty": {
                    if (dq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;
                }

                case "front": {
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekFirst()).append('\n');
                    }
                    break;
                }

                case "back": {
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekLast()).append('\n');
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        Queue qL = new LinkedList();
//        Queue qR = new LinkedList();
//        int T = Integer.parseInt(br.readLine());
//        int a = 0;
//        int last = 0;
//        for(int i = 0; i < T; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String s = st.nextToken();
//
//            switch(s){
//                case "push_front":
//                    a = Integer.parseInt(st.nextToken());
//                    while(qL.isEmpty()) {
//                        qR.offer(qL.poll());
//                    }
//                    qL.offer(a);
//                    if(last != 0){
//                        last = a;
//                    }
//                    while(qR.isEmpty()){
//                        qL.offer(qR.poll());
//                    }
//                    break;
//
//                case "push_back":
//                    a = Integer.parseInt(st.nextToken());
//                    qL.offer(a);
//                    last = a;
//                    break;
//
//                case "pop_front":
//                    if(qL.isEmpty()){
//                        sb.append(-1).append('\n');
//                    } else{
//                        sb.append(qL.poll()).append('\n');
//                    }
//                    break;
//
//                case "pop_back":
//                    if (qL.isEmpty()){
//                        sb.append(-1).append('\n');
//                    } else {
//                        while (qL.isEmpty()) {
//                            qR.offer(qL.poll());
//                        }
//                        sb.append(qR.poll()).append('\n');
//                        while (qR.isEmpty()) {
//                            qL.offer(qR.poll());
//                        }
//                    }
//                    break;
//
//                case "size":
//                    sb.append(qL.size()).append('\n');
//                    break;
//
//                case "empty":
//                    if (qL.isEmpty()){
//                        sb.append(1).append('\n');
//                    } else {
//                        sb.append(0).append('\n');
//                    }
//                    break;
//
//                case "front":
//                    if (qL.isEmpty()){
//                        sb.append(-1).append('\n');
//                    } else {
//                        sb.append(qL.peek()).append('\n');
//                    }
//                    break;
//
//                case "back":
//                    sb.append(last).append('\n');
//                    break;
//            }
//        }
//        System.out.println(sb);
//    }
}
