package io.intercom.android.sdk.tickets;

import C.Y;
import M0.e;
import V.V;
import Y.C1500m;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FIleAttachmentListKt$FileAttachment$1 implements q {
    final /* synthetic */ FileType $fileType;
    final /* synthetic */ q $trialingIcon;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.FileType[] r0 = io.intercom.android.sdk.models.FileType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.FileType r1 = io.intercom.android.sdk.models.FileType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.FileType r1 = io.intercom.android.sdk.models.FileType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1.WhenMappings.<clinit>():void");
        }
    }

    FIleAttachmentListKt$FileAttachment$1(q qVar, FileType fileType) {
        this.$trialingIcon = qVar;
        this.$fileType = fileType;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        int i11;
        C6496s.h(y10, "$this$BoxedTextLayout");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(y10) ? 4 : 2;
        }
        if ((i10 & 91) == 18 && mVar.i()) {
            mVar.I();
        } else if (this.$trialingIcon != null) {
            mVar.T(1377519035);
            this.$trialingIcon.invoke(y10, mVar, Integer.valueOf(i10 & 14));
            mVar.M();
        } else {
            mVar.T(1377585003);
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.$fileType.ordinal()];
            if (i12 == 1) {
                i11 = R.drawable.intercom_ic_image;
            } else if (i12 != 2) {
                i11 = R.drawable.intercom_ic_attachment;
            } else {
                i11 = R.drawable.intercom_ic_video;
            }
            V.a(e.c(i11, mVar, 0), "Image Icon", androidx.compose.foundation.layout.q.n(i.f23074a, h.j((float) 16)), 0, mVar, 440, 8);
            mVar.M();
        }
    }
}
