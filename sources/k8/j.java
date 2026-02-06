package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;

public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f32453a;

    /* renamed from: b  reason: collision with root package name */
    public int f32454b;

    /* renamed from: c  reason: collision with root package name */
    public int f32455c;

    /* renamed from: d  reason: collision with root package name */
    public int f32456d;

    /* renamed from: e  reason: collision with root package name */
    private byte f32457e;

    /* renamed from: f  reason: collision with root package name */
    public c f32458f;

    /* renamed from: g  reason: collision with root package name */
    public int f32459g;

    /* renamed from: h  reason: collision with root package name */
    public int f32460h;

    public void a(GifReader gifReader) {
        this.f32453a = gifReader.readUInt16();
        this.f32454b = gifReader.readUInt16();
        this.f32455c = gifReader.readUInt16();
        this.f32456d = gifReader.readUInt16();
        this.f32457e = gifReader.peek();
        if (c()) {
            c cVar = new c(d());
            this.f32458f = cVar;
            cVar.a(gifReader);
        }
        this.f32459g = gifReader.peek() & 255;
        this.f32460h = gifReader.position();
        while (true) {
            byte peek = gifReader.peek();
            if (peek != 0) {
                gifReader.skip((long) (peek & 255));
            } else {
                return;
            }
        }
    }

    public boolean b() {
        if ((this.f32457e & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if ((this.f32457e & 128) == 128) {
            return true;
        }
        return false;
    }

    public int d() {
        return 2 << (this.f32457e & 15);
    }
}
