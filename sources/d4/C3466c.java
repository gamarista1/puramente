package d4;

import Gh.C5404e;
import X3.g;
import a4.C3114g;
import a4.V;
import d4.C3472i;
import j4.C3627n;
import java.nio.ByteBuffer;
import qf.C6658d;

/* renamed from: d4.c  reason: case insensitive filesystem */
public final class C3466c implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f43100a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43101b;

    /* renamed from: d4.c$a */
    public static final class a implements C3472i.a {
        /* renamed from: b */
        public C3472i a(ByteBuffer byteBuffer, C3627n nVar, g gVar) {
            return new C3466c(byteBuffer, nVar);
        }
    }

    public C3466c(ByteBuffer byteBuffer, C3627n nVar) {
        this.f43100a = byteBuffer;
        this.f43101b = nVar;
    }

    /* JADX INFO: finally extract failed */
    public Object a(C6658d dVar) {
        try {
            C5404e eVar = new C5404e();
            eVar.write(this.f43100a);
            this.f43100a.position(0);
            return new m(V.e(eVar, this.f43101b.g()), (String) null, C3114g.MEMORY);
        } catch (Throwable th2) {
            this.f43100a.position(0);
            throw th2;
        }
    }
}
