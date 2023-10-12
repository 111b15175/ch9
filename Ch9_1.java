class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public CRectangle() {
        this(10, 8); // 使用this()設定width和height的值
    }
}

public class Ch9_1 {
    public static void main(String[] args) {
        // 在這裡你可以測試 CRectangle 類別的建構元
       
        CRectangle rect1 = new CRectangle();
        System.out.println("rect2: width=" + rect1.width + ", height=" + rect1.height);
    }
}