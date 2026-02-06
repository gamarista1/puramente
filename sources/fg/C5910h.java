package fg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.h  reason: case insensitive filesystem */
public final class C5910h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f67654e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5910h f67655f = new C5910h((C5916k) null, (C5912i) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5916k f67656a;

    /* renamed from: b  reason: collision with root package name */
    private final C5912i f67657b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67658c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f67659d;

    /* renamed from: fg.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5910h a() {
            return C5910h.f67655f;
        }

        private a() {
        }
    }

    public C5910h(C5916k kVar, C5912i iVar, boolean z10, boolean z11) {
        this.f67656a = kVar;
        this.f67657b = iVar;
        this.f67658c = z10;
        this.f67659d = z11;
    }

    public static /* synthetic */ C5910h c(C5910h hVar, C5916k kVar, C5912i iVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = hVar.f67656a;
        }
        if ((i10 & 2) != 0) {
            iVar = hVar.f67657b;
        }
        if ((i10 & 4) != 0) {
            z10 = hVar.f67658c;
        }
        if ((i10 & 8) != 0) {
            z11 = hVar.f67659d;
        }
        return hVar.b(kVar, iVar, z10, z11);
    }

    public final C5910h b(C5916k kVar, C5912i iVar, boolean z10, boolean z11) {
        return new C5910h(kVar, iVar, z10, z11);
    }

    public final boolean d() {
        return this.f67658c;
    }

    public final C5912i e() {
        return this.f67657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5910h)) {
            return false;
        }
        C5910h hVar = (C5910h) obj;
        if (this.f67656a == hVar.f67656a && this.f67657b == hVar.f67657b && this.f67658c == hVar.f67658c && this.f67659d == hVar.f67659d) {
            return true;
        }
        return false;
    }

    public final C5916k f() {
        return this.f67656a;
    }

    public final boolean g() {
        return this.f67659d;
    }

    public int hashCode() {
        int i10;
        C5916k kVar = this.f67656a;
        int i11 = 0;
        if (kVar == null) {
            i10 = 0;
        } else {
            i10 = kVar.hashCode();
        }
        int i12 = i10 * 31;
        C5912i iVar = this.f67657b;
        if (iVar != null) {
            i11 = iVar.hashCode();
        }
        return ((((i12 + i11) * 31) + Boolean.hashCode(this.f67658c)) * 31) + Boolean.hashCode(this.f67659d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f67656a + ", mutability=" + this.f67657b + ", definitelyNotNull=" + this.f67658c + ", isNullabilityQualifierForWarning=" + this.f67659d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5910h(C5916k kVar, C5912i iVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, iVar, z10, (i10 & 8) != 0 ? false : z11);
    }
}
