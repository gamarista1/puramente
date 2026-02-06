package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private int[] f32438a;

    public c(int i10) {
        this.f32438a = new int[i10];
    }

    public void a(GifReader gifReader) {
        for (int i10 = 0; i10 < this.f32438a.length; i10++) {
            byte peek = gifReader.peek();
            byte peek2 = gifReader.peek();
            int i11 = (peek2 & 255) << 8;
            byte b10 = peek & 255;
            this.f32438a[i10] = b10 | i11 | ((gifReader.peek() & 255) << 16) | -16777216;
        }
    }

    public int[] b() {
        return this.f32438a;
    }
}
