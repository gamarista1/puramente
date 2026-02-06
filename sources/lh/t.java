package lh;

import gh.C5978b;
import gh.C5985i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import yf.C6787a;

@C5985i(with = u.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Llh/t;", "Llh/x;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "content", "", "b", "()Z", "isString", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t extends x {
    public static final t INSTANCE = new t();

    /* renamed from: a  reason: collision with root package name */
    private static final String f72007a = "null";

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ Lazy f72008b = C6531o.a(C6534r.PUBLICATION, a.f72009a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72009a = new a();

        a() {
            super(0);
        }

        public final C5978b invoke() {
            return u.f72010a;
        }
    }

    private t() {
        super((DefaultConstructorMarker) null);
    }

    private final /* synthetic */ C5978b g() {
        return (C5978b) f72008b.getValue();
    }

    public String a() {
        return f72007a;
    }

    public boolean b() {
        return false;
    }

    public final C5978b serializer() {
        return g();
    }
}
