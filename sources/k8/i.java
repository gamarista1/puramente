package K8;

import K8.h;
import com.github.penfeizhou.animation.gif.io.GifReader;

public class i extends f {

    /* renamed from: a  reason: collision with root package name */
    private int f32449a;

    /* renamed from: b  reason: collision with root package name */
    private byte f32450b;

    /* renamed from: c  reason: collision with root package name */
    public int f32451c;

    /* renamed from: d  reason: collision with root package name */
    public int f32452d;

    public void a(GifReader gifReader) {
        this.f32449a = gifReader.peek() & 255;
        this.f32450b = gifReader.peek();
        this.f32451c = gifReader.readUInt16();
        this.f32452d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new h.a();
        }
    }

    public int c() {
        return (this.f32450b >> 2) & 7;
    }

    public boolean d() {
        if ((this.f32450b & 1) == 1) {
            return true;
        }
        return false;
    }
}
