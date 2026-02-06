package Q1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import x1.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f5415a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f5416a;

        /* renamed from: b  reason: collision with root package name */
        private final d f5417b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5418c = true;

        a(TextView textView) {
            this.f5416a = textView;
            this.f5417b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f5417b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f5417b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g10.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void k() {
            this.f5416a.setFilters(a(this.f5416a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new h(transformationMethod);
            }
            return transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f5418c) {
                return h(inputFilterArr);
            }
            return f(inputFilterArr);
        }

        public boolean b() {
            return this.f5418c;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            this.f5418c = z10;
            l();
            k();
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f5418c) {
                return m(transformationMethod);
            }
            return j(transformationMethod);
        }

        /* access modifiers changed from: package-private */
        public void i(boolean z10) {
            this.f5418c = z10;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            this.f5416a.setTransformationMethod(e(this.f5416a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void d(boolean z10);

        /* access modifiers changed from: package-private */
        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f5419a;

        c(TextView textView) {
            this.f5419a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.k();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (f()) {
                return inputFilterArr;
            }
            return this.f5419a.a(inputFilterArr);
        }

        public boolean b() {
            return this.f5419a.b();
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (!f()) {
                this.f5419a.c(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            if (f()) {
                this.f5419a.i(z10);
            } else {
                this.f5419a.d(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod e(TransformationMethod transformationMethod) {
            if (f()) {
                return transformationMethod;
            }
            return this.f5419a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        g.g(textView, "textView cannot be null");
        if (!z10) {
            this.f5415a = new c(textView);
        } else {
            this.f5415a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f5415a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f5415a.b();
    }

    public void c(boolean z10) {
        this.f5415a.c(z10);
    }

    public void d(boolean z10) {
        this.f5415a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f5415a.e(transformationMethod);
    }
}
