package javaBasic;

import java.util.Iterator;
import java.util.StringTokenizer;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

}

class ColorTV extends TV{
    int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    
    void printPropoerty() {
        System.out.printf("%d¿Œƒ° %d Color TV\n",super.getSize(),color);
    }
    
}

class IPTV extends ColorTV{
    String ip;

    public IPTV(String ip,int size, int color) {
        super(size, color);
        this.ip = ip;
    }
    
    @Override
    void printPropoerty() {
        System.out.printf("%s ¡÷º“¿«",ip);
        super.printPropoerty();
    }
    
}


public class Trainning3 {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("This");
//        
//        sb.append(" is pencil");
//        System.out.println(sb);
//        
//        sb.insert(7, " my");
//        System.out.println(sb);
//        
//        sb.replace(8,10,"your");
//        System.out.println(sb);
//        
//        sb.delete(8, 13);
//        System.out.println(sb);
//        
//        sb.setLength(4);
//        System.out.println(sb);
        
//        StringTokenizer st = new StringTokenizer("»´±Êµø/¿Â»≠/»´∑√/ƒ·¡„/∆œ¡„","/");
//        while(st.hasMoreElements()) {
//            System.out.println(st.nextToken());
//        }
        System.out.println(Math.PI);
        System.out.println(Math.ceil(3.5));
        System.out.println(Math.floor(3.5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.exp(2));
        System.out.println(Math.round(3.14));
        
        System.out.println("¿Ãπ¯¡÷ «‡øÓ¿« π¯»£¥¬ ");
        for(int i=0;i<5;i++) {
            System.out.print((int)(Math.random()*45 + 1) + " "); 
        }
        
    }


}
