package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import x1.g;

final class A {

    /* renamed from: a  reason: collision with root package name */
    private TextView f11412a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f11413b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    A(TextView textView) {
        this.f11412a = (TextView) g.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f11413b;
        if (textClassifier == null) {
            return a.a(this.f11412a);
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f11413b = textClassifier;
    }
}
