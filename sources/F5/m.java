package F5;

import android.os.AsyncTask;
import java.io.File;
import kotlin.jvm.internal.C6496s;
import t7.C4049a;

public final class m extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    private final String f30781a;

    /* renamed from: b  reason: collision with root package name */
    private final File f30782b;

    /* renamed from: c  reason: collision with root package name */
    private final a f30783c;

    public interface a {
        void a(File file);
    }

    public m(String str, File file, a aVar) {
        C6496s.h(str, "uriStr");
        C6496s.h(file, "destFile");
        C6496s.h(aVar, "onSuccess");
        this.f30781a = str;
        this.f30782b = file;
        this.f30783c = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r0 = t7.C4049a.d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C6496s.h(r5, r0)     // Catch:{ all -> 0x004b }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = r4.f30781a     // Catch:{ Exception -> 0x004d }
            r5.<init>(r0)     // Catch:{ Exception -> 0x004d }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x004d }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ Exception -> 0x004d }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ Exception -> 0x004d }
            int r0 = r0.getContentLength()     // Catch:{ Exception -> 0x004d }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x004d }
            java.io.InputStream r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r5)     // Catch:{ Exception -> 0x004d }
            r2.<init>(r5)     // Catch:{ Exception -> 0x004d }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x004d }
            r2.readFully(r5)     // Catch:{ Exception -> 0x004d }
            r2.close()     // Catch:{ Exception -> 0x004d }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x004d }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004d }
            java.io.File r3 = r4.f30782b     // Catch:{ Exception -> 0x004d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x004d }
            r0.write(r5)     // Catch:{ Exception -> 0x004d }
            r0.flush()     // Catch:{ Exception -> 0x004d }
            r0.close()     // Catch:{ Exception -> 0x004d }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004d }
            return r5
        L_0x004b:
            r5 = move-exception
            goto L_0x0050
        L_0x004d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
            return r5
        L_0x0050:
            t7.C4049a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.m.a(java.lang.String[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10) {
        if (!C4049a.d(this) && z10) {
            try {
                this.f30783c.a(this.f30782b);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C4049a.d(this)) {
            try {
                b(((Boolean) obj).booleanValue());
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
