package E3;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: E3.h  reason: case insensitive filesystem */
abstract class C1158h {
    static PropertyValuesHolder a(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
