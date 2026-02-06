package fi;

import Sc.a;
import Sc.b;
import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.t;
import retrofit2.C6675h;
import rh.F;

final class c implements C6675h {

    /* renamed from: a  reason: collision with root package name */
    private final e f67702a;

    /* renamed from: b  reason: collision with root package name */
    private final t f67703b;

    c(e eVar, t tVar) {
        this.f67702a = eVar;
        this.f67703b = tVar;
    }

    /* renamed from: a */
    public Object convert(F f10) {
        a s10 = this.f67702a.s(f10.f());
        try {
            Object read = this.f67703b.read(s10);
            if (s10.I0() == b.END_DOCUMENT) {
                return read;
            }
            throw new i("JSON document was not fully consumed.");
        } finally {
            f10.close();
        }
    }
}
