package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.j  reason: case insensitive filesystem */
public final class C1640j implements C1637i {

    /* renamed from: b  reason: collision with root package name */
    private static final a f13756b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f13757c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityManager f13758a;

    /* renamed from: androidx.compose.ui.platform.j$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1640j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f13758a = (AccessibilityManager) systemService;
    }

    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        if (j10 >= 2147483647L) {
            return j10;
        }
        if (z11) {
            z10 |= true;
        }
        if (z12) {
            z10 |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a10 = C1620c0.f13695a.a(this.f13758a, (int) j10, z10 ? 1 : 0);
            if (a10 != Integer.MAX_VALUE) {
                return (long) a10;
            }
        } else if (!z12 || !this.f13758a.isTouchExplorationEnabled()) {
            return j10;
        }
        return Long.MAX_VALUE;
    }
}
