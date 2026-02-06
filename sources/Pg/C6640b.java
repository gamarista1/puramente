package pg;

import java.io.IOException;
import java.io.InputStream;
import pg.C6639a;

/* renamed from: pg.b  reason: case insensitive filesystem */
public abstract class C6640b implements r {

    /* renamed from: a  reason: collision with root package name */
    private static final C6645g f72486a = C6645g.c();

    private p d(p pVar) {
        if (pVar == null || pVar.e()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    private v e(p pVar) {
        if (pVar instanceof C6639a) {
            return ((C6639a) pVar).b();
        }
        return new v(pVar);
    }

    /* renamed from: f */
    public p a(InputStream inputStream, C6645g gVar) {
        return d(h(inputStream, gVar));
    }

    /* renamed from: g */
    public p c(InputStream inputStream, C6645g gVar) {
        return d(i(inputStream, gVar));
    }

    public p h(InputStream inputStream, C6645g gVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return i(new C6639a.C1046a.C1047a(inputStream, C6643e.A(read, inputStream)), gVar);
        } catch (IOException e10) {
            throw new C6649k(e10.getMessage());
        }
    }

    public p i(InputStream inputStream, C6645g gVar) {
        C6643e g10 = C6643e.g(inputStream);
        p pVar = (p) b(g10, gVar);
        try {
            g10.a(0);
            return pVar;
        } catch (C6649k e10) {
            throw e10.i(pVar);
        }
    }
}
