package com.google.android.gms.measurement.internal;

import Ea.e;
import Pa.q;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzks;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.internal.C4622h3;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class x5 extends C4645k5 {
    x5(q5 q5Var) {
        super(q5Var);
    }

    static zzfn.zzh A(zzfn.zzf zzf, String str) {
        for (zzfn.zzh next : zzf.zzh()) {
            if (next.zzg().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static zzks B(zzks zzks, byte[] bArr) {
        zzix zza = zzix.zza();
        if (zza != null) {
            return zzks.zza(bArr, zza);
        }
        return zzks.zza(bArr);
    }

    static Object E(zzfn.zzf zzf, String str, Object obj) {
        Object b02 = b0(zzf, str);
        if (b02 == null) {
            return obj;
        }
        return b02;
    }

    private static String I(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    static List J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void M(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void N(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String split : strArr) {
            String[] split2 = split.split(f.f37529a);
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                M(builder, str2, string, set);
            }
        }
    }

    static void O(zzfn.zzf.zza zza, String str, Object obj) {
        List<zzfn.zzh> zzf = zza.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfn.zzh.zza zza2 = zzfn.zzh.zze().zza(str);
        if (obj instanceof Long) {
            zza2.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza2.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza2.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zza.zza(i10, zza2);
        } else {
            zza.zza(zza2);
        }
    }

    private static void S(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void T(StringBuilder sb2, int i10, zzff.zzc zzc) {
        if (zzc != null) {
            S(sb2, i10);
            sb2.append("filter {\n");
            if (zzc.zzg()) {
                W(sb2, i10, "complement", Boolean.valueOf(zzc.zzf()));
            }
            if (zzc.zzi()) {
                W(sb2, i10, "param_name", d().f(zzc.zze()));
            }
            if (zzc.zzj()) {
                int i11 = i10 + 1;
                zzff.zzf zzd = zzc.zzd();
                if (zzd != null) {
                    S(sb2, i11);
                    sb2.append("string_filter");
                    sb2.append(" {\n");
                    if (zzd.zzj()) {
                        W(sb2, i11, "match_type", zzd.zzb().name());
                    }
                    if (zzd.zzi()) {
                        W(sb2, i11, "expression", zzd.zze());
                    }
                    if (zzd.zzh()) {
                        W(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                    }
                    if (zzd.zza() > 0) {
                        S(sb2, i10 + 2);
                        sb2.append("expression_list {\n");
                        for (String append : zzd.zzf()) {
                            S(sb2, i10 + 3);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    S(sb2, i11);
                    sb2.append("}\n");
                }
            }
            if (zzc.zzh()) {
                U(sb2, i10 + 1, "number_filter", zzc.zzc());
            }
            S(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void U(StringBuilder sb2, int i10, String str, zzff.zzd zzd) {
        if (zzd != null) {
            S(sb2, i10);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzd.zzh()) {
                W(sb2, i10, "comparison_type", zzd.zza().name());
            }
            if (zzd.zzj()) {
                W(sb2, i10, "match_as_float", Boolean.valueOf(zzd.zzg()));
            }
            if (zzd.zzi()) {
                W(sb2, i10, "comparison_value", zzd.zzd());
            }
            if (zzd.zzl()) {
                W(sb2, i10, "min_comparison_value", zzd.zzf());
            }
            if (zzd.zzk()) {
                W(sb2, i10, "max_comparison_value", zzd.zze());
            }
            S(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void V(StringBuilder sb2, int i10, String str, zzfn.zzm zzm) {
        Integer num;
        Integer num2;
        Long l10;
        if (zzm != null) {
            S(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzm.zzb() != 0) {
                S(sb2, 4);
                sb2.append("results: ");
                int i11 = 0;
                for (Long next : zzm.zzi()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (zzm.zzd() != 0) {
                S(sb2, 4);
                sb2.append("status: ");
                int i13 = 0;
                for (Long next2 : zzm.zzk()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next2);
                    i13 = i14;
                }
                sb2.append(10);
            }
            if (zzm.zza() != 0) {
                S(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (zzfn.zze next3 : zzm.zzh()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    if (next3.zzf()) {
                        num2 = Integer.valueOf(next3.zza());
                    } else {
                        num2 = null;
                    }
                    sb2.append(num2);
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    if (next3.zze()) {
                        l10 = Long.valueOf(next3.zzb());
                    } else {
                        l10 = null;
                    }
                    sb2.append(l10);
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            if (zzm.zzc() != 0) {
                S(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (zzfn.zzn next4 : zzm.zzj()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    if (next4.zzf()) {
                        num = Integer.valueOf(next4.zzb());
                    } else {
                        num = null;
                    }
                    sb2.append(num);
                    sb2.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.zze()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i19 = i20;
                    }
                    sb2.append("]");
                    i17 = i18;
                }
                sb2.append("}\n");
            }
            S(sb2, 3);
            sb2.append("}\n");
        }
    }

    private static void W(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj != null) {
            S(sb2, i10 + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    private final void X(StringBuilder sb2, int i10, List list) {
        String str;
        String str2;
        Long l10;
        if (list != null) {
            int i11 = i10 + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfn.zzh zzh = (zzfn.zzh) it.next();
                if (zzh != null) {
                    S(sb2, i11);
                    sb2.append("param {\n");
                    Double d10 = null;
                    if (zzh.zzm()) {
                        str = d().f(zzh.zzg());
                    } else {
                        str = null;
                    }
                    W(sb2, i11, "name", str);
                    if (zzh.zzn()) {
                        str2 = zzh.zzh();
                    } else {
                        str2 = null;
                    }
                    W(sb2, i11, "string_value", str2);
                    if (zzh.zzl()) {
                        l10 = Long.valueOf(zzh.zzd());
                    } else {
                        l10 = null;
                    }
                    W(sb2, i11, "int_value", l10);
                    if (zzh.zzj()) {
                        d10 = Double.valueOf(zzh.zza());
                    }
                    W(sb2, i11, "double_value", d10);
                    if (zzh.zzc() > 0) {
                        X(sb2, i11, zzh.zzi());
                    }
                    S(sb2, i11);
                    sb2.append("}\n");
                }
            }
        }
    }

    static boolean Z(D d10, E5 e52) {
        C4536s.l(d10);
        C4536s.l(e52);
        if (!TextUtils.isEmpty(e52.f54558b) || !TextUtils.isEmpty(e52.f54573q)) {
            return true;
        }
        return false;
    }

    static boolean a0(List list, int i10) {
        if (i10 >= (list.size() << 6)) {
            return false;
        }
        if (((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    static Object b0(zzfn.zzf zzf, String str) {
        zzfn.zzh A10 = A(zzf, str);
        if (A10 == null) {
            return null;
        }
        if (A10.zzn()) {
            return A10.zzh();
        }
        if (A10.zzl()) {
            return Long.valueOf(A10.zzd());
        }
        if (A10.zzj()) {
            return Double.valueOf(A10.zza());
        }
        if (A10.zzc() <= 0) {
            return null;
        }
        List<zzfn.zzh> zzi = A10.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfn.zzh next : zzi) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzfn.zzh next2 : next.zzi()) {
                    if (next2.zzn()) {
                        bundle.putString(next2.zzg(), next2.zzh());
                    } else if (next2.zzl()) {
                        bundle.putLong(next2.zzg(), next2.zzd());
                    } else if (next2.zzj()) {
                        bundle.putDouble(next2.zzg(), next2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean c0(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    static int t(zzfn.zzk.zza zza, String str) {
        if (zza == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zza.zzd(); i10++) {
            if (str.equals(zza.zzk(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle w(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfn.zzh zzh = (zzfn.zzh) it.next();
            String zzg = zzh.zzg();
            if (zzh.zzj()) {
                bundle.putDouble(zzg, zzh.zza());
            } else if (zzh.zzk()) {
                bundle.putFloat(zzg, zzh.zzb());
            } else if (zzh.zzn()) {
                bundle.putString(zzg, zzh.zzh());
            } else if (zzh.zzl()) {
                bundle.putLong(zzg, zzh.zzd());
            }
        }
        return bundle;
    }

    private final Bundle x(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(x((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final D C(zzad zzad) {
        String str;
        Object obj;
        Bundle x10 = x(zzad.zzc(), true);
        if (!x10.containsKey("_o") || (obj = x10.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String b10 = q.b(zzad.zzb());
        if (b10 == null) {
            b10 = zzad.zzb();
        }
        return new D(b10, new C(x10), str2, zzad.zza());
    }

    /* access modifiers changed from: package-private */
    public final C4624h5 D(String str, zzfn.zzk.zza zza, zzfn.zzf.zza zza2, String str2) {
        int indexOf;
        if (!zzpg.zza() || !a().z(str, F.f54584A0)) {
            return null;
        }
        long currentTimeMillis = zzb().currentTimeMillis();
        String[] split = a().x(str, F.f54646f0).split(f.f37529a);
        HashSet hashSet = new HashSet(split.length);
        int length = split.length;
        int i10 = 0;
        while (i10 < length) {
            String str3 = split[i10];
            Objects.requireNonNull(str3);
            if (hashSet.add(str3)) {
                i10++;
            } else {
                throw new IllegalArgumentException("duplicate element: " + str3);
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        o5 o10 = o();
        String M10 = o10.m().M(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(o10.a().x(str, F.f54631Y));
        if (!TextUtils.isEmpty(M10)) {
            builder.authority(M10 + "." + o10.a().x(str, F.f54633Z));
        } else {
            builder.authority(o10.a().x(str, F.f54633Z));
        }
        builder.path(o10.a().x(str, F.f54636a0));
        M(builder, "gmp_app_id", zza.zzx(), unmodifiableSet);
        M(builder, "gmp_version", "97001", unmodifiableSet);
        String zzu = zza.zzu();
        C4618h a10 = a();
        M1 m12 = F.f54590D0;
        if (a10.z(str, m12) && m().W(str)) {
            zzu = "";
        }
        M(builder, "app_instance_id", zzu, unmodifiableSet);
        M(builder, "rdid", zza.zzz(), unmodifiableSet);
        M(builder, "bundle_id", zza.zzt(), unmodifiableSet);
        String zze = zza2.zze();
        String a11 = q.a(zze);
        if (!TextUtils.isEmpty(a11)) {
            zze = a11;
        }
        M(builder, "app_event_name", zze, unmodifiableSet);
        M(builder, "app_version", String.valueOf(zza.zzb()), unmodifiableSet);
        String zzy = zza.zzy();
        if (a().z(str, m12) && m().a0(str) && !TextUtils.isEmpty(zzy) && (indexOf = zzy.indexOf(".")) != -1) {
            zzy = zzy.substring(0, indexOf);
        }
        M(builder, "os_version", zzy, unmodifiableSet);
        M(builder, DiagnosticsEntry.TIMESTAMP_KEY, String.valueOf(zza2.zzc()), unmodifiableSet);
        String str4 = "1";
        if (zza.zzad()) {
            M(builder, "lat", str4, unmodifiableSet);
        }
        M(builder, "privacy_sandbox_version", String.valueOf(zza.zza()), unmodifiableSet);
        M(builder, "trigger_uri_source", str4, unmodifiableSet);
        M(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        M(builder, "request_uuid", str2, unmodifiableSet);
        List<zzfn.zzh> zzf = zza2.zzf();
        Bundle bundle = new Bundle();
        for (zzfn.zzh next : zzf) {
            String zzg = next.zzg();
            if (next.zzj()) {
                bundle.putString(zzg, String.valueOf(next.zza()));
            } else if (next.zzk()) {
                bundle.putString(zzg, String.valueOf(next.zzb()));
            } else if (next.zzn()) {
                bundle.putString(zzg, next.zzh());
            } else if (next.zzl()) {
                bundle.putString(zzg, String.valueOf(next.zzd()));
            }
        }
        N(builder, a().x(str, F.f54644e0).split("\\|"), bundle, unmodifiableSet);
        List<zzfn.zzo> zzab = zza.zzab();
        Bundle bundle2 = new Bundle();
        for (zzfn.zzo next2 : zzab) {
            String zzg2 = next2.zzg();
            if (next2.zzi()) {
                bundle2.putString(zzg2, String.valueOf(next2.zza()));
            } else if (next2.zzj()) {
                bundle2.putString(zzg2, String.valueOf(next2.zzb()));
            } else if (next2.zzm()) {
                bundle2.putString(zzg2, next2.zzh());
            } else if (next2.zzk()) {
                bundle2.putString(zzg2, String.valueOf(next2.zzc()));
            }
        }
        N(builder, a().x(str, F.f54642d0).split("\\|"), bundle2, unmodifiableSet);
        if (!zza.zzac()) {
            str4 = "0";
        }
        M(builder, "dma", str4, unmodifiableSet);
        if (!zza.zzw().isEmpty()) {
            M(builder, "dma_cps", zza.zzw(), unmodifiableSet);
        }
        if (a().o(F.f54594F0) && zza.zzae()) {
            zzfn.zza zzg3 = zza.zzg();
            if (!zzg3.zzh().isEmpty()) {
                M(builder, "dl_gclid", zzg3.zzh(), unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                M(builder, "dl_gbraid", zzg3.zzg(), unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                M(builder, "dl_gs", zzg3.zzf(), unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                M(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                M(builder, "mr_gclid", zzg3.zzk(), unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                M(builder, "mr_gbraid", zzg3.zzj(), unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                M(builder, "mr_gs", zzg3.zzi(), unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                M(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), unmodifiableSet);
            }
        }
        return new C4624h5(builder.build().toString(), currentTimeMillis, 1);
    }

    /* access modifiers changed from: package-private */
    public final String F(zzff.zzb zzb) {
        if (zzb == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzb.zzl()) {
            W(sb2, 0, "filter_id", Integer.valueOf(zzb.zzb()));
        }
        W(sb2, 0, "event_name", d().c(zzb.zzf()));
        String I10 = I(zzb.zzh(), zzb.zzi(), zzb.zzj());
        if (!I10.isEmpty()) {
            W(sb2, 0, "filter_type", I10);
        }
        if (zzb.zzk()) {
            U(sb2, 1, "event_count_filter", zzb.zze());
        }
        if (zzb.zza() > 0) {
            sb2.append("  filters {\n");
            for (zzff.zzc T10 : zzb.zzg()) {
                T(sb2, 2, T10);
            }
        }
        S(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String G(zzff.zze zze) {
        if (zze == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zze.zzi()) {
            W(sb2, 0, "filter_id", Integer.valueOf(zze.zza()));
        }
        W(sb2, 0, "property_name", d().g(zze.zze()));
        String I10 = I(zze.zzf(), zze.zzg(), zze.zzh());
        if (!I10.isEmpty()) {
            W(sb2, 0, "filter_type", I10);
        }
        T(sb2, 1, zze.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String H(zzfn.zzj zzj) {
        Long l10;
        Long l11;
        zzfn.zzc zzv;
        if (zzj == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (zzpn.zza() && a().o(F.f54674t0) && zzj.zza() > 0) {
            f();
            if (B5.C0(zzj.zza(0).zzz()) && zzj.zzf()) {
                W(sb2, 0, "UploadSubdomain", zzj.zzd());
            }
        }
        for (zzfn.zzk next : zzj.zze()) {
            if (next != null) {
                S(sb2, 1);
                sb2.append("bundle {\n");
                if (next.zzbo()) {
                    W(sb2, 1, "protocol_version", Integer.valueOf(next.zzf()));
                }
                if (zzph.zza() && a().z(next.zzz(), F.f54672s0) && next.zzbr()) {
                    W(sb2, 1, "session_stitching_token", next.zzao());
                }
                W(sb2, 1, "platform", next.zzam());
                if (next.zzbj()) {
                    W(sb2, 1, "gmp_version", Long.valueOf(next.zzn()));
                }
                if (next.zzbw()) {
                    W(sb2, 1, "uploading_gmp_version", Long.valueOf(next.zzt()));
                }
                if (next.zzbh()) {
                    W(sb2, 1, "dynamite_version", Long.valueOf(next.zzl()));
                }
                if (next.zzbb()) {
                    W(sb2, 1, "config_version", Long.valueOf(next.zzj()));
                }
                W(sb2, 1, "gmp_app_id", next.zzaj());
                W(sb2, 1, "admob_app_id", next.zzy());
                W(sb2, 1, "app_id", next.zzz());
                W(sb2, 1, "app_version", next.zzac());
                if (next.zzay()) {
                    W(sb2, 1, "app_version_major", Integer.valueOf(next.zzb()));
                }
                W(sb2, 1, "firebase_instance_id", next.zzai());
                if (next.zzbg()) {
                    W(sb2, 1, "dev_cert_hash", Long.valueOf(next.zzk()));
                }
                W(sb2, 1, "app_store", next.zzab());
                if (next.zzbv()) {
                    W(sb2, 1, "upload_timestamp_millis", Long.valueOf(next.zzs()));
                }
                if (next.zzbs()) {
                    W(sb2, 1, "start_timestamp_millis", Long.valueOf(next.zzq()));
                }
                if (next.zzbi()) {
                    W(sb2, 1, "end_timestamp_millis", Long.valueOf(next.zzm()));
                }
                if (next.zzbn()) {
                    W(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.zzp()));
                }
                if (next.zzbm()) {
                    W(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.zzo()));
                }
                W(sb2, 1, "app_instance_id", next.zzaa());
                W(sb2, 1, "resettable_device_id", next.zzan());
                W(sb2, 1, "ds_id", next.zzah());
                if (next.zzbl()) {
                    W(sb2, 1, "limited_ad_tracking", Boolean.valueOf(next.zzav()));
                }
                W(sb2, 1, "os_version", next.zzal());
                W(sb2, 1, "device_model", next.zzag());
                W(sb2, 1, "user_default_language", next.zzap());
                if (next.zzbu()) {
                    W(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(next.zzh()));
                }
                if (next.zzba()) {
                    W(sb2, 1, "bundle_sequential_index", Integer.valueOf(next.zzc()));
                }
                if (zzpn.zza()) {
                    f();
                    if (B5.C0(next.zzz()) && a().o(F.f54674t0) && next.zzbf()) {
                        W(sb2, 1, "delivery_index", Integer.valueOf(next.zzd()));
                    }
                }
                if (next.zzbq()) {
                    W(sb2, 1, "service_upload", Boolean.valueOf(next.zzaw()));
                }
                W(sb2, 1, "health_monitor", next.zzak());
                if (next.zzbp()) {
                    W(sb2, 1, "retry_counter", Integer.valueOf(next.zzg()));
                }
                if (next.zzbd()) {
                    W(sb2, 1, "consent_signals", next.zzae());
                }
                if (next.zzbk()) {
                    W(sb2, 1, "is_dma_region", Boolean.valueOf(next.zzau()));
                }
                if (next.zzbe()) {
                    W(sb2, 1, "core_platform_services", next.zzaf());
                }
                if (next.zzbc()) {
                    W(sb2, 1, "consent_diagnostics", next.zzad());
                }
                if (next.zzbt()) {
                    W(sb2, 1, "target_os_version", Long.valueOf(next.zzr()));
                }
                if (zzpg.zza() && a().z(next.zzz(), F.f54584A0)) {
                    W(sb2, 1, "ad_services_version", Integer.valueOf(next.zza()));
                    if (next.zzaz() && (zzv = next.zzv()) != null) {
                        S(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        W(sb2, 2, "eligible", Boolean.valueOf(zzv.zzf()));
                        W(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzv.zzh()));
                        W(sb2, 2, "pre_r", Boolean.valueOf(zzv.zzi()));
                        W(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzv.zzj()));
                        W(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzv.zze()));
                        W(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzv.zzd()));
                        W(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzv.zzg()));
                        S(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (zzoj.zza() && a().o(F.f54610N0) && next.zzax()) {
                    W(sb2, 1, "ad_campaign_info", next.zzu());
                }
                List<zzfn.zzo> zzas = next.zzas();
                if (zzas != null) {
                    for (zzfn.zzo next2 : zzas) {
                        if (next2 != null) {
                            S(sb2, 2);
                            sb2.append("user_property {\n");
                            Double d10 = null;
                            if (next2.zzl()) {
                                l10 = Long.valueOf(next2.zzd());
                            } else {
                                l10 = null;
                            }
                            W(sb2, 2, "set_timestamp_millis", l10);
                            W(sb2, 2, "name", d().g(next2.zzg()));
                            W(sb2, 2, "string_value", next2.zzh());
                            if (next2.zzk()) {
                                l11 = Long.valueOf(next2.zzc());
                            } else {
                                l11 = null;
                            }
                            W(sb2, 2, "int_value", l11);
                            if (next2.zzi()) {
                                d10 = Double.valueOf(next2.zza());
                            }
                            W(sb2, 2, "double_value", d10);
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfn.zzd> zzaq = next.zzaq();
                next.zzz();
                if (zzaq != null) {
                    for (zzfn.zzd next3 : zzaq) {
                        if (next3 != null) {
                            S(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (next3.zzg()) {
                                W(sb2, 2, "audience_id", Integer.valueOf(next3.zza()));
                            }
                            if (next3.zzh()) {
                                W(sb2, 2, "new_audience", Boolean.valueOf(next3.zzf()));
                            }
                            V(sb2, 2, "current_data", next3.zzd());
                            if (next3.zzi()) {
                                V(sb2, 2, "previous_data", next3.zze());
                            }
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfn.zzf> zzar = next.zzar();
                if (zzar != null) {
                    for (zzfn.zzf next4 : zzar) {
                        if (next4 != null) {
                            S(sb2, 2);
                            sb2.append("event {\n");
                            W(sb2, 2, "name", d().c(next4.zzg()));
                            if (next4.zzk()) {
                                W(sb2, 2, "timestamp_millis", Long.valueOf(next4.zzd()));
                            }
                            if (next4.zzj()) {
                                W(sb2, 2, "previous_timestamp_millis", Long.valueOf(next4.zzc()));
                            }
                            if (next4.zzi()) {
                                W(sb2, 2, "count", Integer.valueOf(next4.zza()));
                            }
                            if (next4.zzb() != 0) {
                                X(sb2, 2, next4.zzh());
                            }
                            S(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                S(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final List K(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzj().G().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().G().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final Map L(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(L((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(L((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(L((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void P(zzfn.zzh.zza zza, Object obj) {
        C4536s.l(obj);
        zza.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfn.zzh.zza zze = zzfn.zzh.zze();
                    for (String next : bundle.keySet()) {
                        zzfn.zzh.zza zza2 = zzfn.zzh.zze().zza(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            zza2.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza2.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza2.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfn.zzh) ((zzjk) zze.zzai()));
                    }
                }
            }
            zza.zza((Iterable<? extends zzfn.zzh>) arrayList);
        } else {
            zzj().B().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void Q(zzfn.zzk.zza zza) {
        zzj().F().a("Checking account type status for ad personalization signals");
        if (e0(zza.zzt())) {
            zzj().A().a("Turning off ad personalization due to account type");
            zzfn.zzo zzo = (zzfn.zzo) ((zzjk) zzfn.zzo.zze().zza("_npa").zzb(c().p()).zza(1).zzai());
            int i10 = 0;
            while (true) {
                if (i10 >= zza.zzd()) {
                    zza.zza(zzo);
                    break;
                } else if ("_npa".equals(zza.zzk(i10).zzg())) {
                    zza.zza(i10, zzo);
                    break;
                } else {
                    i10++;
                }
            }
            C4625i a10 = C4625i.a(zza.zzv());
            a10.d(C4622h3.a.AD_PERSONALIZATION, C4639k.CHILD_ACCOUNT);
            zza.zzf(a10.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(zzfn.zzo.zza zza, Object obj) {
        C4536s.l(obj);
        zza.zzc().zzb().zza();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else {
            zzj().B().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Y(long j10, long j11) {
        if (j10 == 0 || j11 <= 0 || Math.abs(zzb().currentTimeMillis() - j10) > j11) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final byte[] d0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().B().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str) {
        if (zznq.zza() && a().o(F.f54614P0)) {
            return false;
        }
        C4536s.l(str);
        Z1 C02 = l().C0(str);
        if (C02 != null && c().t() && C02.z() && m().R(str)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final byte[] f0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            zzj().B().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    /* access modifiers changed from: package-private */
    public final List g0() {
        Map e10 = F.e(this.f55232b.zza());
        if (e10 == null || e10.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) F.f54615Q.a((Object) null)).intValue();
        Iterator it = e10.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().G().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e11) {
                    zzj().G().b("Experiment ID NumberFormatException", e11);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x5 j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ J5 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ C4646l l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4681q2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Q4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ o5 o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return v(str.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING)));
    }

    /* access modifiers changed from: package-private */
    public final long v(byte[] bArr) {
        C4536s.l(bArr);
        f().i();
        MessageDigest Q02 = B5.Q0();
        if (Q02 != null) {
            return B5.w(Q02.digest(bArr));
        }
        zzj().B().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzj().B().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable y(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.V1 r5 = r4.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.X1 r5 = r5.B()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x5.y(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final zzfn.zzf z(A a10) {
        zzfn.zzf.zza zza = zzfn.zzf.zze().zza(a10.f54429e);
        Iterator it = a10.f54430f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzfn.zzh.zza zza2 = zzfn.zzh.zze().zza(str);
            Object t02 = a10.f54430f.t0(str);
            C4536s.l(t02);
            P(zza2, t02);
            zza.zza(zza2);
        }
        return (zzfn.zzf) ((zzjk) zza.zzai());
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
