import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class wa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final List<Member> members = new ArrayList<>();
        final Set<Member> winners = new HashSet<>();

        // 리스트에 넣고
        for (final Member member : Member.values()) {
            for (int i = 0; i < member.getNumOfTicket(); i++) {
                members.add(member);
            }
        }

        // 셔플
        Collections.shuffle(members);

        System.out.println("참여자 : " + members);
        System.out.println("엔터 누르면 한명씩 뽑혀요~");

        // 3명 뽑기
        while (winners.size() < 3) {
            br.readLine();

            final Member member = members.get(ThreadLocalRandom.current().nextInt(members.size()));
            System.out.println(member + " 당첨!");

            winners.add(member);
        }

        System.out.print("당첨자 : ");
        System.out.println(winners);
    }
}

enum Member {
    성현님(15),
    //    선준님(13),
    선아님(8),
    상혁님(7),
    예나님(6),
    인규님(6),
    영진님(6),
    근희님(5),
    학수님(4),
    연주님(3),
    동현A님(3),
    유진님(2),
    예진님(1),
    정현A님(1),
    승우님(1),
    석진님(1)
    ;

    private final int numOfTicket;

    Member(final int ticket) {
        this.numOfTicket = ticket;
    }

    public int getNumOfTicket() {
        return this.numOfTicket;
    }
}