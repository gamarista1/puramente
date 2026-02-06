package D8;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class d {

    static class a extends IOException {
        a() {
            super("APNG Format error");
        }
    }

    public static boolean a(Reader reader) {
        E8.a aVar;
        if (reader instanceof E8.a) {
            aVar = (E8.a) reader;
        } else {
            aVar = new E8.a(reader);
        }
        try {
            if (!aVar.a("PNG") || !aVar.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (aVar.available() > 0) {
                if (c(aVar) instanceof a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List b(E8.a aVar) {
        if (!aVar.a("PNG") || !aVar.a("\r\n\u001a\n")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.available() > 0) {
            arrayList.add(c(aVar));
        }
        return arrayList;
    }

    private static e c(E8.a aVar) {
        e eVar;
        int position = aVar.position();
        int c10 = aVar.c();
        int b10 = aVar.b();
        if (b10 == a.f30572g) {
            eVar = new a();
        } else if (b10 == f.f30595n) {
            eVar = new f();
        } else if (b10 == g.f30605f) {
            eVar = new g();
        } else if (b10 == h.f30607e) {
            eVar = new h();
        } else if (b10 == i.f30608e) {
            eVar = new i();
        } else if (b10 == j.f30609h) {
            eVar = new j();
        } else {
            eVar = new e();
        }
        eVar.f30594d = position;
        eVar.f30592b = b10;
        eVar.f30591a = c10;
        eVar.c(aVar);
        eVar.f30593c = aVar.c();
        return eVar;
    }
}
