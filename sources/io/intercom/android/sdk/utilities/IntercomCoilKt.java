package io.intercom.android.sdk.utilities;

import X3.h;
import android.content.Context;
import android.graphics.drawable.Drawable;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import j4.C3622i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "Lj4/i;", "imageRequest", "Llf/M;", "loadIntercomImage", "(Landroid/content/Context;Lj4/i;)V", "Landroid/graphics/drawable/Drawable;", "loadIntercomImageBlocking", "(Landroid/content/Context;Lj4/i;)Landroid/graphics/drawable/Drawable;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomCoilKt {
    public static final void loadIntercomImage(Context context, C3622i iVar) {
        C6496s.h(context, "context");
        C6496s.h(iVar, "imageRequest");
        IntercomImageLoaderKt.getImageLoader(context).c(iVar);
    }

    public static final Drawable loadIntercomImageBlocking(Context context, C3622i iVar) {
        C6496s.h(context, "context");
        C6496s.h(iVar, "imageRequest");
        return h.a(IntercomImageLoaderKt.getImageLoader(context), iVar).a();
    }
}
