package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ya.C5286c;

/* renamed from: com.google.android.gms.common.internal.c  reason: case insensitive filesystem */
public abstract class C4518c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final C5286c[] zze = new C5286c[0];
    private volatile String zzA;
    /* access modifiers changed from: private */
    public ConnectionResult zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    private volatile q0 zzD;
    B0 zza;
    final Handler zzb;
    protected C0821c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final C4527i zzn;
    private final com.google.android.gms.common.b zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    /* access modifiers changed from: private */
    public C4532n zzr;
    private IInterface zzs;
    /* access modifiers changed from: private */
    public final ArrayList zzt;
    private n0 zzu;
    private int zzv;
    /* access modifiers changed from: private */
    public final a zzw;
    /* access modifiers changed from: private */
    public final b zzx;
    private final int zzy;
    private final String zzz;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void a(Bundle bundle);

        void b(int i10);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void c(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0821c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class d implements C0821c {
        public d() {
        }

        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.s0()) {
                C4518c cVar = C4518c.this;
                cVar.getRemoteService((C4529k) null, cVar.getScopes());
            } else if (C4518c.this.zzx != null) {
                C4518c.this.zzx.c(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C4518c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C4518c.a r13, com.google.android.gms.common.internal.C4518c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.C4527i.b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.b.f()
            com.google.android.gms.common.internal.C4536s.l(r13)
            com.google.android.gms.common.internal.C4536s.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4518c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void c(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        B0 b02;
        B0 b03;
        boolean z12 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        C4536s.a(z12);
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                if (i10 == 1) {
                    n0 n0Var = this.zzu;
                    if (n0Var != null) {
                        C4527i iVar = this.zzn;
                        String b10 = this.zza.b();
                        C4536s.l(b10);
                        iVar.f(b10, this.zza.a(), 4225, n0Var, zze(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    n0 n0Var2 = this.zzu;
                    if (!(n0Var2 == null || (b03 = this.zza) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + b03.b() + " on " + b03.a());
                        C4527i iVar2 = this.zzn;
                        String b11 = this.zza.b();
                        C4536s.l(b11);
                        iVar2.f(b11, this.zza.a(), 4225, n0Var2, zze(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    n0 n0Var3 = new n0(this, this.zzd.get());
                    this.zzu = n0Var3;
                    if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                        b02 = new B0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup());
                    } else {
                        b02 = new B0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    }
                    this.zza = b02;
                    if (b02.c()) {
                        if (getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                        }
                    }
                    C4527i iVar3 = this.zzn;
                    String b12 = this.zza.b();
                    C4536s.l(b12);
                    String a10 = this.zza.a();
                    if (!iVar3.g(new u0(b12, a10, 4225, this.zza.c()), n0Var3, zze(), getBindServiceExecutor())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.zza.b() + " on " + this.zza.a());
                        zzl(16, (Bundle) null, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    C4536s.l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzj(C4518c cVar, q0 q0Var) {
        C4538u uVar;
        cVar.zzD = q0Var;
        if (cVar.usesClientTelemetry()) {
            C4524f fVar = q0Var.f54225d;
            C4537t b10 = C4537t.b();
            if (fVar == null) {
                uVar = null;
            } else {
                uVar = fVar.t0();
            }
            b10.c(uVar);
        }
    }

    static /* bridge */ /* synthetic */ void zzk(C4518c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.zzp) {
            i11 = cVar.zzv;
        }
        if (i11 == 3) {
            cVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, cVar.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(C4518c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.zzp) {
            try {
                if (cVar.zzv != i10) {
                    return false;
                }
                cVar.c(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(C4518c cVar) {
        if (cVar.zzC || TextUtils.isEmpty(cVar.getServiceDescriptor()) || TextUtils.isEmpty(cVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(cVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int h10 = this.zzo.h(this.zzl, getMinApkVersion());
        if (h10 != 0) {
            c(1, (IInterface) null);
            triggerNotAvailable(new d(), h10, (PendingIntent) null);
            return;
        }
        connect(new d());
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(C0821c cVar) {
        C4536s.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        c(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((l0) this.zzt.get(i10)).d();
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        c(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        C4532n nVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            nVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + format);
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append(String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + format2);
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(c.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + format3);
        }
    }

    /* access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C5286c[] getApiFeatures() {
        return zze;
    }

    public final C5286c[] getAvailableFeatures() {
        q0 q0Var = this.zzD;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f54223b;
    }

    /* access modifiers changed from: protected */
    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        B0 b02;
        if (isConnected() && (b02 = this.zza) != null) {
            return b02.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(C4529k kVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = com.google.android.gms.common.b.f54100a;
        Scope[] scopeArr = C4525g.f54170o;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        C5286c[] cVarArr = C4525g.f54171p;
        C4525g gVar = r3;
        C4525g gVar2 = new C4525g(6, i11, i10, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        C4525g gVar3 = gVar;
        gVar3.f54175d = this.zzl.getPackageName();
        gVar3.f54178g = getServiceRequestExtraArgs;
        if (set2 != null) {
            gVar3.f54177f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            gVar3.f54179h = account;
            if (kVar != null) {
                gVar3.f54176e = kVar.asBinder();
            }
        } else if (requiresAccount()) {
            gVar3.f54179h = getAccount();
        }
        gVar3.f54180i = zze;
        gVar3.f54181j = getApiFeatures();
        if (usesClientTelemetry()) {
            gVar3.f54184m = true;
        }
        try {
            synchronized (this.zzq) {
                C4532n nVar = this.zzr;
                if (nVar != null) {
                    nVar.B0(new m0(this, this.zzd.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv != 5) {
                    checkConnected();
                    iInterface = this.zzs;
                    C4536s.m(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                C4532n nVar = this.zzr;
                if (nVar == null) {
                    return null;
                }
                IBinder asBinder = nVar.asBinder();
                return asBinder;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C4524f getTelemetryConfiguration() {
        q0 q0Var = this.zzD;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f54225d;
    }

    /* access modifiers changed from: protected */
    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.o0();
        this.zzj = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new o0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(C0821c cVar, int i10, PendingIntent pendingIntent) {
        C4536s.m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new p0(this, i10, (Bundle) null)));
    }

    protected C4518c(Context context, Looper looper, C4527i iVar, com.google.android.gms.common.b bVar, int i10, a aVar, b bVar2, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C4536s.m(context, "Context must not be null");
        this.zzl = context;
        C4536s.m(looper, "Looper must not be null");
        this.zzm = looper;
        C4536s.m(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        C4536s.m(bVar, "API availability must not be null");
        this.zzo = bVar;
        this.zzb = new k0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar2;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
