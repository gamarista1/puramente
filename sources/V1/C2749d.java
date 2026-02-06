package v1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C1609x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o1.e;
import v1.k;

/* renamed from: v1.d  reason: case insensitive filesystem */
abstract class C2749d {

    /* renamed from: a  reason: collision with root package name */
    private static final C1609x f26918a = new C1609x(2);

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator f26919b = new C2748c();

    /* renamed from: v1.d$a */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* renamed from: v1.d$b */
    private static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ContentProviderClient f26920a;

        b(Context context, Uri uri) {
            this.f26920a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f26920a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f26920a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* renamed from: v1.d$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        String f26921a;

        /* renamed from: b  reason: collision with root package name */
        String f26922b;

        /* renamed from: c  reason: collision with root package name */
        List f26923c;

        c(String str, String str2, List list) {
            this.f26921a = str;
            this.f26922b = str2;
            this.f26923c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!Objects.equals(this.f26921a, cVar.f26921a) || !Objects.equals(this.f26922b, cVar.f26922b) || !Objects.equals(this.f26923c, cVar.f26923c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f26921a, this.f26922b, this.f26923c});
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        if (eVar.b() != null) {
            return eVar.b();
        }
        return e.c(resources, eVar.c());
    }

    static k.a e(Context context, List list, CancellationSignal cancellationSignal) {
        D3.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
                if (f10 == null) {
                    return k.a.b(1, (k.b[]) null);
                }
                arrayList.add(h(context, eVar, f10.authority, cancellationSignal));
            }
            k.a a10 = k.a.a(0, arrayList);
            D3.a.f();
            return a10;
        } finally {
            D3.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        D3.a.c("FontProvider.getProvider");
        try {
            List d10 = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d10);
            ProviderInfo providerInfo = (ProviderInfo) f26918a.get(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e10 = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
            } else if (resolveContentProvider.packageName.equals(eVar.f())) {
                List b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b10, f26919b);
                for (int i10 = 0; i10 < d10.size(); i10++) {
                    ArrayList arrayList = new ArrayList((Collection) d10.get(i10));
                    Collections.sort(arrayList, f26919b);
                    if (c(b10, arrayList)) {
                        f26918a.put(cVar, resolveContentProvider);
                        D3.a.f();
                        return resolveContentProvider;
                    }
                }
                D3.a.f();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
            }
        } finally {
            D3.a.f();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    static k.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        a a10;
        Cursor cursor;
        int i10;
        int i11;
        ArrayList arrayList;
        Uri uri;
        int i12;
        boolean z10;
        String str2 = str;
        D3.a.c("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            a10 = a.a(context, build);
            cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            D3.a.c("ContentQueryWrapper.query");
            cursor = a10.b(build, strArr, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal);
            D3.a.f();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = cursor.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = cursor.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i12 = cursor.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    if (columnIndex6 != -1) {
                        z10 = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            k.b a11 = k.b.a(uri, i11, i12, z10, i10);
                            arrayList3 = arrayList;
                            arrayList3.add(a11);
                        }
                    }
                    z10 = false;
                    k.b a112 = k.b.a(uri, i11, i12, z10, i10);
                    arrayList3 = arrayList;
                    arrayList3.add(a112);
                }
                arrayList2 = arrayList3;
            }
            if (cursor != null) {
                cursor.close();
            }
            a10.close();
            k.b[] bVarArr = (k.b[]) arrayList2.toArray(new k.b[0]);
            D3.a.f();
            return bVarArr;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
