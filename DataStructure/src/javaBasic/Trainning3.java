package javaBasic;

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
        System.out.printf("%d인치 %d Color TV\n",super.getSize(),color);
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
        System.out.printf("%s 주소의",ip);
        super.printPropoerty();
    }
    
}


public class Trainning3 {



    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printPropoerty();
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);       
        iptv.printPropoerty();

    }

}
