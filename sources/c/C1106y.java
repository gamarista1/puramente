package C;

import C.C1101t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

/* renamed from: C.y  reason: case insensitive filesystem */
public final class C1106y extends C1101t {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1103f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final C1106y f1104g = new C1106y(C1101t.a.Visible, 0, 0, (C6798l) null, (C6798l) null, 30, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C1106y f1105h = new C1106y(C1101t.a.Clip, 0, 0, (C6798l) null, (C6798l) null, 30, (DefaultConstructorMarker) null);

    /* renamed from: C.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1106y a() {
            return C1106y.f1105h;
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C1106y(C1101t.a aVar, int i10, int i11, C6798l lVar, C6798l lVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? null : lVar2);
    }

    private C1106y(C1101t.a aVar, int i10, int i11, C6798l lVar, C6798l lVar2) {
        super(aVar, i10, i11, lVar, lVar2, (DefaultConstructorMarker) null);
    }
}
