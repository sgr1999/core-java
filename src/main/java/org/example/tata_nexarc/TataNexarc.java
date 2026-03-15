package org.example.tata_nexarc;

import java.util.HashMap;

public class TataNexarc {

    public static void main(String[] args) {
        String str = "abababacSagar";

        HashMap<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

//        int maxLength = 3;
//        int start = 7;
//        end = 9
//        c = c

//        a = 9
//        b = 5
//        c = 7
//        S = 8
        for (int end =0; end < str.length(); end++){
            char c = str.charAt(end);
            if (map.containsKey(c)){
                start = Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);
    }

//    select s.student_id, s.student_name, s.class, m.marks
//    from student_info s join marks m
//    on s.student_id = m.student_id
//    where m.subject = 'Math'
//    order by m.marks desc
//    limit 2;

//    select s.student_id,
//    rank() over (order by sum(m.marks) desc) as rank
//    from student_info s join marks m
//    on s.student_id = m.student_id
//    where s.class = 5
//    group by s.student_id
//    order by rank;

}
