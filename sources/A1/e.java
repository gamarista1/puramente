package A1;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.C1680b0;
import androidx.core.view.C1683d;
import x1.g;

public abstract class e {

    class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f428a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f428a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f428a.a(f.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    class b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f429a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f429a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (e.e(str, bundle, this.f429a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(f fVar, int i10, Bundle bundle);
    }

    private static c b(View view) {
        g.f(view);
        return new d(view);
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        x1.c.d(inputConnection, "inputConnection must be non-null");
        x1.c.d(editorInfo, "editorInfo must be non-null");
        x1.c.d(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        if (c.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean e(java.lang.String r7, android.os.Bundle r8, A1.e.c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0082
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x0020
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x0022
        L_0x001d:
            r7 = move-exception
            r2 = r1
            goto L_0x007c
        L_0x0020:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x0022:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x001d }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x001d }
            if (r7 == 0) goto L_0x002f
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x0031
        L_0x002d:
            r7 = move-exception
            goto L_0x007c
        L_0x002f:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x0031:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x002d }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x003c
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x003e
        L_0x003c:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x003e:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x002d }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x0049
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x004b
        L_0x0049:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x004b:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x002d }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x0056
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0058
        L_0x0056:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0058:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x0063
        L_0x0061:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x0063:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x002d }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x0076
            A1.f r8 = new A1.f     // Catch:{ all -> 0x002d }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x002d }
            boolean r0 = r9.a(r8, r6, r7)     // Catch:{ all -> 0x002d }
        L_0x0076:
            if (r2 == 0) goto L_0x007b
            r2.send(r0, r1)
        L_0x007b:
            return r0
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            r2.send(r0, r1)
        L_0x0081:
            throw r7
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.e.e(java.lang.String, android.os.Bundle, A1.e$c):boolean");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean f(View view, f fVar, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                fVar.d();
                Parcelable parcelable = (Parcelable) fVar.e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        if (C1680b0.e0(view, new C1683d.a(new ClipData(fVar.b(), new ClipData.Item(fVar.a())), 2).d(fVar.c()).b(bundle).a()) == null) {
            return true;
        }
        return false;
    }
}
