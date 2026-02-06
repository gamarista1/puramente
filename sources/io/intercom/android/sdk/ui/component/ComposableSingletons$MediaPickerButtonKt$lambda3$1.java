package io.intercom.android.sdk.ui.component;

import Y.C1500m;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import x.C2843G;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1  reason: invalid class name */
final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements p {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    ComposableSingletons$MediaPickerButtonKt$lambda3$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(List list) {
        C6496s.h(list, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            MediaPickerButtonKt.MediaPickerButton(1, (C2843G) null, (MediaType) null, (Set<String>) null, new C6343h(), new MediaPickerButtonCTAStyle.TextButton("Open Picker"), (C6787a) null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m577getLambda2$intercom_sdk_ui_release(), mVar, 12607494, 78);
        } else {
            mVar.I();
        }
    }
}
