package com.google.android.gms.measurement.internal;

import Ea.e;
import Ea.f;
import Ga.C4293e;
import Pa.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.C1587a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.measurement.internal.C4622h3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class q5 implements C4615g3 {

    /* renamed from: H  reason: collision with root package name */
    private static volatile q5 f55286H;

    /* renamed from: A  reason: collision with root package name */
    private long f55287A;

    /* renamed from: B  reason: collision with root package name */
    private final Map f55288B;

    /* renamed from: C  reason: collision with root package name */
    private final Map f55289C;

    /* renamed from: D  reason: collision with root package name */
    private final Map f55290D;

    /* renamed from: E  reason: collision with root package name */
    private C4595d4 f55291E;

    /* renamed from: F  reason: collision with root package name */
    private String f55292F;

    /* renamed from: G  reason: collision with root package name */
    private final D5 f55293G;

    /* renamed from: a  reason: collision with root package name */
    private C4681q2 f55294a;

    /* renamed from: b  reason: collision with root package name */
    private Y1 f55295b;

    /* renamed from: c  reason: collision with root package name */
    private C4646l f55296c;

    /* renamed from: d  reason: collision with root package name */
    private C4607f2 f55297d;

    /* renamed from: e  reason: collision with root package name */
    private C4638j5 f55298e;

    /* renamed from: f  reason: collision with root package name */
    private J5 f55299f;

    /* renamed from: g  reason: collision with root package name */
    private final x5 f55300g;

    /* renamed from: h  reason: collision with root package name */
    private C4581b4 f55301h;

    /* renamed from: i  reason: collision with root package name */
    private Q4 f55302i;

    /* renamed from: j  reason: collision with root package name */
    private final o5 f55303j;

    /* renamed from: k  reason: collision with root package name */
    private C4669o2 f55304k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final E2 f55305l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f55306m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55307n;

    /* renamed from: o  reason: collision with root package name */
    private long f55308o;

    /* renamed from: p  reason: collision with root package name */
    private List f55309p;

    /* renamed from: q  reason: collision with root package name */
    private final Set f55310q;

    /* renamed from: r  reason: collision with root package name */
    private int f55311r;

    /* renamed from: s  reason: collision with root package name */
    private int f55312s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f55313t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f55314u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f55315v;

    /* renamed from: w  reason: collision with root package name */
    private FileLock f55316w;

    /* renamed from: x  reason: collision with root package name */
    private FileChannel f55317x;

    /* renamed from: y  reason: collision with root package name */
    private List f55318y;

    /* renamed from: z  reason: collision with root package name */
    private List f55319z;

    private class a implements C4666o {

        /* renamed from: a  reason: collision with root package name */
        zzfn.zzk f55320a;

        /* renamed from: b  reason: collision with root package name */
        List f55321b;

        /* renamed from: c  reason: collision with root package name */
        List f55322c;

        /* renamed from: d  reason: collision with root package name */
        private long f55323d;

        private static long c(zzfn.zzf zzf) {
            return ((zzf.zzd() / 1000) / 60) / 60;
        }

        public final void a(zzfn.zzk zzk) {
            C4536s.l(zzk);
            this.f55320a = zzk;
        }

        public final boolean b(long j10, zzfn.zzf zzf) {
            C4536s.l(zzf);
            if (this.f55322c == null) {
                this.f55322c = new ArrayList();
            }
            if (this.f55321b == null) {
                this.f55321b = new ArrayList();
            }
            if (!this.f55322c.isEmpty() && c((zzfn.zzf) this.f55322c.get(0)) != c(zzf)) {
                return false;
            }
            long zzca = this.f55323d + ((long) zzf.zzca());
            q5.this.a0();
            if (zzca >= ((long) Math.max(0, ((Integer) F.f54653j.a((Object) null)).intValue()))) {
                return false;
            }
            this.f55323d = zzca;
            this.f55322c.add(zzf);
            this.f55321b.add(Long.valueOf(j10));
            int size = this.f55322c.size();
            q5.this.a0();
            if (size >= Math.max(1, ((Integer) F.f54655k.a((Object) null)).intValue())) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    private q5(y5 y5Var) {
        this(y5Var, (E2) null);
    }

    private final void C(String str, boolean z10, Long l10, Long l11) {
        Z1 C02 = c0().C0(str);
        if (C02 != null) {
            C02.T(z10);
            C02.e(l10);
            C02.I(l11);
            if (C02.B()) {
                c0().Q(C02, false, false);
            }
        }
    }

    private final void D(List list) {
        C4536s.a(!list.isEmpty());
        if (this.f55318y != null) {
            zzj().B().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f55318y = new ArrayList(list);
        }
    }

    private final boolean G(int i10, FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i10);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzj().B().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e10) {
            zzj().B().b("Failed to write to channel", e10);
            return false;
        }
    }

    private final boolean H(zzfn.zzf.zza zza, zzfn.zzf.zza zza2) {
        String str;
        C4536s.a("_e".equals(zza.zze()));
        n0();
        zzfn.zzh A10 = x5.A((zzfn.zzf) ((zzjk) zza.zzai()), "_sc");
        String str2 = null;
        if (A10 == null) {
            str = null;
        } else {
            str = A10.zzh();
        }
        n0();
        zzfn.zzh A11 = x5.A((zzfn.zzf) ((zzjk) zza2.zzai()), "_pc");
        if (A11 != null) {
            str2 = A11.zzh();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C4536s.a("_e".equals(zza.zze()));
        n0();
        zzfn.zzh A12 = x5.A((zzfn.zzf) ((zzjk) zza.zzai()), "_et");
        if (A12 == null || !A12.zzl() || A12.zzd() <= 0) {
            return true;
        }
        long zzd = A12.zzd();
        n0();
        zzfn.zzh A13 = x5.A((zzfn.zzf) ((zzjk) zza2.zzai()), "_et");
        if (A13 != null && A13.zzd() > 0) {
            zzd += A13.zzd();
        }
        n0();
        x5.O(zza2, "_et", Long.valueOf(zzd));
        n0();
        x5.O(zza, "_fr", 1L);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v98, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v99, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v100, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v101, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v102, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v103, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v104, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v109, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v110, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v111, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v112, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v113, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v115, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v101, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0230 A[SYNTHETIC, Splitter:B:118:0x0230] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0237 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0588 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x064d A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x069a A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0706 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x080b A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0a76 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0a8e A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0b88 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0bbb A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0bf6 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0d0c A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0d20 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0d23 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0d48 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0ef3 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0f05 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0f1e A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x0f9b A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0f9f A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0fb0 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x1026 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x1057 A[Catch:{ IOException -> 0x0206, all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x10b7 A[SYNTHETIC, Splitter:B:597:0x10b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean I(java.lang.String r42, long r43) {
        /*
            r41 = this;
            r1 = r41
            java.lang.String r2 = "_ai"
            java.lang.String r3 = "items"
            com.google.android.gms.measurement.internal.l r4 = r41.c0()
            r4.S0()
            com.google.android.gms.measurement.internal.q5$a r4 = new com.google.android.gms.measurement.internal.q5$a     // Catch:{ all -> 0x007e }
            r5 = 0
            r4.<init>()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r6 = r41.c0()     // Catch:{ all -> 0x007e }
            long r7 = r1.f55287A     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.internal.C4536s.l(r4)     // Catch:{ all -> 0x007e }
            r6.i()     // Catch:{ all -> 0x007e }
            r6.p()     // Catch:{ all -> 0x007e }
            r10 = -1
            r12 = 1
            r13 = 0
            android.database.sqlite.SQLiteDatabase r15 = r6.w()     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            boolean r14 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r16 = ""
            if (r14 == 0) goto L_0x009a
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x004e
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r5 = java.lang.String.valueOf(r43)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String[] r5 = new java.lang.String[]{r9, r5}     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            goto L_0x0056
        L_0x0043:
            r0 = move-exception
            r1 = r0
            r5 = 0
            goto L_0x10b5
        L_0x0048:
            r0 = move-exception
            r7 = r0
            r5 = 0
        L_0x004b:
            r9 = 0
            goto L_0x021d
        L_0x004e:
            java.lang.String r5 = java.lang.String.valueOf(r43)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
        L_0x0056:
            if (r14 == 0) goto L_0x005a
            java.lang.String r16 = "rowid <= ? and "
        L_0x005a:
            r9 = r16
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r10 = "select app_id, metadata_fingerprint from raw_events where "
            r14.<init>(r10)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            r14.append(r9)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r9 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r14.append(r9)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r9 = r14.toString()     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            android.database.Cursor r5 = r15.rawQuery(r9, r5)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r9 != 0) goto L_0x0082
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x007e:
            r0 = move-exception
            r1 = r0
            goto L_0x10bb
        L_0x0082:
            java.lang.String r9 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r10 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x0093 }
            r5.close()     // Catch:{ SQLiteException -> 0x0093 }
            goto L_0x00ef
        L_0x008f:
            r0 = move-exception
            r1 = r0
            goto L_0x10b5
        L_0x0093:
            r0 = move-exception
            r7 = r0
            goto L_0x021d
        L_0x0097:
            r0 = move-exception
            r7 = r0
            goto L_0x004b
        L_0x009a:
            r9 = r10
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00ba
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x00b7, all -> 0x00b4 }
            r10 = 0
            java.lang.String[] r9 = new java.lang.String[]{r10, r9}     // Catch:{ SQLiteException -> 0x00ae, all -> 0x00a9 }
            goto L_0x00bf
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            r1 = r0
            r5 = r10
            goto L_0x10b5
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            r7 = r0
            r5 = r10
            r9 = r5
            goto L_0x021d
        L_0x00b4:
            r0 = move-exception
            r10 = 0
            goto L_0x00aa
        L_0x00b7:
            r0 = move-exception
            r10 = 0
            goto L_0x00af
        L_0x00ba:
            r10 = 0
            java.lang.String[] r9 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
        L_0x00bf:
            if (r5 == 0) goto L_0x00c3
            java.lang.String r16 = " and rowid <= ?"
        L_0x00c3:
            r5 = r16
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.<init>(r11)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r5 = " order by rowid limit 1;"
            r10.append(r5)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            java.lang.String r5 = r10.toString()     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            android.database.Cursor r5 = r15.rawQuery(r5, r9)     // Catch:{ SQLiteException -> 0x0048, all -> 0x0043 }
            boolean r9 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r9 != 0) goto L_0x00e7
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x00e7:
            java.lang.String r10 = r5.getString(r13)     // Catch:{ SQLiteException -> 0x0097 }
            r5.close()     // Catch:{ SQLiteException -> 0x0097 }
            r9 = 0
        L_0x00ef:
            java.lang.String r11 = "raw_events_metadata"
            java.lang.String r14 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r18 = new java.lang.String[]{r9, r10}     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r19 = 0
            r20 = 0
            r14 = r15
            r23 = r15
            r15 = r11
            android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0093 }
            boolean r11 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0093 }
            if (r11 != 0) goto L_0x0129
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.B()     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r8 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ SQLiteException -> 0x0093 }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x0093 }
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x0129:
            byte[] r11 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r14 = com.google.android.gms.internal.measurement.zzfn.zzk.zzw()     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzks r11 = com.google.android.gms.measurement.internal.x5.B(r14, r11)     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r11 = (com.google.android.gms.internal.measurement.zzfn.zzk.zza) r11     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzkt r11 = r11.zzai()     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzfn$zzk r11 = (com.google.android.gms.internal.measurement.zzfn.zzk) r11     // Catch:{ IOException -> 0x0206 }
            boolean r14 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0093 }
            if (r14 == 0) goto L_0x0156
            com.google.android.gms.measurement.internal.V1 r14 = r6.zzj()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.measurement.internal.X1 r14 = r14.G()     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ SQLiteException -> 0x0093 }
            r14.b(r15, r12)     // Catch:{ SQLiteException -> 0x0093 }
        L_0x0156:
            r5.close()     // Catch:{ SQLiteException -> 0x0093 }
            r4.a(r11)     // Catch:{ SQLiteException -> 0x0093 }
            r11 = -1
            int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r14 == 0) goto L_0x0171
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String[] r7 = new java.lang.String[]{r9, r10, r7}     // Catch:{ SQLiteException -> 0x0093 }
            r18 = r7
            r17 = r11
            goto L_0x017b
        L_0x0171:
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[]{r9, r10}     // Catch:{ SQLiteException -> 0x0093 }
            r17 = r7
            r18 = r8
        L_0x017b:
            java.lang.String r15 = "raw_events"
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r10 = "timestamp"
            java.lang.String r11 = "data"
            java.lang.String[] r16 = new java.lang.String[]{r7, r8, r10, r11}     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r21 = "rowid"
            r22 = 0
            r19 = 0
            r20 = 0
            r14 = r23
            android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0093 }
            boolean r7 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0093 }
            if (r7 != 0) goto L_0x01b3
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.G()     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ SQLiteException -> 0x0093 }
            r7.b(r8, r10)     // Catch:{ SQLiteException -> 0x0093 }
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x01b3:
            long r7 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x0093 }
            r10 = 3
            byte[] r11 = r5.getBlob(r10)     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r10 = com.google.android.gms.internal.measurement.zzfn.zzf.zze()     // Catch:{ IOException -> 0x01e9 }
            com.google.android.gms.internal.measurement.zzks r10 = com.google.android.gms.measurement.internal.x5.B(r10, r11)     // Catch:{ IOException -> 0x01e9 }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r10 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10     // Catch:{ IOException -> 0x01e9 }
            r11 = 1
            java.lang.String r12 = r5.getString(r11)     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r11 = r10.zza((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0093 }
            r12 = 2
            long r14 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x0093 }
            r11.zzb((long) r14)     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzkt r10 = r10.zzai()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzjk r10 = (com.google.android.gms.internal.measurement.zzjk) r10     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.internal.measurement.zzfn$zzf r10 = (com.google.android.gms.internal.measurement.zzfn.zzf) r10     // Catch:{ SQLiteException -> 0x0093 }
            boolean r7 = r4.b(r7, r10)     // Catch:{ SQLiteException -> 0x0093 }
            if (r7 != 0) goto L_0x01fc
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x01e9:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.V1 r8 = r6.zzj()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.measurement.internal.X1 r8 = r8.B()     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ SQLiteException -> 0x0093 }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x0093 }
        L_0x01fc:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0093 }
            if (r7 != 0) goto L_0x01b3
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x0206:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.V1 r8 = r6.zzj()     // Catch:{ SQLiteException -> 0x0093 }
            com.google.android.gms.measurement.internal.X1 r8 = r8.B()     // Catch:{ SQLiteException -> 0x0093 }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ SQLiteException -> 0x0093 }
            r8.c(r10, r11, r7)     // Catch:{ SQLiteException -> 0x0093 }
            r5.close()     // Catch:{ all -> 0x007e }
            goto L_0x0233
        L_0x021d:
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.X1 r6 = r6.B()     // Catch:{ all -> 0x008f }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.V1.q(r9)     // Catch:{ all -> 0x008f }
            r6.c(r8, r9, r7)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x0233
            r5.close()     // Catch:{ all -> 0x007e }
        L_0x0233:
            java.util.List r5 = r4.f55322c     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x10a5
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x023f
            goto L_0x10a5
        L_0x023f:
            com.google.android.gms.internal.measurement.zzfn$zzk r5 = r4.f55320a     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r5 = r5.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r5 = (com.google.android.gms.internal.measurement.zzfn.zzk.zza) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r5 = r5.zzl()     // Catch:{ all -> 0x007e }
            r9 = r13
            r10 = r9
            r11 = r10
            r7 = 0
            r8 = 0
            r12 = -1
            r14 = -1
        L_0x0252:
            java.util.List r15 = r4.f55322c     // Catch:{ all -> 0x007e }
            int r15 = r15.size()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = "_et"
            java.lang.String r6 = "_fr"
            r17 = r10
            java.lang.String r10 = "_e"
            r44 = r11
            java.lang.String r11 = "_c"
            r18 = r12
            r19 = r13
            if (r9 >= r15) goto L_0x082f
            java.util.List r15 = r4.f55322c     // Catch:{ all -> 0x007e }
            java.lang.Object r15 = r15.get(r9)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r15 = (com.google.android.gms.internal.measurement.zzfn.zzf) r15     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r15 = r15.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r15 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r15     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.q2 r12 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r13 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r13.zzz()     // Catch:{ all -> 0x007e }
            r22 = r9
            java.lang.String r9 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r9 = r12.K(r13, r9)     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "_err"
            if (r9 == 0) goto L_0x0305
            com.google.android.gms.measurement.internal.V1 r6 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r6 = r6.G()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r10 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r10 = r10.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.V1.q(r10)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.E2 r11 = r1.f55305l     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.R1 r11 = r11.y()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r15.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r11 = r11.c(r13)     // Catch:{ all -> 0x007e }
            r6.c(r9, r10, r11)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.q2 r6 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            boolean r6 = r6.T(r9)     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.q2 r6 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            boolean r6 = r6.V(r9)     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x02d6
            goto L_0x02fa
        L_0x02d6:
            java.lang.String r6 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x02fa
            r41.o0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.D5 r6 = r1.f55293G     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r25 = r9.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r15.zze()     // Catch:{ all -> 0x007e }
            r29 = 0
            r26 = 11
            r24 = r6
            com.google.android.gms.measurement.internal.B5.U(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x007e }
        L_0x02fa:
            r11 = r44
            r24 = r2
            r10 = r3
            r12 = r18
            r13 = r22
            goto L_0x0825
        L_0x0305:
            java.lang.String r9 = r15.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = Pa.q.a(r2)     // Catch:{ all -> 0x007e }
            boolean r9 = r9.equals(r13)     // Catch:{ all -> 0x007e }
            if (r9 == 0) goto L_0x0377
            r15.zza((java.lang.String) r2)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.V1 r9 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r9 = r9.F()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r9.a(r13)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.V1 r9 = r41.zzj()     // Catch:{ all -> 0x007e }
            r13 = 5
            boolean r9 = r9.x(r13)     // Catch:{ all -> 0x007e }
            if (r9 == 0) goto L_0x0377
            r9 = 0
        L_0x032f:
            int r13 = r15.zza()     // Catch:{ all -> 0x007e }
            if (r9 >= r13) goto L_0x0377
            java.lang.String r13 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfn$zzh r23 = r15.zzb((int) r9)     // Catch:{ all -> 0x007e }
            r24 = r2
            java.lang.String r2 = r23.zzg()     // Catch:{ all -> 0x007e }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0372
            com.google.android.gms.internal.measurement.zzfn$zzh r2 = r15.zzb((int) r9)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x007e }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0372
            java.lang.String r2 = "admob"
            com.google.android.gms.internal.measurement.zzfn$zzh r13 = r15.zzb((int) r9)     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r13.zzh()     // Catch:{ all -> 0x007e }
            boolean r2 = r2.equalsIgnoreCase(r13)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0372
            com.google.android.gms.measurement.internal.V1 r2 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r2 = r2.H()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = "AdMob ad impression logged from app. Potentially duplicative."
            r2.a(r13)     // Catch:{ all -> 0x007e }
        L_0x0372:
            int r9 = r9 + 1
            r2 = r24
            goto L_0x032f
        L_0x0377:
            r24 = r2
            com.google.android.gms.measurement.internal.q2 r2 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r2 = r2.I(r9, r13)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x03b5
            r41.n0()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r15.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.internal.C4536s.f(r9)     // Catch:{ all -> 0x007e }
            int r13 = r9.hashCode()     // Catch:{ all -> 0x007e }
            r23 = r3
            r3 = 95027(0x17333, float:1.33161E-40)
            if (r13 == r3) goto L_0x03a3
            goto L_0x03ac
        L_0x03a3:
            java.lang.String r3 = "_ui"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x03ac
            goto L_0x03b7
        L_0x03ac:
            r26 = r5
            r25 = r7
            r27 = r8
            r9 = r14
            goto L_0x0586
        L_0x03b5:
            r23 = r3
        L_0x03b7:
            r25 = r7
            r3 = 0
            r9 = 0
            r13 = 0
        L_0x03bc:
            int r7 = r15.zza()     // Catch:{ all -> 0x007e }
            r26 = r5
            java.lang.String r5 = "_r"
            if (r3 >= r7) goto L_0x0426
            com.google.android.gms.internal.measurement.zzfn$zzh r7 = r15.zzb((int) r3)     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x007e }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x03f3
            com.google.android.gms.internal.measurement.zzfn$zzh r5 = r15.zzb((int) r3)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r5 = r5.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r5     // Catch:{ all -> 0x007e }
            r27 = r8
            r7 = 1
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = r5.zza((long) r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r5 = r5.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r5 = (com.google.android.gms.internal.measurement.zzjk) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r5 = (com.google.android.gms.internal.measurement.zzfn.zzh) r5     // Catch:{ all -> 0x007e }
            r15.zza((int) r3, (com.google.android.gms.internal.measurement.zzfn.zzh) r5)     // Catch:{ all -> 0x007e }
            r9 = 1
            goto L_0x041f
        L_0x03f3:
            r27 = r8
            com.google.android.gms.internal.measurement.zzfn$zzh r7 = r15.zzb((int) r3)     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x007e }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x041f
            com.google.android.gms.internal.measurement.zzfn$zzh r5 = r15.zzb((int) r3)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r5 = r5.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r5     // Catch:{ all -> 0x007e }
            r7 = 1
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = r5.zza((long) r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r5 = r5.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r5 = (com.google.android.gms.internal.measurement.zzjk) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r5 = (com.google.android.gms.internal.measurement.zzfn.zzh) r5     // Catch:{ all -> 0x007e }
            r15.zza((int) r3, (com.google.android.gms.internal.measurement.zzfn.zzh) r5)     // Catch:{ all -> 0x007e }
            r13 = 1
        L_0x041f:
            int r3 = r3 + 1
            r5 = r26
            r8 = r27
            goto L_0x03bc
        L_0x0426:
            r27 = r8
            if (r9 != 0) goto L_0x0458
            if (r2 == 0) goto L_0x0458
            com.google.android.gms.measurement.internal.V1 r3 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r3 = r3.F()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.E2 r8 = r1.f55305l     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.R1 r8 = r8.y()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r15.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.c(r9)     // Catch:{ all -> 0x007e }
            r3.b(r7, r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = com.google.android.gms.internal.measurement.zzfn.zzh.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = r3.zza((java.lang.String) r11)     // Catch:{ all -> 0x007e }
            r7 = 1
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = r3.zza((long) r7)     // Catch:{ all -> 0x007e }
            r15.zza((com.google.android.gms.internal.measurement.zzfn.zzh.zza) r3)     // Catch:{ all -> 0x007e }
        L_0x0458:
            if (r13 != 0) goto L_0x0486
            com.google.android.gms.measurement.internal.V1 r3 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r3 = r3.F()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.E2 r8 = r1.f55305l     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.R1 r8 = r8.y()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r15.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.c(r9)     // Catch:{ all -> 0x007e }
            r3.b(r7, r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = com.google.android.gms.internal.measurement.zzfn.zzh.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = r3.zza((java.lang.String) r5)     // Catch:{ all -> 0x007e }
            r7 = 1
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = r3.zza((long) r7)     // Catch:{ all -> 0x007e }
            r15.zza((com.google.android.gms.internal.measurement.zzfn.zzh.zza) r3)     // Catch:{ all -> 0x007e }
        L_0x0486:
            com.google.android.gms.measurement.internal.l r28 = r41.c0()     // Catch:{ all -> 0x007e }
            long r29 = r41.v0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r3 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r31 = r3.zzz()     // Catch:{ all -> 0x007e }
            r36 = 1
            r37 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            com.google.android.gms.measurement.internal.p r3 = r28.E(r29, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x007e }
            long r7 = r3.f55256e     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h r3 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            int r3 = r3.t(r9)     // Catch:{ all -> 0x007e }
            r9 = r14
            long r13 = (long) r3     // Catch:{ all -> 0x007e }
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x04be
            l(r15, r5)     // Catch:{ all -> 0x007e }
            goto L_0x04c0
        L_0x04be:
            r17 = 1
        L_0x04c0:
            java.lang.String r3 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r3 = com.google.android.gms.measurement.internal.B5.G0(r3)     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0586
            if (r2 == 0) goto L_0x0586
            com.google.android.gms.measurement.internal.l r28 = r41.c0()     // Catch:{ all -> 0x007e }
            long r29 = r41.v0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r3 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r31 = r3.zzz()     // Catch:{ all -> 0x007e }
            r36 = 0
            r37 = 0
            r32 = 0
            r33 = 0
            r34 = 1
            r35 = 0
            com.google.android.gms.measurement.internal.p r3 = r28.E(r29, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x007e }
            long r7 = r3.f55254c     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h r3 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r5 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r5.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r13 = com.google.android.gms.measurement.internal.F.f54663o     // Catch:{ all -> 0x007e }
            int r3 = r3.q(r5, r13)     // Catch:{ all -> 0x007e }
            long r13 = (long) r3     // Catch:{ all -> 0x007e }
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0586
            com.google.android.gms.measurement.internal.V1 r3 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r7 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.V1.q(r7)     // Catch:{ all -> 0x007e }
            r3.b(r5, r7)     // Catch:{ all -> 0x007e }
            r3 = -1
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x051c:
            int r13 = r15.zza()     // Catch:{ all -> 0x007e }
            if (r5 >= r13) goto L_0x0547
            com.google.android.gms.internal.measurement.zzfn$zzh r13 = r15.zzb((int) r5)     // Catch:{ all -> 0x007e }
            java.lang.String r14 = r13.zzg()     // Catch:{ all -> 0x007e }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x007e }
            if (r14 == 0) goto L_0x0539
            com.google.android.gms.internal.measurement.zzjk$zzb r3 = r13.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r3 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r3     // Catch:{ all -> 0x007e }
            r7 = r3
            r3 = r5
            goto L_0x0544
        L_0x0539:
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x007e }
            boolean r13 = r12.equals(r13)     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0544
            r8 = 1
        L_0x0544:
            int r5 = r5 + 1
            goto L_0x051c
        L_0x0547:
            if (r8 == 0) goto L_0x054f
            if (r7 == 0) goto L_0x054f
            r15.zza((int) r3)     // Catch:{ all -> 0x007e }
            goto L_0x0586
        L_0x054f:
            if (r7 == 0) goto L_0x056f
            java.lang.Object r5 = r7.clone()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r5 = (com.google.android.gms.internal.measurement.zzjk.zzb) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = r5.zza((java.lang.String) r12)     // Catch:{ all -> 0x007e }
            r7 = 10
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r5 = r5.zza((long) r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r5 = r5.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r5 = (com.google.android.gms.internal.measurement.zzjk) r5     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r5 = (com.google.android.gms.internal.measurement.zzfn.zzh) r5     // Catch:{ all -> 0x007e }
            r15.zza((int) r3, (com.google.android.gms.internal.measurement.zzfn.zzh) r5)     // Catch:{ all -> 0x007e }
            goto L_0x0586
        L_0x056f:
            com.google.android.gms.measurement.internal.V1 r3 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r3 = r3.B()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r7 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.V1.q(r7)     // Catch:{ all -> 0x007e }
            r3.b(r5, r7)     // Catch:{ all -> 0x007e }
        L_0x0586:
            if (r2 == 0) goto L_0x05f7
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
            java.util.List r3 = r15.zzf()     // Catch:{ all -> 0x007e }
            r2.<init>(r3)     // Catch:{ all -> 0x007e }
            r3 = 0
            r5 = -1
            r7 = -1
        L_0x0594:
            int r8 = r2.size()     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r3 >= r8) goto L_0x05c4
            java.lang.Object r8 = r2.get(r3)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r8 = (com.google.android.gms.internal.measurement.zzfn.zzh) r8     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzg()     // Catch:{ all -> 0x007e }
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x05b0
            r5 = r3
            goto L_0x05c1
        L_0x05b0:
            java.lang.Object r8 = r2.get(r3)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r8 = (com.google.android.gms.internal.measurement.zzfn.zzh) r8     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzg()     // Catch:{ all -> 0x007e }
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x05c1
            r7 = r3
        L_0x05c1:
            int r3 = r3 + 1
            goto L_0x0594
        L_0x05c4:
            r3 = -1
            if (r5 == r3) goto L_0x05f8
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r3 = (com.google.android.gms.internal.measurement.zzfn.zzh) r3     // Catch:{ all -> 0x007e }
            boolean r3 = r3.zzl()     // Catch:{ all -> 0x007e }
            if (r3 != 0) goto L_0x05fa
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r3 = (com.google.android.gms.internal.measurement.zzfn.zzh) r3     // Catch:{ all -> 0x007e }
            boolean r3 = r3.zzj()     // Catch:{ all -> 0x007e }
            if (r3 != 0) goto L_0x05fa
            com.google.android.gms.measurement.internal.V1 r2 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r2 = r2.H()     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x007e }
            r15.zza((int) r5)     // Catch:{ all -> 0x007e }
            l(r15, r11)     // Catch:{ all -> 0x007e }
            r2 = 18
            k(r15, r2, r13)     // Catch:{ all -> 0x007e }
        L_0x05f7:
            r3 = -1
        L_0x05f8:
            r8 = 3
            goto L_0x0641
        L_0x05fa:
            r3 = -1
            if (r7 != r3) goto L_0x05ff
            r8 = 3
            goto L_0x0622
        L_0x05ff:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r2 = (com.google.android.gms.internal.measurement.zzfn.zzh) r2     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x007e }
            int r7 = r2.length()     // Catch:{ all -> 0x007e }
            r8 = 3
            if (r7 == r8) goto L_0x0611
            goto L_0x0622
        L_0x0611:
            r7 = 0
        L_0x0612:
            int r13 = r2.length()     // Catch:{ all -> 0x007e }
            if (r7 >= r13) goto L_0x0641
            int r13 = r2.codePointAt(r7)     // Catch:{ all -> 0x007e }
            boolean r14 = java.lang.Character.isLetter(r13)     // Catch:{ all -> 0x007e }
            if (r14 != 0) goto L_0x063b
        L_0x0622:
            com.google.android.gms.measurement.internal.V1 r2 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r2 = r2.H()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r7)     // Catch:{ all -> 0x007e }
            r15.zza((int) r5)     // Catch:{ all -> 0x007e }
            l(r15, r11)     // Catch:{ all -> 0x007e }
            r2 = 19
            k(r15, r2, r12)     // Catch:{ all -> 0x007e }
            goto L_0x0641
        L_0x063b:
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x007e }
            int r7 = r7 + r13
            goto L_0x0612
        L_0x0641:
            java.lang.String r2 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x007e }
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x069a
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r2 = r15.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r2 = (com.google.android.gms.internal.measurement.zzjk) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r2 = (com.google.android.gms.internal.measurement.zzfn.zzf) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r2 = com.google.android.gms.measurement.internal.x5.A(r2, r6)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0695
            if (r27 == 0) goto L_0x068d
            long r5 = r27.zzc()     // Catch:{ all -> 0x007e }
            long r12 = r15.zzc()     // Catch:{ all -> 0x007e }
            long r5 = r5 - r12
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x007e }
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x068d
            java.lang.Object r2 = r27.clone()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r2 = (com.google.android.gms.internal.measurement.zzjk.zzb) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r2     // Catch:{ all -> 0x007e }
            boolean r5 = r1.H(r15, r2)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x068d
            r5 = r26
            r5.zza((int) r9, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r2)     // Catch:{ all -> 0x007e }
            r14 = r9
            r12 = r18
        L_0x0687:
            r25 = 0
            r27 = 0
            goto L_0x06ee
        L_0x068d:
            r5 = r26
            r12 = r44
            r14 = r9
            r25 = r15
            goto L_0x06ee
        L_0x0695:
            r5 = r26
        L_0x0697:
            r6 = r18
            goto L_0x06ec
        L_0x069a:
            r5 = r26
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r15.zze()     // Catch:{ all -> 0x007e }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0697
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r2 = r15.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r2 = (com.google.android.gms.internal.measurement.zzjk) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r2 = (com.google.android.gms.internal.measurement.zzfn.zzf) r2     // Catch:{ all -> 0x007e }
            r7 = r19
            com.google.android.gms.internal.measurement.zzfn$zzh r2 = com.google.android.gms.measurement.internal.x5.A(r2, r7)     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0697
            if (r25 == 0) goto L_0x06e4
            long r6 = r25.zzc()     // Catch:{ all -> 0x007e }
            long r12 = r15.zzc()     // Catch:{ all -> 0x007e }
            long r6 = r6 - r12
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x007e }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x06e4
            java.lang.Object r2 = r25.clone()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r2 = (com.google.android.gms.internal.measurement.zzjk.zzb) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r2     // Catch:{ all -> 0x007e }
            boolean r6 = r1.H(r2, r15)     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x06e4
            r6 = r18
            r5.zza((int) r6, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r2)     // Catch:{ all -> 0x007e }
            r12 = r6
            r14 = r9
            goto L_0x0687
        L_0x06e4:
            r6 = r18
            r14 = r44
            r12 = r6
            r27 = r15
            goto L_0x06ee
        L_0x06ec:
            r12 = r6
            r14 = r9
        L_0x06ee:
            boolean r2 = com.google.android.gms.internal.measurement.zzop.zza()     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x080b
            com.google.android.gms.measurement.internal.h r2 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54612O0     // Catch:{ all -> 0x007e }
            boolean r2 = r2.o(r6)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x080b
            int r2 = r15.zza()     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x080b
            r41.n0()     // Catch:{ all -> 0x007e }
            java.util.List r2 = r15.zzf()     // Catch:{ all -> 0x007e }
            android.os.Bundle r2 = com.google.android.gms.measurement.internal.x5.w(r2)     // Catch:{ all -> 0x007e }
            r6 = 0
        L_0x0712:
            int r7 = r15.zza()     // Catch:{ all -> 0x007e }
            if (r6 >= r7) goto L_0x07b9
            com.google.android.gms.internal.measurement.zzfn$zzh r7 = r15.zzb((int) r6)     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r7.zzg()     // Catch:{ all -> 0x007e }
            r10 = r23
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x007e }
            if (r9 == 0) goto L_0x0794
            java.util.List r9 = r7.zzi()     // Catch:{ all -> 0x007e }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x007e }
            if (r9 != 0) goto L_0x0794
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            java.util.List r7 = r7.zzi()     // Catch:{ all -> 0x007e }
            int r11 = r7.size()     // Catch:{ all -> 0x007e }
            android.os.Bundle[] r11 = new android.os.Bundle[r11]     // Catch:{ all -> 0x007e }
            r13 = 0
        L_0x0743:
            int r3 = r7.size()     // Catch:{ all -> 0x007e }
            if (r13 >= r3) goto L_0x0790
            java.lang.Object r3 = r7.get(r13)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r3 = (com.google.android.gms.internal.measurement.zzfn.zzh) r3     // Catch:{ all -> 0x007e }
            r41.n0()     // Catch:{ all -> 0x007e }
            java.util.List r18 = r3.zzi()     // Catch:{ all -> 0x007e }
            android.os.Bundle r8 = com.google.android.gms.measurement.internal.x5.w(r18)     // Catch:{ all -> 0x007e }
            java.util.List r3 = r3.zzi()     // Catch:{ all -> 0x007e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007e }
        L_0x0762:
            boolean r18 = r3.hasNext()     // Catch:{ all -> 0x007e }
            if (r18 == 0) goto L_0x0786
            java.lang.Object r18 = r3.next()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r18 = (com.google.android.gms.internal.measurement.zzfn.zzh) r18     // Catch:{ all -> 0x007e }
            r19 = r3
            java.lang.String r3 = r15.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r18 = r18.zzcc()     // Catch:{ all -> 0x007e }
            r20 = r7
            r7 = r18
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r7 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r7     // Catch:{ all -> 0x007e }
            r1.x(r3, r7, r8, r9)     // Catch:{ all -> 0x007e }
            r3 = r19
            r7 = r20
            goto L_0x0762
        L_0x0786:
            r20 = r7
            r11[r13] = r8     // Catch:{ all -> 0x007e }
            int r13 = r13 + 1
            r7 = r20
            r8 = 3
            goto L_0x0743
        L_0x0790:
            r2.putParcelableArray(r10, r11)     // Catch:{ all -> 0x007e }
            goto L_0x07b1
        L_0x0794:
            java.lang.String r3 = r7.zzg()     // Catch:{ all -> 0x007e }
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x007e }
            if (r3 != 0) goto L_0x07b1
            java.lang.String r3 = r15.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r7 = r7.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r7 = (com.google.android.gms.internal.measurement.zzfn.zzh.zza) r7     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            r1.x(r3, r7, r2, r8)     // Catch:{ all -> 0x007e }
        L_0x07b1:
            int r6 = r6 + 1
            r23 = r10
            r3 = -1
            r8 = 3
            goto L_0x0712
        L_0x07b9:
            r10 = r23
            r15.zzd()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5 r3 = r41.n0()     // Catch:{ all -> 0x007e }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
            r6.<init>()     // Catch:{ all -> 0x007e }
            java.util.Set r7 = r2.keySet()     // Catch:{ all -> 0x007e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x007e }
        L_0x07cf:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x07f8
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r9 = com.google.android.gms.internal.measurement.zzfn.zzh.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r9 = r9.zza((java.lang.String) r8)     // Catch:{ all -> 0x007e }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x07cf
            r3.P(r9, r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r8 = r9.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r8 = (com.google.android.gms.internal.measurement.zzjk) r8     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r8 = (com.google.android.gms.internal.measurement.zzfn.zzh) r8     // Catch:{ all -> 0x007e }
            r6.add(r8)     // Catch:{ all -> 0x007e }
            goto L_0x07cf
        L_0x07f8:
            int r2 = r6.size()     // Catch:{ all -> 0x007e }
            r3 = 0
        L_0x07fd:
            if (r3 >= r2) goto L_0x080d
            java.lang.Object r7 = r6.get(r3)     // Catch:{ all -> 0x007e }
            int r3 = r3 + 1
            com.google.android.gms.internal.measurement.zzfn$zzh r7 = (com.google.android.gms.internal.measurement.zzfn.zzh) r7     // Catch:{ all -> 0x007e }
            r15.zza((com.google.android.gms.internal.measurement.zzfn.zzh) r7)     // Catch:{ all -> 0x007e }
            goto L_0x07fd
        L_0x080b:
            r10 = r23
        L_0x080d:
            java.util.List r2 = r4.f55322c     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r3 = r15.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r3 = (com.google.android.gms.internal.measurement.zzjk) r3     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r3 = (com.google.android.gms.internal.measurement.zzfn.zzf) r3     // Catch:{ all -> 0x007e }
            r13 = r22
            r2.set(r13, r3)     // Catch:{ all -> 0x007e }
            int r11 = r44 + 1
            r5.zza((com.google.android.gms.internal.measurement.zzfn.zzf.zza) r15)     // Catch:{ all -> 0x007e }
            r7 = r25
            r8 = r27
        L_0x0825:
            int r9 = r13 + 1
            r3 = r10
            r10 = r17
            r2 = r24
            r13 = 0
            goto L_0x0252
        L_0x082f:
            r7 = r19
            r2 = 0
            r8 = r44
            r12 = r2
            r9 = 0
        L_0x0837:
            if (r9 >= r8) goto L_0x0884
            com.google.android.gms.internal.measurement.zzfn$zzf r14 = r5.zza((int) r9)     // Catch:{ all -> 0x007e }
            java.lang.String r15 = r14.zzg()     // Catch:{ all -> 0x007e }
            boolean r15 = r10.equals(r15)     // Catch:{ all -> 0x007e }
            if (r15 == 0) goto L_0x0859
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r15 = com.google.android.gms.measurement.internal.x5.A(r14, r6)     // Catch:{ all -> 0x007e }
            if (r15 == 0) goto L_0x0859
            r5.zzb((int) r9)     // Catch:{ all -> 0x007e }
            int r8 = r8 + -1
            int r9 = r9 + -1
        L_0x0857:
            r14 = 1
            goto L_0x0882
        L_0x0859:
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r14 = com.google.android.gms.measurement.internal.x5.A(r14, r7)     // Catch:{ all -> 0x007e }
            if (r14 == 0) goto L_0x0857
            boolean r15 = r14.zzl()     // Catch:{ all -> 0x007e }
            if (r15 == 0) goto L_0x0871
            long r14 = r14.zzd()     // Catch:{ all -> 0x007e }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x007e }
            goto L_0x0872
        L_0x0871:
            r14 = 0
        L_0x0872:
            if (r14 == 0) goto L_0x0857
            long r18 = r14.longValue()     // Catch:{ all -> 0x007e }
            int r15 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0857
            long r14 = r14.longValue()     // Catch:{ all -> 0x007e }
            long r12 = r12 + r14
            goto L_0x0857
        L_0x0882:
            int r9 = r9 + r14
            goto L_0x0837
        L_0x0884:
            r6 = 0
            r1.m(r5, r12, r6)     // Catch:{ all -> 0x007e }
            java.util.List r6 = r5.zzaa()     // Catch:{ all -> 0x007e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007e }
        L_0x0890:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x08b5
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r7 = (com.google.android.gms.internal.measurement.zzfn.zzf) r7     // Catch:{ all -> 0x007e }
            java.lang.String r9 = "_s"
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x007e }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0890
            com.google.android.gms.measurement.internal.l r6 = r41.c0()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r5.zzt()     // Catch:{ all -> 0x007e }
            r6.J0(r7, r8)     // Catch:{ all -> 0x007e }
        L_0x08b5:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.x5.t(r5, r6)     // Catch:{ all -> 0x007e }
            if (r6 < 0) goto L_0x08c2
            r6 = 1
            r1.m(r5, r12, r6)     // Catch:{ all -> 0x007e }
            goto L_0x08e2
        L_0x08c2:
            int r6 = com.google.android.gms.measurement.internal.x5.t(r5, r8)     // Catch:{ all -> 0x007e }
            if (r6 < 0) goto L_0x08e2
            r5.zzc((int) r6)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.V1 r6 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r6 = r6.B()     // Catch:{ all -> 0x007e }
            java.lang.String r7 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x007e }
            r6.b(r7, r8)     // Catch:{ all -> 0x007e }
        L_0x08e2:
            com.google.android.gms.measurement.internal.x5 r6 = r41.n0()     // Catch:{ all -> 0x007e }
            r6.Q(r5)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.z2 r7 = r41.zzl()     // Catch:{ all -> 0x007e }
            r7.i()     // Catch:{ all -> 0x007e }
            r41.q0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r7 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.Z1 r7 = r7.C0(r6)     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x0915
            com.google.android.gms.measurement.internal.V1 r7 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r7 = r7.B()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "Cannot fix consent fields without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.q(r6)     // Catch:{ all -> 0x007e }
            r7.b(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0918
        L_0x0915:
            r1.s(r7, r5)     // Catch:{ all -> 0x007e }
        L_0x0918:
            boolean r6 = com.google.android.gms.internal.measurement.zzoj.zza()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0959
            com.google.android.gms.measurement.internal.h r6 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r7 = com.google.android.gms.measurement.internal.F.f54610N0     // Catch:{ all -> 0x007e }
            boolean r6 = r6.o(r7)     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0959
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.z2 r7 = r41.zzl()     // Catch:{ all -> 0x007e }
            r7.i()     // Catch:{ all -> 0x007e }
            r41.q0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r7 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.Z1 r7 = r7.C0(r6)     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x0956
            com.google.android.gms.measurement.internal.V1 r7 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r7 = r7.G()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "Cannot populate ad_campaign_info without appInfo. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.q(r6)     // Catch:{ all -> 0x007e }
            r7.b(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0959
        L_0x0956:
            r1.T(r7, r5)     // Catch:{ all -> 0x007e }
        L_0x0959:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r6 = r5.zzi((long) r6)     // Catch:{ all -> 0x007e }
            r7 = -9223372036854775808
            r6.zze((long) r7)     // Catch:{ all -> 0x007e }
            r6 = 0
        L_0x0968:
            int r7 = r5.zzc()     // Catch:{ all -> 0x007e }
            if (r6 >= r7) goto L_0x099b
            com.google.android.gms.internal.measurement.zzfn$zzf r7 = r5.zza((int) r6)     // Catch:{ all -> 0x007e }
            long r8 = r7.zzd()     // Catch:{ all -> 0x007e }
            long r12 = r5.zzf()     // Catch:{ all -> 0x007e }
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0985
            long r8 = r7.zzd()     // Catch:{ all -> 0x007e }
            r5.zzi((long) r8)     // Catch:{ all -> 0x007e }
        L_0x0985:
            long r8 = r7.zzd()     // Catch:{ all -> 0x007e }
            long r12 = r5.zze()     // Catch:{ all -> 0x007e }
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x0998
            long r7 = r7.zzd()     // Catch:{ all -> 0x007e }
            r5.zze((long) r7)     // Catch:{ all -> 0x007e }
        L_0x0998:
            int r6 = r6 + 1
            goto L_0x0968
        L_0x099b:
            r5.zzs()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r6 = com.google.android.gms.measurement.internal.C4622h3.f55119c     // Catch:{ all -> 0x007e }
            boolean r7 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0a1b
            com.google.android.gms.measurement.internal.h r7 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r8 = com.google.android.gms.measurement.internal.F.f54628W0     // Catch:{ all -> 0x007e }
            boolean r7 = r7.o(r8)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0a1b
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r6 = r1.N(r6)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r7 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzae()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r7 = com.google.android.gms.measurement.internal.C4622h3.q(r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r6 = r6.h(r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r7 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r7 = r7.I0(r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r8 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            r8.T(r9, r6)     // Catch:{ all -> 0x007e }
            boolean r8 = r6.B()     // Catch:{ all -> 0x007e }
            if (r8 != 0) goto L_0x09ff
            boolean r8 = r7.B()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x09ff
            com.google.android.gms.measurement.internal.l r7 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            r7.R0(r8)     // Catch:{ all -> 0x007e }
            goto L_0x0a18
        L_0x09ff:
            boolean r8 = r6.B()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0a18
            boolean r7 = r7.B()     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x0a18
            com.google.android.gms.measurement.internal.l r7 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            r7.T0(r8)     // Catch:{ all -> 0x007e }
        L_0x0a18:
            n(r5, r6)     // Catch:{ all -> 0x007e }
        L_0x0a1b:
            com.google.android.gms.measurement.internal.h r7 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r8 = com.google.android.gms.measurement.internal.F.f54592E0     // Catch:{ all -> 0x007e }
            boolean r7 = r7.o(r8)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0a42
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r6 = r1.N(r6)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzae()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r8 = com.google.android.gms.measurement.internal.C4622h3.q(r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r6 = r6.h(r8)     // Catch:{ all -> 0x007e }
            n(r5, r6)     // Catch:{ all -> 0x007e }
        L_0x0a42:
            boolean r8 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0a73
            com.google.android.gms.measurement.internal.h r8 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54584A0     // Catch:{ all -> 0x007e }
            boolean r8 = r8.z(r9, r10)     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0a73
            r41.o0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r8.zzz()     // Catch:{ all -> 0x007e }
            boolean r8 = com.google.android.gms.measurement.internal.B5.y0(r8)     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0a73
            com.google.android.gms.internal.measurement.zzfn$zzk r8 = r4.f55320a     // Catch:{ all -> 0x007e }
            boolean r8 = r8.zzat()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0a73
            r8 = 1
            goto L_0x0a74
        L_0x0a73:
            r8 = 0
        L_0x0a74:
            if (r7 != 0) goto L_0x0a8c
            if (r8 == 0) goto L_0x0a8a
            com.google.android.gms.internal.measurement.zzfn$zzk r7 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h3 r7 = r1.N(r7)     // Catch:{ all -> 0x007e }
            boolean r7 = r7.A()     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0a8a
            r7 = 1
            goto L_0x0a8b
        L_0x0a8a:
            r7 = 0
        L_0x0a8b:
            r8 = r7
        L_0x0a8c:
            if (r8 == 0) goto L_0x0b76
            r7 = 0
        L_0x0a8f:
            int r8 = r5.zzc()     // Catch:{ all -> 0x007e }
            if (r7 >= r8) goto L_0x0b76
            com.google.android.gms.internal.measurement.zzfn$zzf r8 = r5.zza((int) r7)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r8 = r8.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r8 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r8     // Catch:{ all -> 0x007e }
            java.util.List r9 = r8.zzf()     // Catch:{ all -> 0x007e }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x007e }
        L_0x0aa7:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x007e }
            if (r10 == 0) goto L_0x0abf
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r10 = (com.google.android.gms.internal.measurement.zzfn.zzh) r10     // Catch:{ all -> 0x007e }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x007e }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x007e }
            if (r10 == 0) goto L_0x0aa7
            r9 = 1
            goto L_0x0ac0
        L_0x0abf:
            r9 = 0
        L_0x0ac0:
            if (r9 == 0) goto L_0x0b72
            com.google.android.gms.internal.measurement.zzfn$zzk r9 = r4.f55320a     // Catch:{ all -> 0x007e }
            int r9 = r9.zza()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h r10 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r12 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r12 = r12.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r13 = com.google.android.gms.measurement.internal.F.f54627W     // Catch:{ all -> 0x007e }
            int r10 = r10.q(r12, r13)     // Catch:{ all -> 0x007e }
            if (r9 < r10) goto L_0x0b67
            com.google.android.gms.measurement.internal.h r9 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r10 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r10 = r10.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r12 = com.google.android.gms.measurement.internal.F.f54588C0     // Catch:{ all -> 0x007e }
            boolean r9 = r9.z(r10, r12)     // Catch:{ all -> 0x007e }
            if (r9 == 0) goto L_0x0b0e
            com.google.android.gms.measurement.internal.B5 r9 = r41.o0()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r9.P0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = com.google.android.gms.internal.measurement.zzfn.zzh.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "_tu"
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = r10.zza((java.lang.String) r12)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = r10.zzb(r9)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r10 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r10 = (com.google.android.gms.internal.measurement.zzjk) r10     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r10 = (com.google.android.gms.internal.measurement.zzfn.zzh) r10     // Catch:{ all -> 0x007e }
            r8.zza((com.google.android.gms.internal.measurement.zzfn.zzh) r10)     // Catch:{ all -> 0x007e }
            goto L_0x0b0f
        L_0x0b0e:
            r9 = 0
        L_0x0b0f:
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = com.google.android.gms.internal.measurement.zzfn.zzh.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "_tr"
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = r10.zza((java.lang.String) r12)     // Catch:{ all -> 0x007e }
            r12 = 1
            com.google.android.gms.internal.measurement.zzfn$zzh$zza r10 = r10.zza((long) r12)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r10 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r10 = (com.google.android.gms.internal.measurement.zzjk) r10     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r10 = (com.google.android.gms.internal.measurement.zzfn.zzh) r10     // Catch:{ all -> 0x007e }
            r8.zza((com.google.android.gms.internal.measurement.zzfn.zzh) r10)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5 r10 = r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r12 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r12 = r12.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.h5 r9 = r10.D(r12, r5, r8, r9)     // Catch:{ all -> 0x007e }
            if (r9 == 0) goto L_0x0b67
            com.google.android.gms.measurement.internal.V1 r10 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r10 = r10.F()     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "Generated trigger URI. appId, uri"
            com.google.android.gms.internal.measurement.zzfn$zzk r13 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r13.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r14 = r9.f55133a     // Catch:{ all -> 0x007e }
            r10.c(r12, r13, r14)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r10 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r12 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r12 = r12.zzz()     // Catch:{ all -> 0x007e }
            r10.e0(r12, r9)     // Catch:{ all -> 0x007e }
            java.util.Set r9 = r1.f55310q     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r10 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r10 = r10.zzz()     // Catch:{ all -> 0x007e }
            r9.add(r10)     // Catch:{ all -> 0x007e }
        L_0x0b67:
            com.google.android.gms.internal.measurement.zzkt r8 = r8.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r8 = (com.google.android.gms.internal.measurement.zzjk) r8     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r8 = (com.google.android.gms.internal.measurement.zzfn.zzf) r8     // Catch:{ all -> 0x007e }
            r5.zza((int) r7, (com.google.android.gms.internal.measurement.zzfn.zzf) r8)     // Catch:{ all -> 0x007e }
        L_0x0b72:
            int r7 = r7 + 1
            goto L_0x0a8f
        L_0x0b76:
            boolean r7 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0bbb
            com.google.android.gms.measurement.internal.h r7 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r8 = com.google.android.gms.measurement.internal.F.f54628W0     // Catch:{ all -> 0x007e }
            boolean r7 = r7.o(r8)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0bbb
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r7 = r5.zzi()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.J5 r8 = r41.V()     // Catch:{ all -> 0x007e }
            java.lang.String r9 = r5.zzt()     // Catch:{ all -> 0x007e }
            java.util.List r10 = r5.zzaa()     // Catch:{ all -> 0x007e }
            java.util.List r11 = r5.zzab()     // Catch:{ all -> 0x007e }
            long r12 = r5.zzf()     // Catch:{ all -> 0x007e }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007e }
            long r13 = r5.zze()     // Catch:{ all -> 0x007e }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x007e }
            boolean r6 = r6.B()     // Catch:{ all -> 0x007e }
            r14 = 1
            r6 = r6 ^ r14
            r14 = r6
            java.util.List r6 = r8.v(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x007e }
            r7.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfn.zzd>) r6)     // Catch:{ all -> 0x007e }
            goto L_0x0be6
        L_0x0bbb:
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r6 = r5.zzi()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.J5 r7 = r41.V()     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r5.zzt()     // Catch:{ all -> 0x007e }
            java.util.List r9 = r5.zzaa()     // Catch:{ all -> 0x007e }
            java.util.List r10 = r5.zzab()     // Catch:{ all -> 0x007e }
            long r11 = r5.zzf()     // Catch:{ all -> 0x007e }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x007e }
            long r12 = r5.zze()     // Catch:{ all -> 0x007e }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007e }
            java.util.List r7 = r7.u(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x007e }
            r6.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfn.zzd>) r7)     // Catch:{ all -> 0x007e }
        L_0x0be6:
            com.google.android.gms.measurement.internal.h r6 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r7 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r7.zzz()     // Catch:{ all -> 0x007e }
            boolean r6 = r6.I(r7)     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0ef3
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x007e }
            r6.<init>()     // Catch:{ all -> 0x007e }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x007e }
            r7.<init>()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.B5 r8 = r41.o0()     // Catch:{ all -> 0x007e }
            java.security.SecureRandom r8 = r8.R0()     // Catch:{ all -> 0x007e }
            r9 = 0
        L_0x0c09:
            int r10 = r5.zzc()     // Catch:{ all -> 0x007e }
            if (r9 >= r10) goto L_0x0ebc
            com.google.android.gms.internal.measurement.zzfn$zzf r10 = r5.zza((int) r9)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk$zzb r10 = r10.zzcc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf$zza r10 = (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10     // Catch:{ all -> 0x007e }
            java.lang.String r11 = r10.zze()     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x007e }
            java.lang.String r12 = "_sr"
            if (r11 == 0) goto L_0x0ca6
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r11 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r11 = (com.google.android.gms.internal.measurement.zzfn.zzf) r11     // Catch:{ all -> 0x007e }
            java.lang.String r13 = "_en"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x5.b0(r11, r13)     // Catch:{ all -> 0x007e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x007e }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r13 = (com.google.android.gms.measurement.internal.C4725y) r13     // Catch:{ all -> 0x007e }
            if (r13 != 0) goto L_0x0c5b
            com.google.android.gms.measurement.internal.l r13 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r14 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r14 = r14.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r15 = com.google.android.gms.common.internal.C4536s.l(r11)     // Catch:{ all -> 0x007e }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r13 = r13.B0(r14, r15)     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0c5b
            r6.put(r11, r13)     // Catch:{ all -> 0x007e }
        L_0x0c5b:
            if (r13 == 0) goto L_0x0c9a
            java.lang.Long r11 = r13.f55411i     // Catch:{ all -> 0x007e }
            if (r11 != 0) goto L_0x0c9a
            java.lang.Long r11 = r13.f55412j     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x0c77
            long r14 = r11.longValue()     // Catch:{ all -> 0x007e }
            r18 = 1
            int r11 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r11 <= 0) goto L_0x0c77
            r41.n0()     // Catch:{ all -> 0x007e }
            java.lang.Long r11 = r13.f55412j     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5.O(r10, r12, r11)     // Catch:{ all -> 0x007e }
        L_0x0c77:
            java.lang.Boolean r11 = r13.f55413k     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x0c8f
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x0c8f
            r41.n0()     // Catch:{ all -> 0x007e }
            java.lang.String r11 = "_efs"
            r12 = 1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5.O(r10, r11, r14)     // Catch:{ all -> 0x007e }
        L_0x0c8f:
            com.google.android.gms.internal.measurement.zzkt r11 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r11 = (com.google.android.gms.internal.measurement.zzfn.zzf) r11     // Catch:{ all -> 0x007e }
            r7.add(r11)     // Catch:{ all -> 0x007e }
        L_0x0c9a:
            r5.zza((int) r9, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10)     // Catch:{ all -> 0x007e }
        L_0x0c9d:
            r15 = r4
            r1 = r5
            r44 = r8
            r2 = r9
            r8 = 1
            goto L_0x0eaf
        L_0x0ca6:
            com.google.android.gms.measurement.internal.q2 r11 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r13 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r13 = r13.zzz()     // Catch:{ all -> 0x007e }
            long r13 = r11.t(r13)     // Catch:{ all -> 0x007e }
            r41.o0()     // Catch:{ all -> 0x007e }
            long r2 = r10.zzc()     // Catch:{ all -> 0x007e }
            long r2 = com.google.android.gms.measurement.internal.B5.t(r2, r13)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r11 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r11 = (com.google.android.gms.internal.measurement.zzfn.zzf) r11     // Catch:{ all -> 0x007e }
            java.lang.String r15 = "_dbg"
            r18 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x007e }
            boolean r18 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x007e }
            if (r18 != 0) goto L_0x0d03
            java.util.List r11 = r11.zzh()     // Catch:{ all -> 0x007e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x007e }
        L_0x0cdd:
            boolean r18 = r11.hasNext()     // Catch:{ all -> 0x007e }
            if (r18 == 0) goto L_0x0d03
            java.lang.Object r18 = r11.next()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzh r18 = (com.google.android.gms.internal.measurement.zzfn.zzh) r18     // Catch:{ all -> 0x007e }
            r44 = r11
            java.lang.String r11 = r18.zzg()     // Catch:{ all -> 0x007e }
            boolean r11 = r15.equals(r11)     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x0d07
            long r18 = r18.zzd()     // Catch:{ all -> 0x007e }
            java.lang.Long r11 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x007e }
            boolean r1 = r1.equals(r11)     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0d05
        L_0x0d03:
            r1 = 0
            goto L_0x0d0a
        L_0x0d05:
            r1 = 1
            goto L_0x0d0a
        L_0x0d07:
            r11 = r44
            goto L_0x0cdd
        L_0x0d0a:
            if (r1 != 0) goto L_0x0d20
            com.google.android.gms.measurement.internal.q2 r1 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r11 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r11 = r11.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r15 = r10.zze()     // Catch:{ all -> 0x007e }
            int r1 = r1.D(r11, r15)     // Catch:{ all -> 0x007e }
            r11 = r1
            goto L_0x0d21
        L_0x0d20:
            r11 = 1
        L_0x0d21:
            if (r11 > 0) goto L_0x0d48
            com.google.android.gms.measurement.internal.V1 r1 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r1 = r1.G()     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "Sample rate must be positive. event, rate"
            java.lang.String r3 = r10.zze()     // Catch:{ all -> 0x007e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007e }
            r1.c(r2, r3, r11)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r1 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r1 = (com.google.android.gms.internal.measurement.zzjk) r1     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r1 = (com.google.android.gms.internal.measurement.zzfn.zzf) r1     // Catch:{ all -> 0x007e }
            r7.add(r1)     // Catch:{ all -> 0x007e }
            r5.zza((int) r9, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10)     // Catch:{ all -> 0x007e }
            goto L_0x0c9d
        L_0x0d48:
            java.lang.String r1 = r10.zze()     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r1 = (com.google.android.gms.measurement.internal.C4725y) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0da7
            com.google.android.gms.measurement.internal.l r1 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r15 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r15 = r15.zzz()     // Catch:{ all -> 0x007e }
            r18 = r13
            java.lang.String r13 = r10.zze()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r1 = r1.B0(r15, r13)     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0da9
            com.google.android.gms.measurement.internal.V1 r1 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r1 = r1.G()     // Catch:{ all -> 0x007e }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzfn$zzk r14 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r14 = r14.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r15 = r10.zze()     // Catch:{ all -> 0x007e }
            r1.c(r13, r14, r15)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r13 = r4.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r25 = r13.zzz()     // Catch:{ all -> 0x007e }
            java.lang.String r26 = r10.zze()     // Catch:{ all -> 0x007e }
            long r33 = r10.zzc()     // Catch:{ all -> 0x007e }
            r39 = 0
            r40 = 0
            r27 = 1
            r29 = 1
            r31 = 1
            r35 = 0
            r37 = 0
            r38 = 0
            r24 = r1
            r24.<init>(r25, r26, r27, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ all -> 0x007e }
            goto L_0x0da9
        L_0x0da7:
            r18 = r13
        L_0x0da9:
            r41.n0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r13 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r13 = (com.google.android.gms.internal.measurement.zzjk) r13     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r13 = (com.google.android.gms.internal.measurement.zzfn.zzf) r13     // Catch:{ all -> 0x007e }
            java.lang.String r14 = "_eid"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.x5.b0(r13, r14)     // Catch:{ all -> 0x007e }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x007e }
            if (r13 == 0) goto L_0x0dc1
            r14 = 1
        L_0x0dbf:
            r15 = 1
            goto L_0x0dc3
        L_0x0dc1:
            r14 = 0
            goto L_0x0dbf
        L_0x0dc3:
            if (r11 != r15) goto L_0x0def
            com.google.android.gms.internal.measurement.zzkt r2 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r2 = (com.google.android.gms.internal.measurement.zzjk) r2     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r2 = (com.google.android.gms.internal.measurement.zzfn.zzf) r2     // Catch:{ all -> 0x007e }
            r7.add(r2)     // Catch:{ all -> 0x007e }
            if (r14 == 0) goto L_0x0dea
            java.lang.Long r2 = r1.f55411i     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0dde
            java.lang.Long r2 = r1.f55412j     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0dde
            java.lang.Boolean r2 = r1.f55413k     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0dea
        L_0x0dde:
            r2 = 0
            com.google.android.gms.measurement.internal.y r1 = r1.c(r2, r2, r2)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r10.zze()     // Catch:{ all -> 0x007e }
            r6.put(r2, r1)     // Catch:{ all -> 0x007e }
        L_0x0dea:
            r5.zza((int) r9, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10)     // Catch:{ all -> 0x007e }
            goto L_0x0c9d
        L_0x0def:
            int r15 = r8.nextInt(r11)     // Catch:{ all -> 0x007e }
            if (r15 != 0) goto L_0x0e31
            r41.n0()     // Catch:{ all -> 0x007e }
            r15 = r4
            r26 = r5
            long r4 = (long) r11     // Catch:{ all -> 0x007e }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5.O(r10, r12, r11)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r11 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r11 = (com.google.android.gms.internal.measurement.zzfn.zzf) r11     // Catch:{ all -> 0x007e }
            r7.add(r11)     // Catch:{ all -> 0x007e }
            if (r14 == 0) goto L_0x0e19
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            r5 = 0
            com.google.android.gms.measurement.internal.y r1 = r1.c(r5, r4, r5)     // Catch:{ all -> 0x007e }
        L_0x0e19:
            java.lang.String r4 = r10.zze()     // Catch:{ all -> 0x007e }
            long r11 = r10.zzc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r1 = r1.b(r11, r2)     // Catch:{ all -> 0x007e }
            r6.put(r4, r1)     // Catch:{ all -> 0x007e }
            r44 = r8
            r2 = r9
            r1 = r26
            r8 = 1
            goto L_0x0eac
        L_0x0e31:
            r15 = r4
            r26 = r5
            java.lang.Long r4 = r1.f55410h     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0e41
            long r4 = r4.longValue()     // Catch:{ all -> 0x007e }
            r44 = r8
            r22 = r9
            goto L_0x0e52
        L_0x0e41:
            r41.o0()     // Catch:{ all -> 0x007e }
            long r4 = r10.zzb()     // Catch:{ all -> 0x007e }
            r44 = r8
            r22 = r9
            r8 = r18
            long r4 = com.google.android.gms.measurement.internal.B5.t(r4, r8)     // Catch:{ all -> 0x007e }
        L_0x0e52:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0e9b
            r41.n0()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "_efs"
            r8 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5.O(r10, r4, r5)     // Catch:{ all -> 0x007e }
            r41.n0()     // Catch:{ all -> 0x007e }
            long r4 = (long) r11     // Catch:{ all -> 0x007e }
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x5.O(r10, r12, r11)     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r11 = r10.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r11 = (com.google.android.gms.internal.measurement.zzjk) r11     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzf r11 = (com.google.android.gms.internal.measurement.zzfn.zzf) r11     // Catch:{ all -> 0x007e }
            r7.add(r11)     // Catch:{ all -> 0x007e }
            if (r14 == 0) goto L_0x0e87
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007e }
            r11 = 0
            com.google.android.gms.measurement.internal.y r1 = r1.c(r11, r4, r5)     // Catch:{ all -> 0x007e }
        L_0x0e87:
            java.lang.String r4 = r10.zze()     // Catch:{ all -> 0x007e }
            long r11 = r10.zzc()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r1 = r1.b(r11, r2)     // Catch:{ all -> 0x007e }
            r6.put(r4, r1)     // Catch:{ all -> 0x007e }
        L_0x0e96:
            r2 = r22
            r1 = r26
            goto L_0x0eac
        L_0x0e9b:
            r8 = 1
            if (r14 == 0) goto L_0x0e96
            java.lang.String r2 = r10.zze()     // Catch:{ all -> 0x007e }
            r3 = 0
            com.google.android.gms.measurement.internal.y r1 = r1.c(r13, r3, r3)     // Catch:{ all -> 0x007e }
            r6.put(r2, r1)     // Catch:{ all -> 0x007e }
            goto L_0x0e96
        L_0x0eac:
            r1.zza((int) r2, (com.google.android.gms.internal.measurement.zzfn.zzf.zza) r10)     // Catch:{ all -> 0x007e }
        L_0x0eaf:
            int r2 = r2 + 1
            r8 = r44
            r5 = r1
            r9 = r2
            r4 = r15
            r2 = 0
            r1 = r41
            goto L_0x0c09
        L_0x0ebc:
            r15 = r4
            r1 = r5
            int r2 = r7.size()     // Catch:{ all -> 0x007e }
            int r3 = r1.zzc()     // Catch:{ all -> 0x007e }
            if (r2 >= r3) goto L_0x0ecf
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r2 = r1.zzl()     // Catch:{ all -> 0x007e }
            r2.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfn.zzf>) r7)     // Catch:{ all -> 0x007e }
        L_0x0ecf:
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x007e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007e }
        L_0x0ed7:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0ef1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007e }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r4 = r41.c0()     // Catch:{ all -> 0x007e }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.y r3 = (com.google.android.gms.measurement.internal.C4725y) r3     // Catch:{ all -> 0x007e }
            r4.P(r3)     // Catch:{ all -> 0x007e }
            goto L_0x0ed7
        L_0x0ef1:
            r2 = r15
            goto L_0x0ef5
        L_0x0ef3:
            r1 = r5
            r2 = r4
        L_0x0ef5:
            com.google.android.gms.internal.measurement.zzfn$zzk r3 = r2.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r3.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r4 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.Z1 r4 = r4.C0(r3)     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x0f1e
            com.google.android.gms.measurement.internal.V1 r4 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r2.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.q(r6)     // Catch:{ all -> 0x007e }
            r4.b(r5, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0faa
        L_0x0f1e:
            int r5 = r1.zzc()     // Catch:{ all -> 0x007e }
            if (r5 <= 0) goto L_0x0faa
            long r5 = r4.D0()     // Catch:{ all -> 0x007e }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0f32
            r1.zzg((long) r5)     // Catch:{ all -> 0x007e }
            goto L_0x0f35
        L_0x0f32:
            r1.zzo()     // Catch:{ all -> 0x007e }
        L_0x0f35:
            long r7 = r4.H0()     // Catch:{ all -> 0x007e }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0f40
            goto L_0x0f41
        L_0x0f40:
            r5 = r7
        L_0x0f41:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0f49
            r1.zzh((long) r5)     // Catch:{ all -> 0x007e }
            goto L_0x0f4c
        L_0x0f49:
            r1.zzp()     // Catch:{ all -> 0x007e }
        L_0x0f4c:
            boolean r5 = com.google.android.gms.internal.measurement.zzpn.zza()     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0f7c
            com.google.android.gms.measurement.internal.h r5 = r41.a0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54674t0     // Catch:{ all -> 0x007e }
            boolean r5 = r5.o(r6)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0f7c
            r41.o0()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r4.l()     // Catch:{ all -> 0x007e }
            boolean r5 = com.google.android.gms.measurement.internal.B5.C0(r5)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0f7c
            int r5 = r1.zzc()     // Catch:{ all -> 0x007e }
            long r5 = (long) r5     // Catch:{ all -> 0x007e }
            r4.c(r5)     // Catch:{ all -> 0x007e }
            long r5 = r4.B0()     // Catch:{ all -> 0x007e }
            int r5 = (int) r5     // Catch:{ all -> 0x007e }
            r1.zzg((int) r5)     // Catch:{ all -> 0x007e }
            goto L_0x0f7f
        L_0x0f7c:
            r4.y()     // Catch:{ all -> 0x007e }
        L_0x0f7f:
            long r5 = r4.F0()     // Catch:{ all -> 0x007e }
            int r5 = (int) r5     // Catch:{ all -> 0x007e }
            r1.zzf((int) r5)     // Catch:{ all -> 0x007e }
            long r5 = r1.zzf()     // Catch:{ all -> 0x007e }
            r4.C0(r5)     // Catch:{ all -> 0x007e }
            long r5 = r1.zze()     // Catch:{ all -> 0x007e }
            r4.y0(r5)     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r4.k()     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0f9f
            r1.zzn(r5)     // Catch:{ all -> 0x007e }
            goto L_0x0fa2
        L_0x0f9f:
            r1.zzm()     // Catch:{ all -> 0x007e }
        L_0x0fa2:
            com.google.android.gms.measurement.internal.l r5 = r41.c0()     // Catch:{ all -> 0x007e }
            r6 = 0
            r5.Q(r4, r6, r6)     // Catch:{ all -> 0x007e }
        L_0x0faa:
            int r4 = r1.zzc()     // Catch:{ all -> 0x007e }
            if (r4 <= 0) goto L_0x1009
            com.google.android.gms.measurement.internal.q2 r4 = r41.i0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r5 = r2.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r5.zzz()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfi$zzd r4 = r4.G(r5)     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0fcf
            boolean r5 = r4.zzs()     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x0fc7
            goto L_0x0fcf
        L_0x0fc7:
            long r4 = r4.zzc()     // Catch:{ all -> 0x007e }
            r1.zzb((long) r4)     // Catch:{ all -> 0x007e }
            goto L_0x0ff8
        L_0x0fcf:
            com.google.android.gms.internal.measurement.zzfn$zzk r4 = r2.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r4 = r4.zzaj()     // Catch:{ all -> 0x007e }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0fe1
            r4 = -1
            r1.zzb((long) r4)     // Catch:{ all -> 0x007e }
            goto L_0x0ff8
        L_0x0fe1:
            com.google.android.gms.measurement.internal.V1 r4 = r41.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r4 = r4.G()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzfn$zzk r6 = r2.f55320a     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.zzz()     // Catch:{ all -> 0x007e }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.q(r6)     // Catch:{ all -> 0x007e }
            r4.b(r5, r6)     // Catch:{ all -> 0x007e }
        L_0x0ff8:
            com.google.android.gms.measurement.internal.l r4 = r41.c0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzkt r1 = r1.zzai()     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzjk r1 = (com.google.android.gms.internal.measurement.zzjk) r1     // Catch:{ all -> 0x007e }
            com.google.android.gms.internal.measurement.zzfn$zzk r1 = (com.google.android.gms.internal.measurement.zzfn.zzk) r1     // Catch:{ all -> 0x007e }
            r13 = r17
            r4.X(r1, r13)     // Catch:{ all -> 0x007e }
        L_0x1009:
            com.google.android.gms.measurement.internal.l r1 = r41.c0()     // Catch:{ all -> 0x007e }
            java.util.List r2 = r2.f55321b     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.internal.C4536s.l(r2)     // Catch:{ all -> 0x007e }
            r1.i()     // Catch:{ all -> 0x007e }
            r1.p()     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x007e }
            r13 = 0
        L_0x1020:
            int r5 = r2.size()     // Catch:{ all -> 0x007e }
            if (r13 >= r5) goto L_0x103d
            if (r13 == 0) goto L_0x102d
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x007e }
        L_0x102d:
            java.lang.Object r5 = r2.get(r13)     // Catch:{ all -> 0x007e }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007e }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007e }
            r4.append(r5)     // Catch:{ all -> 0x007e }
            int r13 = r13 + 1
            goto L_0x1020
        L_0x103d:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x007e }
            android.database.sqlite.SQLiteDatabase r5 = r1.w()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007e }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x007e }
            int r5 = r2.size()     // Catch:{ all -> 0x007e }
            if (r4 == r5) goto L_0x1070
            com.google.android.gms.measurement.internal.V1 r1 = r1.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r1 = r1.B()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007e }
            int r2 = r2.size()     // Catch:{ all -> 0x007e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r1.c(r5, r4, r2)     // Catch:{ all -> 0x007e }
        L_0x1070:
            com.google.android.gms.measurement.internal.l r1 = r41.c0()     // Catch:{ all -> 0x007e }
            android.database.sqlite.SQLiteDatabase r2 = r1.w()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            java.lang.String[] r5 = new java.lang.String[]{r3, r3}     // Catch:{ SQLiteException -> 0x1082 }
            r2.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x1082 }
            goto L_0x1095
        L_0x1082:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.V1 r1 = r1.zzj()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.X1 r1 = r1.B()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.V1.q(r3)     // Catch:{ all -> 0x007e }
            r1.c(r4, r3, r2)     // Catch:{ all -> 0x007e }
        L_0x1095:
            com.google.android.gms.measurement.internal.l r1 = r41.c0()     // Catch:{ all -> 0x007e }
            r1.W0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r1 = r41.c0()
            r1.U0()
            r1 = 1
            return r1
        L_0x10a5:
            com.google.android.gms.measurement.internal.l r1 = r41.c0()     // Catch:{ all -> 0x007e }
            r1.W0()     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.l r1 = r41.c0()
            r1.U0()
            r1 = 0
            return r1
        L_0x10b5:
            if (r5 == 0) goto L_0x10ba
            r5.close()     // Catch:{ all -> 0x007e }
        L_0x10ba:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x10bb:
            com.google.android.gms.measurement.internal.l r2 = r41.c0()
            r2.U0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.I(java.lang.String, long):boolean");
    }

    private final void J() {
        zzl().i();
        if (this.f55313t || this.f55314u || this.f55315v) {
            zzj().F().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f55313t), Boolean.valueOf(this.f55314u), Boolean.valueOf(this.f55315v));
            return;
        }
        zzj().F().a("Stopping uploading service(s)");
        List<Runnable> list = this.f55309p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) C4536s.l(this.f55309p)).clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void K() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.measurement.internal.z2 r1 = r21.zzl()
            r1.i()
            r21.q0()
            long r1 = r0.f55308o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            Ea.e r1 = r21.zzb()
            long r1 = r1.a()
            long r5 = r0.f55308o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.V1 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.f2 r1 = r21.w0()
            r1.c()
            com.google.android.gms.measurement.internal.j5 r1 = r21.x0()
            r1.u()
            return
        L_0x004b:
            r0.f55308o = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.E2 r1 = r0.f55305l
            boolean r1 = r1.n()
            if (r1 == 0) goto L_0x024e
            boolean r1 = r21.L()
            if (r1 != 0) goto L_0x005d
            goto L_0x024e
        L_0x005d:
            Ea.e r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54585B
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.l r5 = r21.c0()
            boolean r5 = r5.Z0()
            if (r5 != 0) goto L_0x0090
            com.google.android.gms.measurement.internal.l r5 = r21.c0()
            boolean r5 = r5.Y0()
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r5 = 0
            goto L_0x0091
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.h r10 = r21.a0()
            java.lang.String r10 = r10.K()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bd
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bd
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54679w
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00bd:
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54677v
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00e4
        L_0x00d1:
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54675u
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00e4:
            com.google.android.gms.measurement.internal.Q4 r12 = r0.f55302i
            com.google.android.gms.measurement.internal.l2 r12 = r12.f54841g
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.Q4 r14 = r0.f55302i
            com.google.android.gms.measurement.internal.l2 r14 = r14.f54842h
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.l r16 = r21.c0()
            r17 = r10
            long r9 = r16.u()
            com.google.android.gms.measurement.internal.l r11 = r21.c0()
            r19 = r7
            long r6 = r11.v()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r10 = r3
            goto L_0x018d
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            com.google.android.gms.measurement.internal.x5 r5 = r21.n0()
            r12 = r17
            boolean r5 = r5.Y(r8, r12)
            if (r5 != 0) goto L_0x0147
            long r10 = r8 + r12
        L_0x0147:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018d
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x018d
            r5 = 0
        L_0x0150:
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54589D
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r8 = 0
            int r6 = java.lang.Math.max(r8, r6)
            r9 = 20
            int r6 = java.lang.Math.min(r9, r6)
            if (r5 >= r6) goto L_0x0110
            r12 = 1
            long r12 = r12 << r5
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54587C
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r3, r6)
            long r6 = r6 * r12
            long r10 = r10 + r6
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            int r5 = r5 + 1
            goto L_0x0150
        L_0x018d:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.V1 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.f2 r1 = r21.w0()
            r1.c()
            com.google.android.gms.measurement.internal.j5 r1 = r21.x0()
            r1.u()
            return
        L_0x01ad:
            com.google.android.gms.measurement.internal.Y1 r1 = r21.g0()
            boolean r1 = r1.v()
            if (r1 != 0) goto L_0x01d3
            com.google.android.gms.measurement.internal.V1 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.f2 r1 = r21.w0()
            r1.b()
            com.google.android.gms.measurement.internal.j5 r1 = r21.x0()
            r1.u()
            return
        L_0x01d3:
            com.google.android.gms.measurement.internal.Q4 r1 = r0.f55302i
            com.google.android.gms.measurement.internal.l2 r1 = r1.f54840f
            long r1 = r1.a()
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54671s
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.x5 r7 = r21.n0()
            boolean r7 = r7.Y(r1, r5)
            if (r7 != 0) goto L_0x01fe
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01fe:
            com.google.android.gms.measurement.internal.f2 r1 = r21.w0()
            r1.c()
            Ea.e r1 = r21.zzb()
            long r1 = r1.currentTimeMillis()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0235
            r21.a0()
            com.google.android.gms.measurement.internal.M1 r1 = com.google.android.gms.measurement.internal.F.f54681x
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.Q4 r1 = r0.f55302i
            com.google.android.gms.measurement.internal.l2 r1 = r1.f54841g
            Ea.e r2 = r21.zzb()
            long r2 = r2.currentTimeMillis()
            r1.b(r2)
        L_0x0235:
            com.google.android.gms.measurement.internal.V1 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.j5 r1 = r21.x0()
            r1.t(r10)
            return
        L_0x024e:
            com.google.android.gms.measurement.internal.V1 r1 = r21.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.f2 r1 = r21.w0()
            r1.c()
            com.google.android.gms.measurement.internal.j5 r1 = r21.x0()
            r1.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.K():void");
    }

    private final boolean L() {
        zzl().i();
        q0();
        if (c0().X0() || !TextUtils.isEmpty(c0().x())) {
            return true;
        }
        return false;
    }

    private final boolean M() {
        zzl().i();
        FileLock fileLock = this.f55316w;
        if (fileLock == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(zzcf.zza().zza(this.f55305l.zza().getFilesDir(), "google_app_measurement.db")), "rw").getChannel();
                this.f55317x = channel;
                FileLock tryLock = channel.tryLock();
                this.f55316w = tryLock;
                if (tryLock != null) {
                    zzj().F().a("Storage concurrent access okay");
                    return true;
                }
                zzj().B().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                zzj().B().b("Failed to acquire storage lock", e10);
                return false;
            } catch (IOException e11) {
                zzj().B().b("Failed to access storage lock file", e11);
                return false;
            } catch (OverlappingFileLockException e12) {
                zzj().G().b("Storage lock already acquired", e12);
                return false;
            }
        } else {
            zzj().F().a("Storage concurrent access okay");
            return true;
        }
    }

    private final void R(D d10, E5 e52) {
        C4536s.f(e52.f54557a);
        C4572a2 b10 = C4572a2.b(d10);
        o0().I(b10.f55003d, c0().A0(e52.f54557a));
        o0().R(b10, a0().p(e52.f54557a));
        D a10 = b10.a();
        if ("_cmp".equals(a10.f54497a) && "referrer API v2".equals(a10.f54498b.u0("_cis"))) {
            String u02 = a10.f54498b.u0("gclid");
            if (!TextUtils.isEmpty(u02)) {
                u(new A5("_lgclid", a10.f54500d, u02, "auto"), e52);
            }
        }
        q(a10, e52);
    }

    private final void S(Z1 z12) {
        zzl().i();
        if (!TextUtils.isEmpty(z12.q()) || !TextUtils.isEmpty(z12.j())) {
            Uri.Builder builder = new Uri.Builder();
            String q10 = z12.q();
            if (TextUtils.isEmpty(q10)) {
                q10 = z12.j();
            }
            C1587a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme((String) F.f54645f.a((Object) null)).encodedAuthority((String) F.f54647g.a((Object) null));
            encodedAuthority.path("config/app/" + q10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "97001").appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) C4536s.l(z12.l());
                URL url = new URL(uri);
                zzj().F().b("Fetching remote configuration", str);
                zzfi.zzd G10 = i0().G(str);
                String L10 = i0().L(str);
                if (G10 != null) {
                    if (!TextUtils.isEmpty(L10)) {
                        aVar = new C1587a();
                        aVar.put("If-Modified-Since", L10);
                    }
                    String J10 = i0().J(str);
                    if (!TextUtils.isEmpty(J10)) {
                        if (aVar == null) {
                            aVar = new C1587a();
                        }
                        aVar.put("If-None-Match", J10);
                    }
                }
                this.f55313t = true;
                Y1 g02 = g0();
                r5 r5Var = new r5(this);
                g02.i();
                g02.p();
                C4536s.l(url);
                C4536s.l(r5Var);
                g02.zzl().u(new C4593d2(g02, str, url, (byte[]) null, aVar, r5Var));
            } catch (MalformedURLException unused) {
                zzj().B().c("Failed to parse config URL. Not fetching. appId", V1.q(z12.l()), uri);
            }
        } else {
            w((String) C4536s.l(z12.l()), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    private final E5 U(String str) {
        String str2 = str;
        Z1 C02 = c0().C0(str2);
        if (C02 == null || TextUtils.isEmpty(C02.o())) {
            zzj().A().b("No app data available; dropping", str2);
            return null;
        }
        Boolean i10 = i(C02);
        if (i10 == null || i10.booleanValue()) {
            return new E5(str, C02.q(), C02.o(), C02.U(), C02.n(), C02.z0(), C02.t0(), (String) null, C02.A(), false, C02.p(), C02.Q(), 0, 0, C02.z(), false, C02.j(), C02.K0(), C02.v0(), C02.w(), (String) null, N(str).z(), "", (String) null, C02.C(), C02.J0(), N(str).b(), Y(str).j(), C02.a(), C02.X(), C02.v(), C02.t());
        }
        zzj().B().b("App version does not match; dropping. appId", V1.q(str));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x030f A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x038f A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0719 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x072b A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0771 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x07cb A[SYNTHETIC, Splitter:B:279:0x07cb] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07f0 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0866 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x087f A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0906 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0924 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x099a A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x09f5 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df A[SYNTHETIC, Splitter:B:75:0x01df] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0241 A[SYNTHETIC, Splitter:B:89:0x0241] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0251 A[Catch:{ SQLiteException -> 0x02d7, all -> 0x01bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void W(com.google.android.gms.measurement.internal.D r37, com.google.android.gms.measurement.internal.E5 r38) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r38
            java.lang.String r4 = "_fx"
            java.lang.String r5 = "_sno"
            com.google.android.gms.common.internal.C4536s.l(r38)
            java.lang.String r6 = r3.f54557a
            com.google.android.gms.common.internal.C4536s.f(r6)
            long r6 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.z2 r8 = r36.zzl()
            r8.i()
            r36.q0()
            java.lang.String r8 = r3.f54557a
            r36.n0()
            boolean r9 = com.google.android.gms.measurement.internal.x5.Z(r37, r38)
            if (r9 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r9 = r3.f54564h
            if (r9 != 0) goto L_0x0034
            r1.e(r3)
            return
        L_0x0034:
            com.google.android.gms.measurement.internal.q2 r9 = r36.i0()
            java.lang.String r10 = r2.f54497a
            boolean r9 = r9.K(r8, r10)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r9 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.V1 r3 = r36.zzj()
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r8)
            com.google.android.gms.measurement.internal.E2 r5 = r1.f55305l
            com.google.android.gms.measurement.internal.R1 r5 = r5.y()
            java.lang.String r6 = r2.f54497a
            java.lang.String r5 = r5.c(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.q2 r3 = r36.i0()
            boolean r3 = r3.T(r8)
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.q2 r3 = r36.i0()
            boolean r3 = r3.V(r8)
            if (r3 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            if (r3 != 0) goto L_0x0095
            java.lang.String r4 = r2.f54497a
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0095
            r36.o0()
            com.google.android.gms.measurement.internal.D5 r9 = r1.f55293G
            java.lang.String r13 = r2.f54497a
            r2 = 0
            r11 = 11
            java.lang.String r12 = "_ev"
            r10 = r8
            r4 = r14
            r14 = r2
            com.google.android.gms.measurement.internal.B5.U(r9, r10, r11, r12, r13, r14)
            goto L_0x0096
        L_0x0095:
            r4 = r14
        L_0x0096:
            if (r3 == 0) goto L_0x00de
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            com.google.android.gms.measurement.internal.Z1 r2 = r2.C0(r8)
            if (r2 == 0) goto L_0x00de
            long r5 = r2.x0()
            long r7 = r2.a0()
            long r5 = java.lang.Math.max(r5, r7)
            Ea.e r3 = r36.zzb()
            long r7 = r3.currentTimeMillis()
            long r7 = r7 - r5
            long r5 = java.lang.Math.abs(r7)
            r36.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54583A
            java.lang.Object r3 = r3.a(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.V1 r3 = r36.zzj()
            com.google.android.gms.measurement.internal.X1 r3 = r3.A()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.S(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.a2 r2 = com.google.android.gms.measurement.internal.C4572a2.b(r37)
            com.google.android.gms.measurement.internal.B5 r9 = r36.o0()
            com.google.android.gms.measurement.internal.h r10 = r36.a0()
            int r10 = r10.p(r8)
            r9.R(r2, r10)
            boolean r9 = com.google.android.gms.internal.measurement.zzou.zza()
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.h r9 = r36.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54686z0
            boolean r9 = r9.o(r10)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.h r9 = r36.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54617R
            r11 = 10
            r12 = 35
            int r9 = r9.l(r8, r10, r11, r12)
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            java.util.TreeSet r10 = new java.util.TreeSet
            android.os.Bundle r11 = r2.f55003d
            java.util.Set r11 = r11.keySet()
            r10.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "items"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x0159
            com.google.android.gms.measurement.internal.B5 r12 = r36.o0()
            android.os.Bundle r13 = r2.f55003d
            android.os.Parcelable[] r11 = r13.getParcelableArray(r11)
            boolean r13 = com.google.android.gms.internal.measurement.zzou.zza()
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.measurement.internal.h r13 = r36.a0()
            com.google.android.gms.measurement.internal.M1 r14 = com.google.android.gms.measurement.internal.F.f54686z0
            boolean r13 = r13.o(r14)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r12.W(r11, r9, r13)
        L_0x0159:
            r14 = 0
            goto L_0x0123
        L_0x015b:
            com.google.android.gms.measurement.internal.D r2 = r2.a()
            com.google.android.gms.measurement.internal.V1 r9 = r36.zzj()
            r10 = 2
            boolean r9 = r9.x(r10)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.measurement.internal.V1 r9 = r36.zzj()
            com.google.android.gms.measurement.internal.X1 r9 = r9.F()
            com.google.android.gms.measurement.internal.E2 r10 = r1.f55305l
            com.google.android.gms.measurement.internal.R1 r10 = r10.y()
            java.lang.String r10 = r10.b(r2)
            java.lang.String r11 = "Logging event"
            r9.b(r11, r10)
        L_0x0181:
            boolean r9 = com.google.android.gms.internal.measurement.zzoo.zza()
            if (r9 == 0) goto L_0x0190
            com.google.android.gms.measurement.internal.h r9 = r36.a0()
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54680w0
            r9.o(r10)
        L_0x0190:
            com.google.android.gms.measurement.internal.l r9 = r36.c0()
            r9.S0()
            r1.e(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x01bf
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x01bf
            java.lang.String r9 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bf
        L_0x01b9:
            r9 = 0
            goto L_0x01c0
        L_0x01bb:
            r0 = move-exception
            r2 = r0
            goto L_0x0a40
        L_0x01bf:
            r9 = 1
        L_0x01c0:
            java.lang.String r11 = "_iap"
            java.lang.String r12 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x01bb }
            if (r11 != 0) goto L_0x01d3
            if (r9 == 0) goto L_0x01cd
            goto L_0x01d3
        L_0x01cd:
            r24 = r6
            r7 = r15
            r6 = 1
            goto L_0x033c
        L_0x01d3:
            com.google.android.gms.measurement.internal.C r11 = r2.f54498b     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "currency"
            java.lang.String r11 = r11.u0(r12)     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "value"
            if (r9 == 0) goto L_0x0241
            com.google.android.gms.measurement.internal.C r9 = r2.f54498b     // Catch:{ all -> 0x01bb }
            java.lang.Double r9 = r9.q0(r12)     // Catch:{ all -> 0x01bb }
            double r13 = r9.doubleValue()     // Catch:{ all -> 0x01bb }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r13 = r13 * r19
            r21 = 0
            int r9 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0203
            com.google.android.gms.measurement.internal.C r9 = r2.f54498b     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = r9.s0(r12)     // Catch:{ all -> 0x01bb }
            long r12 = r9.longValue()     // Catch:{ all -> 0x01bb }
            double r12 = (double) r12     // Catch:{ all -> 0x01bb }
            double r13 = r12 * r19
        L_0x0203:
            r19 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 > 0) goto L_0x021d
            r19 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 < 0) goto L_0x021d
            long r12 = java.lang.Math.round(r13)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x024b
            long r12 = -r12
            goto L_0x024b
        L_0x021d:
            com.google.android.gms.measurement.internal.V1 r2 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r2 = r2.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Double r5 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()     // Catch:{ all -> 0x01bb }
            r2.W0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            return
        L_0x0241:
            com.google.android.gms.measurement.internal.C r9 = r2.f54498b     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = r9.s0(r12)     // Catch:{ all -> 0x01bb }
            long r12 = r9.longValue()     // Catch:{ all -> 0x01bb }
        L_0x024b:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x01cd
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r9.matches(r10)     // Catch:{ all -> 0x01bb }
            if (r10 == 0) goto L_0x01cd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "_ltv_"
            r10.<init>(r11)     // Catch:{ all -> 0x01bb }
            r10.append(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r14 = r10.toString()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r9 = r36.c0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r9 = r9.D0(r8, r14)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x027d
            java.lang.Object r9 = r9.f54496e     // Catch:{ all -> 0x01bb }
            boolean r10 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x01bb }
            if (r10 != 0) goto L_0x0282
        L_0x027d:
            r24 = r6
            r7 = r15
            r6 = 1
            goto L_0x02ad
        L_0x0282:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x01bb }
            long r9 = r9.longValue()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r19 = new com.google.android.gms.measurement.internal.C5     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f54499c     // Catch:{ all -> 0x01bb }
            Ea.e r20 = r36.zzb()     // Catch:{ all -> 0x01bb }
            long r20 = r20.currentTimeMillis()     // Catch:{ all -> 0x01bb }
            long r9 = r9 + r12
            java.lang.Long r22 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r9 = r19
            r10 = r8
            r13 = 0
            r12 = r14
            r24 = r6
            r6 = 1
            r7 = 0
            r13 = r20
            r7 = r15
            r15 = r22
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x01bb }
        L_0x02aa:
            r9 = r19
            goto L_0x0305
        L_0x02ad:
            com.google.android.gms.measurement.internal.l r9 = r36.c0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r10 = r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r11 = com.google.android.gms.measurement.internal.F.f54593F     // Catch:{ all -> 0x01bb }
            int r10 = r10.q(r8, r11)     // Catch:{ all -> 0x01bb }
            int r10 = r10 - r6
            com.google.android.gms.common.internal.C4536s.f(r8)     // Catch:{ all -> 0x01bb }
            r9.i()     // Catch:{ all -> 0x01bb }
            r9.p()     // Catch:{ all -> 0x01bb }
            android.database.sqlite.SQLiteDatabase r11 = r9.w()     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.String r15 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.String[] r10 = new java.lang.String[]{r8, r8, r10}     // Catch:{ SQLiteException -> 0x02d7 }
            r11.execSQL(r15, r10)     // Catch:{ SQLiteException -> 0x02d7 }
            goto L_0x02ea
        L_0x02d7:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.V1 r9 = r9.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r9 = r9.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            r9.c(r11, r15, r10)     // Catch:{ all -> 0x01bb }
        L_0x02ea:
            com.google.android.gms.measurement.internal.C5 r19 = new com.google.android.gms.measurement.internal.C5     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f54499c     // Catch:{ all -> 0x01bb }
            Ea.e r9 = r36.zzb()     // Catch:{ all -> 0x01bb }
            long r15 = r9.currentTimeMillis()     // Catch:{ all -> 0x01bb }
            java.lang.Long r17 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01bb }
            r9 = r19
            r10 = r8
            r12 = r14
            r13 = r15
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x01bb }
            goto L_0x02aa
        L_0x0305:
            com.google.android.gms.measurement.internal.l r10 = r36.c0()     // Catch:{ all -> 0x01bb }
            boolean r10 = r10.a0(r9)     // Catch:{ all -> 0x01bb }
            if (r10 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal.V1 r10 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r10 = r10.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r13 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.R1 r13 = r13.y()     // Catch:{ all -> 0x01bb }
            java.lang.String r14 = r9.f54494c     // Catch:{ all -> 0x01bb }
            java.lang.String r13 = r13.g(r14)     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r9.f54496e     // Catch:{ all -> 0x01bb }
            r10.d(r11, r12, r13, r9)     // Catch:{ all -> 0x01bb }
            r36.o0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.D5 r9 = r1.f55293G     // Catch:{ all -> 0x01bb }
            r13 = 0
            r14 = 0
            r11 = 9
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.B5.U(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
        L_0x033c:
            java.lang.String r9 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r21 = com.google.android.gms.measurement.internal.B5.G0(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x01bb }
            r36.o0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C r9 = r2.f54498b     // Catch:{ all -> 0x01bb }
            long r9 = com.google.android.gms.measurement.internal.B5.v(r9)     // Catch:{ all -> 0x01bb }
            r13 = 1
            long r15 = r9 + r13
            com.google.android.gms.measurement.internal.l r9 = r36.c0()     // Catch:{ all -> 0x01bb }
            long r10 = r36.v0()     // Catch:{ all -> 0x01bb }
            r19 = 0
            r20 = 0
            r17 = 1
            r18 = 0
            r12 = r8
            r13 = r15
            r15 = r17
            r16 = r21
            r17 = r18
            r18 = r7
            com.google.android.gms.measurement.internal.p r9 = r9.D(r10, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01bb }
            long r10 = r9.f55253b     // Catch:{ all -> 0x01bb }
            r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r12 = com.google.android.gms.measurement.internal.F.f54657l     // Catch:{ all -> 0x01bb }
            r13 = 0
            java.lang.Object r12 = r12.a(r13)     // Catch:{ all -> 0x01bb }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x01bb }
            int r12 = r12.intValue()     // Catch:{ all -> 0x01bb }
            long r12 = (long) r12     // Catch:{ all -> 0x01bb }
            long r10 = r10 - r12
            r14 = 0
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r12 <= 0) goto L_0x03bd
            long r10 = r10 % r16
            r12 = 1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x03ae
            com.google.android.gms.measurement.internal.V1 r2 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r2 = r2.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            long r5 = r9.f55253b     // Catch:{ all -> 0x01bb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
        L_0x03ae:
            com.google.android.gms.measurement.internal.l r2 = r36.c0()     // Catch:{ all -> 0x01bb }
            r2.W0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            return
        L_0x03bd:
            r12 = 1
            if (r21 == 0) goto L_0x0417
            long r10 = r9.f55252a     // Catch:{ all -> 0x01bb }
            r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54661n     // Catch:{ all -> 0x01bb }
            r12 = 0
            java.lang.Object r6 = r6.a(r12)     // Catch:{ all -> 0x01bb }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01bb }
            int r6 = r6.intValue()     // Catch:{ all -> 0x01bb }
            long r12 = (long) r6     // Catch:{ all -> 0x01bb }
            long r10 = r10 - r12
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0417
            long r10 = r10 % r16
            r3 = 1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x03f8
            com.google.android.gms.measurement.internal.V1 r3 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r3 = r3.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            long r6 = r9.f55252a     // Catch:{ all -> 0x01bb }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01bb }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x01bb }
        L_0x03f8:
            r36.o0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.D5 r9 = r1.f55293G     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "_ev"
            java.lang.String r13 = r2.f54497a     // Catch:{ all -> 0x01bb }
            r14 = 0
            r11 = 16
            r10 = r8
            com.google.android.gms.measurement.internal.B5.U(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()     // Catch:{ all -> 0x01bb }
            r2.W0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            return
        L_0x0417:
            if (r7 == 0) goto L_0x0465
            long r6 = r9.f55255d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r10 = r36.a0()     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r3.f54557a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r12 = com.google.android.gms.measurement.internal.F.f54659m     // Catch:{ all -> 0x01bb }
            int r10 = r10.q(r11, r12)     // Catch:{ all -> 0x01bb }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x01bb }
            r13 = 0
            int r10 = java.lang.Math.max(r13, r10)     // Catch:{ all -> 0x01bb }
            long r10 = (long) r10     // Catch:{ all -> 0x01bb }
            long r6 = r6 - r10
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0466
            r10 = 1
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0456
            com.google.android.gms.measurement.internal.V1 r2 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r2 = r2.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            long r5 = r9.f55255d     // Catch:{ all -> 0x01bb }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01bb }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x01bb }
        L_0x0456:
            com.google.android.gms.measurement.internal.l r2 = r36.c0()     // Catch:{ all -> 0x01bb }
            r2.W0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            return
        L_0x0465:
            r13 = 0
        L_0x0466:
            com.google.android.gms.measurement.internal.C r6 = r2.f54498b     // Catch:{ all -> 0x01bb }
            android.os.Bundle r6 = r6.r0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.B5 r7 = r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.f54499c     // Catch:{ all -> 0x01bb }
            r7.J(r6, r9, r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.B5 r7 = r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54555E     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.z0(r8, r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "_r"
            if (r7 == 0) goto L_0x04a0
            com.google.android.gms.measurement.internal.B5 r7 = r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "_dbg"
            r16 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01bb }
            r7.J(r6, r9, r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.B5 r7 = r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01bb }
            r7.J(r6, r12, r9)     // Catch:{ all -> 0x01bb }
            goto L_0x04a2
        L_0x04a0:
            r16 = 1
        L_0x04a2:
            java.lang.String r7 = "_s"
            java.lang.String r9 = r2.f54497a     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x04c7
            com.google.android.gms.measurement.internal.l r7 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r7 = r7.D0(r9, r5)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x04c7
            java.lang.Object r9 = r7.f54496e     // Catch:{ all -> 0x01bb }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x04c7
            com.google.android.gms.measurement.internal.B5 r9 = r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = r7.f54496e     // Catch:{ all -> 0x01bb }
            r9.J(r6, r5, r7)     // Catch:{ all -> 0x01bb }
        L_0x04c7:
            com.google.android.gms.measurement.internal.l r5 = r36.c0()     // Catch:{ all -> 0x01bb }
            long r9 = r5.A(r8)     // Catch:{ all -> 0x01bb }
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x04e8
            com.google.android.gms.measurement.internal.V1 r5 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r5 = r5.G()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bb }
            r5.c(r7, r11, r9)     // Catch:{ all -> 0x01bb }
        L_0x04e8:
            com.google.android.gms.measurement.internal.A r5 = new com.google.android.gms.measurement.internal.A     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r10 = r1.f55305l     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r2.f54499c     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r2.f54497a     // Catch:{ all -> 0x01bb }
            long r14 = r2.f54500d     // Catch:{ all -> 0x01bb }
            r22 = 0
            r9 = r5
            r2 = r12
            r12 = r8
            r26 = r2
            r2 = r13
            r13 = r7
            r16 = r22
            r18 = r6
            r9.<init>((com.google.android.gms.measurement.internal.E2) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (long) r14, (long) r16, (android.os.Bundle) r18)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r6 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r5.f54426b     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.y r6 = r6.B0(r8, r7)     // Catch:{ all -> 0x01bb }
            if (r6 != 0) goto L_0x0583
            com.google.android.gms.measurement.internal.l r6 = r36.c0()     // Catch:{ all -> 0x01bb }
            long r6 = r6.x0(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r9 = r36.a0()     // Catch:{ all -> 0x01bb }
            int r9 = r9.k(r8)     // Catch:{ all -> 0x01bb }
            long r9 = (long) r9     // Catch:{ all -> 0x01bb }
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0564
            if (r21 == 0) goto L_0x0564
            com.google.android.gms.measurement.internal.V1 r2 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r2 = r2.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r6 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.R1 r6 = r6.y()     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = r5.f54426b     // Catch:{ all -> 0x01bb }
            java.lang.String r5 = r6.c(r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r6 = r36.a0()     // Catch:{ all -> 0x01bb }
            int r6 = r6.k(r8)     // Catch:{ all -> 0x01bb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01bb }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x01bb }
            r36.o0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.D5 r9 = r1.f55293G     // Catch:{ all -> 0x01bb }
            r13 = 0
            r14 = 0
            r11 = 8
            r12 = 0
            r10 = r8
            com.google.android.gms.measurement.internal.B5.U(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            return
        L_0x0564:
            com.google.android.gms.measurement.internal.y r6 = new com.google.android.gms.measurement.internal.y     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r5.f54426b     // Catch:{ all -> 0x01bb }
            long r14 = r5.f54428d     // Catch:{ all -> 0x01bb }
            r22 = 0
            r23 = 0
            r12 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r9 = r6
            r10 = r8
            r7 = r14
            r14 = r16
            r16 = r7
            r9.<init>(r10, r11, r12, r14, r16, r18, r20, r21, r22, r23)     // Catch:{ all -> 0x01bb }
            goto L_0x0591
        L_0x0583:
            com.google.android.gms.measurement.internal.E2 r7 = r1.f55305l     // Catch:{ all -> 0x01bb }
            long r8 = r6.f55408f     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.A r5 = r5.a(r7, r8)     // Catch:{ all -> 0x01bb }
            long r7 = r5.f54428d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.y r6 = r6.a(r7)     // Catch:{ all -> 0x01bb }
        L_0x0591:
            com.google.android.gms.measurement.internal.l r7 = r36.c0()     // Catch:{ all -> 0x01bb }
            r7.P(r6)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.z2 r6 = r36.zzl()     // Catch:{ all -> 0x01bb }
            r6.i()     // Catch:{ all -> 0x01bb }
            r36.q0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.C4536s.l(r5)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.C4536s.l(r38)     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r5.f54425a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.C4536s.f(r6)     // Catch:{ all -> 0x01bb }
            java.lang.String r6 = r5.f54425a     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r3.f54557a     // Catch:{ all -> 0x01bb }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.common.internal.C4536s.a(r6)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r6 = com.google.android.gms.internal.measurement.zzfn.zzk.zzw()     // Catch:{ all -> 0x01bb }
            r7 = 1
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r6 = r6.zzh((int) r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = "android"
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r6 = r6.zzp(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f54557a     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x05d4
            java.lang.String r8 = r3.f54557a     // Catch:{ all -> 0x01bb }
            r6.zzb((java.lang.String) r8)     // Catch:{ all -> 0x01bb }
        L_0x05d4:
            java.lang.String r8 = r3.f54560d     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x05e1
            java.lang.String r8 = r3.f54560d     // Catch:{ all -> 0x01bb }
            r6.zzd((java.lang.String) r8)     // Catch:{ all -> 0x01bb }
        L_0x05e1:
            java.lang.String r8 = r3.f54559c     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x05ee
            java.lang.String r8 = r3.f54559c     // Catch:{ all -> 0x01bb }
            r6.zze((java.lang.String) r8)     // Catch:{ all -> 0x01bb }
        L_0x05ee:
            java.lang.String r8 = r3.f54580x     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x05fb
            java.lang.String r8 = r3.f54580x     // Catch:{ all -> 0x01bb }
            r6.zzr(r8)     // Catch:{ all -> 0x01bb }
        L_0x05fb:
            long r8 = r3.f54566j     // Catch:{ all -> 0x01bb }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0608
            int r8 = (int) r8     // Catch:{ all -> 0x01bb }
            r6.zze((int) r8)     // Catch:{ all -> 0x01bb }
        L_0x0608:
            long r8 = r3.f54561e     // Catch:{ all -> 0x01bb }
            r6.zzf((long) r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f54558b     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x061a
            java.lang.String r8 = r3.f54558b     // Catch:{ all -> 0x01bb }
            r6.zzm(r8)     // Catch:{ all -> 0x01bb }
        L_0x061a:
            java.lang.String r8 = r3.f54557a     // Catch:{ all -> 0x01bb }
            java.lang.Object r8 = com.google.android.gms.common.internal.C4536s.l(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r8 = r1.N(r8)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54578v     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r9 = com.google.android.gms.measurement.internal.C4622h3.q(r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r8 = r8.h(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r8.y()     // Catch:{ all -> 0x01bb }
            r6.zzg((java.lang.String) r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r6.zzx()     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x064e
            java.lang.String r9 = r3.f54573q     // Catch:{ all -> 0x01bb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x064e
            java.lang.String r9 = r3.f54573q     // Catch:{ all -> 0x01bb }
            r6.zza((java.lang.String) r9)     // Catch:{ all -> 0x01bb }
        L_0x064e:
            boolean r9 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0711
            com.google.android.gms.measurement.internal.h r9 = r36.a0()     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f54557a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r11 = com.google.android.gms.measurement.internal.F.f54584A0     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.z(r10, r11)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0711
            r36.o0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            boolean r9 = com.google.android.gms.measurement.internal.B5.y0(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x0711
            int r9 = r3.f54553C     // Catch:{ all -> 0x01bb }
            r6.zzd((int) r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54554D     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r11 = r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r12 = com.google.android.gms.measurement.internal.F.f54592E0     // Catch:{ all -> 0x01bb }
            boolean r11 = r11.o(r12)     // Catch:{ all -> 0x01bb }
            r12 = 32
            if (r11 != 0) goto L_0x0697
            boolean r8 = r8.A()     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x0697
            r14 = 0
            int r8 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0694
            r16 = -2
            long r8 = r9 & r16
            long r9 = r8 | r12
        L_0x0694:
            r7 = 1
            goto L_0x069a
        L_0x0697:
            r14 = 0
            goto L_0x0694
        L_0x069a:
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x06a0
            r11 = 1
            goto L_0x06a1
        L_0x06a0:
            r11 = r2
        L_0x06a1:
            r6.zza((boolean) r11)     // Catch:{ all -> 0x01bb }
            int r11 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0713
            com.google.android.gms.internal.measurement.zzfn$zzc$zza r11 = com.google.android.gms.internal.measurement.zzfn.zzc.zza()     // Catch:{ all -> 0x01bb }
            long r18 = r9 & r7
            int r16 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x06b4
            r7 = 1
            goto L_0x06b5
        L_0x06b4:
            r7 = r2
        L_0x06b5:
            r11.zzc(r7)     // Catch:{ all -> 0x01bb }
            r7 = 2
            long r7 = r7 & r9
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x06c1
            r7 = 1
            goto L_0x06c2
        L_0x06c1:
            r7 = r2
        L_0x06c2:
            r11.zze(r7)     // Catch:{ all -> 0x01bb }
            r7 = 4
            long r7 = r7 & r9
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x06ce
            r7 = 1
            goto L_0x06cf
        L_0x06ce:
            r7 = r2
        L_0x06cf:
            r11.zzf(r7)     // Catch:{ all -> 0x01bb }
            r7 = 8
            long r7 = r7 & r9
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x06db
            r7 = 1
            goto L_0x06dc
        L_0x06db:
            r7 = r2
        L_0x06dc:
            r11.zzg(r7)     // Catch:{ all -> 0x01bb }
            r7 = 16
            long r7 = r7 & r9
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x06e8
            r7 = 1
            goto L_0x06e9
        L_0x06e8:
            r7 = r2
        L_0x06e9:
            r11.zzb(r7)     // Catch:{ all -> 0x01bb }
            long r7 = r9 & r12
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x06f4
            r13 = 1
            goto L_0x06f5
        L_0x06f4:
            r13 = r2
        L_0x06f5:
            r11.zza(r13)     // Catch:{ all -> 0x01bb }
            r7 = 64
            long r7 = r7 & r9
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0701
            r13 = 1
            goto L_0x0702
        L_0x0701:
            r13 = r2
        L_0x0702:
            r11.zzd(r13)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzkt r7 = r11.zzai()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzjk r7 = (com.google.android.gms.internal.measurement.zzjk) r7     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzc r7 = (com.google.android.gms.internal.measurement.zzfn.zzc) r7     // Catch:{ all -> 0x01bb }
            r6.zza((com.google.android.gms.internal.measurement.zzfn.zzc) r7)     // Catch:{ all -> 0x01bb }
            goto L_0x0713
        L_0x0711:
            r14 = 0
        L_0x0713:
            long r7 = r3.f54562f     // Catch:{ all -> 0x01bb }
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x071c
            r6.zzc((long) r7)     // Catch:{ all -> 0x01bb }
        L_0x071c:
            long r7 = r3.f54575s     // Catch:{ all -> 0x01bb }
            r6.zzd((long) r7)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.x5 r7 = r36.n0()     // Catch:{ all -> 0x01bb }
            java.util.List r7 = r7.g0()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x072e
            r6.zzc((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x01bb }
        L_0x072e:
            java.lang.String r7 = r3.f54557a     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = com.google.android.gms.common.internal.C4536s.l(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r7 = r1.N(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r3.f54578v     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r8 = com.google.android.gms.measurement.internal.C4622h3.q(r8)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h3 r7 = r7.h(r8)     // Catch:{ all -> 0x01bb }
            boolean r8 = r7.A()     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x081d
            boolean r8 = r3.f54571o     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x081d
            com.google.android.gms.measurement.internal.Q4 r8 = r1.f55302i     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            android.util.Pair r8 = r8.u(r9, r7)     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x081d
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x01bb }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x081d
            boolean r9 = r3.f54571o     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x081d
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01bb }
            r6.zzq(r9)     // Catch:{ all -> 0x01bb }
            java.lang.Object r9 = r8.second     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x077a
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x01bb }
            r6.zzc((boolean) r9)     // Catch:{ all -> 0x01bb }
        L_0x077a:
            boolean r9 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x081d
            com.google.android.gms.measurement.internal.h r9 = r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.o(r10)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x081d
            java.lang.String r9 = r5.f54426b     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r4)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x081d
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x081d
            com.google.android.gms.measurement.internal.l r8 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.Z1 r8 = r8.C0(r9)     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x081d
            boolean r9 = r8.D()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x081d
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            r10 = 0
            r1.C(r9, r2, r10, r10)     // Catch:{ all -> 0x01bb }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x01bb }
            r9.<init>()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r10 = r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r11 = com.google.android.gms.measurement.internal.F.f54622T0     // Catch:{ all -> 0x01bb }
            boolean r10 = r10.o(r11)     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = "_pfo"
            if (r10 == 0) goto L_0x07f0
            java.lang.Long r10 = r8.L0()     // Catch:{ all -> 0x01bb }
            if (r10 == 0) goto L_0x07dc
            long r12 = r10.longValue()     // Catch:{ all -> 0x01bb }
            long r12 = java.lang.Math.max(r14, r12)     // Catch:{ all -> 0x01bb }
            r9.putLong(r11, r12)     // Catch:{ all -> 0x01bb }
        L_0x07dc:
            java.lang.Long r8 = r8.M0()     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x07eb
            java.lang.String r10 = "_uwa"
            long r11 = r8.longValue()     // Catch:{ all -> 0x01bb }
            r9.putLong(r10, r11)     // Catch:{ all -> 0x01bb }
        L_0x07eb:
            r8 = r26
            r10 = 1
            goto L_0x0812
        L_0x07f0:
            com.google.android.gms.measurement.internal.h r8 = r36.a0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.M1 r10 = com.google.android.gms.measurement.internal.F.f54620S0     // Catch:{ all -> 0x01bb }
            boolean r8 = r8.o(r10)     // Catch:{ all -> 0x01bb }
            if (r8 == 0) goto L_0x07eb
            com.google.android.gms.measurement.internal.l r8 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f54557a     // Catch:{ all -> 0x01bb }
            long r12 = r8.r0(r10)     // Catch:{ all -> 0x01bb }
            r18 = 1
            long r12 = r12 - r18
            long r12 = java.lang.Math.max(r14, r12)     // Catch:{ all -> 0x01bb }
            r9.putLong(r11, r12)     // Catch:{ all -> 0x01bb }
            goto L_0x07eb
        L_0x0812:
            r9.putLong(r8, r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.D5 r10 = r1.f55293G     // Catch:{ all -> 0x01bb }
            java.lang.String r11 = r3.f54557a     // Catch:{ all -> 0x01bb }
            r10.a(r11, r4, r9)     // Catch:{ all -> 0x01bb }
            goto L_0x081f
        L_0x081d:
            r8 = r26
        L_0x081f:
            com.google.android.gms.measurement.internal.E2 r4 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.w r4 = r4.v()     // Catch:{ all -> 0x01bb }
            r4.k()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r4 = r6.zzi((java.lang.String) r4)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r9 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.w r9 = r9.v()     // Catch:{ all -> 0x01bb }
            r9.k()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r4 = r4.zzo(r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r9 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.w r9 = r9.v()     // Catch:{ all -> 0x01bb }
            long r9 = r9.q()     // Catch:{ all -> 0x01bb }
            int r9 = (int) r9     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r4 = r4.zzj((int) r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r9 = r1.f55305l     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.w r9 = r9.v()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r9.r()     // Catch:{ all -> 0x01bb }
            r4.zzs(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54582z     // Catch:{ all -> 0x01bb }
            r6.zzj((long) r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r4 = r1.f55305l     // Catch:{ all -> 0x01bb }
            boolean r4 = r4.k()     // Catch:{ all -> 0x01bb }
            if (r4 == 0) goto L_0x0873
            r6.zzt()     // Catch:{ all -> 0x01bb }
            r4 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x01bb }
            if (r9 != 0) goto L_0x0873
            r6.zzj((java.lang.String) r4)     // Catch:{ all -> 0x01bb }
        L_0x0873:
            com.google.android.gms.measurement.internal.l r4 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.Z1 r4 = r4.C0(r9)     // Catch:{ all -> 0x01bb }
            if (r4 != 0) goto L_0x08df
            com.google.android.gms.measurement.internal.Z1 r4 = new com.google.android.gms.measurement.internal.Z1     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.E2 r9 = r1.f55305l     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f54557a     // Catch:{ all -> 0x01bb }
            r4.<init>(r9, r10)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r1.j(r7)     // Catch:{ all -> 0x01bb }
            r4.J(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54567k     // Catch:{ all -> 0x01bb }
            r4.W(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54558b     // Catch:{ all -> 0x01bb }
            r4.Z(r9)     // Catch:{ all -> 0x01bb }
            boolean r9 = r7.A()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x08ac
            com.google.android.gms.measurement.internal.Q4 r9 = r1.f55302i     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f54557a     // Catch:{ all -> 0x01bb }
            boolean r11 = r3.f54571o     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r9.v(r10, r11)     // Catch:{ all -> 0x01bb }
            r4.f0(r9)     // Catch:{ all -> 0x01bb }
        L_0x08ac:
            r4.A0(r14)     // Catch:{ all -> 0x01bb }
            r4.C0(r14)     // Catch:{ all -> 0x01bb }
            r4.y0(r14)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54559c     // Catch:{ all -> 0x01bb }
            r4.S(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54566j     // Catch:{ all -> 0x01bb }
            r4.H(r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54560d     // Catch:{ all -> 0x01bb }
            r4.O(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54561e     // Catch:{ all -> 0x01bb }
            r4.u0(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54562f     // Catch:{ all -> 0x01bb }
            r4.n0(r9)     // Catch:{ all -> 0x01bb }
            boolean r9 = r3.f54564h     // Catch:{ all -> 0x01bb }
            r4.K(r9)     // Catch:{ all -> 0x01bb }
            long r9 = r3.f54575s     // Catch:{ all -> 0x01bb }
            r4.q0(r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r9 = r36.c0()     // Catch:{ all -> 0x01bb }
            r9.Q(r4, r2, r2)     // Catch:{ all -> 0x01bb }
        L_0x08df:
            boolean r7 = r7.B()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x08fc
            java.lang.String r7 = r4.m()     // Catch:{ all -> 0x01bb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01bb }
            if (r7 != 0) goto L_0x08fc
            java.lang.String r7 = r4.m()     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = com.google.android.gms.common.internal.C4536s.l(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
            r6.zzc((java.lang.String) r7)     // Catch:{ all -> 0x01bb }
        L_0x08fc:
            java.lang.String r7 = r4.p()     // Catch:{ all -> 0x01bb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01bb }
            if (r7 != 0) goto L_0x0913
            java.lang.String r7 = r4.p()     // Catch:{ all -> 0x01bb }
            java.lang.Object r7 = com.google.android.gms.common.internal.C4536s.l(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bb }
            r6.zzl((java.lang.String) r7)     // Catch:{ all -> 0x01bb }
        L_0x0913:
            com.google.android.gms.measurement.internal.l r7 = r36.c0()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r3.f54557a     // Catch:{ all -> 0x01bb }
            java.util.List r7 = r7.N0(r9)     // Catch:{ all -> 0x01bb }
            r12 = r2
        L_0x091e:
            int r9 = r7.size()     // Catch:{ all -> 0x01bb }
            if (r12 >= r9) goto L_0x0982
            com.google.android.gms.internal.measurement.zzfn$zzo$zza r9 = com.google.android.gms.internal.measurement.zzfn.zzo.zze()     // Catch:{ all -> 0x01bb }
            java.lang.Object r10 = r7.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r10 = (com.google.android.gms.measurement.internal.C5) r10     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r10.f54494c     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzo$zza r9 = r9.zza((java.lang.String) r10)     // Catch:{ all -> 0x01bb }
            java.lang.Object r10 = r7.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r10 = (com.google.android.gms.measurement.internal.C5) r10     // Catch:{ all -> 0x01bb }
            long r10 = r10.f54495d     // Catch:{ all -> 0x01bb }
            com.google.android.gms.internal.measurement.zzfn$zzo$zza r9 = r9.zzb((long) r10)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.x5 r10 = r36.n0()     // Catch:{ all -> 0x01bb }
            java.lang.Object r11 = r7.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r11 = (com.google.android.gms.measurement.internal.C5) r11     // Catch:{ all -> 0x01bb }
            java.lang.Object r11 = r11.f54496e     // Catch:{ all -> 0x01bb }
            r10.R(r9, r11)     // Catch:{ all -> 0x01bb }
            r6.zza((com.google.android.gms.internal.measurement.zzfn.zzo.zza) r9)     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = "_sid"
            java.lang.Object r10 = r7.get(r12)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C5 r10 = (com.google.android.gms.measurement.internal.C5) r10     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r10.f54494c     // Catch:{ all -> 0x01bb }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x097f
            long r9 = r4.I0()     // Catch:{ all -> 0x01bb }
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x097f
            com.google.android.gms.measurement.internal.x5 r9 = r36.n0()     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r3.f54580x     // Catch:{ all -> 0x01bb }
            long r9 = r9.u(r10)     // Catch:{ all -> 0x01bb }
            long r18 = r4.I0()     // Catch:{ all -> 0x01bb }
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x097f
            r6.zzr()     // Catch:{ all -> 0x01bb }
        L_0x097f:
            int r12 = r12 + 1
            goto L_0x091e
        L_0x0982:
            com.google.android.gms.measurement.internal.l r3 = r36.c0()     // Catch:{ IOException -> 0x09f8 }
            com.google.android.gms.internal.measurement.zzkt r4 = r6.zzai()     // Catch:{ IOException -> 0x09f8 }
            com.google.android.gms.internal.measurement.zzjk r4 = (com.google.android.gms.internal.measurement.zzjk) r4     // Catch:{ IOException -> 0x09f8 }
            com.google.android.gms.internal.measurement.zzfn$zzk r4 = (com.google.android.gms.internal.measurement.zzfn.zzk) r4     // Catch:{ IOException -> 0x09f8 }
            long r3 = r3.z(r4)     // Catch:{ IOException -> 0x09f8 }
            com.google.android.gms.measurement.internal.l r6 = r36.c0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.C r7 = r5.f54430f     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x09ee
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01bb }
        L_0x099e:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x09b2
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01bb }
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x01bb }
            if (r9 == 0) goto L_0x099e
        L_0x09b0:
            r13 = 1
            goto L_0x09ef
        L_0x09b2:
            com.google.android.gms.measurement.internal.q2 r7 = r36.i0()     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r5.f54425a     // Catch:{ all -> 0x01bb }
            java.lang.String r9 = r5.f54426b     // Catch:{ all -> 0x01bb }
            boolean r7 = r7.I(r8, r9)     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r26 = r36.c0()     // Catch:{ all -> 0x01bb }
            long r27 = r36.v0()     // Catch:{ all -> 0x01bb }
            java.lang.String r8 = r5.f54425a     // Catch:{ all -> 0x01bb }
            r34 = 0
            r35 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r29 = r8
            com.google.android.gms.measurement.internal.p r8 = r26.E(r27, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x09ee
            long r7 = r8.f55256e     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.h r9 = r36.a0()     // Catch:{ all -> 0x01bb }
            java.lang.String r10 = r5.f54425a     // Catch:{ all -> 0x01bb }
            int r9 = r9.t(r10)     // Catch:{ all -> 0x01bb }
            long r9 = (long) r9     // Catch:{ all -> 0x01bb }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x09ee
            goto L_0x09b0
        L_0x09ee:
            r13 = r2
        L_0x09ef:
            boolean r2 = r6.Z(r5, r3, r13)     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x0a0f
            r1.f55308o = r14     // Catch:{ all -> 0x01bb }
            goto L_0x0a0f
        L_0x09f8:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.V1 r3 = r36.zzj()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.X1 r3 = r3.B()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r6.zzt()     // Catch:{ all -> 0x01bb }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.V1.q(r5)     // Catch:{ all -> 0x01bb }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x01bb }
        L_0x0a0f:
            com.google.android.gms.measurement.internal.l r2 = r36.c0()     // Catch:{ all -> 0x01bb }
            r2.W0()     // Catch:{ all -> 0x01bb }
            com.google.android.gms.measurement.internal.l r2 = r36.c0()
            r2.U0()
            r36.K()
            com.google.android.gms.measurement.internal.V1 r2 = r36.zzj()
            com.google.android.gms.measurement.internal.X1 r2 = r2.F()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r24
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0a40:
            com.google.android.gms.measurement.internal.l r3 = r36.c0()
            r3.U0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.W(com.google.android.gms.measurement.internal.D, com.google.android.gms.measurement.internal.E5):void");
    }

    private final C4701u Y(String str) {
        zzl().i();
        q0();
        C4701u uVar = (C4701u) this.f55289C.get(str);
        if (uVar != null) {
            return uVar;
        }
        C4701u G02 = c0().G0(str);
        this.f55289C.put(str, G02);
        return G02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = r5.f55294a;
        r3 = com.google.android.gms.measurement.internal.C4622h3.a.AD_PERSONALIZATION;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.String r6, com.google.android.gms.measurement.internal.C4625i r7) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.q2 r0 = r5.f55294a
            com.google.android.gms.internal.measurement.zzfi$zza r0 = r0.E(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.measurement.internal.h3$a r6 = com.google.android.gms.measurement.internal.C4622h3.a.AD_PERSONALIZATION
            com.google.android.gms.measurement.internal.k r0 = com.google.android.gms.measurement.internal.C4639k.FAILSAFE
            r7.d(r6, r0)
            return r1
        L_0x0011:
            boolean r0 = com.google.android.gms.internal.measurement.zzne.zza()
            r2 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.h r0 = r5.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54616Q0
            boolean r0 = r0.o(r3)
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.l r0 = r5.c0()
            com.google.android.gms.measurement.internal.Z1 r0 = r0.C0(r6)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r0.t()
            com.google.android.gms.measurement.internal.h2 r0 = com.google.android.gms.measurement.internal.C4621h2.b(r0)
            Pa.o r0 = r0.a()
            Pa.o r3 = Pa.o.POLICY
            if (r0 != r3) goto L_0x0055
            com.google.android.gms.measurement.internal.q2 r0 = r5.f55294a
            com.google.android.gms.measurement.internal.h3$a r3 = com.google.android.gms.measurement.internal.C4622h3.a.AD_PERSONALIZATION
            Pa.o r0 = r0.u(r6, r3)
            Pa.o r4 = Pa.o.UNINITIALIZED
            if (r0 == r4) goto L_0x0055
            com.google.android.gms.measurement.internal.k r6 = com.google.android.gms.measurement.internal.C4639k.REMOTE_ENFORCED_DEFAULT
            r7.d(r3, r6)
            Pa.o r6 = Pa.o.GRANTED
            if (r0 != r6) goto L_0x0054
            return r2
        L_0x0054:
            return r1
        L_0x0055:
            com.google.android.gms.measurement.internal.h3$a r0 = com.google.android.gms.measurement.internal.C4622h3.a.AD_PERSONALIZATION
            com.google.android.gms.measurement.internal.k r3 = com.google.android.gms.measurement.internal.C4639k.REMOTE_DEFAULT
            r7.d(r0, r3)
            com.google.android.gms.measurement.internal.q2 r7 = r5.f55294a
            boolean r6 = r7.H(r6, r0)
            if (r6 == 0) goto L_0x0065
            return r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.a(java.lang.String, com.google.android.gms.measurement.internal.i):int");
    }

    private final int b(FileChannel fileChannel) {
        zzl().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzj().B().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    zzj().G().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e10) {
            zzj().B().b("Failed to read from channel", e10);
            return 0;
        }
    }

    private final C4701u d(String str, C4701u uVar, C4622h3 h3Var, C4625i iVar) {
        o oVar;
        C4622h3.a aVar;
        o u10;
        int i10 = 90;
        if (i0().E(str) == null) {
            if (uVar.g() == o.DENIED) {
                i10 = uVar.a();
                iVar.c(C4622h3.a.AD_USER_DATA, i10);
            } else {
                iVar.d(C4622h3.a.AD_USER_DATA, C4639k.FAILSAFE);
            }
            return new C4701u(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        o g10 = uVar.g();
        o oVar2 = o.GRANTED;
        if (g10 == oVar2 || g10 == (oVar = o.DENIED)) {
            i10 = uVar.a();
            iVar.c(C4622h3.a.AD_USER_DATA, i10);
        } else {
            boolean z10 = true;
            if (!zzne.zza() || !a0().o(F.f54616Q0)) {
                o oVar3 = o.UNINITIALIZED;
                if (!(g10 == oVar3 || g10 == o.POLICY)) {
                    z10 = false;
                }
                C4536s.a(z10);
                C4681q2 q2Var = this.f55294a;
                C4622h3.a aVar2 = C4622h3.a.AD_USER_DATA;
                C4622h3.a F10 = q2Var.F(str, aVar2);
                Boolean w10 = h3Var.w();
                if (F10 == C4622h3.a.AD_STORAGE && w10 != null) {
                    if (w10.booleanValue()) {
                        g10 = oVar2;
                    } else {
                        g10 = oVar;
                    }
                    iVar.d(aVar2, C4639k.REMOTE_DELEGATION);
                }
                if (g10 == oVar3) {
                    if (!this.f55294a.H(str, aVar2)) {
                        oVar2 = oVar;
                    }
                    iVar.d(aVar2, C4639k.REMOTE_DEFAULT);
                }
            } else if (g10 != o.POLICY || (u10 = this.f55294a.u(str, aVar)) == o.UNINITIALIZED) {
                C4681q2 q2Var2 = this.f55294a;
                C4622h3.a aVar3 = C4622h3.a.AD_USER_DATA;
                C4622h3.a F11 = q2Var2.F(str, aVar3);
                o t10 = h3Var.t();
                if (!(t10 == oVar2 || t10 == oVar)) {
                    z10 = false;
                }
                if (F11 != C4622h3.a.AD_STORAGE || !z10) {
                    iVar.d(aVar3, C4639k.REMOTE_DEFAULT);
                    if (!this.f55294a.H(str, aVar3)) {
                        g10 = oVar;
                    }
                } else {
                    iVar.d(aVar3, C4639k.REMOTE_DELEGATION);
                    g10 = t10;
                }
            } else {
                iVar.d((aVar = C4622h3.a.AD_USER_DATA), C4639k.REMOTE_ENFORCED_DEFAULT);
                g10 = u10;
            }
            g10 = oVar2;
        }
        boolean U10 = this.f55294a.U(str);
        SortedSet O10 = i0().O(str);
        if (g10 == o.DENIED || O10.isEmpty()) {
            return new C4701u(Boolean.FALSE, i10, Boolean.valueOf(U10), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(U10);
        String str2 = "";
        if (U10) {
            str2 = TextUtils.join(str2, O10);
        }
        return new C4701u(bool, i10, valueOf, str2);
    }

    private final Boolean f0(E5 e52) {
        Boolean bool = e52.f54574r;
        if (!zzne.zza() || !a0().o(F.f54616Q0) || TextUtils.isEmpty(e52.f54556F)) {
            return bool;
        }
        int i10 = v5.f55378a[C4621h2.b(e52.f54556F).a().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Boolean.FALSE;
            }
            if (i10 == 3) {
                return Boolean.TRUE;
            }
            if (i10 != 4) {
                return bool;
            }
        }
        return null;
    }

    private static C4645k5 g(C4645k5 k5Var) {
        if (k5Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (k5Var.r()) {
            return k5Var;
        } else {
            String valueOf = String.valueOf(k5Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static q5 h(Context context) {
        C4536s.l(context);
        C4536s.l(context.getApplicationContext());
        if (f55286H == null) {
            synchronized (q5.class) {
                try {
                    if (f55286H == null) {
                        f55286H = new q5((y5) C4536s.l(new y5(context)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f55286H;
    }

    private static boolean h0(E5 e52) {
        if (!TextUtils.isEmpty(e52.f54558b) || !TextUtils.isEmpty(e52.f54573q)) {
            return true;
        }
        return false;
    }

    private final Boolean i(Z1 z12) {
        try {
            if (z12.U() != -2147483648L) {
                if (z12.U() == ((long) C4293e.a(this.f55305l.zza()).e(z12.l(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C4293e.a(this.f55305l.zza()).e(z12.l(), 0).versionName;
                String o10 = z12.o();
                if (o10 != null && o10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String j(C4622h3 h3Var) {
        if (!h3Var.B()) {
            return null;
        }
        byte[] bArr = new byte[16];
        o0().R0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    private static void k(zzfn.zzf.zza zza, int i10, String str) {
        List<zzfn.zzh> zzf = zza.zzf();
        int i11 = 0;
        while (i11 < zzf.size()) {
            if (!"_err".equals(zzf.get(i11).zzg())) {
                i11++;
            } else {
                return;
            }
        }
        zza.zza((zzfn.zzh) ((zzjk) zzfn.zzh.zze().zza("_err").zza((long) i10).zzai())).zza((zzfn.zzh) ((zzjk) zzfn.zzh.zze().zza("_ev").zzb(str).zzai()));
    }

    private static void l(zzfn.zzf.zza zza, String str) {
        List<zzfn.zzh> zzf = zza.zzf();
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            if (str.equals(zzf.get(i10).zzg())) {
                zza.zza(i10);
                return;
            }
        }
    }

    private final void m(zzfn.zzk.zza zza, long j10, boolean z10) {
        String str;
        C5 c52;
        String str2;
        if (z10) {
            str = "_se";
        } else {
            str = "_lte";
        }
        C5 D02 = c0().D0(zza.zzt(), str);
        if (D02 == null || D02.f54496e == null) {
            c52 = new C5(zza.zzt(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(j10));
        } else {
            c52 = new C5(zza.zzt(), "auto", str, zzb().currentTimeMillis(), Long.valueOf(((Long) D02.f54496e).longValue() + j10));
        }
        zzfn.zzo zzo = (zzfn.zzo) ((zzjk) zzfn.zzo.zze().zza(str).zzb(zzb().currentTimeMillis()).zza(((Long) c52.f54496e).longValue()).zzai());
        int t10 = x5.t(zza, str);
        if (t10 >= 0) {
            zza.zza(t10, zzo);
        } else {
            zza.zza(zzo);
        }
        if (j10 > 0) {
            c0().a0(c52);
            if (z10) {
                str2 = "session-scoped";
            } else {
                str2 = "lifetime";
            }
            zzj().F().c("Updated engagement user property. scope, value", str2, c52.f54496e);
        }
    }

    private static void n(zzfn.zzk.zza zza, C4622h3 h3Var) {
        if (!h3Var.A()) {
            zza.zzq();
            zza.zzn();
            zza.zzk();
        }
        if (!h3Var.B()) {
            zza.zzh();
            zza.zzr();
        }
    }

    static /* synthetic */ void t(q5 q5Var, y5 y5Var) {
        q5Var.zzl().i();
        q5Var.f55304k = new C4669o2(q5Var);
        C4646l lVar = new C4646l(q5Var);
        lVar.q();
        q5Var.f55296c = lVar;
        q5Var.a0().n((C4632j) C4536s.l(q5Var.f55294a));
        Q4 q42 = new Q4(q5Var);
        q42.q();
        q5Var.f55302i = q42;
        J5 j52 = new J5(q5Var);
        j52.q();
        q5Var.f55299f = j52;
        C4581b4 b4Var = new C4581b4(q5Var);
        b4Var.q();
        q5Var.f55301h = b4Var;
        C4638j5 j5Var = new C4638j5(q5Var);
        j5Var.q();
        q5Var.f55298e = j5Var;
        q5Var.f55297d = new C4607f2(q5Var);
        if (q5Var.f55311r != q5Var.f55312s) {
            q5Var.zzj().B().c("Not all upload components initialized", Integer.valueOf(q5Var.f55311r), Integer.valueOf(q5Var.f55312s));
        }
        q5Var.f55306m = true;
    }

    private final long v0() {
        long currentTimeMillis = zzb().currentTimeMillis();
        Q4 q42 = this.f55302i;
        q42.p();
        q42.i();
        long a10 = q42.f54843i.a();
        if (a10 == 0) {
            a10 = ((long) q42.f().R0().nextInt(86400000)) + 1;
            q42.f54843i.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    private final C4607f2 w0() {
        C4607f2 f2Var = this.f55297d;
        if (f2Var != null) {
            return f2Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final void x(String str, zzfn.zzh.zza zza, Bundle bundle, String str2) {
        int r10;
        List b10 = f.b("_o", "_sn", "_sc", "_si");
        if (B5.E0(zza.zzf()) || B5.E0(str)) {
            r10 = a0().r(str2, true);
        } else {
            r10 = a0().m(str2, true);
        }
        long j10 = (long) r10;
        long codePointCount = (long) zza.zzg().codePointCount(0, zza.zzg().length());
        o0();
        String zzf = zza.zzf();
        a0();
        String E10 = B5.E(zzf, 40, true);
        if (codePointCount > j10 && !b10.contains(zza.zzf())) {
            if ("_ev".equals(zza.zzf())) {
                o0();
                bundle.putString("_ev", B5.E(zza.zzg(), a0().r(str2, true), true));
                return;
            }
            zzj().H().c("Param value is too long; discarded. Name, value length", E10, Long.valueOf(codePointCount));
            if (bundle.getLong("_err") == 0) {
                bundle.putLong("_err", 4);
                if (bundle.getString("_ev") == null) {
                    bundle.putString("_ev", E10);
                    bundle.putLong("_el", codePointCount);
                }
            }
            bundle.remove(zza.zzf());
        }
    }

    private final C4638j5 x0() {
        return (C4638j5) g(this.f55298e);
    }

    private final void z(String str, C4622h3 h3Var) {
        zzl().i();
        q0();
        this.f55288B.put(str, h3Var);
        c0().v0(str, h3Var);
    }

    public final void A(String str, C4595d4 d4Var) {
        zzl().i();
        String str2 = this.f55292F;
        if (str2 == null || str2.equals(str) || d4Var != null) {
            this.f55292F = str;
            this.f55291E = d4Var;
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(String str, E5 e52) {
        long j10;
        zzl().i();
        q0();
        if (h0(e52)) {
            if (!e52.f54564h) {
                e(e52);
                return;
            }
            Boolean f02 = f0(e52);
            if (!"_npa".equals(str) || f02 == null) {
                zzj().A().b("Removing user property", this.f55305l.y().g(str));
                c0().S0();
                try {
                    e(e52);
                    if ("_id".equals(str)) {
                        c0().J0((String) C4536s.l(e52.f54557a), "_lair");
                    }
                    c0().J0((String) C4536s.l(e52.f54557a), str);
                    c0().W0();
                    zzj().A().b("User property removed", this.f55305l.y().g(str));
                    c0().U0();
                } catch (Throwable th2) {
                    c0().U0();
                    throw th2;
                }
            } else {
                zzj().A().a("Falling back to manifest metadata value for ad personalization");
                long currentTimeMillis = zzb().currentTimeMillis();
                if (f02.booleanValue()) {
                    j10 = 1;
                } else {
                    j10 = 0;
                }
                u(new A5("_npa", currentTimeMillis, Long.valueOf(j10), "auto"), e52);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void E(boolean z10) {
        K();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[Catch:{ all -> 0x00fd, SQLiteException -> 0x0051, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[Catch:{ all -> 0x00fd, SQLiteException -> 0x0051, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013b A[Catch:{ all -> 0x00fd, SQLiteException -> 0x0051, all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f A[Catch:{ all -> 0x00fd, SQLiteException -> 0x0051, all -> 0x0010 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(boolean r7, int r8, java.lang.Throwable r9, byte[] r10, java.lang.String r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.z2 r11 = r6.zzl()
            r11.i()
            r6.q0()
            r11 = 0
            if (r10 != 0) goto L_0x0013
            byte[] r10 = new byte[r11]     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r7 = move-exception
            goto L_0x01c3
        L_0x0013:
            java.util.List r0 = r6.f55318y     // Catch:{ all -> 0x0010 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C4536s.l(r0)     // Catch:{ all -> 0x0010 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0010 }
            r1 = 0
            r6.f55318y = r1     // Catch:{ all -> 0x0010 }
            boolean r2 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ all -> 0x0010 }
            if (r2 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.h r2 = r6.a0()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ all -> 0x0010 }
            boolean r2 = r2.o(r3)     // Catch:{ all -> 0x0010 }
            if (r2 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x003c
        L_0x0032:
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 == r2) goto L_0x003a
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 != r2) goto L_0x017c
        L_0x003a:
            if (r9 != 0) goto L_0x017c
        L_0x003c:
            boolean r9 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ SQLiteException -> 0x0051 }
            if (r9 == 0) goto L_0x0054
            com.google.android.gms.measurement.internal.h r9 = r6.a0()     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.M1 r2 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ SQLiteException -> 0x0051 }
            boolean r9 = r9.o(r2)     // Catch:{ SQLiteException -> 0x0051 }
            if (r9 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x0063
            goto L_0x0054
        L_0x0051:
            r7 = move-exception
            goto L_0x0151
        L_0x0054:
            com.google.android.gms.measurement.internal.Q4 r9 = r6.f55302i     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.l2 r9 = r9.f54841g     // Catch:{ SQLiteException -> 0x0051 }
            Ea.e r2 = r6.zzb()     // Catch:{ SQLiteException -> 0x0051 }
            long r2 = r2.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0051 }
            r9.b(r2)     // Catch:{ SQLiteException -> 0x0051 }
        L_0x0063:
            com.google.android.gms.measurement.internal.Q4 r9 = r6.f55302i     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.l2 r9 = r9.f54842h     // Catch:{ SQLiteException -> 0x0051 }
            r2 = 0
            r9.b(r2)     // Catch:{ SQLiteException -> 0x0051 }
            r6.K()     // Catch:{ SQLiteException -> 0x0051 }
            boolean r9 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ SQLiteException -> 0x0051 }
            if (r9 == 0) goto L_0x00a2
            com.google.android.gms.measurement.internal.h r9 = r6.a0()     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ SQLiteException -> 0x0051 }
            boolean r9 = r9.o(r4)     // Catch:{ SQLiteException -> 0x0051 }
            if (r9 == 0) goto L_0x00a2
            if (r7 == 0) goto L_0x0084
            goto L_0x00a2
        L_0x0084:
            boolean r7 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ SQLiteException -> 0x0051 }
            if (r7 == 0) goto L_0x00b8
            com.google.android.gms.measurement.internal.h r7 = r6.a0()     // Catch:{ SQLiteException -> 0x0051 }
            boolean r7 = r7.o(r4)     // Catch:{ SQLiteException -> 0x0051 }
            if (r7 == 0) goto L_0x00b8
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()     // Catch:{ SQLiteException -> 0x0051 }
            java.lang.String r8 = "Purged empty bundles"
            r7.a(r8)     // Catch:{ SQLiteException -> 0x0051 }
            goto L_0x00b8
        L_0x00a2:
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()     // Catch:{ SQLiteException -> 0x0051 }
            java.lang.String r9 = "Successful upload. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteException -> 0x0051 }
            int r10 = r10.length     // Catch:{ SQLiteException -> 0x0051 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x0051 }
            r7.c(r9, r8, r10)     // Catch:{ SQLiteException -> 0x0051 }
        L_0x00b8:
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ SQLiteException -> 0x0051 }
            r7.S0()     // Catch:{ SQLiteException -> 0x0051 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00fd }
        L_0x00c3:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00fd }
            if (r8 == 0) goto L_0x011b
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x00fd }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x00fd }
            com.google.android.gms.measurement.internal.l r9 = r6.c0()     // Catch:{ SQLiteException -> 0x010e }
            long r4 = r8.longValue()     // Catch:{ SQLiteException -> 0x010e }
            r9.i()     // Catch:{ SQLiteException -> 0x010e }
            r9.p()     // Catch:{ SQLiteException -> 0x010e }
            android.database.sqlite.SQLiteDatabase r10 = r9.w()     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid=?"
            int r10 = r10.delete(r4, r5, r0)     // Catch:{ SQLiteException -> 0x00ff }
            r0 = 1
            if (r10 != r0) goto L_0x00f5
            goto L_0x00c3
        L_0x00f5:
            android.database.sqlite.SQLiteException r10 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r0 = "Deleted fewer rows from queue than expected"
            r10.<init>(r0)     // Catch:{ SQLiteException -> 0x00ff }
            throw r10     // Catch:{ SQLiteException -> 0x00ff }
        L_0x00fd:
            r7 = move-exception
            goto L_0x0149
        L_0x00ff:
            r10 = move-exception
            com.google.android.gms.measurement.internal.V1 r9 = r9.zzj()     // Catch:{ SQLiteException -> 0x010e }
            com.google.android.gms.measurement.internal.X1 r9 = r9.B()     // Catch:{ SQLiteException -> 0x010e }
            java.lang.String r0 = "Failed to delete a bundle in a queue table"
            r9.b(r0, r10)     // Catch:{ SQLiteException -> 0x010e }
            throw r10     // Catch:{ SQLiteException -> 0x010e }
        L_0x010e:
            r9 = move-exception
            java.util.List r10 = r6.f55319z     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x011a
            boolean r8 = r10.contains(r8)     // Catch:{ all -> 0x00fd }
            if (r8 == 0) goto L_0x011a
            goto L_0x00c3
        L_0x011a:
            throw r9     // Catch:{ all -> 0x00fd }
        L_0x011b:
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x00fd }
            r7.W0()     // Catch:{ all -> 0x00fd }
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ SQLiteException -> 0x0051 }
            r7.U0()     // Catch:{ SQLiteException -> 0x0051 }
            r6.f55319z = r1     // Catch:{ SQLiteException -> 0x0051 }
            com.google.android.gms.measurement.internal.Y1 r7 = r6.g0()     // Catch:{ SQLiteException -> 0x0051 }
            boolean r7 = r7.v()     // Catch:{ SQLiteException -> 0x0051 }
            if (r7 == 0) goto L_0x013f
            boolean r7 = r6.L()     // Catch:{ SQLiteException -> 0x0051 }
            if (r7 == 0) goto L_0x013f
            r6.u0()     // Catch:{ SQLiteException -> 0x0051 }
            goto L_0x0146
        L_0x013f:
            r7 = -1
            r6.f55287A = r7     // Catch:{ SQLiteException -> 0x0051 }
            r6.K()     // Catch:{ SQLiteException -> 0x0051 }
        L_0x0146:
            r6.f55308o = r2     // Catch:{ SQLiteException -> 0x0051 }
            goto L_0x01bd
        L_0x0149:
            com.google.android.gms.measurement.internal.l r8 = r6.c0()     // Catch:{ SQLiteException -> 0x0051 }
            r8.U0()     // Catch:{ SQLiteException -> 0x0051 }
            throw r7     // Catch:{ SQLiteException -> 0x0051 }
        L_0x0151:
            com.google.android.gms.measurement.internal.V1 r8 = r6.zzj()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.X1 r8 = r8.B()     // Catch:{ all -> 0x0010 }
            java.lang.String r9 = "Database error while trying to delete uploaded bundles"
            r8.b(r9, r7)     // Catch:{ all -> 0x0010 }
            Ea.e r7 = r6.zzb()     // Catch:{ all -> 0x0010 }
            long r7 = r7.a()     // Catch:{ all -> 0x0010 }
            r6.f55308o = r7     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()     // Catch:{ all -> 0x0010 }
            java.lang.String r8 = "Disable upload, time"
            long r9 = r6.f55308o     // Catch:{ all -> 0x0010 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0010 }
            r7.b(r8, r9)     // Catch:{ all -> 0x0010 }
            goto L_0x01bd
        L_0x017c:
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()     // Catch:{ all -> 0x0010 }
            java.lang.String r10 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0010 }
            r7.c(r10, r1, r9)     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.Q4 r7 = r6.f55302i     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.l2 r7 = r7.f54842h     // Catch:{ all -> 0x0010 }
            Ea.e r9 = r6.zzb()     // Catch:{ all -> 0x0010 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0010 }
            r7.b(r9)     // Catch:{ all -> 0x0010 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x01a4
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x01b3
        L_0x01a4:
            com.google.android.gms.measurement.internal.Q4 r7 = r6.f55302i     // Catch:{ all -> 0x0010 }
            com.google.android.gms.measurement.internal.l2 r7 = r7.f54840f     // Catch:{ all -> 0x0010 }
            Ea.e r8 = r6.zzb()     // Catch:{ all -> 0x0010 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0010 }
            r7.b(r8)     // Catch:{ all -> 0x0010 }
        L_0x01b3:
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x0010 }
            r7.W(r0)     // Catch:{ all -> 0x0010 }
            r6.K()     // Catch:{ all -> 0x0010 }
        L_0x01bd:
            r6.f55314u = r11
            r6.J()
            return
        L_0x01c3:
            r6.f55314u = r11
            r6.J()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.F(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final C4622h3 N(String str) {
        zzl().i();
        q0();
        C4622h3 h3Var = (C4622h3) this.f55288B.get(str);
        if (h3Var == null) {
            h3Var = c0().K0(str);
            if (h3Var == null) {
                h3Var = C4622h3.f55119c;
            }
            z(str, h3Var);
        }
        return h3Var;
    }

    /* access modifiers changed from: package-private */
    public final String O(E5 e52) {
        try {
            return (String) zzl().r(new u5(this, e52)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzj().B().c("Failed to get app instance id. appId", V1.q(e52.f54557a), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(C4604f fVar) {
        E5 U10 = U((String) C4536s.l(fVar.f55060a));
        if (U10 != null) {
            Q(fVar, U10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Q(C4604f fVar, E5 e52) {
        boolean z10;
        C4536s.l(fVar);
        C4536s.f(fVar.f55060a);
        C4536s.l(fVar.f55061b);
        C4536s.l(fVar.f55062c);
        C4536s.f(fVar.f55062c.f54441b);
        zzl().i();
        q0();
        if (h0(e52)) {
            if (!e52.f54564h) {
                e(e52);
                return;
            }
            C4604f fVar2 = new C4604f(fVar);
            boolean z11 = false;
            fVar2.f55064e = false;
            c0().S0();
            try {
                C4604f y02 = c0().y0((String) C4536s.l(fVar2.f55060a), fVar2.f55062c.f54441b);
                if (y02 != null && !y02.f55061b.equals(fVar2.f55061b)) {
                    zzj().G().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f55305l.y().g(fVar2.f55062c.f54441b), fVar2.f55061b, y02.f55061b);
                }
                if (y02 != null && (z10 = y02.f55064e)) {
                    fVar2.f55061b = y02.f55061b;
                    fVar2.f55063d = y02.f55063d;
                    fVar2.f55067h = y02.f55067h;
                    fVar2.f55065f = y02.f55065f;
                    fVar2.f55068i = y02.f55068i;
                    fVar2.f55064e = z10;
                    A5 a52 = fVar2.f55062c;
                    fVar2.f55062c = new A5(a52.f54441b, y02.f55062c.f54442c, a52.o0(), y02.f55062c.f54445f);
                } else if (TextUtils.isEmpty(fVar2.f55065f)) {
                    A5 a53 = fVar2.f55062c;
                    fVar2.f55062c = new A5(a53.f54441b, fVar2.f55063d, a53.o0(), fVar2.f55062c.f54445f);
                    z11 = true;
                    fVar2.f55064e = true;
                }
                if (fVar2.f55064e) {
                    A5 a54 = fVar2.f55062c;
                    C5 c52 = new C5((String) C4536s.l(fVar2.f55060a), fVar2.f55061b, a54.f54441b, a54.f54442c, C4536s.l(a54.o0()));
                    if (c0().a0(c52)) {
                        zzj().A().d("User property updated immediately", fVar2.f55060a, this.f55305l.y().g(c52.f54494c), c52.f54496e);
                    } else {
                        zzj().B().d("(2)Too many active user properties, ignoring", V1.q(fVar2.f55060a), this.f55305l.y().g(c52.f54494c), c52.f54496e);
                    }
                    if (z11 && fVar2.f55068i != null) {
                        W(new D(fVar2.f55068i, fVar2.f55063d), e52);
                    }
                }
                if (c0().Y(fVar2)) {
                    zzj().A().d("Conditional property added", fVar2.f55060a, this.f55305l.y().g(fVar2.f55062c.f54441b), fVar2.f55062c.o0());
                } else {
                    zzj().B().d("Too many conditional properties, ignoring", V1.q(fVar2.f55060a), this.f55305l.y().g(fVar2.f55062c.f54441b), fVar2.f55062c.o0());
                }
                c0().W0();
                c0().U0();
            } catch (Throwable th2) {
                c0().U0();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void T(Z1 z12, zzfn.zzk.zza zza) {
        zzl().i();
        q0();
        zzfn.zza.C0830zza zzc = zzfn.zza.zzc();
        byte[] E10 = z12.E();
        if (E10 != null) {
            try {
                zzc = (zzfn.zza.C0830zza) x5.B(zzc, E10);
            } catch (zzjs unused) {
                zzj().G().b("Failed to parse locally stored ad campaign info. appId", V1.q(z12.l()));
            }
        }
        for (zzfn.zzf next : zza.zzaa()) {
            if (next.zzg().equals("_cmp")) {
                String str = (String) x5.E(next, "gclid", "");
                String str2 = (String) x5.E(next, "gbraid", "");
                String str3 = (String) x5.E(next, "gad_source", "");
                if (!str.isEmpty() || (!str2.isEmpty() || !str3.isEmpty())) {
                    long longValue = ((Long) x5.E(next, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = next.zzd();
                    }
                    if ("referrer API v2".equals(x5.b0(next, "_cis"))) {
                        if (longValue > zzc.zzb()) {
                            if (str.isEmpty()) {
                                zzc.zzh();
                            } else {
                                zzc.zzf(str);
                            }
                            if (str2.isEmpty()) {
                                zzc.zzg();
                            } else {
                                zzc.zze(str2);
                            }
                            if (str3.isEmpty()) {
                                zzc.zzf();
                            } else {
                                zzc.zzd(str3);
                            }
                            zzc.zzb(longValue);
                        }
                    } else if (longValue > zzc.zza()) {
                        if (str.isEmpty()) {
                            zzc.zze();
                        } else {
                            zzc.zzc(str);
                        }
                        if (str2.isEmpty()) {
                            zzc.zzd();
                        } else {
                            zzc.zzb(str2);
                        }
                        if (str3.isEmpty()) {
                            zzc.zzc();
                        } else {
                            zzc.zza(str3);
                        }
                        zzc.zza(longValue);
                    }
                }
            }
        }
        if (!((zzfn.zza) ((zzjk) zzc.zzai())).equals(zzfn.zza.zze())) {
            zza.zza((zzfn.zza) ((zzjk) zzc.zzai()));
        }
        z12.i(((zzfn.zza) ((zzjk) zzc.zzai())).zzbz());
        if (z12.B()) {
            c0().Q(z12, false, false);
        }
    }

    public final J5 V() {
        return (J5) g(this.f55299f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03b2 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03dd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03f4 A[SYNTHETIC, Splitter:B:131:0x03f4] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x048d A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04aa A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0516 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cd A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0237 A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024a A[Catch:{ SQLiteException -> 0x01b8, all -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X(com.google.android.gms.measurement.internal.E5 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "com.android.vending"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            com.google.android.gms.measurement.internal.z2 r9 = r23.zzl()
            r9.i()
            r23.q0()
            com.google.android.gms.common.internal.C4536s.l(r24)
            java.lang.String r9 = r2.f54557a
            com.google.android.gms.common.internal.C4536s.f(r9)
            boolean r9 = h0(r24)
            if (r9 != 0) goto L_0x002b
            return
        L_0x002b:
            com.google.android.gms.measurement.internal.l r9 = r23.c0()
            java.lang.String r10 = r2.f54557a
            com.google.android.gms.measurement.internal.Z1 r9 = r9.C0(r10)
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x005f
            java.lang.String r13 = r9.q()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x005f
            java.lang.String r13 = r2.f54558b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x005f
            r9.R(r11)
            com.google.android.gms.measurement.internal.l r13 = r23.c0()
            r13.Q(r9, r10, r10)
            com.google.android.gms.measurement.internal.q2 r9 = r23.i0()
            java.lang.String r13 = r2.f54557a
            r9.Q(r13)
        L_0x005f:
            boolean r9 = r2.f54564h
            if (r9 != 0) goto L_0x0067
            r23.e(r24)
            return
        L_0x0067:
            long r13 = r2.f54569m
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0075
            Ea.e r9 = r23.zzb()
            long r13 = r9.currentTimeMillis()
        L_0x0075:
            com.google.android.gms.measurement.internal.E2 r9 = r1.f55305l
            com.google.android.gms.measurement.internal.w r9 = r9.v()
            r9.s()
            int r9 = r2.f54570n
            r15 = 1
            if (r9 == 0) goto L_0x009d
            if (r9 == r15) goto L_0x009d
            com.google.android.gms.measurement.internal.V1 r16 = r23.zzj()
            com.google.android.gms.measurement.internal.X1 r15 = r16.G()
            java.lang.String r11 = r2.f54557a
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "Incorrect app type, assuming installed app. appId, appType"
            r15.c(r12, r11, r9)
            r9 = r10
        L_0x009d:
            com.google.android.gms.measurement.internal.l r11 = r23.c0()
            r11.S0()
            com.google.android.gms.measurement.internal.l r11 = r23.c0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.C5 r11 = r11.D0(r12, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Boolean r12 = r23.f0(r24)     // Catch:{ all -> 0x00c5 }
            r21 = r3
            r22 = r4
            if (r11 == 0) goto L_0x00c8
            java.lang.String r15 = "auto"
            java.lang.String r10 = r11.f54493b     // Catch:{ all -> 0x00c5 }
            boolean r10 = r15.equals(r10)     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r10 = 1
            goto L_0x00fc
        L_0x00c5:
            r0 = move-exception
            goto L_0x0544
        L_0x00c8:
            if (r12 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.A5 r0 = new com.google.android.gms.measurement.internal.A5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_npa"
            boolean r10 = r12.booleanValue()     // Catch:{ all -> 0x00c5 }
            if (r10 == 0) goto L_0x00d7
            r18 = 1
            goto L_0x00d9
        L_0x00d7:
            r18 = 0
        L_0x00d9:
            java.lang.Long r19 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r10 = 1
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00f2
            java.lang.Object r11 = r11.f54496e     // Catch:{ all -> 0x00c5 }
            java.lang.Long r12 = r0.f54443d     // Catch:{ all -> 0x00c5 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x00fc
        L_0x00f2:
            r1.u(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x00fc
        L_0x00f6:
            r10 = 1
            if (r11 == 0) goto L_0x00fc
            r1.B(r0, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00fc:
            com.google.android.gms.measurement.internal.l r0 = r23.c0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = com.google.android.gms.common.internal.C4536s.l(r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.Z1 r0 = r0.C0(r11)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x01cb
            r23.o0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r12 = r2.f54558b     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = r0.q()     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r2.f54573q     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r0.j()     // Catch:{ all -> 0x00c5 }
            boolean r3 = com.google.android.gms.measurement.internal.B5.h0(r12, r15, r11, r3)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.V1 r3 = r23.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r3 = r3.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r11 = r0.l()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r11)     // Catch:{ all -> 0x00c5 }
            r3.b(r4, r11)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.l r3 = r23.c0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r0.l()     // Catch:{ all -> 0x00c5 }
            r3.p()     // Catch:{ all -> 0x00c5 }
            r3.i()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.internal.C4536s.f(r4)     // Catch:{ all -> 0x00c5 }
            android.database.sqlite.SQLiteDatabase r0 = r3.w()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String[] r11 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r12 = "events"
            int r12 = r0.delete(r12, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r15 = "user_attributes"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "apps"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "consent_settings"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "default_event_params"
            int r15 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r15
            java.lang.String r15 = "trigger_uris"
            int r0 = r0.delete(r15, r8, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            int r12 = r12 + r0
            if (r12 <= 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.V1 r0 = r3.zzj()     // Catch:{ SQLiteException -> 0x01b8 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.F()     // Catch:{ SQLiteException -> 0x01b8 }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x01b8 }
            r0.c(r8, r4, r11)     // Catch:{ SQLiteException -> 0x01b8 }
            goto L_0x01ca
        L_0x01b8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.V1 r3 = r3.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r3 = r3.B()     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.V1.q(r4)     // Catch:{ all -> 0x00c5 }
            r3.c(r8, r4, r0)     // Catch:{ all -> 0x00c5 }
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            if (r0 == 0) goto L_0x0225
            long r3 = r0.U()     // Catch:{ all -> 0x00c5 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            long r3 = r0.U()     // Catch:{ all -> 0x00c5 }
            long r10 = r2.f54566j     // Catch:{ all -> 0x00c5 }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            r3 = 1
            goto L_0x01e5
        L_0x01e4:
            r3 = 0
        L_0x01e5:
            java.lang.String r4 = r0.o()     // Catch:{ all -> 0x00c5 }
            long r10 = r0.U()     // Catch:{ all -> 0x00c5 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            java.lang.String r0 = r2.f54559c     // Catch:{ all -> 0x00c5 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x0200
            r15 = 1
            goto L_0x0201
        L_0x0200:
            r15 = 0
        L_0x0201:
            r0 = r3 | r15
            if (r0 == 0) goto L_0x0225
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "_pv"
            r0.putString(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.D r3 = new com.google.android.gms.measurement.internal.D     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_au"
            com.google.android.gms.measurement.internal.C r4 = new com.google.android.gms.measurement.internal.C     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.q(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0225:
            r23.e(r24)     // Catch:{ all -> 0x00c5 }
            if (r9 != 0) goto L_0x0237
            com.google.android.gms.measurement.internal.l r0 = r23.c0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.y r0 = r0.B0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0237:
            r3 = 1
            if (r9 != r3) goto L_0x0247
            com.google.android.gms.measurement.internal.l r0 = r23.c0()     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.y r0 = r0.B0(r3, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0248
        L_0x0247:
            r0 = 0
        L_0x0248:
            if (r0 != 0) goto L_0x0516
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r10 = r13 / r3
            r15 = 1
            long r10 = r10 + r15
            long r10 = r10 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r12 = "_r"
            java.lang.String r15 = "_c"
            if (r9 != 0) goto L_0x04c7
            com.google.android.gms.measurement.internal.A5 r0 = new com.google.android.gms.measurement.internal.A5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r9 = r15
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.u(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.z2 r0 = r23.zzl()     // Catch:{ all -> 0x00c5 }
            r0.i()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.o2 r0 = r1.f55304k     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C4536s.l(r0)     // Catch:{ all -> 0x00c5 }
            r10 = r0
            com.google.android.gms.measurement.internal.o2 r10 = (com.google.android.gms.measurement.internal.C4669o2) r10     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0373
            boolean r11 = r0.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x028d
            goto L_0x0373
        L_0x028d:
            com.google.android.gms.measurement.internal.E2 r11 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.z2 r11 = r11.zzl()     // Catch:{ all -> 0x00c5 }
            r11.i()     // Catch:{ all -> 0x00c5 }
            boolean r11 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r11 != 0) goto L_0x02ad
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter is not available"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02ad:
            com.google.android.gms.measurement.internal.n2 r11 = new com.google.android.gms.measurement.internal.n2     // Catch:{ all -> 0x00c5 }
            r11.<init>(r10, r0)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.z2 r0 = r0.zzl()     // Catch:{ all -> 0x00c5 }
            r0.i()     // Catch:{ all -> 0x00c5 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x00c5 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r6, r8)     // Catch:{ all -> 0x00c5 }
            r0.setComponent(r15)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.E2 r8 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            android.content.Context r8 = r8.zza()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r8 != 0) goto L_0x02e9
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.I()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x02e9:
            r15 = 0
            java.util.List r8 = r8.queryIntentServices(r0, r15)     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0363
            boolean r16 = r8.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r16 != 0) goto L_0x0363
            java.lang.Object r8 = r8.get(r15)     // Catch:{ all -> 0x00c5 }
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8     // Catch:{ all -> 0x00c5 }
            android.content.pm.ServiceInfo r8 = r8.serviceInfo     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0382
            java.lang.String r15 = r8.packageName     // Catch:{ all -> 0x00c5 }
            java.lang.String r8 = r8.name     // Catch:{ all -> 0x00c5 }
            if (r8 == 0) goto L_0x0353
            boolean r6 = r6.equals(r15)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            boolean r6 = r10.b()     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x0353
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00c5 }
            r6.<init>(r0)     // Catch:{ all -> 0x00c5 }
            Da.b r0 = Da.C4250b.b()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.E2 r8 = r10.f55248a     // Catch:{ RuntimeException -> 0x0337 }
            android.content.Context r8 = r8.zza()     // Catch:{ RuntimeException -> 0x0337 }
            r15 = 1
            boolean r0 = r0.a(r8, r6, r11, r15)     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.E2 r6 = r10.f55248a     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()     // Catch:{ RuntimeException -> 0x0337 }
            com.google.android.gms.measurement.internal.X1 r6 = r6.F()     // Catch:{ RuntimeException -> 0x0337 }
            java.lang.String r11 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0339
            java.lang.String r0 = "available"
            goto L_0x033b
        L_0x0337:
            r0 = move-exception
            goto L_0x033f
        L_0x0339:
            java.lang.String r0 = "not available"
        L_0x033b:
            r6.b(r11, r0)     // Catch:{ RuntimeException -> 0x0337 }
            goto L_0x0382
        L_0x033f:
            com.google.android.gms.measurement.internal.E2 r6 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r6 = r6.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r6 = r6.B()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c5 }
            r6.b(r10, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0353:
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0363:
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.E()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
            goto L_0x0382
        L_0x0373:
            com.google.android.gms.measurement.internal.E2 r0 = r10.f55248a     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.V1 r0 = r0.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.I()     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r6)     // Catch:{ all -> 0x00c5 }
        L_0x0382:
            com.google.android.gms.measurement.internal.z2 r0 = r23.zzl()     // Catch:{ all -> 0x00c5 }
            r0.i()     // Catch:{ all -> 0x00c5 }
            r23.q0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r6.<init>()     // Catch:{ all -> 0x00c5 }
            r10 = 1
            r6.putLong(r9, r10)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r12, r10)     // Catch:{ all -> 0x00c5 }
            r8 = 0
            r6.putLong(r7, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r5, r8)     // Catch:{ all -> 0x00c5 }
            r12 = r22
            r6.putLong(r12, r8)     // Catch:{ all -> 0x00c5 }
            r15 = r21
            r6.putLong(r15, r8)     // Catch:{ all -> 0x00c5 }
            r6.putLong(r4, r10)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r2.f54572p     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x03b5
            r6.putLong(r3, r10)     // Catch:{ all -> 0x00c5 }
        L_0x03b5:
            java.lang.String r0 = r2.f54557a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = com.google.android.gms.common.internal.C4536s.l(r0)     // Catch:{ all -> 0x00c5 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.l r0 = r23.c0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.internal.C4536s.f(r3)     // Catch:{ all -> 0x00c5 }
            r0.i()     // Catch:{ all -> 0x00c5 }
            r0.p()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "first_open_count"
            long r8 = r0.s0(r3, r4)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.E2 r0 = r1.f55305l     // Catch:{ all -> 0x00c5 }
            android.content.Context r0 = r0.zza()     // Catch:{ all -> 0x00c5 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.V1 r0 = r23.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.B()     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.V1.q(r3)     // Catch:{ all -> 0x00c5 }
            r0.b(r4, r3)     // Catch:{ all -> 0x00c5 }
            r21 = r5
        L_0x03f0:
            r3 = 0
            goto L_0x04a6
        L_0x03f4:
            com.google.android.gms.measurement.internal.E2 r0 = r1.f55305l     // Catch:{ NameNotFoundException -> 0x0404 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0404 }
            Ga.d r0 = Ga.C4293e.a(r0)     // Catch:{ NameNotFoundException -> 0x0404 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.e(r3, r4)     // Catch:{ NameNotFoundException -> 0x0404 }
            goto L_0x0417
        L_0x0404:
            r0 = move-exception
            com.google.android.gms.measurement.internal.V1 r4 = r23.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()     // Catch:{ all -> 0x00c5 }
            java.lang.String r10 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.V1.q(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r10, r11, r0)     // Catch:{ all -> 0x00c5 }
            r0 = 0
        L_0x0417:
            if (r0 == 0) goto L_0x0465
            long r10 = r0.firstInstallTime     // Catch:{ all -> 0x00c5 }
            r16 = 0
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0465
            r21 = r5
            long r4 = r0.lastUpdateTime     // Catch:{ all -> 0x00c5 }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0448
            com.google.android.gms.measurement.internal.h r0 = r23.a0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54664o0     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.o(r4)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0441
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0446
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0446
        L_0x0441:
            r4 = 1
            r6.putLong(r7, r4)     // Catch:{ all -> 0x00c5 }
        L_0x0446:
            r0 = 0
            goto L_0x0449
        L_0x0448:
            r0 = 1
        L_0x0449:
            com.google.android.gms.measurement.internal.A5 r4 = new com.google.android.gms.measurement.internal.A5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fi"
            if (r0 == 0) goto L_0x0452
            r10 = 1
            goto L_0x0454
        L_0x0452:
            r10 = 0
        L_0x0454:
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r5 = r15
            r15 = r4
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.u(r4, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0468
        L_0x0465:
            r21 = r5
            r5 = r15
        L_0x0468:
            com.google.android.gms.measurement.internal.E2 r0 = r1.f55305l     // Catch:{ NameNotFoundException -> 0x0478 }
            android.content.Context r0 = r0.zza()     // Catch:{ NameNotFoundException -> 0x0478 }
            Ga.d r0 = Ga.C4293e.a(r0)     // Catch:{ NameNotFoundException -> 0x0478 }
            r4 = 0
            android.content.pm.ApplicationInfo r11 = r0.c(r3, r4)     // Catch:{ NameNotFoundException -> 0x0478 }
            goto L_0x048b
        L_0x0478:
            r0 = move-exception
            com.google.android.gms.measurement.internal.V1 r4 = r23.zzj()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.X1 r4 = r4.B()     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.V1.q(r3)     // Catch:{ all -> 0x00c5 }
            r4.c(r7, r3, r0)     // Catch:{ all -> 0x00c5 }
            r11 = 0
        L_0x048b:
            if (r11 == 0) goto L_0x03f0
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0499
            r3 = 1
            r6.putLong(r12, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x049b
        L_0x0499:
            r3 = 1
        L_0x049b:
            int r0 = r11.flags     // Catch:{ all -> 0x00c5 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03f0
            r6.putLong(r5, r3)     // Catch:{ all -> 0x00c5 }
            goto L_0x03f0
        L_0x04a6:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04af
            r3 = r21
            r6.putLong(r3, r8)     // Catch:{ all -> 0x00c5 }
        L_0x04af:
            com.google.android.gms.measurement.internal.D r0 = new com.google.android.gms.measurement.internal.D     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_f"
            com.google.android.gms.measurement.internal.C r3 = new com.google.android.gms.measurement.internal.C     // Catch:{ all -> 0x00c5 }
            r3.<init>(r6)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r0
            r17 = r3
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.R(r0, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x04c7:
            r6 = r15
            r5 = 1
            if (r9 != r5) goto L_0x0535
            com.google.android.gms.measurement.internal.A5 r0 = new com.google.android.gms.measurement.internal.A5     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_fvt"
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r20 = "auto"
            r15 = r0
            r17 = r13
            r15.<init>(r16, r17, r19, r20)     // Catch:{ all -> 0x00c5 }
            r1.u(r0, r2)     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.z2 r0 = r23.zzl()     // Catch:{ all -> 0x00c5 }
            r0.i()     // Catch:{ all -> 0x00c5 }
            r23.q0()     // Catch:{ all -> 0x00c5 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r12, r7)     // Catch:{ all -> 0x00c5 }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x00c5 }
            boolean r4 = r2.f54572p     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x04ff
            r0.putLong(r3, r7)     // Catch:{ all -> 0x00c5 }
        L_0x04ff:
            com.google.android.gms.measurement.internal.D r3 = new com.google.android.gms.measurement.internal.D     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_v"
            com.google.android.gms.measurement.internal.C r4 = new com.google.android.gms.measurement.internal.C     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.R(r3, r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x0535
        L_0x0516:
            boolean r0 = r2.f54565i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0535
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.D r3 = new com.google.android.gms.measurement.internal.D     // Catch:{ all -> 0x00c5 }
            java.lang.String r16 = "_cd"
            com.google.android.gms.measurement.internal.C r4 = new com.google.android.gms.measurement.internal.C     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r18 = "auto"
            r15 = r3
            r17 = r4
            r19 = r13
            r15.<init>(r16, r17, r18, r19)     // Catch:{ all -> 0x00c5 }
            r1.R(r3, r2)     // Catch:{ all -> 0x00c5 }
        L_0x0535:
            com.google.android.gms.measurement.internal.l r0 = r23.c0()     // Catch:{ all -> 0x00c5 }
            r0.W0()     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.measurement.internal.l r0 = r23.c0()
            r0.U0()
            return
        L_0x0544:
            com.google.android.gms.measurement.internal.l r2 = r23.c0()
            r2.U0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.X(com.google.android.gms.measurement.internal.E5):void");
    }

    /* access modifiers changed from: package-private */
    public final void Z(E5 e52) {
        if (this.f55318y != null) {
            ArrayList arrayList = new ArrayList();
            this.f55319z = arrayList;
            arrayList.addAll(this.f55318y);
        }
        C4646l c02 = c0();
        String str = (String) C4536s.l(e52.f54557a);
        C4536s.f(str);
        c02.i();
        c02.p();
        try {
            SQLiteDatabase w10 = c02.w();
            String[] strArr = {str};
            int delete = w10.delete("apps", "app_id=?", strArr) + w10.delete("events", "app_id=?", strArr) + w10.delete("events_snapshot", "app_id=?", strArr) + w10.delete("user_attributes", "app_id=?", strArr) + w10.delete("conditional_properties", "app_id=?", strArr) + w10.delete("raw_events", "app_id=?", strArr) + w10.delete("raw_events_metadata", "app_id=?", strArr) + w10.delete("queue", "app_id=?", strArr) + w10.delete("audience_filter_values", "app_id=?", strArr) + w10.delete("main_event_params", "app_id=?", strArr) + w10.delete("default_event_params", "app_id=?", strArr) + w10.delete("trigger_uris", "app_id=?", strArr);
            if (delete > 0) {
                c02.zzj().F().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            c02.zzj().B().c("Error resetting analytics data. appId, error", V1.q(str), e10);
        }
        if (e52.f54564h) {
            X(e52);
        }
    }

    public final C4618h a0() {
        return ((E2) C4536s.l(this.f55305l)).u();
    }

    /* access modifiers changed from: package-private */
    public final void b0(E5 e52) {
        boolean z10;
        boolean z11;
        zzl().i();
        q0();
        C4536s.f(e52.f54557a);
        C4701u d10 = C4701u.d(e52.f54552B);
        zzj().F().c("Setting DMA consent for package", e52.f54557a, d10);
        String str = e52.f54557a;
        zzl().i();
        q0();
        o g10 = C4701u.c(c(str), 100).g();
        this.f55289C.put(str, d10);
        c0().R(str, d10);
        o g11 = C4701u.c(c(str), 100).g();
        zzl().i();
        q0();
        o oVar = o.DENIED;
        boolean z12 = false;
        if (g10 == oVar && g11 == o.GRANTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g10 == o.GRANTED && g11 == oVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (a0().o(F.f54602J0)) {
            if (z10 || z11) {
                z12 = true;
            }
            z10 = z12;
        }
        if (z10) {
            zzj().F().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (c0().E(v0(), str, false, false, false, false, false, false).f55257f < ((long) a0().q(str, F.f54629X))) {
                bundle.putLong("_r", 1);
                zzj().F().c("_dcu realtime event count", str, Long.valueOf(c0().E(v0(), str, false, false, false, false, false, true).f55257f));
            }
            this.f55293G.a(str, "_dcu", bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle c(String str) {
        int i10;
        String str2;
        zzl().i();
        q0();
        if (i0().E(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C4622h3 N10 = N(str);
        bundle.putAll(N10.o());
        bundle.putAll(d(str, Y(str), N10, new C4625i()).f());
        if (n0().e0(str)) {
            i10 = 1;
        } else {
            C5 D02 = c0().D0(str, "_npa");
            if (D02 != null) {
                i10 = D02.f54496e.equals(1L);
            } else {
                i10 = a(str, new C4625i());
            }
        }
        if (i10 == 1) {
            str2 = "denied";
        } else {
            str2 = "granted";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    public final C4646l c0() {
        return (C4646l) g(this.f55296c);
    }

    /* access modifiers changed from: package-private */
    public final void d0(E5 e52) {
        zzl().i();
        q0();
        C4536s.f(e52.f54557a);
        C4622h3 i10 = C4622h3.i(e52.f54578v, e52.f54551A);
        C4622h3 N10 = N(e52.f54557a);
        zzj().F().c("Setting storage consent for package", e52.f54557a, i10);
        z(e52.f54557a, i10);
        if ((!zznk.zza() || !a0().o(F.f54628W0)) && i10.u(N10)) {
            Z(e52);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.Z1 e(com.google.android.gms.measurement.internal.E5 r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.z2 r0 = r12.zzl()
            r0.i()
            r12.q0()
            com.google.android.gms.common.internal.C4536s.l(r13)
            java.lang.String r0 = r13.f54557a
            com.google.android.gms.common.internal.C4536s.f(r0)
            java.lang.String r0 = r13.f54579w
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0029
            java.util.Map r0 = r12.f55290D
            java.lang.String r2 = r13.f54557a
            com.google.android.gms.measurement.internal.q5$b r3 = new com.google.android.gms.measurement.internal.q5$b
            java.lang.String r4 = r13.f54579w
            r3.<init>(r4)
            r0.put(r2, r3)
        L_0x0029:
            com.google.android.gms.measurement.internal.l r0 = r12.c0()
            java.lang.String r2 = r13.f54557a
            com.google.android.gms.measurement.internal.Z1 r0 = r0.C0(r2)
            java.lang.String r2 = r13.f54557a
            com.google.android.gms.measurement.internal.h3 r2 = r12.N(r2)
            java.lang.String r3 = r13.f54578v
            com.google.android.gms.measurement.internal.h3 r3 = com.google.android.gms.measurement.internal.C4622h3.q(r3)
            com.google.android.gms.measurement.internal.h3 r2 = r2.h(r3)
            boolean r3 = r2.A()
            if (r3 == 0) goto L_0x0054
            com.google.android.gms.measurement.internal.Q4 r3 = r12.f55302i
            java.lang.String r4 = r13.f54557a
            boolean r5 = r13.f54571o
            java.lang.String r3 = r3.v(r4, r5)
            goto L_0x0056
        L_0x0054:
            java.lang.String r3 = ""
        L_0x0056:
            r4 = 0
            if (r0 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.Z1 r0 = new com.google.android.gms.measurement.internal.Z1
            com.google.android.gms.measurement.internal.E2 r5 = r12.f55305l
            java.lang.String r6 = r13.f54557a
            r0.<init>(r5, r6)
            boolean r5 = r2.B()
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r12.j(r2)
            r0.J(r5)
        L_0x006f:
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x0078
            r0.f0(r3)
        L_0x0078:
            r2 = r4
            goto L_0x0142
        L_0x007b:
            boolean r5 = r2.A()
            if (r5 == 0) goto L_0x0129
            if (r3 == 0) goto L_0x0129
            java.lang.String r5 = r0.s()
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0129
            java.lang.String r5 = r0.s()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r0.f0(r3)
            boolean r3 = r13.f54571o
            if (r3 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.Q4 r3 = r12.f55302i
            java.lang.String r6 = r13.f54557a
            android.util.Pair r3 = r3.u(r6, r2)
            java.lang.Object r3 = r3.first
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0110
            if (r5 != 0) goto L_0x0110
            boolean r3 = com.google.android.gms.internal.measurement.zznk.zza()
            if (r3 == 0) goto L_0x00ca
            com.google.android.gms.measurement.internal.h r3 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54628W0
            boolean r3 = r3.o(r5)
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r2.B()
            if (r3 != 0) goto L_0x00ca
            r2 = 1
            goto L_0x00d2
        L_0x00ca:
            java.lang.String r2 = r12.j(r2)
            r0.J(r2)
            r2 = r4
        L_0x00d2:
            com.google.android.gms.measurement.internal.l r3 = r12.c0()
            java.lang.String r5 = r13.f54557a
            java.lang.String r6 = "_id"
            com.google.android.gms.measurement.internal.C5 r3 = r3.D0(r5, r6)
            if (r3 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.l r3 = r12.c0()
            java.lang.String r5 = r13.f54557a
            java.lang.String r6 = "_lair"
            com.google.android.gms.measurement.internal.C5 r3 = r3.D0(r5, r6)
            if (r3 != 0) goto L_0x0142
            Ea.e r3 = r12.zzb()
            long r9 = r3.currentTimeMillis()
            com.google.android.gms.measurement.internal.C5 r3 = new com.google.android.gms.measurement.internal.C5
            java.lang.String r6 = r13.f54557a
            r7 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "auto"
            java.lang.String r8 = "_lair"
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r11)
            com.google.android.gms.measurement.internal.l r5 = r12.c0()
            r5.a0(r3)
            goto L_0x0142
        L_0x0110:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.B()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.j(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0129:
            java.lang.String r3 = r0.m()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0078
            boolean r3 = r2.B()
            if (r3 == 0) goto L_0x0078
            java.lang.String r2 = r12.j(r2)
            r0.J(r2)
            goto L_0x0078
        L_0x0142:
            java.lang.String r3 = r13.f54558b
            r0.Z(r3)
            java.lang.String r3 = r13.f54573q
            r0.f(r3)
            java.lang.String r3 = r13.f54567k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0159
            java.lang.String r3 = r13.f54567k
            r0.W(r3)
        L_0x0159:
            long r5 = r13.f54561e
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0164
            r0.u0(r5)
        L_0x0164:
            java.lang.String r3 = r13.f54559c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0171
            java.lang.String r3 = r13.f54559c
            r0.S(r3)
        L_0x0171:
            long r5 = r13.f54566j
            r0.H(r5)
            java.lang.String r3 = r13.f54560d
            if (r3 == 0) goto L_0x017d
            r0.O(r3)
        L_0x017d:
            long r5 = r13.f54562f
            r0.n0(r5)
            boolean r3 = r13.f54564h
            r0.K(r3)
            java.lang.String r3 = r13.f54563g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0194
            java.lang.String r3 = r13.f54563g
            r0.c0(r3)
        L_0x0194:
            boolean r3 = r13.f54571o
            r0.h(r3)
            java.lang.Boolean r3 = r13.f54574r
            r0.d(r3)
            long r5 = r13.f54575s
            r0.q0(r5)
            java.lang.String r3 = r13.f54580x
            r0.l0(r3)
            boolean r3 = com.google.android.gms.internal.measurement.zznw.zza()
            if (r3 == 0) goto L_0x01c0
            com.google.android.gms.measurement.internal.h r3 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54670r0
            boolean r3 = r3.o(r5)
            if (r3 == 0) goto L_0x01c0
            java.util.List r1 = r13.f54576t
            r0.g(r1)
            goto L_0x01d5
        L_0x01c0:
            boolean r3 = com.google.android.gms.internal.measurement.zznw.zza()
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.h r3 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54668q0
            boolean r3 = r3.o(r5)
            if (r3 == 0) goto L_0x01d5
            r0.g(r1)
        L_0x01d5:
            boolean r1 = com.google.android.gms.internal.measurement.zzpn.zza()
            if (r1 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.h r1 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54674t0
            boolean r1 = r1.o(r3)
            if (r1 == 0) goto L_0x020a
            r12.o0()
            java.lang.String r1 = r0.l()
            boolean r1 = com.google.android.gms.measurement.internal.B5.C0(r1)
            if (r1 == 0) goto L_0x020a
            boolean r1 = r13.f54581y
            r0.P(r1)
            com.google.android.gms.measurement.internal.h r1 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54676u0
            boolean r1 = r1.o(r3)
            if (r1 == 0) goto L_0x020a
            java.lang.String r1 = r13.f54555E
            r0.o0(r1)
        L_0x020a:
            boolean r1 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r1 == 0) goto L_0x0221
            com.google.android.gms.measurement.internal.h r1 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54584A0
            boolean r1 = r1.o(r3)
            if (r1 == 0) goto L_0x0221
            int r1 = r13.f54553C
            r0.b(r1)
        L_0x0221:
            long r5 = r13.f54582z
            r0.G0(r5)
            boolean r1 = com.google.android.gms.internal.measurement.zzne.zza()
            if (r1 == 0) goto L_0x023d
            com.google.android.gms.measurement.internal.h r1 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54616Q0
            boolean r1 = r1.o(r3)
            if (r1 == 0) goto L_0x023d
            java.lang.String r13 = r13.f54556F
            r0.i0(r13)
        L_0x023d:
            boolean r13 = com.google.android.gms.internal.measurement.zznk.zza()
            if (r13 == 0) goto L_0x025f
            com.google.android.gms.measurement.internal.h r13 = r12.a0()
            com.google.android.gms.measurement.internal.M1 r1 = com.google.android.gms.measurement.internal.F.f54628W0
            boolean r13 = r13.o(r1)
            if (r13 == 0) goto L_0x025f
            boolean r13 = r0.B()
            if (r13 != 0) goto L_0x0257
            if (r2 == 0) goto L_0x026c
        L_0x0257:
            com.google.android.gms.measurement.internal.l r13 = r12.c0()
            r13.Q(r0, r2, r4)
            goto L_0x026c
        L_0x025f:
            boolean r13 = r0.B()
            if (r13 == 0) goto L_0x026c
            com.google.android.gms.measurement.internal.l r13 = r12.c0()
            r13.Q(r0, r4, r4)
        L_0x026c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.e(com.google.android.gms.measurement.internal.E5):com.google.android.gms.measurement.internal.Z1");
    }

    public final R1 e0() {
        return this.f55305l.y();
    }

    public final Y1 g0() {
        return (Y1) g(this.f55295b);
    }

    public final C4681q2 i0() {
        return (C4681q2) g(this.f55294a);
    }

    /* access modifiers changed from: package-private */
    public final E2 j0() {
        return this.f55305l;
    }

    public final C4581b4 k0() {
        return (C4581b4) g(this.f55301h);
    }

    public final Q4 l0() {
        return this.f55302i;
    }

    public final o5 m0() {
        return this.f55303j;
    }

    public final x5 n0() {
        return (x5) g(this.f55300g);
    }

    /* access modifiers changed from: package-private */
    public final void o(C4604f fVar) {
        E5 U10 = U((String) C4536s.l(fVar.f55060a));
        if (U10 != null) {
            p(fVar, U10);
        }
    }

    public final B5 o0() {
        return ((E2) C4536s.l(this.f55305l)).G();
    }

    /* access modifiers changed from: package-private */
    public final void p(C4604f fVar, E5 e52) {
        Bundle bundle;
        C4536s.l(fVar);
        C4536s.f(fVar.f55060a);
        C4536s.l(fVar.f55062c);
        C4536s.f(fVar.f55062c.f54441b);
        zzl().i();
        q0();
        if (h0(e52)) {
            if (!e52.f54564h) {
                e(e52);
                return;
            }
            c0().S0();
            try {
                e(e52);
                String str = (String) C4536s.l(fVar.f55060a);
                C4604f y02 = c0().y0(str, fVar.f55062c.f54441b);
                if (y02 != null) {
                    zzj().A().c("Removing conditional user property", fVar.f55060a, this.f55305l.y().g(fVar.f55062c.f54441b));
                    c0().y(str, fVar.f55062c.f54441b);
                    if (y02.f55064e) {
                        c0().J0(str, fVar.f55062c.f54441b);
                    }
                    D d10 = fVar.f55070k;
                    if (d10 != null) {
                        C c10 = d10.f54498b;
                        if (c10 != null) {
                            bundle = c10.r0();
                        } else {
                            bundle = null;
                        }
                        W((D) C4536s.l(o0().C(str, ((D) C4536s.l(fVar.f55070k)).f54497a, bundle, y02.f55061b, fVar.f55070k.f54500d, true, true)), e52);
                    }
                } else {
                    zzj().G().c("Conditional user property doesn't exist", V1.q(fVar.f55060a), this.f55305l.y().g(fVar.f55062c.f54441b));
                }
                c0().W0();
                c0().U0();
            } catch (Throwable th2) {
                c0().U0();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void p0() {
        zzl().i();
        q0();
        if (!this.f55307n) {
            this.f55307n = true;
            if (M()) {
                int b10 = b(this.f55317x);
                int y10 = this.f55305l.w().y();
                zzl().i();
                if (b10 > y10) {
                    zzj().B().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(b10), Integer.valueOf(y10));
                } else if (b10 >= y10) {
                } else {
                    if (G(y10, this.f55317x)) {
                        zzj().F().c("Storage version upgraded. Previous, current version", Integer.valueOf(b10), Integer.valueOf(y10));
                    } else {
                        zzj().B().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(b10), Integer.valueOf(y10));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(D d10, E5 e52) {
        C4595d4 d4Var;
        D d11;
        List<C4604f> list;
        List<C4604f> list2;
        List<C4604f> list3;
        String str;
        E5 e53 = e52;
        C4536s.l(e52);
        C4536s.f(e53.f54557a);
        zzl().i();
        q0();
        String str2 = e53.f54557a;
        long j10 = d10.f54500d;
        C4572a2 b10 = C4572a2.b(d10);
        zzl().i();
        if (this.f55291E == null || (str = this.f55292F) == null || !str.equals(str2)) {
            d4Var = null;
        } else {
            d4Var = this.f55291E;
        }
        B5.S(d4Var, b10.f55003d, false);
        D a10 = b10.a();
        n0();
        if (x5.Z(a10, e53)) {
            if (!e53.f54564h) {
                e(e53);
                return;
            }
            List list4 = e53.f54576t;
            if (list4 == null) {
                d11 = a10;
            } else if (list4.contains(a10.f54497a)) {
                Bundle r02 = a10.f54498b.r0();
                r02.putLong("ga_safelisted", 1);
                d11 = new D(a10.f54497a, new C(r02), a10.f54499c, a10.f54500d);
            } else {
                zzj().A().d("Dropping non-safelisted event. appId, event name, origin", str2, a10.f54497a, a10.f54499c);
                return;
            }
            c0().S0();
            try {
                C4646l c02 = c0();
                C4536s.f(str2);
                c02.i();
                c02.p();
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i10 < 0) {
                    c02.zzj().G().c("Invalid time querying timed out conditional properties", V1.q(str2), Long.valueOf(j10));
                    list = Collections.emptyList();
                } else {
                    list = c02.N("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (C4604f fVar : list) {
                    if (fVar != null) {
                        zzj().F().d("User property timed out", fVar.f55060a, this.f55305l.y().g(fVar.f55062c.f54441b), fVar.f55062c.o0());
                        if (fVar.f55066g != null) {
                            W(new D(fVar.f55066g, j10), e53);
                        }
                        c0().y(str2, fVar.f55062c.f54441b);
                    }
                }
                C4646l c03 = c0();
                C4536s.f(str2);
                c03.i();
                c03.p();
                if (i10 < 0) {
                    c03.zzj().G().c("Invalid time querying expired conditional properties", V1.q(str2), Long.valueOf(j10));
                    list2 = Collections.emptyList();
                } else {
                    list2 = c03.N("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C4604f fVar2 : list2) {
                    if (fVar2 != null) {
                        zzj().F().d("User property expired", fVar2.f55060a, this.f55305l.y().g(fVar2.f55062c.f54441b), fVar2.f55062c.o0());
                        c0().J0(str2, fVar2.f55062c.f54441b);
                        D d12 = fVar2.f55070k;
                        if (d12 != null) {
                            arrayList.add(d12);
                        }
                        c0().y(str2, fVar2.f55062c.f54441b);
                    }
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    W(new D((D) obj, j10), e53);
                }
                C4646l c04 = c0();
                String str3 = d11.f54497a;
                C4536s.f(str2);
                C4536s.f(str3);
                c04.i();
                c04.p();
                if (i10 < 0) {
                    c04.zzj().G().d("Invalid time querying triggered conditional properties", V1.q(str2), c04.d().c(str3), Long.valueOf(j10));
                    list3 = Collections.emptyList();
                } else {
                    list3 = c04.N("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C4604f fVar3 : list3) {
                    if (fVar3 != null) {
                        A5 a52 = fVar3.f55062c;
                        C5 c52 = r3;
                        C5 c53 = new C5((String) C4536s.l(fVar3.f55060a), fVar3.f55061b, a52.f54441b, j10, C4536s.l(a52.o0()));
                        if (c0().a0(c52)) {
                            zzj().F().d("User property triggered", fVar3.f55060a, this.f55305l.y().g(c52.f54494c), c52.f54496e);
                        } else {
                            zzj().B().d("Too many active user properties, ignoring", V1.q(fVar3.f55060a), this.f55305l.y().g(c52.f54494c), c52.f54496e);
                        }
                        D d13 = fVar3.f55068i;
                        if (d13 != null) {
                            arrayList2.add(d13);
                        }
                        fVar3.f55062c = new A5(c52);
                        fVar3.f55064e = true;
                        c0().Y(fVar3);
                    }
                }
                W(d11, e53);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    W(new D((D) obj2, j10), e53);
                }
                c0().W0();
                c0().U0();
            } catch (Throwable th2) {
                c0().U0();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void q0() {
        if (!this.f55306m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void r(D d10, String str) {
        D d11 = d10;
        String str2 = str;
        Z1 C02 = c0().C0(str2);
        if (C02 == null || TextUtils.isEmpty(C02.o())) {
            zzj().A().b("No app data available; dropping event", str2);
            return;
        }
        Boolean i10 = i(C02);
        if (i10 == null) {
            if (!"_ui".equals(d11.f54497a)) {
                zzj().G().b("Could not find package. appId", V1.q(str));
            }
        } else if (!i10.booleanValue()) {
            zzj().B().b("App version does not match; dropping event. appId", V1.q(str));
            return;
        }
        E5 e52 = r2;
        E5 e53 = new E5(str, C02.q(), C02.o(), C02.U(), C02.n(), C02.z0(), C02.t0(), (String) null, C02.A(), false, C02.p(), C02.Q(), 0, 0, C02.z(), false, C02.j(), C02.K0(), C02.v0(), C02.w(), (String) null, N(str2).z(), "", (String) null, C02.C(), C02.J0(), N(str2).b(), Y(str2).j(), C02.a(), C02.X(), C02.v(), C02.t());
        R(d11, e52);
    }

    /* access modifiers changed from: package-private */
    public final void r0() {
        this.f55312s++;
    }

    /* access modifiers changed from: package-private */
    public final void s(Z1 z12, zzfn.zzk.zza zza) {
        zzfn.zzo zzo;
        zzl().i();
        q0();
        C4625i a10 = C4625i.a(zza.zzv());
        if (!zzne.zza() || !a0().o(F.f54616Q0)) {
            String l10 = z12.l();
            zzl().i();
            q0();
            C4622h3 N10 = N(l10);
            if (N10.w() != null) {
                a10.c(C4622h3.a.AD_STORAGE, N10.b());
            } else {
                a10.d(C4622h3.a.AD_STORAGE, C4639k.FAILSAFE);
            }
            if (N10.x() != null) {
                a10.c(C4622h3.a.ANALYTICS_STORAGE, N10.b());
            } else {
                a10.d(C4622h3.a.ANALYTICS_STORAGE, C4639k.FAILSAFE);
            }
        } else {
            String l11 = z12.l();
            zzl().i();
            q0();
            C4622h3 N11 = N(l11);
            int[] iArr = v5.f55378a;
            int i10 = iArr[N11.t().ordinal()];
            if (i10 == 1) {
                a10.d(C4622h3.a.AD_STORAGE, C4639k.REMOTE_ENFORCED_DEFAULT);
            } else if (i10 == 2 || i10 == 3) {
                a10.c(C4622h3.a.AD_STORAGE, N11.b());
            } else {
                a10.d(C4622h3.a.AD_STORAGE, C4639k.FAILSAFE);
            }
            int i11 = iArr[N11.v().ordinal()];
            if (i11 == 1) {
                a10.d(C4622h3.a.ANALYTICS_STORAGE, C4639k.REMOTE_ENFORCED_DEFAULT);
            } else if (i11 == 2 || i11 == 3) {
                a10.c(C4622h3.a.ANALYTICS_STORAGE, N11.b());
            } else {
                a10.d(C4622h3.a.ANALYTICS_STORAGE, C4639k.FAILSAFE);
            }
        }
        String l12 = z12.l();
        zzl().i();
        q0();
        C4701u d10 = d(l12, Y(l12), N(l12), a10);
        zza.zzb(((Boolean) C4536s.l(d10.h())).booleanValue());
        if (!TextUtils.isEmpty(d10.i())) {
            zza.zzh(d10.i());
        }
        zzl().i();
        q0();
        Iterator<zzfn.zzo> it = zza.zzab().iterator();
        while (true) {
            if (!it.hasNext()) {
                zzo = null;
                break;
            }
            zzo = it.next();
            if ("_npa".equals(zzo.zzg())) {
                break;
            }
        }
        if (zzo != null) {
            C4622h3.a aVar = C4622h3.a.AD_PERSONALIZATION;
            if (a10.b(aVar) == C4639k.UNSET) {
                C5 D02 = c0().D0(z12.l(), "_npa");
                if (D02 == null) {
                    Boolean K02 = z12.K0();
                    if (K02 == null || ((K02 == Boolean.TRUE && zzo.zzc() != 1) || (K02 == Boolean.FALSE && zzo.zzc() != 0))) {
                        a10.d(aVar, C4639k.API);
                    } else {
                        a10.d(aVar, C4639k.MANIFEST);
                    }
                } else if ("tcf".equals(D02.f54493b)) {
                    a10.d(aVar, C4639k.TCF);
                } else if ("app".equals(D02.f54493b)) {
                    a10.d(aVar, C4639k.API);
                } else {
                    a10.d(aVar, C4639k.MANIFEST);
                }
            }
        } else {
            int a11 = a(z12.l(), a10);
            zza.zza((zzfn.zzo) ((zzjk) zzfn.zzo.zze().zza("_npa").zzb(zzb().currentTimeMillis()).zza((long) a11).zzai()));
            zzj().F().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(a11));
        }
        zza.zzf(a10.toString());
        boolean U10 = this.f55294a.U(z12.l());
        List<zzfn.zzf> zzaa = zza.zzaa();
        int i12 = 0;
        for (int i13 = 0; i13 < zzaa.size(); i13++) {
            if ("_tcf".equals(zzaa.get(i13).zzg())) {
                zzfn.zzf.zza zza2 = (zzfn.zzf.zza) zzaa.get(i13).zzcc();
                List<zzfn.zzh> zzf = zza2.zzf();
                while (true) {
                    if (i12 >= zzf.size()) {
                        break;
                    } else if ("_tcfd".equals(zzf.get(i12).zzg())) {
                        zza2.zza(i12, zzfn.zzh.zze().zza("_tcfd").zzb(C4610f5.d(zzf.get(i12).zzh(), U10)));
                        break;
                    } else {
                        i12++;
                    }
                }
                zza.zza(i13, zza2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void s0() {
        this.f55311r++;
    }

    /* access modifiers changed from: protected */
    public final void t0() {
        int delete;
        zzl().i();
        c0().V0();
        C4646l c02 = c0();
        c02.i();
        c02.p();
        if (c02.g0()) {
            M1 m12 = F.f54648g0;
            if (((Long) m12.a((Object) null)).longValue() != 0 && (delete = c02.w().delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(c02.zzb().currentTimeMillis()), String.valueOf(m12.a((Object) null))})) > 0) {
                c02.zzj().F().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
            }
        }
        if (this.f55302i.f54841g.a() == 0) {
            this.f55302i.f54841g.b(zzb().currentTimeMillis());
        }
        K();
    }

    /* access modifiers changed from: package-private */
    public final void u(A5 a52, E5 e52) {
        C5 D02;
        long j10;
        int i10;
        zzl().i();
        q0();
        if (h0(e52)) {
            if (!e52.f54564h) {
                e(e52);
                return;
            }
            int m02 = o0().m0(a52.f54441b);
            int i11 = 0;
            if (m02 != 0) {
                o0();
                String str = a52.f54441b;
                a0();
                String E10 = B5.E(str, 24, true);
                String str2 = a52.f54441b;
                if (str2 != null) {
                    i10 = str2.length();
                } else {
                    i10 = 0;
                }
                o0();
                B5.U(this.f55293G, e52.f54557a, m02, "_ev", E10, i10);
                return;
            }
            int r10 = o0().r(a52.f54441b, a52.o0());
            if (r10 != 0) {
                o0();
                String str3 = a52.f54441b;
                a0();
                String E11 = B5.E(str3, 24, true);
                Object o02 = a52.o0();
                if (o02 != null && ((o02 instanceof String) || (o02 instanceof CharSequence))) {
                    i11 = String.valueOf(o02).length();
                }
                o0();
                B5.U(this.f55293G, e52.f54557a, r10, "_ev", E11, i11);
                return;
            }
            Object v02 = o0().v0(a52.f54441b, a52.o0());
            if (v02 != null) {
                if ("_sid".equals(a52.f54441b)) {
                    long j11 = a52.f54442c;
                    String str4 = a52.f54445f;
                    String str5 = (String) C4536s.l(e52.f54557a);
                    C5 D03 = c0().D0(str5, "_sno");
                    if (D03 != null) {
                        Object obj = D03.f54496e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            u(new A5("_sno", j11, Long.valueOf(j10 + 1), str4), e52);
                        }
                    }
                    if (D03 != null) {
                        zzj().G().b("Retrieved last session number from database does not contain a valid (long) value", D03.f54496e);
                    }
                    C4725y B02 = c0().B0(str5, "_s");
                    if (B02 != null) {
                        j10 = B02.f55405c;
                        zzj().F().b("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    u(new A5("_sno", j11, Long.valueOf(j10 + 1), str4), e52);
                }
                C5 c52 = new C5((String) C4536s.l(e52.f54557a), (String) C4536s.l(a52.f54445f), a52.f54441b, a52.f54442c, v02);
                zzj().F().c("Setting user property", this.f55305l.y().g(c52.f54494c), v02);
                c0().S0();
                try {
                    if ("_id".equals(c52.f54494c) && (D02 = c0().D0(e52.f54557a, "_id")) != null && !c52.f54496e.equals(D02.f54496e)) {
                        c0().J0(e52.f54557a, "_lair");
                    }
                    e(e52);
                    boolean a02 = c0().a0(c52);
                    if ("_sid".equals(a52.f54441b)) {
                        long u10 = n0().u(e52.f54580x);
                        Z1 C02 = c0().C0(e52.f54557a);
                        if (C02 != null) {
                            C02.E0(u10);
                            if (C02.B()) {
                                c0().Q(C02, false, false);
                            }
                        }
                    }
                    c0().W0();
                    if (!a02) {
                        zzj().B().c("Too many unique user properties are set. Ignoring user property", this.f55305l.y().g(c52.f54494c), c52.f54496e);
                        o0();
                        B5.U(this.f55293G, e52.f54557a, 9, (String) null, (String) null, 0);
                    }
                    c0().U0();
                } catch (Throwable th2) {
                    c0().U0();
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        zzj().B().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.V1.q(r6), r17.b());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:222:0x04d3 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0221 A[SYNTHETIC, Splitter:B:108:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x023d A[SYNTHETIC, Splitter:B:117:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026c A[SYNTHETIC, Splitter:B:129:0x026c] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03ae A[Catch:{ all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03af A[Catch:{ all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0430 A[Catch:{ all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0444 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u0() {
        /*
            r26 = this;
            r7 = r26
            com.google.android.gms.measurement.internal.z2 r0 = r26.zzl()
            r0.i()
            r26.q0()
            r0 = 1
            r7.f55315v = r0
            r8 = 0
            com.google.android.gms.measurement.internal.E2 r1 = r7.f55305l     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.k4 r1 = r1.E()     // Catch:{ all -> 0x02a3 }
            java.lang.Boolean r1 = r1.R()     // Catch:{ all -> 0x02a3 }
            if (r1 != 0) goto L_0x0033
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Upload data called on the client side before use of service was decided"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r7.f55315v = r8
            r26.J()
            return
        L_0x002f:
            r0 = move-exception
            r1 = r8
            goto L_0x0515
        L_0x0033:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x02a3 }
            if (r1 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r0 = r0.B()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Upload called in the client side when service should be used"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r7.f55315v = r8
            r26.J()
            return
        L_0x004c:
            long r1 = r7.f55308o     // Catch:{ all -> 0x02a3 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x005d
            r26.K()     // Catch:{ all -> 0x002f }
            r7.f55315v = r8
            r26.J()
            return
        L_0x005d:
            com.google.android.gms.measurement.internal.z2 r1 = r26.zzl()     // Catch:{ all -> 0x02a3 }
            r1.i()     // Catch:{ all -> 0x02a3 }
            java.util.List r1 = r7.f55318y     // Catch:{ all -> 0x02a3 }
            if (r1 == 0) goto L_0x007b
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r0 = r0.F()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Uploading requested multiple times"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r7.f55315v = r8
            r26.J()
            return
        L_0x007b:
            com.google.android.gms.measurement.internal.Y1 r1 = r26.g0()     // Catch:{ all -> 0x02a3 }
            boolean r1 = r1.v()     // Catch:{ all -> 0x02a3 }
            if (r1 != 0) goto L_0x009b
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r0 = r0.F()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "Network not connected, ignoring upload request"
            r0.a(r1)     // Catch:{ all -> 0x002f }
            r26.K()     // Catch:{ all -> 0x002f }
            r7.f55315v = r8
            r26.J()
            return
        L_0x009b:
            Ea.e r1 = r26.zzb()     // Catch:{ all -> 0x02a3 }
            long r1 = r1.currentTimeMillis()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.h r5 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r6 = com.google.android.gms.measurement.internal.F.f54621T     // Catch:{ all -> 0x02a3 }
            r9 = 0
            int r5 = r5.q(r9, r6)     // Catch:{ all -> 0x02a3 }
            r26.a0()     // Catch:{ all -> 0x02a3 }
            long r10 = com.google.android.gms.measurement.internal.C4618h.E()     // Catch:{ all -> 0x02a3 }
            long r10 = r1 - r10
            r6 = r8
        L_0x00b8:
            if (r6 >= r5) goto L_0x00c3
            boolean r12 = r7.I(r9, r10)     // Catch:{ all -> 0x002f }
            if (r12 == 0) goto L_0x00c3
            int r6 = r6 + 1
            goto L_0x00b8
        L_0x00c3:
            boolean r5 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x02a3 }
            if (r5 == 0) goto L_0x011d
            com.google.android.gms.measurement.internal.z2 r5 = r26.zzl()     // Catch:{ all -> 0x002f }
            r5.i()     // Catch:{ all -> 0x002f }
            java.util.Set r5 = r7.f55310q     // Catch:{ all -> 0x002f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x002f }
        L_0x00d6:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x002f }
            if (r6 == 0) goto L_0x0118
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x002f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x002f }
            boolean r10 = com.google.android.gms.internal.measurement.zzpg.zza()     // Catch:{ all -> 0x002f }
            if (r10 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.h r10 = r26.a0()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.M1 r11 = com.google.android.gms.measurement.internal.F.f54584A0     // Catch:{ all -> 0x002f }
            boolean r10 = r10.z(r6, r11)     // Catch:{ all -> 0x002f }
            if (r10 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.V1 r10 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r10 = r10.A()     // Catch:{ all -> 0x002f }
            java.lang.String r11 = "Notifying app that trigger URIs are available. App ID"
            r10.b(r11, r6)     // Catch:{ all -> 0x002f }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x002f }
            r10.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r11 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r10.setAction(r11)     // Catch:{ all -> 0x002f }
            r10.setPackage(r6)     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.E2 r6 = r7.f55305l     // Catch:{ all -> 0x002f }
            android.content.Context r6 = r6.zza()     // Catch:{ all -> 0x002f }
            r6.sendBroadcast(r10)     // Catch:{ all -> 0x002f }
            goto L_0x00d6
        L_0x0118:
            java.util.Set r5 = r7.f55310q     // Catch:{ all -> 0x002f }
            r5.clear()     // Catch:{ all -> 0x002f }
        L_0x011d:
            com.google.android.gms.measurement.internal.Q4 r5 = r7.f55302i     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.l2 r5 = r5.f54841g     // Catch:{ all -> 0x02a3 }
            long r5 = r5.a()     // Catch:{ all -> 0x02a3 }
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.measurement.internal.V1 r3 = r26.zzj()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.X1 r3 = r3.A()     // Catch:{ all -> 0x002f }
            java.lang.String r4 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x002f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x002f }
            r3.b(r4, r5)     // Catch:{ all -> 0x002f }
        L_0x0140:
            com.google.android.gms.measurement.internal.l r3 = r26.c0()     // Catch:{ all -> 0x02a3 }
            java.lang.String r6 = r3.x()     // Catch:{ all -> 0x02a3 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x02a3 }
            r4 = -1
            if (r3 != 0) goto L_0x04e9
            long r10 = r7.f55287A     // Catch:{ all -> 0x02a3 }
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0160
            com.google.android.gms.measurement.internal.l r3 = r26.c0()     // Catch:{ all -> 0x002f }
            long r3 = r3.t()     // Catch:{ all -> 0x002f }
            r7.f55287A = r3     // Catch:{ all -> 0x002f }
        L_0x0160:
            com.google.android.gms.measurement.internal.h r3 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r4 = com.google.android.gms.measurement.internal.F.f54649h     // Catch:{ all -> 0x02a3 }
            int r3 = r3.q(r6, r4)     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.h r4 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r5 = com.google.android.gms.measurement.internal.F.f54651i     // Catch:{ all -> 0x02a3 }
            int r4 = r4.q(r6, r5)     // Catch:{ all -> 0x02a3 }
            int r4 = java.lang.Math.max(r8, r4)     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.l r5 = r26.c0()     // Catch:{ all -> 0x02a3 }
            java.util.List r3 = r5.L(r6, r3, r4)     // Catch:{ all -> 0x02a3 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x02a3 }
            if (r4 != 0) goto L_0x04d1
            com.google.android.gms.measurement.internal.h3 r4 = r7.N(r6)     // Catch:{ all -> 0x02a3 }
            boolean r4 = r4.A()     // Catch:{ all -> 0x02a3 }
            if (r4 == 0) goto L_0x01e3
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x002f }
        L_0x0194:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x01b3
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x002f }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x002f }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.measurement.zzfn$zzk r5 = (com.google.android.gms.internal.measurement.zzfn.zzk) r5     // Catch:{ all -> 0x002f }
            java.lang.String r10 = r5.zzan()     // Catch:{ all -> 0x002f }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x002f }
            if (r10 != 0) goto L_0x0194
            java.lang.String r4 = r5.zzan()     // Catch:{ all -> 0x002f }
            goto L_0x01b4
        L_0x01b3:
            r4 = r9
        L_0x01b4:
            if (r4 == 0) goto L_0x01e3
            r5 = r8
        L_0x01b7:
            int r10 = r3.size()     // Catch:{ all -> 0x002f }
            if (r5 >= r10) goto L_0x01e3
            java.lang.Object r10 = r3.get(r5)     // Catch:{ all -> 0x002f }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x002f }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.measurement.zzfn$zzk r10 = (com.google.android.gms.internal.measurement.zzfn.zzk) r10     // Catch:{ all -> 0x002f }
            java.lang.String r11 = r10.zzan()     // Catch:{ all -> 0x002f }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x002f }
            if (r11 != 0) goto L_0x01e0
            java.lang.String r10 = r10.zzan()     // Catch:{ all -> 0x002f }
            boolean r10 = r10.equals(r4)     // Catch:{ all -> 0x002f }
            if (r10 != 0) goto L_0x01e0
            java.util.List r3 = r3.subList(r8, r5)     // Catch:{ all -> 0x002f }
            goto L_0x01e3
        L_0x01e0:
            int r5 = r5 + 1
            goto L_0x01b7
        L_0x01e3:
            com.google.android.gms.internal.measurement.zzfn$zzj$zzb r4 = com.google.android.gms.internal.measurement.zzfn.zzj.zzb()     // Catch:{ all -> 0x02a3 }
            int r5 = r3.size()     // Catch:{ all -> 0x02a3 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02a3 }
            int r11 = r3.size()     // Catch:{ all -> 0x02a3 }
            r10.<init>(r11)     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.h r11 = r26.a0()     // Catch:{ all -> 0x02a3 }
            boolean r11 = r11.H(r6)     // Catch:{ all -> 0x02a3 }
            if (r11 == 0) goto L_0x020a
            com.google.android.gms.measurement.internal.h3 r11 = r7.N(r6)     // Catch:{ all -> 0x002f }
            boolean r11 = r11.A()     // Catch:{ all -> 0x002f }
            if (r11 == 0) goto L_0x020a
            r11 = r0
            goto L_0x020b
        L_0x020a:
            r11 = r8
        L_0x020b:
            com.google.android.gms.measurement.internal.h3 r12 = r7.N(r6)     // Catch:{ all -> 0x02a3 }
            boolean r12 = r12.A()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.h3 r13 = r7.N(r6)     // Catch:{ all -> 0x02a3 }
            boolean r13 = r13.B()     // Catch:{ all -> 0x02a3 }
            boolean r14 = com.google.android.gms.internal.measurement.zzph.zza()     // Catch:{ all -> 0x02a3 }
            if (r14 == 0) goto L_0x022f
            com.google.android.gms.measurement.internal.h r14 = r26.a0()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.M1 r15 = com.google.android.gms.measurement.internal.F.f54672s0     // Catch:{ all -> 0x002f }
            boolean r14 = r14.z(r6, r15)     // Catch:{ all -> 0x002f }
            if (r14 == 0) goto L_0x022f
            r14 = r0
            goto L_0x0230
        L_0x022f:
            r14 = r8
        L_0x0230:
            com.google.android.gms.measurement.internal.o5 r15 = r7.f55303j     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.m5 r17 = r15.p(r6)     // Catch:{ all -> 0x02a3 }
            boolean r15 = com.google.android.gms.internal.measurement.zzpn.zza()     // Catch:{ all -> 0x02a3 }
            r9 = 3
            if (r15 == 0) goto L_0x0269
            com.google.android.gms.measurement.internal.h r15 = r26.a0()     // Catch:{ all -> 0x002f }
            com.google.android.gms.measurement.internal.M1 r0 = com.google.android.gms.measurement.internal.F.f54674t0     // Catch:{ all -> 0x002f }
            boolean r0 = r15.o(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0269
            r26.o0()     // Catch:{ all -> 0x002f }
            boolean r0 = com.google.android.gms.measurement.internal.B5.C0(r6)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0269
            com.google.android.gms.measurement.internal.q2 r0 = r26.i0()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r0.M(r6)     // Catch:{ all -> 0x002f }
            int r15 = r17.a()     // Catch:{ all -> 0x002f }
            if (r15 != r9) goto L_0x0269
            boolean r15 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x002f }
            if (r15 != 0) goto L_0x0269
            r4.zza((java.lang.String) r0)     // Catch:{ all -> 0x002f }
        L_0x0269:
            r0 = r8
        L_0x026a:
            if (r0 >= r5) goto L_0x0418
            java.lang.Object r15 = r3.get(r0)     // Catch:{ all -> 0x02a3 }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x02a3 }
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzk r15 = (com.google.android.gms.internal.measurement.zzfn.zzk) r15     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzjk$zzb r15 = r15.zzcc()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r15 = (com.google.android.gms.internal.measurement.zzfn.zzk.zza) r15     // Catch:{ all -> 0x02a3 }
            java.lang.Object r18 = r3.get(r0)     // Catch:{ all -> 0x02a3 }
            r9 = r18
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x02a3 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x02a3 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x02a3 }
            r10.add(r9)     // Catch:{ all -> 0x02a3 }
            r26.a0()     // Catch:{ all -> 0x02a3 }
            r8 = 97001(0x17ae9, double:4.7925E-319)
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r8 = r15.zzl((long) r8)     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzk$zza r8 = r8.zzk((long) r1)     // Catch:{ all -> 0x02a3 }
            r9 = 0
            r8.zzd((boolean) r9)     // Catch:{ all -> 0x02a3 }
            if (r11 != 0) goto L_0x02a7
            r15.zzk()     // Catch:{ all -> 0x02a3 }
            goto L_0x02a7
        L_0x02a3:
            r0 = move-exception
            r1 = 0
            goto L_0x0515
        L_0x02a7:
            if (r12 != 0) goto L_0x02af
            r15.zzq()     // Catch:{ all -> 0x02a3 }
            r15.zzn()     // Catch:{ all -> 0x02a3 }
        L_0x02af:
            if (r13 != 0) goto L_0x02b4
            r15.zzh()     // Catch:{ all -> 0x02a3 }
        L_0x02b4:
            r7.y(r6, r15)     // Catch:{ all -> 0x02a3 }
            if (r14 != 0) goto L_0x02bc
            r15.zzr()     // Catch:{ all -> 0x02a3 }
        L_0x02bc:
            boolean r8 = com.google.android.gms.internal.measurement.zznk.zza()     // Catch:{ all -> 0x02a3 }
            if (r8 == 0) goto L_0x02d3
            com.google.android.gms.measurement.internal.h r8 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54630X0     // Catch:{ all -> 0x02a3 }
            boolean r8 = r8.o(r9)     // Catch:{ all -> 0x02a3 }
            if (r8 == 0) goto L_0x02d3
            if (r13 != 0) goto L_0x02d3
            r15.zzi()     // Catch:{ all -> 0x02a3 }
        L_0x02d3:
            boolean r8 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ all -> 0x02a3 }
            if (r8 == 0) goto L_0x03b1
            com.google.android.gms.measurement.internal.h r8 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r9 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ all -> 0x02a3 }
            boolean r8 = r8.o(r9)     // Catch:{ all -> 0x02a3 }
            if (r8 == 0) goto L_0x03b1
            java.lang.String r8 = r15.zzz()     // Catch:{ all -> 0x02a3 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x02a3 }
            if (r9 != 0) goto L_0x0304
            java.lang.String r9 = "00000000-0000-0000-0000-000000000000"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x02a3 }
            if (r8 == 0) goto L_0x02f8
            goto L_0x0304
        L_0x02f8:
            r21 = r3
            r22 = r11
            r24 = r12
            r23 = r13
            r25 = r14
            goto L_0x03a8
        L_0x0304:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02a3 }
            java.util.List r9 = r15.zzaa()     // Catch:{ all -> 0x02a3 }
            r8.<init>(r9)     // Catch:{ all -> 0x02a3 }
            java.util.Iterator r9 = r8.iterator()     // Catch:{ all -> 0x02a3 }
            r21 = r3
            r22 = r11
            r3 = 0
            r11 = 0
            r19 = 0
            r20 = 0
        L_0x031b:
            boolean r23 = r9.hasNext()     // Catch:{ all -> 0x02a3 }
            if (r23 == 0) goto L_0x0390
            java.lang.Object r23 = r9.next()     // Catch:{ all -> 0x02a3 }
            r24 = r12
            r12 = r23
            com.google.android.gms.internal.measurement.zzfn$zzf r12 = (com.google.android.gms.internal.measurement.zzfn.zzf) r12     // Catch:{ all -> 0x02a3 }
            r23 = r13
            java.lang.String r13 = "_fx"
            r25 = r14
            java.lang.String r14 = r12.zzg()     // Catch:{ all -> 0x02a3 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x02a3 }
            if (r13 == 0) goto L_0x0349
            r9.remove()     // Catch:{ all -> 0x02a3 }
            r13 = r23
            r12 = r24
            r14 = r25
            r19 = 1
            r20 = 1
            goto L_0x031b
        L_0x0349:
            java.lang.String r13 = "_f"
            java.lang.String r14 = r12.zzg()     // Catch:{ all -> 0x02a3 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x02a3 }
            if (r13 == 0) goto L_0x0389
            com.google.android.gms.measurement.internal.h r13 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r14 = com.google.android.gms.measurement.internal.F.f54622T0     // Catch:{ all -> 0x02a3 }
            boolean r13 = r13.o(r14)     // Catch:{ all -> 0x02a3 }
            if (r13 == 0) goto L_0x0387
            r26.n0()     // Catch:{ all -> 0x02a3 }
            java.lang.String r13 = "_pfo"
            com.google.android.gms.internal.measurement.zzfn$zzh r13 = com.google.android.gms.measurement.internal.x5.A(r12, r13)     // Catch:{ all -> 0x02a3 }
            if (r13 == 0) goto L_0x0374
            long r13 = r13.zzd()     // Catch:{ all -> 0x02a3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02a3 }
        L_0x0374:
            r26.n0()     // Catch:{ all -> 0x02a3 }
            java.lang.String r13 = "_uwa"
            com.google.android.gms.internal.measurement.zzfn$zzh r12 = com.google.android.gms.measurement.internal.x5.A(r12, r13)     // Catch:{ all -> 0x02a3 }
            if (r12 == 0) goto L_0x0387
            long r12 = r12.zzd()     // Catch:{ all -> 0x02a3 }
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02a3 }
        L_0x0387:
            r20 = 1
        L_0x0389:
            r13 = r23
            r12 = r24
            r14 = r25
            goto L_0x031b
        L_0x0390:
            r24 = r12
            r23 = r13
            r25 = r14
            if (r19 == 0) goto L_0x039e
            r15.zzl()     // Catch:{ all -> 0x02a3 }
            r15.zzb((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzfn.zzf>) r8)     // Catch:{ all -> 0x02a3 }
        L_0x039e:
            if (r20 == 0) goto L_0x03a8
            java.lang.String r8 = r15.zzt()     // Catch:{ all -> 0x02a3 }
            r9 = 1
            r7.C(r8, r9, r11, r3)     // Catch:{ all -> 0x02a3 }
        L_0x03a8:
            int r3 = r15.zzc()     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x03af
            goto L_0x03bb
        L_0x03af:
            r8 = 3
            goto L_0x0408
        L_0x03b1:
            r21 = r3
            r22 = r11
            r24 = r12
            r23 = r13
            r25 = r14
        L_0x03bb:
            com.google.android.gms.measurement.internal.h r3 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r8 = com.google.android.gms.measurement.internal.F.f54652i0     // Catch:{ all -> 0x02a3 }
            boolean r3 = r3.z(r6, r8)     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x03de
            com.google.android.gms.internal.measurement.zzkt r3 = r15.zzai()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzjk r3 = (com.google.android.gms.internal.measurement.zzjk) r3     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzk r3 = (com.google.android.gms.internal.measurement.zzfn.zzk) r3     // Catch:{ all -> 0x02a3 }
            byte[] r3 = r3.zzbz()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.x5 r8 = r26.n0()     // Catch:{ all -> 0x02a3 }
            long r8 = r8.v(r3)     // Catch:{ all -> 0x02a3 }
            r15.zza((long) r8)     // Catch:{ all -> 0x02a3 }
        L_0x03de:
            boolean r3 = com.google.android.gms.internal.measurement.zzpn.zza()     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x0404
            com.google.android.gms.measurement.internal.h r3 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r8 = com.google.android.gms.measurement.internal.F.f54674t0     // Catch:{ all -> 0x02a3 }
            boolean r3 = r3.o(r8)     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x0404
            r26.o0()     // Catch:{ all -> 0x02a3 }
            boolean r3 = com.google.android.gms.measurement.internal.B5.C0(r6)     // Catch:{ all -> 0x02a3 }
            if (r3 == 0) goto L_0x0404
            int r3 = r17.a()     // Catch:{ all -> 0x02a3 }
            r8 = 3
            if (r3 != r8) goto L_0x0405
            r15.zzk()     // Catch:{ all -> 0x02a3 }
            goto L_0x0405
        L_0x0404:
            r8 = 3
        L_0x0405:
            r4.zza((com.google.android.gms.internal.measurement.zzfn.zzk.zza) r15)     // Catch:{ all -> 0x02a3 }
        L_0x0408:
            int r0 = r0 + 1
            r9 = r8
            r3 = r21
            r11 = r22
            r13 = r23
            r12 = r24
            r14 = r25
            r8 = 0
            goto L_0x026a
        L_0x0418:
            boolean r0 = com.google.android.gms.internal.measurement.zznl.zza()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0444
            com.google.android.gms.measurement.internal.h r0 = r26.a0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.M1 r3 = com.google.android.gms.measurement.internal.F.f54606L0     // Catch:{ all -> 0x02a3 }
            boolean r0 = r0.o(r3)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0444
            int r0 = r4.zza()     // Catch:{ all -> 0x02a3 }
            if (r0 != 0) goto L_0x0444
            r7.D(r10)     // Catch:{ all -> 0x02a3 }
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 204(0xcc, float:2.86E-43)
            r1 = r26
            r1.F(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x02a3 }
            r1 = 0
            r7.f55315v = r1
            r26.J()
            return
        L_0x0444:
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x02a3 }
            r3 = 2
            boolean r0 = r0.x(r3)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x0460
            com.google.android.gms.measurement.internal.x5 r0 = r26.n0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzkt r3 = r4.zzai()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzjk r3 = (com.google.android.gms.internal.measurement.zzjk) r3     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzj r3 = (com.google.android.gms.internal.measurement.zzfn.zzj) r3     // Catch:{ all -> 0x02a3 }
            java.lang.String r9 = r0.H(r3)     // Catch:{ all -> 0x02a3 }
            goto L_0x0461
        L_0x0460:
            r9 = 0
        L_0x0461:
            r26.n0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzkt r0 = r4.zzai()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzjk r0 = (com.google.android.gms.internal.measurement.zzjk) r0     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.internal.measurement.zzfn$zzj r0 = (com.google.android.gms.internal.measurement.zzfn.zzj) r0     // Catch:{ all -> 0x02a3 }
            byte[] r14 = r0.zzbz()     // Catch:{ all -> 0x02a3 }
            r7.D(r10)     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.Q4 r0 = r7.f55302i     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.l2 r0 = r0.f54842h     // Catch:{ MalformedURLException -> 0x04d3 }
            r0.b(r1)     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r0 = "?"
            if (r5 <= 0) goto L_0x0487
            r1 = 0
            com.google.android.gms.internal.measurement.zzfn$zzk r0 = r4.zza((int) r1)     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r0 = r0.zzz()     // Catch:{ MalformedURLException -> 0x04d3 }
        L_0x0487:
            com.google.android.gms.measurement.internal.V1 r1 = r26.zzj()     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r2 = "Uploading data. app, uncompressed size, data"
            int r3 = r14.length     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ MalformedURLException -> 0x04d3 }
            r1.d(r2, r0, r3, r9)     // Catch:{ MalformedURLException -> 0x04d3 }
            r0 = 1
            r7.f55314u = r0     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.Y1 r11 = r26.g0()     // Catch:{ MalformedURLException -> 0x04d3 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r0 = r17.b()     // Catch:{ MalformedURLException -> 0x04d3 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x04d3 }
            java.util.Map r15 = r17.c()     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.s5 r0 = new com.google.android.gms.measurement.internal.s5     // Catch:{ MalformedURLException -> 0x04d3 }
            r0.<init>(r7, r6)     // Catch:{ MalformedURLException -> 0x04d3 }
            r11.i()     // Catch:{ MalformedURLException -> 0x04d3 }
            r11.p()     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.common.internal.C4536s.l(r13)     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.common.internal.C4536s.l(r14)     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.common.internal.C4536s.l(r0)     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.z2 r1 = r11.zzl()     // Catch:{ MalformedURLException -> 0x04d3 }
            com.google.android.gms.measurement.internal.d2 r2 = new com.google.android.gms.measurement.internal.d2     // Catch:{ MalformedURLException -> 0x04d3 }
            r10 = r2
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04d3 }
            r1.u(r2)     // Catch:{ MalformedURLException -> 0x04d3 }
        L_0x04d1:
            r1 = 0
            goto L_0x050f
        L_0x04d3:
            com.google.android.gms.measurement.internal.V1 r0 = r26.zzj()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.X1 r0 = r0.B()     // Catch:{ all -> 0x02a3 }
            java.lang.String r1 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.V1.q(r6)     // Catch:{ all -> 0x02a3 }
            java.lang.String r3 = r17.b()     // Catch:{ all -> 0x02a3 }
            r0.c(r1, r2, r3)     // Catch:{ all -> 0x02a3 }
            goto L_0x04d1
        L_0x04e9:
            r7.f55287A = r4     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.l r0 = r26.c0()     // Catch:{ all -> 0x02a3 }
            r26.a0()     // Catch:{ all -> 0x02a3 }
            long r3 = com.google.android.gms.measurement.internal.C4618h.E()     // Catch:{ all -> 0x02a3 }
            long r1 = r1 - r3
            java.lang.String r0 = r0.J(r1)     // Catch:{ all -> 0x02a3 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a3 }
            if (r1 != 0) goto L_0x04d1
            com.google.android.gms.measurement.internal.l r1 = r26.c0()     // Catch:{ all -> 0x02a3 }
            com.google.android.gms.measurement.internal.Z1 r0 = r1.C0(r0)     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x04d1
            r7.S(r0)     // Catch:{ all -> 0x02a3 }
            goto L_0x04d1
        L_0x050f:
            r7.f55315v = r1
            r26.J()
            return
        L_0x0515:
            r7.f55315v = r1
            r26.J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.u0():void");
    }

    /* access modifiers changed from: package-private */
    public final void v(Runnable runnable) {
        zzl().i();
        if (this.f55309p == null) {
            this.f55309p = new ArrayList();
        }
        this.f55309p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0146 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0154 A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017a A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e A[Catch:{ all -> 0x005d, all -> 0x0013 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.z2 r0 = r6.zzl()
            r0.i()
            r6.q0()
            com.google.android.gms.common.internal.C4536s.f(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0016
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r7 = move-exception
            goto L_0x019d
        L_0x0016:
            com.google.android.gms.measurement.internal.V1 r1 = r6.zzj()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0013 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0013 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.l r1 = r6.c0()     // Catch:{ all -> 0x0013 }
            r1.S0()     // Catch:{ all -> 0x0013 }
            com.google.android.gms.measurement.internal.l r1 = r6.c0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.Z1 r1 = r1.C0(r7)     // Catch:{ all -> 0x005d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0043
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0043
            if (r8 != r3) goto L_0x0047
        L_0x0043:
            if (r9 != 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = r0
        L_0x0048:
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.V1 r8 = r6.zzj()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.X1 r8 = r8.G()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.V1.q(r7)     // Catch:{ all -> 0x005d }
            r8.b(r9, r7)     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x005d:
            r7 = move-exception
            goto L_0x0195
        L_0x0060:
            r4 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00bc
            if (r8 != r4) goto L_0x0067
            goto L_0x00bc
        L_0x0067:
            Ea.e r10 = r6.zzb()     // Catch:{ all -> 0x005d }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x005d }
            r1.s0(r10)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.l r10 = r6.c0()     // Catch:{ all -> 0x005d }
            r10.Q(r1, r0, r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.V1 r10 = r6.zzj()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.X1 r10 = r10.F()     // Catch:{ all -> 0x005d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005d }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.q2 r9 = r6.i0()     // Catch:{ all -> 0x005d }
            r9.P(r7)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.Q4 r7 = r6.f55302i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.l2 r7 = r7.f54842h     // Catch:{ all -> 0x005d }
            Ea.e r9 = r6.zzb()     // Catch:{ all -> 0x005d }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x005d }
            r7.b(r9)     // Catch:{ all -> 0x005d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a8
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b7
        L_0x00a8:
            com.google.android.gms.measurement.internal.Q4 r7 = r6.f55302i     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.l2 r7 = r7.f54840f     // Catch:{ all -> 0x005d }
            Ea.e r8 = r6.zzb()     // Catch:{ all -> 0x005d }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x005d }
            r7.b(r8)     // Catch:{ all -> 0x005d }
        L_0x00b7:
            r6.K()     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x00bc:
            r9 = 0
            if (r11 == 0) goto L_0x00c8
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x005d }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x005d }
            goto L_0x00c9
        L_0x00c8:
            r2 = r9
        L_0x00c9:
            if (r2 == 0) goto L_0x00d8
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x00d8
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x005d }
            goto L_0x00d9
        L_0x00d8:
            r2 = r9
        L_0x00d9:
            if (r11 == 0) goto L_0x00e4
            java.lang.String r5 = "ETag"
            java.lang.Object r11 = r11.get(r5)     // Catch:{ all -> 0x005d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x005d }
            goto L_0x00e5
        L_0x00e4:
            r11 = r9
        L_0x00e5:
            if (r11 == 0) goto L_0x00f4
            boolean r5 = r11.isEmpty()     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x00f4
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x005d }
            goto L_0x00f5
        L_0x00f4:
            r11 = r9
        L_0x00f5:
            if (r8 == r4) goto L_0x0111
            if (r8 != r3) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            com.google.android.gms.measurement.internal.q2 r9 = r6.i0()     // Catch:{ all -> 0x005d }
            boolean r9 = r9.C(r7, r10, r2, r11)     // Catch:{ all -> 0x005d }
            if (r9 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x0013 }
            r7.U0()     // Catch:{ all -> 0x0013 }
            r6.f55313t = r0
            r6.J()
            return
        L_0x0111:
            com.google.android.gms.measurement.internal.q2 r11 = r6.i0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.measurement.zzfi$zzd r11 = r11.G(r7)     // Catch:{ all -> 0x005d }
            if (r11 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.q2 r11 = r6.i0()     // Catch:{ all -> 0x005d }
            boolean r9 = r11.C(r7, r9, r9, r9)     // Catch:{ all -> 0x005d }
            if (r9 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x0013 }
            r7.U0()     // Catch:{ all -> 0x0013 }
            r6.f55313t = r0
            r6.J()
            return
        L_0x0132:
            Ea.e r9 = r6.zzb()     // Catch:{ all -> 0x005d }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x005d }
            r1.R(r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.l r9 = r6.c0()     // Catch:{ all -> 0x005d }
            r9.Q(r1, r0, r0)     // Catch:{ all -> 0x005d }
            if (r8 != r4) goto L_0x0154
            com.google.android.gms.measurement.internal.V1 r8 = r6.zzj()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.X1 r8 = r8.H()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x005d }
            goto L_0x016a
        L_0x0154:
            com.google.android.gms.measurement.internal.V1 r7 = r6.zzj()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.X1 r7 = r7.F()     // Catch:{ all -> 0x005d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005d }
            int r10 = r10.length     // Catch:{ all -> 0x005d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x005d }
            r7.c(r9, r8, r10)     // Catch:{ all -> 0x005d }
        L_0x016a:
            com.google.android.gms.measurement.internal.Y1 r7 = r6.g0()     // Catch:{ all -> 0x005d }
            boolean r7 = r7.v()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x017e
            boolean r7 = r6.L()     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x017e
            r6.u0()     // Catch:{ all -> 0x005d }
            goto L_0x0181
        L_0x017e:
            r6.K()     // Catch:{ all -> 0x005d }
        L_0x0181:
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x005d }
            r7.W0()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.l r7 = r6.c0()     // Catch:{ all -> 0x0013 }
            r7.U0()     // Catch:{ all -> 0x0013 }
            r6.f55313t = r0
            r6.J()
            return
        L_0x0195:
            com.google.android.gms.measurement.internal.l r8 = r6.c0()     // Catch:{ all -> 0x0013 }
            r8.U0()     // Catch:{ all -> 0x0013 }
            throw r7     // Catch:{ all -> 0x0013 }
        L_0x019d:
            r6.f55313t = r0
            r6.J()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q5.w(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void y(String str, zzfn.zzk.zza zza) {
        int t10;
        int indexOf;
        Set N10 = i0().N(str);
        if (N10 != null) {
            zza.zzd((Iterable<String>) N10);
        }
        if (i0().X(str)) {
            zza.zzj();
        }
        if (i0().a0(str)) {
            String zzy = zza.zzy();
            if (!TextUtils.isEmpty(zzy) && (indexOf = zzy.indexOf(".")) != -1) {
                zza.zzo(zzy.substring(0, indexOf));
            }
        }
        if (i0().b0(str) && (t10 = x5.t(zza, "_id")) != -1) {
            zza.zzc(t10);
        }
        if (i0().Z(str)) {
            zza.zzk();
        }
        if (i0().W(str)) {
            zza.zzh();
            if (!zznk.zza() || !a0().o(F.f54628W0) || N(str).B()) {
                b bVar = (b) this.f55290D.get(str);
                if (bVar == null || bVar.f55326b + a0().u(str, F.f54625V) < zzb().a()) {
                    bVar = new b();
                    this.f55290D.put(str, bVar);
                }
                zza.zzk(bVar.f55325a);
            }
        }
        if (i0().Y(str)) {
            zza.zzr();
        }
    }

    public final Context zza() {
        return this.f55305l.zza();
    }

    public final e zzb() {
        return ((E2) C4536s.l(this.f55305l)).zzb();
    }

    public final C4583c zzd() {
        return this.f55305l.zzd();
    }

    public final V1 zzj() {
        return ((E2) C4536s.l(this.f55305l)).zzj();
    }

    public final C4734z2 zzl() {
        return ((E2) C4536s.l(this.f55305l)).zzl();
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        final String f55325a;

        /* renamed from: b  reason: collision with root package name */
        long f55326b;

        private b(q5 q5Var) {
            this(q5Var, q5Var.o0().P0());
        }

        private b(q5 q5Var, String str) {
            this.f55325a = str;
            this.f55326b = q5Var.zzb().a();
        }
    }

    private q5(y5 y5Var, E2 e22) {
        this.f55306m = false;
        this.f55310q = new HashSet();
        this.f55293G = new t5(this);
        C4536s.l(y5Var);
        this.f55305l = E2.a(y5Var.f55419a, (zzdo) null, (Long) null);
        this.f55287A = -1;
        this.f55303j = new o5(this);
        x5 x5Var = new x5(this);
        x5Var.q();
        this.f55300g = x5Var;
        Y1 y12 = new Y1(this);
        y12.q();
        this.f55295b = y12;
        C4681q2 q2Var = new C4681q2(this);
        q2Var.q();
        this.f55294a = q2Var;
        this.f55288B = new HashMap();
        this.f55289C = new HashMap();
        this.f55290D = new HashMap();
        zzl().y(new p5(this, y5Var));
    }
}
