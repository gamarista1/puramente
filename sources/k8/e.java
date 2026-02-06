package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;

public class e implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final e f32440c = new e(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f32441a;

    /* renamed from: b  reason: collision with root package name */
    private int f32442b;

    public e(int i10) {
        this.f32441a = i10;
    }

    public static e c(GifReader gifReader) {
        byte peek = gifReader.peek() & 255;
        if (peek == 0) {
            return f32440c;
        }
        e eVar = new e(peek);
        eVar.f32442b = gifReader.position();
        eVar.a(gifReader);
        return eVar;
    }

    public void a(GifReader gifReader) {
        gifReader.skip((long) this.f32441a);
    }

    public boolean b() {
        if (this == f32440c) {
            return true;
        }
        return false;
    }
}
