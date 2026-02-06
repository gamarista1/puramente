package M4;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.S0;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final S0 f32573a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection f32574b;

    public b(S0 s02, Collection collection) {
        this.f32573a = s02;
        this.f32574b = collection;
    }

    private final boolean c(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            if (!C6496s.c(jsonReader.nextName(), "errorClass")) {
                jsonReader.skipValue();
            } else if (NativeInterface.isDiscardErrorClass(jsonReader.nextString())) {
                return true;
            }
        }
        jsonReader.endObject();
        return false;
    }

    private final boolean d(JsonReader jsonReader) {
        if (this.f32574b.isEmpty()) {
            jsonReader.skipValue();
            return false;
        }
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            if (C6496s.c(jsonReader.nextName(), "releaseStage")) {
                if (!this.f32574b.contains(jsonReader.nextString())) {
                    return true;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return false;
    }

    private final boolean e(JsonReader jsonReader) {
        jsonReader.beginArray();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            if (c(jsonReader)) {
                this.f32573a.g("Discarding native report due to errorClass");
                return true;
            }
        }
        jsonReader.endArray();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        wf.C6763c.a(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        wf.C6763c.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = ".json"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = Sg.p.u(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = ".static_data.json"
            boolean r0 = Sg.p.u(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0050
        L_0x001c:
            java.nio.charset.Charset r0 = Sg.C5541d.f65029b     // Catch:{ Exception -> 0x004f }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004f }
            r1.<init>(r6)     // Catch:{ Exception -> 0x004f }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004f }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x004f }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004f }
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x004f }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ all -> 0x0040 }
            r6.<init>(r0)     // Catch:{ all -> 0x0040 }
            boolean r1 = r5.b(r6)     // Catch:{ all -> 0x0042 }
            wf.C6763c.a(r6, r4)     // Catch:{ all -> 0x0040 }
            wf.C6763c.a(r0, r4)     // Catch:{ Exception -> 0x004f }
            r2 = r1
            goto L_0x004f
        L_0x0040:
            r6 = move-exception
            goto L_0x0049
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r3 = move-exception
            wf.C6763c.a(r6, r1)     // Catch:{ all -> 0x0040 }
            throw r3     // Catch:{ all -> 0x0040 }
        L_0x0049:
            throw r6     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            wf.C6763c.a(r0, r6)     // Catch:{ Exception -> 0x004f }
            throw r1     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            return r2
        L_0x0050:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.b.a(java.io.File):boolean");
    }

    public final boolean b(JsonReader jsonReader) {
        boolean z10;
        jsonReader.beginObject();
        boolean z11 = true;
        boolean z12 = true;
        do {
            z10 = false;
            if (!jsonReader.hasNext() || (!z11 && !z12)) {
                return false;
            }
            String nextName = jsonReader.nextName();
            if (C6496s.c(nextName, "app")) {
                z10 = d(jsonReader);
                z11 = false;
                continue;
            } else if (C6496s.c(nextName, "exceptions")) {
                z10 = e(jsonReader);
                z12 = false;
                continue;
            } else {
                jsonReader.skipValue();
                continue;
            }
        } while (!z10);
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(com.bugsnag.android.S0 r1, java.util.Collection<java.lang.String> r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0010
            java.util.Collection r2 = com.bugsnag.android.NativeInterface.getEnabledReleaseStages()
            if (r2 != 0) goto L_0x0010
            java.util.Set r2 = mf.Y.e()
            java.util.Collection r2 = (java.util.Collection) r2
        L_0x0010:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.b.<init>(com.bugsnag.android.S0, java.util.Collection, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
