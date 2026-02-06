package androidx.compose.foundation.gestures;

import B.l;
import D0.A;
import J0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import z.m;
import z.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010'R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010'¨\u0006/"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LJ0/V;", "Landroidx/compose/foundation/gestures/c;", "Lz/m;", "state", "Lz/q;", "orientation", "", "enabled", "LB/l;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LUg/K;", "Lq0/g;", "Lqf/d;", "Llf/M;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lz/m;Lz/q;ZLB/l;ZLyf/q;Lyf/q;Z)V", "d", "()Landroidx/compose/foundation/gestures/c;", "node", "e", "(Landroidx/compose/foundation/gestures/c;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lz/m;", "c", "Lz/q;", "Z", "LB/l;", "f", "g", "Lyf/q;", "h", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DraggableElement extends V {

    /* renamed from: j  reason: collision with root package name */
    public static final b f12573j = new b((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    private static final C6798l f12574k = a.f12583a;

    /* renamed from: b  reason: collision with root package name */
    private final m f12575b;

    /* renamed from: c  reason: collision with root package name */
    private final q f12576c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12577d;

    /* renamed from: e  reason: collision with root package name */
    private final l f12578e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12579f;

    /* renamed from: g  reason: collision with root package name */
    private final yf.q f12580g;

    /* renamed from: h  reason: collision with root package name */
    private final yf.q f12581h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f12582i;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12583a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(A a10) {
            return Boolean.TRUE;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public DraggableElement(m mVar, q qVar, boolean z10, l lVar, boolean z11, yf.q qVar2, yf.q qVar3, boolean z12) {
        this.f12575b = mVar;
        this.f12576c = qVar;
        this.f12577d = z10;
        this.f12578e = lVar;
        this.f12579f = z11;
        this.f12580g = qVar2;
        this.f12581h = qVar3;
        this.f12582i = z12;
    }

    /* renamed from: d */
    public c a() {
        return new c(this.f12575b, f12574k, this.f12576c, this.f12577d, this.f12578e, this.f12579f, this.f12580g, this.f12581h, this.f12582i);
    }

    /* renamed from: e */
    public void b(c cVar) {
        cVar.T2(this.f12575b, f12574k, this.f12576c, this.f12577d, this.f12578e, this.f12579f, this.f12580g, this.f12581h, this.f12582i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (C6496s.c(this.f12575b, draggableElement.f12575b) && this.f12576c == draggableElement.f12576c && this.f12577d == draggableElement.f12577d && C6496s.c(this.f12578e, draggableElement.f12578e) && this.f12579f == draggableElement.f12579f && C6496s.c(this.f12580g, draggableElement.f12580g) && C6496s.c(this.f12581h, draggableElement.f12581h) && this.f12582i == draggableElement.f12582i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((this.f12575b.hashCode() * 31) + this.f12576c.hashCode()) * 31) + Boolean.hashCode(this.f12577d)) * 31;
        l lVar = this.f12578e;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((hashCode + i10) * 31) + Boolean.hashCode(this.f12579f)) * 31) + this.f12580g.hashCode()) * 31) + this.f12581h.hashCode()) * 31) + Boolean.hashCode(this.f12582i);
    }
}
