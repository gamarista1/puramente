package R0;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Pair;

public abstract class O {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new H(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(10, new N());
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            int i12 = i11;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < i10 - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float f10 = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint));
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (R0.T.a(r2, T0.e.class) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0006
            goto L_0x0024
        L_0x0006:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x001c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<T0.f> r1 = T0.f.class
            boolean r1 = R0.T.a(r2, r1)
            if (r1 != 0) goto L_0x0026
            java.lang.Class<T0.e> r1 = T0.e.class
            boolean r1 = R0.T.a(r2, r1)
            if (r1 != 0) goto L_0x0026
        L_0x001c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.O.e(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
