package l4;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.C6496s;

/* renamed from: l4.b  reason: case insensitive filesystem */
public class C3736b extends C3735a {

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f46102b;

    public C3736b(ImageView imageView) {
        this.f46102b = imageView;
    }

    public Drawable b() {
        return a().getDrawable();
    }

    public void c(Drawable drawable) {
        a().setImageDrawable(drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3736b) || !C6496s.c(a(), ((C3736b) obj).a())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public ImageView a() {
        return this.f46102b;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
