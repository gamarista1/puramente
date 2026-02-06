package t5;

import android.content.Context;
import android.util.Log;
import com.facebook.I;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;
import t5.C4024a;
import t5.C4028e;

/* renamed from: t5.g  reason: case insensitive filesystem */
public final class C4030g {

    /* renamed from: a  reason: collision with root package name */
    public static final C4030g f48234a = new C4030g();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48235b = C4030g.class.getName();

    /* renamed from: t5.g$a */
    private static final class a extends ObjectInputStream {

        /* renamed from: a  reason: collision with root package name */
        public static final C0728a f48236a = new C0728a((DefaultConstructorMarker) null);

        /* renamed from: t5.g$a$a  reason: collision with other inner class name */
        public static final class C0728a {
            public /* synthetic */ C0728a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0728a() {
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (C6496s.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(C4024a.b.class);
            } else if (C6496s.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(C4028e.b.class);
            }
            C6496s.g(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    private C4030g() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a A[Catch:{ Exception -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized t5.S a() {
        /*
            java.lang.Class<t5.g> r0 = t5.C4030g.class
            monitor-enter(r0)
            F5.h.b()     // Catch:{ all -> 0x0038 }
            android.content.Context r1 = com.facebook.I.l()     // Catch:{ all -> 0x0038 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.C6496s.g(r3, r4)     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            t5.g$a r4 = new t5.g$a     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0050, Exception -> 0x004d, all -> 0x0049 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0047 }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            kotlin.jvm.internal.C6496s.f(r3, r5)     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0047 }
            t5.S r3 = (t5.S) r3     // Catch:{ FileNotFoundException -> 0x0085, Exception -> 0x0047 }
            o7.W.j(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x003b }
            r1.delete()     // Catch:{ Exception -> 0x003b }
            goto L_0x0043
        L_0x0038:
            r1 = move-exception
            goto L_0x00a1
        L_0x003b:
            r1 = move-exception
            java.lang.String r2 = f48235b     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0038 }
        L_0x0043:
            r2 = r3
            goto L_0x0098
        L_0x0045:
            r2 = move-exception
            goto L_0x006f
        L_0x0047:
            r3 = move-exception
            goto L_0x0052
        L_0x0049:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x006f
        L_0x004d:
            r3 = move-exception
            r4 = r2
            goto L_0x0052
        L_0x0050:
            r4 = r2
            goto L_0x0085
        L_0x0052:
            java.lang.String r5 = f48235b     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0045 }
            o7.W.j(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0066 }
            r1.delete()     // Catch:{ Exception -> 0x0066 }
            goto L_0x0098
        L_0x0066:
            r1 = move-exception
            java.lang.String r3 = f48235b     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x006b:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0098
        L_0x006f:
            o7.W.j(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x007c }
            r1.delete()     // Catch:{ Exception -> 0x007c }
            goto L_0x0084
        L_0x007c:
            r1 = move-exception
            java.lang.String r3 = f48235b     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0038 }
        L_0x0084:
            throw r2     // Catch:{ all -> 0x0038 }
        L_0x0085:
            o7.W.j(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0092 }
            r1.delete()     // Catch:{ Exception -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            r1 = move-exception
            java.lang.String r3 = f48235b     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x006b
        L_0x0098:
            if (r2 != 0) goto L_0x009f
            t5.S r2 = new t5.S     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
        L_0x009f:
            monitor-exit(r0)
            return r2
        L_0x00a1:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4030g.a():t5.S");
    }

    public static final void b(S s10) {
        Context l10 = I.l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(l10.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(s10);
                W.j(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f48235b, "Got unexpected exception while persisting events: ", th);
                    try {
                        l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    W.j(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            Log.w(f48235b, "Got unexpected exception while persisting events: ", th);
            l10.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }
}
