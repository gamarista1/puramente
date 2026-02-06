package io.intercom.android.sdk.ui.coil;

import X3.a;
import X3.g;
import a4.C3126t;
import a4.N;
import a4.Y;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import io.intercom.android.sdk.ui.coil.PdfDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "LX3/g;", "getImageLoader", "(Landroid/content/Context;)LX3/g;", "imageLoader", "LX3/g;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomImageLoaderKt {
    private static g imageLoader;

    public static final g getImageLoader(Context context) {
        C6496s.h(context, "context");
        if (imageLoader == null) {
            g.a d10 = new g.a(context).d(Bitmap.Config.ARGB_8888);
            a.C0183a aVar = new a.C0183a();
            if (Build.VERSION.SDK_INT >= 28) {
                aVar.a(new N.a(false, 1, (DefaultConstructorMarker) null));
            } else {
                aVar.a(new C3126t.b(false, 1, (DefaultConstructorMarker) null));
            }
            aVar.a(new Y.b());
            aVar.a(new PdfDecoder.Factory());
            imageLoader = d10.i(aVar.e()).e();
        }
        g gVar = imageLoader;
        C6496s.e(gVar);
        return gVar;
    }
}
