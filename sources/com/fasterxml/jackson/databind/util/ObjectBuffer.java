package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

public final class ObjectBuffer {
    private static final int MAX_CHUNK = 262144;
    private static final int SMALL_CHUNK = 16384;
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    /* access modifiers changed from: protected */
    public final void _copyTo(Object obj, int i10, Object[] objArr, int i11) {
        int i12 = 0;
        for (LinkedNode<Object[]> linkedNode = this._head; linkedNode != null; linkedNode = linkedNode.next()) {
            Object[] value = linkedNode.value();
            int length = value.length;
            System.arraycopy(value, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 != i10) {
            throw new IllegalStateException("Should have gotten " + i10 + " entries, got " + i13);
        }
    }

    /* access modifiers changed from: protected */
    public void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, (LinkedNode) null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < SMALL_CHUNK) {
            length += length;
        } else if (length < MAX_CHUNK) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this._size;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i10) {
        int i11 = this._size + i10;
        Object[] objArr2 = new Object[i11];
        _copyTo(objArr2, i11, objArr, i10);
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return new Object[12];
        }
        return objArr;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i10, Class<T> cls) {
        int i11 = this._size + i10;
        T[] tArr = (Object[]) Array.newInstance(cls, i11);
        _copyTo(tArr, i11, objArr, i10);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i10, List<Object> list) {
        int i11;
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            i11 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] value = linkedNode.value();
            int length = value.length;
            while (i11 < length) {
                list.add(value[i11]);
                i11++;
            }
            linkedNode = linkedNode.next();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
    }
}
