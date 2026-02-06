package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "<init>", "()V", "", "", "key", "Lcom/facebook/react/common/mapbuffer/a$b;", "g", "(Ljava/lang/Object;I)Lcom/facebook/react/common/mapbuffer/a$b;", "", "getKeys", "()[I", "", "getValues", "()[Ljava/lang/Object;", "", "p", "(I)Z", "getBoolean", "getInt", "(I)I", "", "getDouble", "(I)D", "", "getString", "(I)Ljava/lang/String;", "F", "(I)Lcom/facebook/react/common/mapbuffer/a;", "", "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "Landroid/util/SparseArray;", "a", "Landroid/util/SparseArray;", "values", "getCount", "()I", "count", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@B7.a
public final class WritableMapBuffer implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f40606b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f40607a = new SparseArray();

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final int f40608a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40609b;

        /* renamed from: c  reason: collision with root package name */
        private final a.b f40610c;

        public b(int i10) {
            this.f40608a = i10;
            this.f40609b = WritableMapBuffer.this.f40607a.keyAt(i10);
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(i10);
            C6496s.g(valueAt, "valueAt(...)");
            this.f40610c = WritableMapBuffer.this.g(valueAt, getKey());
        }

        public long a() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof Long) {
                return ((Number) valueAt).longValue();
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public int b() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof Integer) {
                return ((Number) valueAt).intValue();
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public double c() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof Double) {
                return ((Number) valueAt).doubleValue();
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public String d() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof String) {
                return (String) valueAt;
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public a e() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof a) {
                return (a) valueAt;
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + a.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public boolean f() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.f40607a.valueAt(this.f40608a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            } else if (valueAt instanceof Boolean) {
                return ((Boolean) valueAt).booleanValue();
            } else {
                Class<?> cls = valueAt.getClass();
                throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + cls + " instead.").toString());
            }
        }

        public int getKey() {
            return this.f40609b;
        }

        public a.b getType() {
            return this.f40610c;
        }
    }

    public static final class c implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f40612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMapBuffer f40613b;

        c(WritableMapBuffer writableMapBuffer) {
            this.f40613b = writableMapBuffer;
        }

        /* renamed from: a */
        public a.c next() {
            WritableMapBuffer writableMapBuffer = this.f40613b;
            int i10 = this.f40612a;
            this.f40612a = i10 + 1;
            return new b(i10);
        }

        public boolean hasNext() {
            if (this.f40612a < this.f40613b.f40607a.size()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        F7.a.a();
    }

    /* access modifiers changed from: private */
    public final a.b g(Object obj, int i10) {
        if (obj instanceof Boolean) {
            return a.b.BOOL;
        }
        if (obj instanceof Integer) {
            return a.b.INT;
        }
        if (obj instanceof Long) {
            return a.b.LONG;
        }
        if (obj instanceof Double) {
            return a.b.DOUBLE;
        }
        if (obj instanceof String) {
            return a.b.STRING;
        }
        if (obj instanceof a) {
            return a.b.MAP;
        }
        Class<?> cls = obj.getClass();
        throw new IllegalStateException("Key " + i10 + " has value of unknown type: " + cls);
    }

    @B7.a
    private final int[] getKeys() {
        int size = this.f40607a.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f40607a.keyAt(i10);
        }
        return iArr;
    }

    @B7.a
    private final Object[] getValues() {
        int size = this.f40607a.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object valueAt = this.f40607a.valueAt(i10);
            C6496s.g(valueAt, "valueAt(...)");
            objArr[i10] = valueAt;
        }
        return objArr;
    }

    public a F(int i10) {
        Object obj = this.f40607a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        } else if (obj instanceof a) {
            return (a) obj;
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalStateException(("Expected " + a.class + " for key: " + i10 + ", found " + cls + " instead.").toString());
        }
    }

    public boolean getBoolean(int i10) {
        Object obj = this.f40607a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i10 + ", found " + cls + " instead.").toString());
        }
    }

    public int getCount() {
        return this.f40607a.size();
    }

    public double getDouble(int i10) {
        Object obj = this.f40607a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        } else if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + i10 + ", found " + cls + " instead.").toString());
        }
    }

    public int getInt(int i10) {
        Object obj = this.f40607a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        } else if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i10 + ", found " + cls + " instead.").toString());
        }
    }

    public String getString(int i10) {
        Object obj = this.f40607a.get(i10);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i10).toString());
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalStateException(("Expected " + String.class + " for key: " + i10 + ", found " + cls + " instead.").toString());
        }
    }

    public Iterator iterator() {
        return new c(this);
    }

    public boolean p(int i10) {
        if (this.f40607a.get(i10) != null) {
            return true;
        }
        return false;
    }
}
