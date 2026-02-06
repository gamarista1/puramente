package P8;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class m {

    static class a extends IOException {
        a() {
            super("WebP Format error");
        }
    }

    public static boolean a(Reader reader) {
        Q8.a aVar;
        if (reader instanceof Q8.a) {
            aVar = (Q8.a) reader;
        } else {
            aVar = new Q8.a(reader);
        }
        try {
            if (!aVar.f("RIFF")) {
                return false;
            }
            aVar.skip(4);
            if (!aVar.f("WEBP")) {
                return false;
            }
            while (aVar.available() > 0) {
                e c10 = c(aVar);
                if (c10 instanceof k) {
                    return ((k) c10).e();
                }
            }
            return false;
        } catch (IOException e10) {
            if (!(e10 instanceof a)) {
                e10.printStackTrace();
            }
        }
    }

    public static List b(Q8.a aVar) {
        if (aVar.f("RIFF")) {
            aVar.skip(4);
            if (aVar.f("WEBP")) {
                ArrayList arrayList = new ArrayList();
                while (aVar.available() > 0) {
                    arrayList.add(c(aVar));
                }
                return arrayList;
            }
            throw new a();
        }
        throw new a();
    }

    static e c(Q8.a aVar) {
        e eVar;
        int position = aVar.position();
        int b10 = aVar.b();
        int e10 = aVar.e();
        if (k.f33560g == b10) {
            eVar = new k();
        } else if (b.f33533f == b10) {
            eVar = new b();
        } else if (c.f33536m == b10) {
            eVar = new c();
        } else if (a.f33532d == b10) {
            eVar = new a();
        } else if (i.f33558d == b10) {
            eVar = new i();
        } else if (j.f33559d == b10) {
            eVar = new j();
        } else if (g.f33557d == b10) {
            eVar = new g();
        } else if (n.f33572d == b10) {
            eVar = new n();
        } else if (f.f33556d == b10) {
            eVar = new f();
        } else {
            eVar = new e();
        }
        eVar.f33553a = b10;
        eVar.f33554b = e10;
        eVar.f33555c = position;
        eVar.c(aVar);
        return eVar;
    }
}
