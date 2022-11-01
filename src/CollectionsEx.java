import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {    // iterator에 데이터가 있으면
            String e = iterator.next(); // iterator의 데이터를 e에 저장 // 첫 번째 데이터를 넘겨주고, iterator는 두 번째 데이터를 가리킴
            String separator;
            if (iterator.hasNext()) // 두번째 데이터가 존재하면
                separator = "->";   // ->를 넣어주고
            else
                separator = "\n";   // 아니면 줄 바꿈
            System.out.print(e+separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0,"터미네이터");
        myList.add(2,"아바타");
        // "터미네이터" -> "트랜스포머" -> "아바타" -> "스타워즈" -> "매트릭스"

        Collections.sort(myList); // 요소 정렬
        printList(myList); // 정렬된 요소 출력
        Collections.reverse(myList); // 요소의 순서를 반대로
        printList(myList); // 요소 출력
        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }
}
