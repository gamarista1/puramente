package K1;

import Ff.l;
import I1.f;
import J1.b;
import Ug.K;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

public final class c implements Bf.c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f3983a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3984b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f3985c;

    /* renamed from: d  reason: collision with root package name */
    private final K f3986d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3987e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile f f3988f;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f3989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f3990b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f3989a = context;
            this.f3990b = cVar;
        }

        /* renamed from: a */
        public final File invoke() {
            Context context = this.f3989a;
            C6496s.g(context, "applicationContext");
            return b.a(context, this.f3990b.f3983a);
        }
    }

    public c(String str, b bVar, C6798l lVar, K k10) {
        C6496s.h(str, "name");
        C6496s.h(lVar, "produceMigrations");
        C6496s.h(k10, "scope");
        this.f3983a = str;
        this.f3984b = bVar;
        this.f3985c = lVar;
        this.f3986d = k10;
    }

    /* renamed from: d */
    public f a(Context context, l lVar) {
        f fVar;
        C6496s.h(context, "thisRef");
        C6496s.h(lVar, "property");
        f fVar2 = this.f3988f;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f3987e) {
            try {
                if (this.f3988f == null) {
                    Context applicationContext = context.getApplicationContext();
                    L1.c cVar = L1.c.f4132a;
                    b bVar = this.f3984b;
                    C6798l lVar2 = this.f3985c;
                    C6496s.g(applicationContext, "applicationContext");
                    this.f3988f = cVar.a(bVar, (List) lVar2.invoke(applicationContext), this.f3986d, new a(applicationContext, this));
                }
                fVar = this.f3988f;
                C6496s.e(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
