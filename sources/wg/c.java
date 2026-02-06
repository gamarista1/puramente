package Wg;

import Ff.g;
import Ug.C5582n;
import Zg.G;
import kotlin.jvm.internal.C6494p;
import yf.C6798l;
import yf.p;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j f66008a = new j(-1, (j) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f66009b = J.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f66010c = J.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final G f66011d = new G("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final G f66012e = new G("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final G f66013f = new G("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final G f66014g = new G("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final G f66015h = new G("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final G f66016i = new G("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final G f66017j = new G("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final G f66018k = new G("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    private static final G f66019l = new G("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final G f66020m = new G("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final G f66021n = new G("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final G f66022o = new G("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final G f66023p = new G("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final G f66024q = new G("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final G f66025r = new G("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final G f66026s = new G("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends C6494p implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66027a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j i(long j10, j jVar) {
            return c.x(j10, jVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (j) obj2);
        }
    }

    /* access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            return (long) i10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final boolean B(C5582n nVar, Object obj, C6798l lVar) {
        Object D10 = nVar.D(obj, (Object) null, lVar);
        if (D10 == null) {
            return false;
        }
        nVar.L(D10);
        return true;
    }

    static /* synthetic */ boolean C(C5582n nVar, Object obj, C6798l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(nVar, obj, lVar);
    }

    /* access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        long j11;
        if (z10) {
            j11 = 4611686018427387904L;
        } else {
            j11 = 0;
        }
        return j11 + j10;
    }

    /* access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* access modifiers changed from: private */
    public static final j x(long j10, j jVar) {
        return new j(j10, jVar, jVar.y(), 0);
    }

    public static final g y() {
        return a.f66027a;
    }

    public static final G z() {
        return f66019l;
    }
}
