package u3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import y3.i;
import y3.j;

public final class x implements j, i {

    /* renamed from: i  reason: collision with root package name */
    public static final a f26764i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final TreeMap f26765j = new TreeMap();

    /* renamed from: a  reason: collision with root package name */
    private final int f26766a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f26767b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f26768c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f26769d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f26770e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f26771f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f26772g;

    /* renamed from: h  reason: collision with root package name */
    private int f26773h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a(String str, int i10) {
            C6496s.h(str, "query");
            TreeMap treeMap = x.f26765j;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    x xVar = (x) ceilingEntry.getValue();
                    xVar.o(str, i10);
                    C6496s.g(xVar, "sqliteQuery");
                    return xVar;
                }
                C6514M m10 = C6514M.f71813a;
                x xVar2 = new x(i10, (DefaultConstructorMarker) null);
                xVar2.o(str, i10);
                return xVar2;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f26765j;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                C6496s.g(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i10;
                    } else {
                        return;
                    }
                }
            }
        }

        private a() {
        }
    }

    public /* synthetic */ x(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final x f(String str, int i10) {
        return f26764i.a(str, i10);
    }

    public void C0(int i10, String str) {
        C6496s.h(str, "value");
        this.f26772g[i10] = 4;
        this.f26770e[i10] = str;
    }

    public void G(int i10, double d10) {
        this.f26772g[i10] = 3;
        this.f26769d[i10] = d10;
    }

    public void Q0(int i10, long j10) {
        this.f26772g[i10] = 2;
        this.f26768c[i10] = j10;
    }

    public void U0(int i10, byte[] bArr) {
        C6496s.h(bArr, "value");
        this.f26772g[i10] = 5;
        this.f26771f[i10] = bArr;
    }

    public String a() {
        String str = this.f26767b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void b(i iVar) {
        C6496s.h(iVar, "statement");
        int n10 = n();
        if (1 <= n10) {
            int i10 = 1;
            while (true) {
                int i11 = this.f26772g[i10];
                if (i11 == 1) {
                    iVar.i1(i10);
                } else if (i11 == 2) {
                    iVar.Q0(i10, this.f26768c[i10]);
                } else if (i11 == 3) {
                    iVar.G(i10, this.f26769d[i10]);
                } else if (i11 == 4) {
                    String str = this.f26770e[i10];
                    if (str != null) {
                        iVar.C0(i10, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i11 == 5) {
                    byte[] bArr = this.f26771f[i10];
                    if (bArr != null) {
                        iVar.U0(i10, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (i10 != n10) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void i1(int i10) {
        this.f26772g[i10] = 1;
    }

    public int n() {
        return this.f26773h;
    }

    public final void o(String str, int i10) {
        C6496s.h(str, "query");
        this.f26767b = str;
        this.f26773h = i10;
    }

    public final void q() {
        TreeMap treeMap = f26765j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f26766a), this);
            f26764i.b();
            C6514M m10 = C6514M.f71813a;
        }
    }

    private x(int i10) {
        this.f26766a = i10;
        int i11 = i10 + 1;
        this.f26772g = new int[i11];
        this.f26768c = new long[i11];
        this.f26769d = new double[i11];
        this.f26770e = new String[i11];
        this.f26771f = new byte[i11][];
    }

    public void close() {
    }
}
