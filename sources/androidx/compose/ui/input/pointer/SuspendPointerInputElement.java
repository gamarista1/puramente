package androidx.compose.ui.input.pointer;

import D0.W;
import J0.V;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "LJ0/V;", "LD0/W;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "LD0/J;", "Lqf/d;", "Llf/M;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lyf/p;)V", "d", "()LD0/W;", "node", "e", "(LD0/W;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "c", "getKey2", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "Lyf/p;", "getPointerInputHandler", "()Lyf/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SuspendPointerInputElement extends V {

    /* renamed from: b  reason: collision with root package name */
    private final Object f13442b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13443c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f13444d;

    /* renamed from: e  reason: collision with root package name */
    private final p f13445e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pVar);
    }

    /* renamed from: d */
    public W a() {
        return new W(this.f13442b, this.f13443c, this.f13444d, this.f13445e);
    }

    /* renamed from: e */
    public void b(W w10) {
        w10.q2(this.f13442b, this.f13443c, this.f13444d, this.f13445e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!C6496s.c(this.f13442b, suspendPointerInputElement.f13442b) || !C6496s.c(this.f13443c, suspendPointerInputElement.f13443c)) {
            return false;
        }
        Object[] objArr = this.f13444d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f13444d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f13444d != null) {
            return false;
        }
        if (this.f13445e == suspendPointerInputElement.f13445e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        Object obj = this.f13442b;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Object obj2 = this.f13443c;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Object[] objArr = this.f13444d;
        if (objArr != null) {
            i12 = Arrays.hashCode(objArr);
        }
        return ((i14 + i12) * 31) + this.f13445e.hashCode();
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar) {
        this.f13442b = obj;
        this.f13443c = obj2;
        this.f13444d = objArr;
        this.f13445e = pVar;
    }
}
