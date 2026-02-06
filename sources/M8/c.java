package M8;

import T4.i;
import V4.v;
import W4.d;
import c5.C3176g;
import com.github.penfeizhou.animation.decode.b;
import h5.C3579e;
import java.io.IOException;

class c implements C3579e {

    /* renamed from: a  reason: collision with root package name */
    private final d f32691a;

    c(d dVar) {
        this.f32691a = dVar;
    }

    public v a(v vVar, i iVar) {
        try {
            return C3176g.c(((b) vVar.get()).v(0), this.f32691a);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
