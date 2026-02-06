package X7;

import com.facebook.react.bridge.ReadableMap;
import i7.C3593b;
import i7.C3594c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends C3593b {

    /* renamed from: D  reason: collision with root package name */
    public static final a f35372D = new a((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    private final ReadableMap f35373B;

    /* renamed from: C  reason: collision with root package name */
    private final a f35374C;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b c(a aVar, C3594c cVar, ReadableMap readableMap, a aVar2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                aVar2 = a.DEFAULT;
            }
            return aVar.b(cVar, readableMap, aVar2);
        }

        public final b a(C3594c cVar, ReadableMap readableMap) {
            C6496s.h(cVar, "builder");
            return c(this, cVar, readableMap, (a) null, 4, (Object) null);
        }

        public final b b(C3594c cVar, ReadableMap readableMap, a aVar) {
            C6496s.h(cVar, "builder");
            C6496s.h(aVar, "cacheControl");
            return new b(cVar, readableMap, aVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ b(C3594c cVar, ReadableMap readableMap, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, readableMap, aVar);
    }

    public static final b A(C3594c cVar, ReadableMap readableMap) {
        return f35372D.a(cVar, readableMap);
    }

    public final a B() {
        return this.f35374C;
    }

    public final ReadableMap C() {
        return this.f35373B;
    }

    private b(C3594c cVar, ReadableMap readableMap, a aVar) {
        super(cVar);
        this.f35373B = readableMap;
        this.f35374C = aVar;
    }
}
