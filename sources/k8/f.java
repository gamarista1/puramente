package K8;

import K8.h;
import com.github.penfeizhou.animation.gif.io.GifReader;

public abstract class f implements b {
    public static f b(GifReader gifReader) {
        byte peek = gifReader.peek();
        if (peek == -7) {
            return new i();
        }
        if (peek == 1) {
            return new l();
        }
        if (peek == -2) {
            return new d();
        }
        if (peek == -1) {
            return new a();
        }
        throw new h.a();
    }
}
