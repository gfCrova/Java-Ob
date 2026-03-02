package com.patterns.behaviorPatterns.Iterator;

public interface IUsuarioIterator {
    Usuario next();
    boolean hasMore();
    void reset();
    void remove(int position);
    Usuario get(int position);
}
