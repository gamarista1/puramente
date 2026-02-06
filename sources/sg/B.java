package Sg;

import Ef.m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;

abstract class B extends A {
    public static String h1(String str, int i10) {
        C6496s.h(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(m.h(i10, str.length()));
            C6496s.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String i1(String str, int i10) {
        C6496s.h(str, "<this>");
        if (i10 >= 0) {
            return p.m1(str, m.d(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char j1(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char k1(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(p.V(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char l1(CharSequence charSequence) {
        C6496s.h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static String m1(String str, int i10) {
        C6496s.h(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, m.h(i10, str.length()));
            C6496s.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
