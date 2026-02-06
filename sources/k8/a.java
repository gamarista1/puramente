package K8;

import com.github.penfeizhou.animation.gif.io.GifReader;

public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public int f32436a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f32437b;

    public void a(GifReader gifReader) {
        byte peek = gifReader.peek();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < peek; i10++) {
            sb2.append((char) gifReader.peek());
        }
        String sb3 = sb2.toString();
        this.f32437b = sb3;
        if ("NETSCAPE2.0".equals(sb3)) {
            if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
                this.f32436a = gifReader.readUInt16();
            }
            do {
            } while (!e.c(gifReader).b());
            return;
        }
        do {
        } while (!e.c(gifReader).b());
    }
}
