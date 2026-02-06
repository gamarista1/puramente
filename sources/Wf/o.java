package wf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.p;

abstract class o extends n {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73736a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Void invoke(File file, IOException iOException) {
            C6496s.h(file, "<anonymous parameter 0>");
            C6496s.h(iOException, "exception");
            throw iOException;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f73737a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(2);
            this.f73737a = pVar;
        }

        public final void a(File file, IOException iOException) {
            C6496s.h(file, "f");
            C6496s.h(iOException, "e");
            if (this.f73737a.invoke(file, iOException) == r.TERMINATE) {
                throw new s(file);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((File) obj, (IOException) obj2);
            return C6514M.f71813a;
        }
    }

    public static final String A(File file, File file2) {
        C6496s.h(file, "<this>");
        C6496s.h(file2, "base");
        String B10 = B(file, file2);
        if (B10 != null) {
            return B10;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    private static final String B(File file, File file2) {
        g x10 = x(l.c(file));
        g x11 = x(l.c(file2));
        if (!C6496s.c(x10.a(), x11.a())) {
            return null;
        }
        int c10 = x11.c();
        int c11 = x10.c();
        int min = Math.min(c11, c10);
        int i10 = 0;
        while (i10 < min && C6496s.c(x10.b().get(i10), x11.b().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = c10 - 1;
        if (i10 <= i11) {
            while (!C6496s.c(((File) x11.b().get(i11)).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < c11) {
            if (i10 < c10) {
                sb2.append(File.separatorChar);
            }
            String str = File.separator;
            C6496s.g(str, "separator");
            C6565s.v0(C6565s.g0(x10.b(), i10), sb2, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 124, (Object) null);
        }
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r5.delete() == false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean p(java.io.File r11, java.io.File r12, boolean r13, yf.p r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            wf.q r12 = new wf.q
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            wf.r r12 = wf.r.TERMINATE
            if (r11 == r12) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            return r1
        L_0x002e:
            wf.i r0 = wf.n.o(r11)     // Catch:{ s -> 0x00d7 }
            wf.o$b r3 = new wf.o$b     // Catch:{ s -> 0x00d7 }
            r3.<init>(r14)     // Catch:{ s -> 0x00d7 }
            wf.i r0 = r0.i(r3)     // Catch:{ s -> 0x00d7 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ s -> 0x00d7 }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ s -> 0x00d7 }
            if (r3 == 0) goto L_0x00d6
            java.lang.Object r3 = r0.next()     // Catch:{ s -> 0x00d7 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ s -> 0x00d7 }
            boolean r4 = r3.exists()     // Catch:{ s -> 0x00d7 }
            if (r4 != 0) goto L_0x0066
            wf.q r10 = new wf.q     // Catch:{ s -> 0x00d7 }
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r6 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ s -> 0x00d7 }
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch:{ s -> 0x00d7 }
            wf.r r4 = wf.r.TERMINATE     // Catch:{ s -> 0x00d7 }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x0066:
            java.lang.String r4 = A(r3, r11)     // Catch:{ s -> 0x00d7 }
            java.io.File r5 = new java.io.File     // Catch:{ s -> 0x00d7 }
            r5.<init>(r12, r4)     // Catch:{ s -> 0x00d7 }
            boolean r4 = r5.exists()     // Catch:{ s -> 0x00d7 }
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r3.isDirectory()     // Catch:{ s -> 0x00d7 }
            if (r4 == 0) goto L_0x0081
            boolean r4 = r5.isDirectory()     // Catch:{ s -> 0x00d7 }
            if (r4 != 0) goto L_0x00a7
        L_0x0081:
            if (r13 != 0) goto L_0x0084
            goto L_0x0097
        L_0x0084:
            boolean r4 = r5.isDirectory()     // Catch:{ s -> 0x00d7 }
            if (r4 == 0) goto L_0x0091
            boolean r4 = wf.k.t(r5)     // Catch:{ s -> 0x00d7 }
            if (r4 != 0) goto L_0x00a7
            goto L_0x0097
        L_0x0091:
            boolean r4 = r5.delete()     // Catch:{ s -> 0x00d7 }
            if (r4 != 0) goto L_0x00a7
        L_0x0097:
            wf.f r4 = new wf.f     // Catch:{ s -> 0x00d7 }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ s -> 0x00d7 }
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch:{ s -> 0x00d7 }
            wf.r r4 = wf.r.TERMINATE     // Catch:{ s -> 0x00d7 }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00a7:
            boolean r4 = r3.isDirectory()     // Catch:{ s -> 0x00d7 }
            if (r4 == 0) goto L_0x00b1
            r5.mkdirs()     // Catch:{ s -> 0x00d7 }
            goto L_0x003f
        L_0x00b1:
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = wf.k.s(r4, r5, r6, r7, r8, r9)     // Catch:{ s -> 0x00d7 }
            long r4 = r4.length()     // Catch:{ s -> 0x00d7 }
            long r6 = r3.length()     // Catch:{ s -> 0x00d7 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            java.io.IOException r4 = new java.io.IOException     // Catch:{ s -> 0x00d7 }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ s -> 0x00d7 }
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch:{ s -> 0x00d7 }
            wf.r r4 = wf.r.TERMINATE     // Catch:{ s -> 0x00d7 }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00d6:
            return r1
        L_0x00d7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.o.p(java.io.File, java.io.File, boolean, yf.p):boolean");
    }

    public static /* synthetic */ boolean q(File file, File file2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = a.f73736a;
        }
        return p(file, file2, z10, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        wf.C6763c.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
        wf.C6763c.a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File r(java.io.File r6, java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            wf.f r8 = new wf.f
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            wf.f r8 = new wf.f
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            wf.h r8 = new wf.h
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0062 }
            r6.<init>(r7)     // Catch:{ all -> 0x0062 }
            wf.C6762b.a(r8, r6, r9)     // Catch:{ all -> 0x0064 }
            r9 = 0
            wf.C6763c.a(r6, r9)     // Catch:{ all -> 0x0062 }
            wf.C6763c.a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r6 = move-exception
            goto L_0x006b
        L_0x0064:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r9 = move-exception
            wf.C6763c.a(r6, r7)     // Catch:{ all -> 0x0062 }
            throw r9     // Catch:{ all -> 0x0062 }
        L_0x006b:
            throw r6     // Catch:{ all -> 0x006c }
        L_0x006c:
            r7 = move-exception
            wf.C6763c.a(r8, r6)
            throw r7
        L_0x0071:
            wf.q r7 = new wf.q
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.o.r(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    public static /* synthetic */ File s(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return r(file, file2, z10, i10);
    }

    public static boolean t(File file) {
        C6496s.h(file, "<this>");
        Iterator it = n.n(file).iterator();
        while (true) {
            boolean z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
        }
    }

    public static String u(File file) {
        C6496s.h(file, "<this>");
        String name = file.getName();
        C6496s.g(name, "getName(...)");
        return Sg.p.T0(name, '.', "");
    }

    public static String v(File file) {
        C6496s.h(file, "<this>");
        String name = file.getName();
        C6496s.g(name, "getName(...)");
        return Sg.p.e1(name, ".", (String) null, 2, (Object) null);
    }

    private static final List w(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!C6496s.c(name, ".")) {
                if (!C6496s.c(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || C6496s.c(((File) C6565s.z0(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final g x(g gVar) {
        return new g(gVar.a(), w(gVar.b()));
    }

    public static final File y(File file, File file2) {
        C6496s.h(file, "<this>");
        C6496s.h(file2, "relative");
        if (l.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C6496s.g(file3, "toString(...)");
        if (file3.length() != 0) {
            char c10 = File.separatorChar;
            if (!Sg.p.R(file3, c10, false, 2, (Object) null)) {
                return new File(file3 + c10 + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File z(File file, String str) {
        C6496s.h(file, "<this>");
        C6496s.h(str, "relative");
        return y(file, new File(str));
    }
}
