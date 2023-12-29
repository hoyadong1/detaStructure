package javaBasic;

public class ForeachEx {
    
    enum Week{��,ȭ,��,��,��,��,��}

    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        String name[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
        
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
