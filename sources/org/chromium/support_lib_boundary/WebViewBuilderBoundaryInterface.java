package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {

        /* renamed from: a  reason: collision with root package name */
        List f72447a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List f72448b = new ArrayList();
        public int baseline = 0;

        /* renamed from: c  reason: collision with root package name */
        List f72449c = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.f72447a.add(obj);
            this.f72448b.add(str);
            this.f72449c.add(list);
        }

        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f72447a, this.f72448b, this.f72449c});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
