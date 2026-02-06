package E3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: E3.f  reason: case insensitive filesystem */
abstract class C1156f {
    static ObjectAnimator a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}
