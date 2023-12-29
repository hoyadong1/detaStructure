package javaBasic;

public class ForeachEx {
    
    enum Week{월,화,수,목,금,토,일}

    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        String name[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        
        int sum = 0;
        for(int i : n) {
            sum +=i;
        }
        System.out.println(sum);

        for(String s : name) {
            System.out.print(s+" ");
        }
        
        System.out.println();
        for(Week day : Week.values()) {
            System.out.print(day+" ");
        }
    }

}
