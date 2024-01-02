package dataStructure;

abstract class PairMap {
    protected String KeyArray[];
    protected String valueArray[];

    abstract String get(String key);

    abstract void put(String ket, String value);

    abstract String delete(String key);

    abstract int length();
}


public class Dictionary extends PairMap {
    public Dictionary(int size) {
        this.KeyArray = new String[size];
        this.valueArray = new String[size];
    }

    private int getIndex(String stringArray[], String str) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == null)
                return -1;
            if (stringArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    String get(String key) {
        if (this.getIndex(KeyArray, key) == -1)
            return null;
        return this.valueArray[getIndex(this.KeyArray, key)];
    }

    @Override
    void put(String key, String value) {
        for (String temp : this.KeyArray) {
            if (temp == null)
                break;
            if (temp.equals(key)) {
                this.valueArray[this.getIndex(KeyArray, key)] = value;
                return;
            }
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.KeyArray[i] == null) {
                this.KeyArray[i] = key;
                this.valueArray[i] = value;
                return;
            }
        }
    }

    @Override
    String delete(String key) {
        int idx = this.getIndex(KeyArray, key);
        if (idx == -1)
            return null;
        this.KeyArray[idx] = null;
        String deletedValue = this.valueArray[idx];
        this.valueArray[idx] = null;
        return deletedValue;
    }

    @Override
    int length() {
        return this.KeyArray.length + 1;
    }



    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }


}
