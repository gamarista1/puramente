package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;

public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f32461a;

    /* renamed from: b  reason: collision with root package name */
    public int f32462b;

    /* renamed from: c  reason: collision with root package name */
    byte f32463c;

    /* renamed from: d  reason: collision with root package name */
    public byte f32464d;

    /* renamed from: e  reason: collision with root package name */
    byte f32465e;

    public void a(GifReader gifReader) {
        this.f32461a = gifReader.readUInt16();
        this.f32462b = gifReader.readUInt16();
        this.f32463c = gifReader.peek();
        this.f32464d = gifReader.peek();
        this.f32465e = gifReader.peek();
    }

    public boolean b() {
        if ((this.f32463c & 128) == 128) {
            return true;
        }
        return false;
    }

    public int c() {
        return 2 << (this.f32463c & 7);
    }
}
