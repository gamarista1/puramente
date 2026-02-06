package y3;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y3.a  reason: case insensitive filesystem */
public final class C2936a implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final C0477a f28721c = new C0477a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f28722a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f28723b;

    /* renamed from: y3.a$a  reason: collision with other inner class name */
    public static final class C0477a {
        public /* synthetic */ C0477a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            long j10;
            if (obj == null) {
                iVar.i1(i10);
            } else if (obj instanceof byte[]) {
                iVar.U0(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVar.G(i10, (double) ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                iVar.G(i10, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                iVar.Q0(i10, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVar.Q0(i10, (long) ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVar.Q0(i10, (long) ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVar.Q0(i10, (long) ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVar.C0(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j10 = 1;
                } else {
                    j10 = 0;
                }
                iVar.Q0(i10, j10);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        public final void b(i iVar, Object[] objArr) {
            C6496s.h(iVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Object obj = objArr[i10];
                    i10++;
                    a(iVar, i10, obj);
                }
            }
        }

        private C0477a() {
        }
    }

    public C2936a(String str, Object[] objArr) {
        C6496s.h(str, "query");
        this.f28722a = str;
        this.f28723b = objArr;
    }

    public String a() {
        return this.f28722a;
    }

    public void b(i iVar) {
        C6496s.h(iVar, "statement");
        f28721c.b(iVar, this.f28723b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2936a(String str) {
        this(str, (Object[]) null);
        C6496s.h(str, "query");
    }
}
