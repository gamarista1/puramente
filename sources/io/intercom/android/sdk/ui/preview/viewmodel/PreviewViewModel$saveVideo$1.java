package io.intercom.android.sdk.ui.preview.viewmodel;

import Ug.K;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveVideo$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
final class PreviewViewModel$saveVideo$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
    int label;
    final /* synthetic */ PreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewViewModel$saveVideo$1(PreviewViewModel previewViewModel, IntercomPreviewFile.NetworkFile networkFile, Context context, C6658d<? super PreviewViewModel$saveVideo$1> dVar) {
        super(2, dVar);
        this.this$0 = previewViewModel;
        this.$file = networkFile;
        this.$context = context;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new PreviewViewModel$saveVideo$1(this.this$0, this.$file, this.$context, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((PreviewViewModel$saveVideo$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            if (Build.VERSION.SDK_INT >= 29) {
                this.this$0.saveVideoOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                PreviewViewModel previewViewModel = this.this$0;
                String url = this.$file.getUrl();
                String mimeType = this.$file.getMimeType();
                Context context = this.$context;
                String str = Environment.DIRECTORY_DOWNLOADS;
                C6496s.g(str, "DIRECTORY_DOWNLOADS");
                previewViewModel.saveFileLegacy(url, mimeType, context, str);
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
