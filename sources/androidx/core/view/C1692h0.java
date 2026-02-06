package androidx.core.view;

import Rg.h;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import zf.C6828a;

/* renamed from: androidx.core.view.h0  reason: case insensitive filesystem */
public abstract class C1692h0 {

    /* renamed from: androidx.core.view.h0$a */
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f16089a;

        a(ViewGroup viewGroup) {
            this.f16089a = viewGroup;
        }

        public Iterator iterator() {
            return C1692h0.c(this.f16089a);
        }
    }

    /* renamed from: androidx.core.view.h0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16090a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator invoke(View view) {
            ViewGroup viewGroup;
            h a10;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null || (a10 = C1692h0.a(viewGroup)) == null) {
                return null;
            }
            return a10.iterator();
        }
    }

    /* renamed from: androidx.core.view.h0$c */
    public static final class c implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f16091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f16092b;

        c(ViewGroup viewGroup) {
            this.f16092b = viewGroup;
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f16092b;
            int i10 = this.f16091a;
            this.f16091a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            if (this.f16091a < this.f16092b.getChildCount()) {
                return true;
            }
            return false;
        }

        public void remove() {
            ViewGroup viewGroup = this.f16092b;
            int i10 = this.f16091a - 1;
            this.f16091a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* renamed from: androidx.core.view.h0$d */
    public static final class d implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f16093a;

        public d(ViewGroup viewGroup) {
            this.f16093a = viewGroup;
        }

        public Iterator iterator() {
            return new X(C1692h0.a(this.f16093a).iterator(), b.f16090a);
        }
    }

    public static final h a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final h b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
