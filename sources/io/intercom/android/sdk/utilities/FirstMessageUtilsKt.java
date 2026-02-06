package io.intercom.android.sdk.utilities;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUg/K;", "applicationScope", "Lcom/intercom/twig/Twig;", "twig", "Landroid/content/Context;", "context", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dataLayer", "Llf/M;", "handleFirstMessageToast", "(LUg/K;Lcom/intercom/twig/Twig;Landroid/content/Context;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "showFirstMessageToast", "(Landroid/content/Context;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FirstMessageUtilsKt {
    public static final void handleFirstMessageToast(K k10, Twig twig, Context context, IntercomDataLayer intercomDataLayer) {
        C6496s.h(k10, "applicationScope");
        C6496s.h(twig, "twig");
        C6496s.h(context, "context");
        C6496s.h(intercomDataLayer, "dataLayer");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new FirstMessageUtilsKt$handleFirstMessageToast$1(intercomDataLayer, twig, context, (C6658d<? super FirstMessageUtilsKt$handleFirstMessageToast$1>) null), 3, (Object) null);
    }

    public static final void showFirstMessageToast(Context context) {
        C6496s.h(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.intercom_onboarding_layout, (ViewGroup) null);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(inflate);
        toast.show();
    }
}
