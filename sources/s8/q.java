package s8;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class q extends ReplacementSpan implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48108a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Spannable spannable, TextView textView) {
            C6496s.h(spannable, "spannable");
            Object[] spans = spannable.getSpans(0, spannable.length(), q.class);
            C6496s.g(spans, "getSpans(...)");
            for (Object obj : spans) {
                q qVar = (q) obj;
                qVar.c();
                qVar.h(textView);
            }
        }

        private a() {
        }
    }

    public static final void g(Spannable spannable, TextView textView) {
        f48108a.a(spannable, textView);
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
