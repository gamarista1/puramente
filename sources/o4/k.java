package o4;

import Ug.G;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j4.C3615b;
import j4.C3616c;
import j4.C3622i;
import k4.C3662d;
import k4.C3663e;
import k4.C3670l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l4.C3738d;
import lf.C6535s;
import n4.C3856c;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final C3616c f47003a = new C3616c((G) null, (G) null, (G) null, (G) null, (C3856c.a) null, (C3663e) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C3615b) null, (C3615b) null, (C3615b) null, 32767, (DefaultConstructorMarker) null);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47004a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                k4.e[] r0 = k4.C3663e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                k4.e r1 = k4.C3663e.EXACT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                k4.e r1 = k4.C3663e.INEXACT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                k4.e r1 = k4.C3663e.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f47004a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.k.a.<clinit>():void");
        }
    }

    public static final boolean a(C3622i iVar) {
        int i10 = a.f47004a[iVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new C6535s();
            } else if ((iVar.q().m() != null || !(iVar.K() instanceof C3662d)) && (!(iVar.M() instanceof C3738d) || !(iVar.K() instanceof C3670l) || !(((C3738d) iVar.M()).a() instanceof ImageView) || ((C3738d) iVar.M()).a() != ((C3670l) iVar.K()).a())) {
                return false;
            }
        }
        return true;
    }

    public static final C3616c b() {
        return f47003a;
    }

    public static final Drawable c(C3622i iVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C3881d.a(iVar.l(), num.intValue());
    }
}
