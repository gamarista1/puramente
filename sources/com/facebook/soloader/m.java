package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class m extends G {

    /* renamed from: f  reason: collision with root package name */
    protected final File f42534f;

    /* renamed from: g  reason: collision with root package name */
    protected final String f42535g;

    protected static final class a extends G.c implements Comparable {

        /* renamed from: c  reason: collision with root package name */
        final ZipEntry f42536c;

        /* renamed from: d  reason: collision with root package name */
        final int f42537d;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f42536c = zipEntry;
            this.f42537d = i10;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            return this.f42489a.compareTo(aVar.f42489a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f42536c.equals(aVar.f42536c) || this.f42537d != aVar.f42537d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f42537d * 31) + this.f42536c.hashCode();
        }
    }

    protected class b extends G.e {

        /* renamed from: a  reason: collision with root package name */
        protected a[] f42538a;

        /* renamed from: b  reason: collision with root package name */
        private final ZipFile f42539b;

        /* renamed from: c  reason: collision with root package name */
        private final G f42540c;

        b(G g10) {
            this.f42539b = new ZipFile(m.this.f42534f);
            this.f42540c = g10;
        }

        public final G.c[] b() {
            return o();
        }

        public void close() {
            this.f42539b.close();
        }

        public void f(File file) {
            G.d dVar;
            a[] o10 = o();
            byte[] bArr = new byte[32768];
            int length = o10.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = o10[i10];
                InputStream inputStream = this.f42539b.getInputStream(aVar.f42536c);
                try {
                    dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    a(dVar, bArr, file);
                    dVar.close();
                    i10++;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
            return;
            throw th;
        }

        /* access modifiers changed from: package-private */
        public a[] n() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap hashMap = new HashMap();
            Pattern compile = Pattern.compile(m.this.f42535g);
            String[] j10 = SysUtil.j();
            Enumeration<? extends ZipEntry> entries = this.f42539b.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                Matcher matcher = compile.matcher(zipEntry.getName());
                if (matcher.matches()) {
                    int groupCount = matcher.groupCount();
                    String group = matcher.group(groupCount - 1);
                    String group2 = matcher.group(groupCount);
                    int e10 = SysUtil.e(j10, group);
                    if (e10 >= 0) {
                        linkedHashSet.add(group);
                        a aVar = (a) hashMap.get(group2);
                        if (aVar == null || e10 < aVar.f42537d) {
                            hashMap.put(group2, new a(group2, zipEntry, e10));
                        }
                    }
                }
            }
            this.f42540c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        /* access modifiers changed from: package-private */
        public a[] o() {
            a[] aVarArr = this.f42538a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] n10 = n();
            this.f42538a = n10;
            return n10;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f42534f = file;
        this.f42535g = str2;
    }

    public String c() {
        return "ExtractFromZipSoSource";
    }

    /* access modifiers changed from: protected */
    public G.e q() {
        return new b(this);
    }

    public String toString() {
        try {
            return this.f42534f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f42534f.getName();
        }
    }

    public boolean v() {
        boolean z10;
        b bVar = new b(this);
        try {
            if (bVar.n().length != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.close();
            return z10;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
