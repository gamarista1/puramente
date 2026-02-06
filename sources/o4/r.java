package o4;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.google.android.gms.common.api.a;
import k4.C3661c;
import k4.C3666h;
import lf.C6535s;

public abstract class r {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47011a;

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
                f47011a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.r.a.<clinit>():void");
        }
    }

    public static final Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        MediaMetadataRetriever.BitmapParams a10 = m.a();
        a10.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j10, i10, a10);
    }

    public static final Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, i11, i12);
        }
        MediaMetadataRetriever.BitmapParams a10 = m.a();
        a10.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, i11, i12, a10);
    }

    public static final int c(C3661c cVar, C3666h hVar) {
        if (cVar instanceof C3661c.a) {
            return ((C3661c.a) cVar).f45103a;
        }
        int i10 = a.f47011a[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new C6535s();
    }
}
