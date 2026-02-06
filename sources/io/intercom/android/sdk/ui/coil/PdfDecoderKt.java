package io.intercom.android.sdk.ui.coil;

import com.google.android.gms.common.api.a;
import k4.C3660b;
import k4.C3661c;
import k4.C3666h;
import k4.C3667i;
import kotlin.Metadata;
import lf.C6535s;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk4/i;", "Lk4/h;", "scale", "Lkotlin/Function0;", "", "original", "widthPx", "(Lk4/i;Lk4/h;Lyf/a;)I", "heightPx", "Lk4/c;", "toPx", "(Lk4/c;Lk4/h;)I", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PdfDecoderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                k4.h[] r0 = k4.C3666h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                k4.h r1 = k4.C3666h.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                k4.h r1 = k4.C3666h.FIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.coil.PdfDecoderKt.WhenMappings.<clinit>():void");
        }
    }

    private static final int heightPx(C3667i iVar, C3666h hVar, C6787a aVar) {
        if (C3660b.b(iVar)) {
            return ((Number) aVar.invoke()).intValue();
        }
        return toPx(iVar.c(), hVar);
    }

    /* access modifiers changed from: private */
    public static final int toPx(C3661c cVar, C3666h hVar) {
        if (cVar instanceof C3661c.a) {
            return ((C3661c.a) cVar).f45103a;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new C6535s();
    }

    private static final int widthPx(C3667i iVar, C3666h hVar, C6787a aVar) {
        if (C3660b.b(iVar)) {
            return ((Number) aVar.invoke()).intValue();
        }
        return toPx(iVar.d(), hVar);
    }
}
