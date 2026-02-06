package o7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.I;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o7.b  reason: case insensitive filesystem */
public final class C3886b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f47182f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f47183g = C3886b.class.getCanonicalName();

    /* renamed from: h  reason: collision with root package name */
    public static C3886b f47184h;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f47185a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f47186b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f47187c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f47188d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f47189e;

    /* renamed from: o7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C3886b a(C3886b bVar) {
            bVar.f47186b = System.currentTimeMillis();
            C3886b.f47184h = bVar;
            return bVar;
        }

        private final C3886b b(Context context) {
            C3886b c10 = c(context);
            if (c10 != null) {
                return c10;
            }
            C3886b d10 = d(context);
            if (d10 == null) {
                return new C3886b();
            }
            return d10;
        }

        private final C3886b c(Context context) {
            Method M10;
            Object V10;
            try {
                if (!g(context) || (M10 = W.M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (V10 = W.V((Object) null, M10, context)) == null) {
                    return null;
                }
                boolean z10 = false;
                Method L10 = W.L(V10.getClass(), "getId", new Class[0]);
                Method L11 = W.L(V10.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (L10 != null) {
                    if (L11 != null) {
                        C3886b bVar = new C3886b();
                        bVar.f47185a = (String) W.V(V10, L10, new Object[0]);
                        Boolean bool = (Boolean) W.V(V10, L11, new Object[0]);
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        }
                        bVar.f47189e = z10;
                        return bVar;
                    }
                }
                return null;
            } catch (Exception e10) {
                W.k0("android_id", e10);
                return null;
            }
        }

        private final C3886b d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        C0708b bVar = new C0708b(cVar.a());
                        C3886b bVar2 = new C3886b();
                        bVar2.f47185a = bVar.r1();
                        bVar2.f47189e = bVar.s1();
                        return bVar2;
                    } catch (Exception e10) {
                        W.k0("android_id", e10);
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean g(Context context) {
            Method M10 = W.M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (M10 == null) {
                return false;
            }
            Object V10 = W.V((Object) null, M10, context);
            if (!(V10 instanceof Integer) || !C6496s.c(V10, 0)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ Exception -> 0x0036, all -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008c A[Catch:{ Exception -> 0x0036, all -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ Exception -> 0x0036, all -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x011a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o7.C3886b e(android.content.Context r13) {
            /*
                r12 = this;
                java.lang.String r0 = "limit_tracking"
                java.lang.String r1 = "androidid"
                java.lang.String r2 = "aid"
                java.lang.String r3 = "context"
                kotlin.jvm.internal.C6496s.h(r13, r3)
                o7.b r3 = r12.b(r13)
                r4 = 0
                android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r6)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 != 0) goto L_0x00f0
                o7.b r5 = o7.C3886b.f47184h     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 == 0) goto L_0x003a
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                long r8 = r5.f47186b     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                long r6 = r6 - r8
                r8 = 3600000(0x36ee80, double:1.7786363E-317)
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L_0x003a
                return r5
            L_0x0033:
                r13 = move-exception
                goto L_0x0118
            L_0x0036:
                r13 = move-exception
                r0 = r4
                goto L_0x00f8
            L_0x003a:
                java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
                r8 = 0
                android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 == 0) goto L_0x006a
                java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                java.lang.String r8 = "contentProviderInfo.packageName"
                kotlin.jvm.internal.C6496s.g(r5, r8)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                boolean r5 = o7.C3900p.a(r13, r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 == 0) goto L_0x006a
                java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            L_0x0068:
                r6 = r5
                goto L_0x0081
            L_0x006a:
                if (r6 == 0) goto L_0x0080
                java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                java.lang.String r6 = "wakizashiProviderInfo.packageName"
                kotlin.jvm.internal.C6496s.g(r5, r6)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                boolean r5 = o7.C3900p.a(r13, r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 == 0) goto L_0x0080
                java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                goto L_0x0068
            L_0x0080:
                r6 = r4
            L_0x0081:
                java.lang.String r5 = r12.f(r13)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r5 == 0) goto L_0x008a
                r3.f47188d = r5     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            L_0x008a:
                if (r6 != 0) goto L_0x0091
                o7.b r13 = r12.a(r3)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                return r13
            L_0x0091:
                android.content.ContentResolver r5 = r13.getContentResolver()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                r9 = 0
                r10 = 0
                r8 = 0
                android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                if (r13 == 0) goto L_0x00e6
                boolean r5 = r13.moveToFirst()     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r5 != 0) goto L_0x00a5
                goto L_0x00e6
            L_0x00a5:
                int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f47187c = r2     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r1 <= 0) goto L_0x00de
                if (r0 <= 0) goto L_0x00de
                java.lang.String r2 = r3.h()     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r2 != 0) goto L_0x00de
                java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f47185a = r1     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f47189e = r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                goto L_0x00de
            L_0x00d5:
                r0 = move-exception
                r4 = r13
                r13 = r0
                goto L_0x0118
            L_0x00d9:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
                goto L_0x00f8
            L_0x00de:
                r13.close()
                o7.b r13 = r12.a(r3)
                return r13
            L_0x00e6:
                o7.b r0 = r12.a(r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r13 == 0) goto L_0x00ef
                r13.close()
            L_0x00ef:
                return r0
            L_0x00f0:
                com.facebook.v r13 = new com.facebook.v     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
                r13.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
                throw r13     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            L_0x00f8:
                java.lang.String r1 = o7.C3886b.f47183g     // Catch:{ all -> 0x0116 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0116 }
                r2.<init>()     // Catch:{ all -> 0x0116 }
                java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
                r2.append(r3)     // Catch:{ all -> 0x0116 }
                r2.append(r13)     // Catch:{ all -> 0x0116 }
                java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0116 }
                o7.W.l0(r1, r13)     // Catch:{ all -> 0x0116 }
                if (r0 == 0) goto L_0x0115
                r0.close()
            L_0x0115:
                return r4
            L_0x0116:
                r13 = move-exception
                r4 = r0
            L_0x0118:
                if (r4 == 0) goto L_0x011d
                r4.close()
            L_0x011d:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o7.C3886b.a.e(android.content.Context):o7.b");
        }

        public final boolean h(Context context) {
            C6496s.h(context, "context");
            C3886b e10 = e(context);
            if (e10 == null || !e10.l()) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    /* renamed from: o7.b$b  reason: collision with other inner class name */
    private static final class C0708b implements IInterface {

        /* renamed from: b  reason: collision with root package name */
        public static final a f47190b = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f47191a;

        /* renamed from: o7.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0708b(IBinder iBinder) {
            C6496s.h(iBinder, "binder");
            this.f47191a = iBinder;
        }

        public IBinder asBinder() {
            return this.f47191a;
        }

        public final String r1() {
            Parcel obtain = Parcel.obtain();
            C6496s.g(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C6496s.g(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f47191a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean s1() {
            Parcel obtain = Parcel.obtain();
            C6496s.g(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C6496s.g(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                obtain.writeInt(1);
                this.f47191a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z10 = false;
                }
                return z10;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public static final C3886b k(Context context) {
        return f47182f.e(context);
    }

    public final String h() {
        if (!I.G() || !I.k()) {
            return null;
        }
        return this.f47185a;
    }

    public final String i() {
        return this.f47188d;
    }

    public final String j() {
        return this.f47187c;
    }

    public final boolean l() {
        return this.f47189e;
    }

    /* renamed from: o7.b$c */
    private static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicBoolean f47192a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        private final BlockingQueue f47193b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.f47192a.compareAndSet(true, true)) {
                Object take = this.f47193b.take();
                C6496s.g(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f47193b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
