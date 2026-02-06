package fi;

import Gh.C5404e;
import Sc.c;
import com.google.gson.e;
import com.google.gson.t;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import retrofit2.C6675h;
import rh.D;
import rh.y;

final class b implements C6675h {

    /* renamed from: c  reason: collision with root package name */
    private static final y f67699c = y.e("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final e f67700a;

    /* renamed from: b  reason: collision with root package name */
    private final t f67701b;

    b(e eVar, t tVar) {
        this.f67700a = eVar;
        this.f67701b = tVar;
    }

    /* renamed from: a */
    public D convert(Object obj) {
        C5404e eVar = new C5404e();
        c t10 = this.f67700a.t(new OutputStreamWriter(eVar.t1(), StandardCharsets.UTF_8));
        this.f67701b.write(t10, obj);
        t10.close();
        return D.create(f67699c, eVar.o0());
    }
}
