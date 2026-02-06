package io.intercom.android.sdk.ui.component;

import Ug.K;
import Ug.V;
import android.net.Uri;
import e.C1935h;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.component.MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1", f = "MediaPickerButton.kt", l = {80}, m = "invokeSuspend")
final class MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1 extends l implements p {
    final /* synthetic */ List<Uri> $it;
    final /* synthetic */ MediaPickerButtonCTAStyle $mediaPickerButtonCTAStyle;
    final /* synthetic */ C1935h $previewLauncher;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(C1935h hVar, List<? extends Uri> list, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, C6658d<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1> dVar) {
        super(2, dVar);
        this.$previewLauncher = hVar;
        this.$it = list;
        this.$mediaPickerButtonCTAStyle = mediaPickerButtonCTAStyle;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(this.$previewLauncher, this.$it, this.$mediaPickerButtonCTAStyle, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            this.label = 1;
            if (V.a(50, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1935h hVar = this.$previewLauncher;
        Iterable<Uri> iterable = this.$it;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Uri localFile : iterable) {
            arrayList.add(new IntercomPreviewFile.LocalFile(localFile));
        }
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle = this.$mediaPickerButtonCTAStyle;
        if (mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TextButton) {
            str = ((MediaPickerButtonCTAStyle.TextButton) mediaPickerButtonCTAStyle).getCtaText();
        } else {
            str = null;
        }
        String str2 = str;
        hVar.b(new IntercomPreviewArgs(arrayList, DeleteType.Remove.INSTANCE, str2, this.$mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TopBarButton, (DownloadState) null, 16, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }
}
