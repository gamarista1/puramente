package E3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: E3.a  reason: case insensitive filesystem */
abstract class C1151a {
    static void a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void b(Animator animator) {
        animator.pause();
    }

    static void c(Animator animator) {
        animator.resume();
    }
}
